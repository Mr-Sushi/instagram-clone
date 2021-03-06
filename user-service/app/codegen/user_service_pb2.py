# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: user_service.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='user_service.proto',
  package='User',
  syntax='proto3',
  serialized_options=None,
  serialized_pb=b'\n\x12user_service.proto\x12\x04User\"/\n\x07NewUser\x12\x10\n\x08username\x18\x01 \x01(\t\x12\x12\n\naccount_id\x18\x02 \x01(\t\"<\n\x12\x43reateUserResponse\x12&\n\x06status\x18\x01 \x01(\x0e\x32\x16.User.CreateUserStatus\"\'\n\x11\x44\x65leteUserRequest\x12\x12\n\naccount_id\x18\x01 \x01(\t\"<\n\x12\x44\x65leteUserResponse\x12&\n\x06status\x18\x01 \x01(\x0e\x32\x16.User.DeleteUserStatus\"$\n\x0eGetUserRequest\x12\x12\n\naccount_id\x18\x01 \x01(\t\"h\n\x0fGetUserResponse\x12\x1e\n\x04user\x18\x01 \x01(\x0b\x32\x0e.User.UserInfoH\x00\x12+\n\x05\x65rror\x18\x02 \x01(\x0e\x32\x1a.User.GetUserResponseErrorH\x00\x42\x08\n\x06status\"P\n\x08UserInfo\x12\n\n\x02id\x18\x01 \x01(\t\x12\x10\n\x08username\x18\x02 \x01(\t\x12\x12\n\ncreated_at\x18\x03 \x01(\t\x12\x12\n\nupdated_at\x18\x04 \x01(\t*~\n\x10\x43reateUserStatus\x12\x1c\n\x18\x43REATE_USER_SERVER_ERROR\x10\x00\x12\x1b\n\x17USERNAME_ALREADY_EXISTS\x10\x01\x12\x1d\n\x19\x41\x43\x43OUNT_ID_ALREADY_EXISTS\x10\x02\x12\x10\n\x0cUSER_CREATED\x10\x03*\\\n\x10\x44\x65leteUserStatus\x12\x1c\n\x18\x44\x45LETE_USER_SERVER_ERROR\x10\x00\x12\x18\n\x14\x41\x43\x43OUNT_ID_NOT_EXIST\x10\x01\x12\x10\n\x0cUSER_DELETED\x10\x02*K\n\x14GetUserResponseError\x12\x19\n\x15GET_USER_SERVER_ERROR\x10\x00\x12\x18\n\x14\x41\x43\x43OUNT_ID_NOT_FOUND\x10\x01\x32\xb4\x01\n\x04User\x12\x33\n\x06\x43reate\x12\r.User.NewUser\x1a\x18.User.CreateUserResponse\"\x00\x12=\n\x06\x44\x65lete\x12\x17.User.DeleteUserRequest\x1a\x18.User.DeleteUserResponse\"\x00\x12\x38\n\x07GetUser\x12\x14.User.GetUserRequest\x1a\x15.User.GetUserResponse\"\x00\x62\x06proto3'
)

_CREATEUSERSTATUS = _descriptor.EnumDescriptor(
  name='CreateUserStatus',
  full_name='User.CreateUserStatus',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='CREATE_USER_SERVER_ERROR', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='USERNAME_ALREADY_EXISTS', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='ACCOUNT_ID_ALREADY_EXISTS', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='USER_CREATED', index=3, number=3,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=468,
  serialized_end=594,
)
_sym_db.RegisterEnumDescriptor(_CREATEUSERSTATUS)

CreateUserStatus = enum_type_wrapper.EnumTypeWrapper(_CREATEUSERSTATUS)
_DELETEUSERSTATUS = _descriptor.EnumDescriptor(
  name='DeleteUserStatus',
  full_name='User.DeleteUserStatus',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DELETE_USER_SERVER_ERROR', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='ACCOUNT_ID_NOT_EXIST', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='USER_DELETED', index=2, number=2,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=596,
  serialized_end=688,
)
_sym_db.RegisterEnumDescriptor(_DELETEUSERSTATUS)

DeleteUserStatus = enum_type_wrapper.EnumTypeWrapper(_DELETEUSERSTATUS)
_GETUSERRESPONSEERROR = _descriptor.EnumDescriptor(
  name='GetUserResponseError',
  full_name='User.GetUserResponseError',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='GET_USER_SERVER_ERROR', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='ACCOUNT_ID_NOT_FOUND', index=1, number=1,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=690,
  serialized_end=765,
)
_sym_db.RegisterEnumDescriptor(_GETUSERRESPONSEERROR)

GetUserResponseError = enum_type_wrapper.EnumTypeWrapper(_GETUSERRESPONSEERROR)
CREATE_USER_SERVER_ERROR = 0
USERNAME_ALREADY_EXISTS = 1
ACCOUNT_ID_ALREADY_EXISTS = 2
USER_CREATED = 3
DELETE_USER_SERVER_ERROR = 0
ACCOUNT_ID_NOT_EXIST = 1
USER_DELETED = 2
GET_USER_SERVER_ERROR = 0
ACCOUNT_ID_NOT_FOUND = 1



_NEWUSER = _descriptor.Descriptor(
  name='NewUser',
  full_name='User.NewUser',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='username', full_name='User.NewUser.username', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='account_id', full_name='User.NewUser.account_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=28,
  serialized_end=75,
)


_CREATEUSERRESPONSE = _descriptor.Descriptor(
  name='CreateUserResponse',
  full_name='User.CreateUserResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='User.CreateUserResponse.status', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=77,
  serialized_end=137,
)


_DELETEUSERREQUEST = _descriptor.Descriptor(
  name='DeleteUserRequest',
  full_name='User.DeleteUserRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='account_id', full_name='User.DeleteUserRequest.account_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=139,
  serialized_end=178,
)


_DELETEUSERRESPONSE = _descriptor.Descriptor(
  name='DeleteUserResponse',
  full_name='User.DeleteUserResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='User.DeleteUserResponse.status', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=180,
  serialized_end=240,
)


_GETUSERREQUEST = _descriptor.Descriptor(
  name='GetUserRequest',
  full_name='User.GetUserRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='account_id', full_name='User.GetUserRequest.account_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=242,
  serialized_end=278,
)


_GETUSERRESPONSE = _descriptor.Descriptor(
  name='GetUserResponse',
  full_name='User.GetUserResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='user', full_name='User.GetUserResponse.user', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='error', full_name='User.GetUserResponse.error', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='status', full_name='User.GetUserResponse.status',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=280,
  serialized_end=384,
)


_USERINFO = _descriptor.Descriptor(
  name='UserInfo',
  full_name='User.UserInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='User.UserInfo.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='username', full_name='User.UserInfo.username', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='created_at', full_name='User.UserInfo.created_at', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='updated_at', full_name='User.UserInfo.updated_at', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=386,
  serialized_end=466,
)

_CREATEUSERRESPONSE.fields_by_name['status'].enum_type = _CREATEUSERSTATUS
_DELETEUSERRESPONSE.fields_by_name['status'].enum_type = _DELETEUSERSTATUS
_GETUSERRESPONSE.fields_by_name['user'].message_type = _USERINFO
_GETUSERRESPONSE.fields_by_name['error'].enum_type = _GETUSERRESPONSEERROR
_GETUSERRESPONSE.oneofs_by_name['status'].fields.append(
  _GETUSERRESPONSE.fields_by_name['user'])
_GETUSERRESPONSE.fields_by_name['user'].containing_oneof = _GETUSERRESPONSE.oneofs_by_name['status']
_GETUSERRESPONSE.oneofs_by_name['status'].fields.append(
  _GETUSERRESPONSE.fields_by_name['error'])
_GETUSERRESPONSE.fields_by_name['error'].containing_oneof = _GETUSERRESPONSE.oneofs_by_name['status']
DESCRIPTOR.message_types_by_name['NewUser'] = _NEWUSER
DESCRIPTOR.message_types_by_name['CreateUserResponse'] = _CREATEUSERRESPONSE
DESCRIPTOR.message_types_by_name['DeleteUserRequest'] = _DELETEUSERREQUEST
DESCRIPTOR.message_types_by_name['DeleteUserResponse'] = _DELETEUSERRESPONSE
DESCRIPTOR.message_types_by_name['GetUserRequest'] = _GETUSERREQUEST
DESCRIPTOR.message_types_by_name['GetUserResponse'] = _GETUSERRESPONSE
DESCRIPTOR.message_types_by_name['UserInfo'] = _USERINFO
DESCRIPTOR.enum_types_by_name['CreateUserStatus'] = _CREATEUSERSTATUS
DESCRIPTOR.enum_types_by_name['DeleteUserStatus'] = _DELETEUSERSTATUS
DESCRIPTOR.enum_types_by_name['GetUserResponseError'] = _GETUSERRESPONSEERROR
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

NewUser = _reflection.GeneratedProtocolMessageType('NewUser', (_message.Message,), {
  'DESCRIPTOR' : _NEWUSER,
  '__module__' : 'user_service_pb2'
  # @@protoc_insertion_point(class_scope:User.NewUser)
  })
_sym_db.RegisterMessage(NewUser)

CreateUserResponse = _reflection.GeneratedProtocolMessageType('CreateUserResponse', (_message.Message,), {
  'DESCRIPTOR' : _CREATEUSERRESPONSE,
  '__module__' : 'user_service_pb2'
  # @@protoc_insertion_point(class_scope:User.CreateUserResponse)
  })
_sym_db.RegisterMessage(CreateUserResponse)

DeleteUserRequest = _reflection.GeneratedProtocolMessageType('DeleteUserRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEUSERREQUEST,
  '__module__' : 'user_service_pb2'
  # @@protoc_insertion_point(class_scope:User.DeleteUserRequest)
  })
_sym_db.RegisterMessage(DeleteUserRequest)

DeleteUserResponse = _reflection.GeneratedProtocolMessageType('DeleteUserResponse', (_message.Message,), {
  'DESCRIPTOR' : _DELETEUSERRESPONSE,
  '__module__' : 'user_service_pb2'
  # @@protoc_insertion_point(class_scope:User.DeleteUserResponse)
  })
_sym_db.RegisterMessage(DeleteUserResponse)

GetUserRequest = _reflection.GeneratedProtocolMessageType('GetUserRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETUSERREQUEST,
  '__module__' : 'user_service_pb2'
  # @@protoc_insertion_point(class_scope:User.GetUserRequest)
  })
_sym_db.RegisterMessage(GetUserRequest)

GetUserResponse = _reflection.GeneratedProtocolMessageType('GetUserResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETUSERRESPONSE,
  '__module__' : 'user_service_pb2'
  # @@protoc_insertion_point(class_scope:User.GetUserResponse)
  })
_sym_db.RegisterMessage(GetUserResponse)

UserInfo = _reflection.GeneratedProtocolMessageType('UserInfo', (_message.Message,), {
  'DESCRIPTOR' : _USERINFO,
  '__module__' : 'user_service_pb2'
  # @@protoc_insertion_point(class_scope:User.UserInfo)
  })
_sym_db.RegisterMessage(UserInfo)



_USER = _descriptor.ServiceDescriptor(
  name='User',
  full_name='User.User',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=768,
  serialized_end=948,
  methods=[
  _descriptor.MethodDescriptor(
    name='Create',
    full_name='User.User.Create',
    index=0,
    containing_service=None,
    input_type=_NEWUSER,
    output_type=_CREATEUSERRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Delete',
    full_name='User.User.Delete',
    index=1,
    containing_service=None,
    input_type=_DELETEUSERREQUEST,
    output_type=_DELETEUSERRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetUser',
    full_name='User.User.GetUser',
    index=2,
    containing_service=None,
    input_type=_GETUSERREQUEST,
    output_type=_GETUSERRESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_USER)

DESCRIPTOR.services_by_name['User'] = _USER

# @@protoc_insertion_point(module_scope)
