// package: Auth
// file: auth_service.proto

/* tslint:disable */
/* eslint-disable */

import * as jspb from "google-protobuf";

export class NewAccount extends jspb.Message { 
    getUsername(): string;
    setUsername(value: string): void;

    getPassword(): string;
    setPassword(value: string): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): NewAccount.AsObject;
    static toObject(includeInstance: boolean, msg: NewAccount): NewAccount.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: NewAccount, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): NewAccount;
    static deserializeBinaryFromReader(message: NewAccount, reader: jspb.BinaryReader): NewAccount;
}

export namespace NewAccount {
    export type AsObject = {
        username: string,
        password: string,
    }
}

export class SignInResponse extends jspb.Message { 

    hasTokens(): boolean;
    clearTokens(): void;
    getTokens(): JWTTokens | undefined;
    setTokens(value?: JWTTokens): void;


    hasError(): boolean;
    clearError(): void;
    getError(): AuthErrorStatus;
    setError(value: AuthErrorStatus): void;


    getStatusCase(): SignInResponse.StatusCase;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): SignInResponse.AsObject;
    static toObject(includeInstance: boolean, msg: SignInResponse): SignInResponse.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: SignInResponse, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): SignInResponse;
    static deserializeBinaryFromReader(message: SignInResponse, reader: jspb.BinaryReader): SignInResponse;
}

export namespace SignInResponse {
    export type AsObject = {
        tokens?: JWTTokens.AsObject,
        error: AuthErrorStatus,
    }

    export enum StatusCase {
        STATUS_NOT_SET = 0,
    
    TOKENS = 1,

    ERROR = 2,

    }

}

export class SignUpResponse extends jspb.Message { 

    hasAccount(): boolean;
    clearAccount(): void;
    getAccount(): AccountInfo | undefined;
    setAccount(value?: AccountInfo): void;


    hasError(): boolean;
    clearError(): void;
    getError(): SignUpErrorStatus;
    setError(value: SignUpErrorStatus): void;


    getStatusCase(): SignUpResponse.StatusCase;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): SignUpResponse.AsObject;
    static toObject(includeInstance: boolean, msg: SignUpResponse): SignUpResponse.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: SignUpResponse, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): SignUpResponse;
    static deserializeBinaryFromReader(message: SignUpResponse, reader: jspb.BinaryReader): SignUpResponse;
}

export namespace SignUpResponse {
    export type AsObject = {
        account?: AccountInfo.AsObject,
        error: SignUpErrorStatus,
    }

    export enum StatusCase {
        STATUS_NOT_SET = 0,
    
    ACCOUNT = 1,

    ERROR = 2,

    }

}

export class DeleteAccountRequest extends jspb.Message { 
    getAccessToken(): string;
    setAccessToken(value: string): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): DeleteAccountRequest.AsObject;
    static toObject(includeInstance: boolean, msg: DeleteAccountRequest): DeleteAccountRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: DeleteAccountRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): DeleteAccountRequest;
    static deserializeBinaryFromReader(message: DeleteAccountRequest, reader: jspb.BinaryReader): DeleteAccountRequest;
}

export namespace DeleteAccountRequest {
    export type AsObject = {
        accessToken: string,
    }
}

export class DeleteAccountResponse extends jspb.Message { 

    hasId(): boolean;
    clearId(): void;
    getId(): string;
    setId(value: string): void;


    hasError(): boolean;
    clearError(): void;
    getError(): DeleteAccountErrorStatus;
    setError(value: DeleteAccountErrorStatus): void;


    getStatusCase(): DeleteAccountResponse.StatusCase;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): DeleteAccountResponse.AsObject;
    static toObject(includeInstance: boolean, msg: DeleteAccountResponse): DeleteAccountResponse.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: DeleteAccountResponse, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): DeleteAccountResponse;
    static deserializeBinaryFromReader(message: DeleteAccountResponse, reader: jspb.BinaryReader): DeleteAccountResponse;
}

export namespace DeleteAccountResponse {
    export type AsObject = {
        id: string,
        error: DeleteAccountErrorStatus,
    }

    export enum StatusCase {
        STATUS_NOT_SET = 0,
    
    ID = 1,

    ERROR = 2,

    }

}

export class AccountResponse extends jspb.Message { 

    hasAccount(): boolean;
    clearAccount(): void;
    getAccount(): AccountInfo | undefined;
    setAccount(value?: AccountInfo): void;


    hasError(): boolean;
    clearError(): void;
    getError(): AuthErrorStatus;
    setError(value: AuthErrorStatus): void;


    getStatusCase(): AccountResponse.StatusCase;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): AccountResponse.AsObject;
    static toObject(includeInstance: boolean, msg: AccountResponse): AccountResponse.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: AccountResponse, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): AccountResponse;
    static deserializeBinaryFromReader(message: AccountResponse, reader: jspb.BinaryReader): AccountResponse;
}

export namespace AccountResponse {
    export type AsObject = {
        account?: AccountInfo.AsObject,
        error: AuthErrorStatus,
    }

    export enum StatusCase {
        STATUS_NOT_SET = 0,
    
    ACCOUNT = 1,

    ERROR = 2,

    }

}

export class UserCredentials extends jspb.Message { 
    getUsername(): string;
    setUsername(value: string): void;

    getPassword(): string;
    setPassword(value: string): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): UserCredentials.AsObject;
    static toObject(includeInstance: boolean, msg: UserCredentials): UserCredentials.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: UserCredentials, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): UserCredentials;
    static deserializeBinaryFromReader(message: UserCredentials, reader: jspb.BinaryReader): UserCredentials;
}

export namespace UserCredentials {
    export type AsObject = {
        username: string,
        password: string,
    }
}

export class AccountInfo extends jspb.Message { 
    getId(): string;
    setId(value: string): void;

    getUsername(): string;
    setUsername(value: string): void;

    getCreatedAt(): string;
    setCreatedAt(value: string): void;

    getUpdatedAt(): string;
    setUpdatedAt(value: string): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): AccountInfo.AsObject;
    static toObject(includeInstance: boolean, msg: AccountInfo): AccountInfo.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: AccountInfo, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): AccountInfo;
    static deserializeBinaryFromReader(message: AccountInfo, reader: jspb.BinaryReader): AccountInfo;
}

export namespace AccountInfo {
    export type AsObject = {
        id: string,
        username: string,
        createdAt: string,
        updatedAt: string,
    }
}

export class JWTTokens extends jspb.Message { 
    getAccessToken(): string;
    setAccessToken(value: string): void;

    getRefreshToken(): string;
    setRefreshToken(value: string): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): JWTTokens.AsObject;
    static toObject(includeInstance: boolean, msg: JWTTokens): JWTTokens.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: JWTTokens, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): JWTTokens;
    static deserializeBinaryFromReader(message: JWTTokens, reader: jspb.BinaryReader): JWTTokens;
}

export namespace JWTTokens {
    export type AsObject = {
        accessToken: string,
        refreshToken: string,
    }
}

export class RenewRequest extends jspb.Message { 
    getRefreshToken(): string;
    setRefreshToken(value: string): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): RenewRequest.AsObject;
    static toObject(includeInstance: boolean, msg: RenewRequest): RenewRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: RenewRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): RenewRequest;
    static deserializeBinaryFromReader(message: RenewRequest, reader: jspb.BinaryReader): RenewRequest;
}

export namespace RenewRequest {
    export type AsObject = {
        refreshToken: string,
    }
}

export class RenewResponse extends jspb.Message { 

    hasTokens(): boolean;
    clearTokens(): void;
    getTokens(): JWTTokens | undefined;
    setTokens(value?: JWTTokens): void;


    hasError(): boolean;
    clearError(): void;
    getError(): AuthErrorStatus;
    setError(value: AuthErrorStatus): void;


    getStatusCase(): RenewResponse.StatusCase;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): RenewResponse.AsObject;
    static toObject(includeInstance: boolean, msg: RenewResponse): RenewResponse.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: RenewResponse, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): RenewResponse;
    static deserializeBinaryFromReader(message: RenewResponse, reader: jspb.BinaryReader): RenewResponse;
}

export namespace RenewResponse {
    export type AsObject = {
        tokens?: JWTTokens.AsObject,
        error: AuthErrorStatus,
    }

    export enum StatusCase {
        STATUS_NOT_SET = 0,
    
    TOKENS = 1,

    ERROR = 2,

    }

}

export class AccountRequest extends jspb.Message { 
    getAccessToken(): string;
    setAccessToken(value: string): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): AccountRequest.AsObject;
    static toObject(includeInstance: boolean, msg: AccountRequest): AccountRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: AccountRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): AccountRequest;
    static deserializeBinaryFromReader(message: AccountRequest, reader: jspb.BinaryReader): AccountRequest;
}

export namespace AccountRequest {
    export type AsObject = {
        accessToken: string,
    }
}

export enum AuthErrorStatus {
    SERVER_ERROR = 0,
    NOT_FOUND = 1,
    BAD_CREDENTIALS = 2,
    INVALID_TOKEN = 3,
    EXPIRED_TOKEN = 4,
}

export enum SignUpErrorStatus {
    USERNAME_IN_USE = 0,
    SIGNUP_SERVER_ERROR = 1,
    SIGNUP_INVALID_PASSWORD = 3,
    SIGNUP_INVALID_USERNAME = 4,
}

export enum DeleteAccountErrorStatus {
    DELETE_SERVER_ERROR = 0,
    DELETE_NOT_FOUND = 1,
    DELETE_INVALID_TOKEN = 2,
    DELETE_TOKEN_EXPIRED = 3,
}
