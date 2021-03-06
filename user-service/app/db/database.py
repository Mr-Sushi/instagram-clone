
import sqlalchemy as db
from sqlalchemy.orm import sessionmaker
import datetime
from typing import List
from sqlalchemy.exc import IntegrityError
from app.models.base import Base
from app.models.user import User
from app.db.exceptions import IdExistsError, UsernameExistsError, EntityNotFoundError
from app.db.utils import Page

MAX_PAGE_SIZE = 100
MIN_PAGE_SIZE = 1
DEFAULT_PAGE_SIZE = 20
MIN_PAGE_NUM = 1
MAX_PAGE_NUM = 1000
DEFAULT_PAGE_NUM = 1

# Session is a class that we created with sessionmaker factory; we'll bind it to the
# engine in Database __init__ method. Please note that only one instance of Database
# can be running in the program due to this.
Session = sessionmaker()

class Database():

    def __init__(self, config):
        self.engine = db.create_engine(
            'postgresql://{}:{}@{}:{}/{}'.format(
                config['username'],
                config['password'],
                config['host'],
                config['port'],
                config['database']
            ),
            pool_size=5,        # How many connections we keep open to the database by default
            max_overflow=20,    # How many connections we can "overflow" at peak times
            pool_timeout=5,     # How long we keep waiting for a new connection in pool (seconds)
            pool_recycle=1800   # Time (seconds) after which idle connection is replaced with a new one
        )
        Session.configure(bind=self.engine)
    
    def authenticate(self) -> bool:
        """Check whether the database connection and authentication is working.
        
        Returns:

            bool -- True if success, False otherwise
        """
        try:
            connection = self.engine.connect()
            connection.execute(f"SELECT 1+1 as RESULT")
            connection.close()
            return True
        except:
            return False

    def findUserById(self, id: str) -> User:
        """Find user by ID.
        
        Arguments:

            id {str} -- User's ID
        
        Returns:

            User -- The found user or None if not found
        """
        session = Session(bind=self.engine)
        return session.query(User).filter_by(id=id).first()

    def findUserByUsername(self, username: str) -> User:
        """Find user by username.
        
        Arguments:

            username {str} -- User's username
        
        Returns:

            User -- The found user or None if not found
        """
        session = Session(bind=self.engine)
        return session.query(User).filter_by(username=username).first()

    def createUser(self, user: User) -> User:
        """Create a new user into database.
        
        Arguments:

            user {User} -- New user instance

        Raises:

            IdExistsError: A user with this ID already exists
            UsernameExistsError: A user with this username already exists
        """
        session = Session(bind=self.engine)
        # Check if user ID already exists
        if self.findUserById(user.id) is not None:
            raise IdExistsError
        # Check if username already exists
        if self.findUserByUsername(user.username) is not None:
            raise UsernameExistsError

        session.add(user)
        session.commit()
        return user

    def getAllUsers(self, page: int = 1, size: int = 20) -> Page:
        """Find all users as paginated result set.
        
        Keyword Arguments:

            page {int} -- Page number (starting from 1) (default: {1})
            size {int} -- Page size (default: {20})
        
        Returns:

            {Page} -- The results wrapped in Page
        """
        size = DEFAULT_PAGE_SIZE if size < MIN_PAGE_SIZE else min(size, MAX_PAGE_SIZE)
        page = DEFAULT_PAGE_NUM if page < MIN_PAGE_NUM else min(page, MAX_PAGE_NUM)

        lower_limit = (page - 1) * size
        upper_limit = page * size

        session = Session(bind=self.engine)
        # Note: Ideally, these two queries should be done concurrently
        users = session.query(User).order_by(User.created_at)[lower_limit:upper_limit]
        count = session.query(User).count()
        return Page(page, size, count, users)

    def deleteUserById(self, user_id: str) -> User:
        """Delete a user by ID.
        
        Arguments:

            user_id {str} -- User's ID
        
        Raises:

            EntityNotFoundError: The user doesn't exist
        """
        session = Session(bind=self.engine)
        user = session.query(User).filter_by(id=user_id).first()
        if user is None:
            raise EntityNotFoundError
        session.delete(user)
        session.commit()
        return user



