// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

public final class ImageService {
  private ImageService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_CreateImageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_CreateImageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_CreateImageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_CreateImageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_DeleteImageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_DeleteImageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_DeleteImageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_DeleteImageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_GetImageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_GetImageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_GetImageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_GetImageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_GetImageDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_GetImageDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_GetImageDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_GetImageDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_GetUserImagesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_GetUserImagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_GetUserImagesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_GetUserImagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_LikeImageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_LikeImageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_LikeImageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_LikeImageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_GetLikesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_GetLikesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_GetLikesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_GetLikesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_SearchImagesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_SearchImagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_SearchImagesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_SearchImagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_ImageSearchPage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_ImageSearchPage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_UserImagePage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_UserImagePage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_Image_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_Image_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_ImageLikesPage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_ImageLikesPage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023image_service.proto\022\005Image\"R\n\022CreateIm" +
      "ageRequest\022$\n\tmeta_data\030\001 \001(\0132\017.Image.Me" +
      "tadataH\000\022\016\n\004data\030\002 \001(\014H\000B\006\n\004part\"U\n\010Meta" +
      "data\022\017\n\007caption\030\001 \001(\t\022\022\n\ncreator_id\030\002 \001(" +
      "\t\022$\n\nimage_type\030\003 \001(\0162\020.Image.ImageType\"" +
      "n\n\023CreateImageResponse\022\035\n\005image\030\001 \001(\0132\014." +
      "Image.ImageH\000\022.\n\005error\030\002 \001(\0162\035.Image.Cre" +
      "ateImageErrorStatusH\000B\010\n\006status\" \n\022Delet" +
      "eImageRequest\022\n\n\002id\030\001 \001(\t\"?\n\023DeleteImage" +
      "Response\022(\n\006status\030\001 \001(\0162\030.Image.DeleteI",
      "mageStatus\"#\n\017GetImageRequest\022\020\n\010image_i" +
      "d\030\001 \001(\t\"h\n\020GetImageResponse\022\035\n\005image\030\001 \001" +
      "(\0132\014.Image.ImageH\000\022+\n\005error\030\002 \001(\0162\032.Imag" +
      "e.GetImageErrorStatusH\000B\010\n\006status\"\'\n\023Get" +
      "ImageDataRequest\022\020\n\010image_id\030\001 \001(\t\"\205\001\n\024G" +
      "etImageDataResponse\022\016\n\004data\030\001 \001(\014H\000\022&\n\ni" +
      "mage_type\030\002 \001(\0162\020.Image.ImageTypeH\000\022+\n\005e" +
      "rror\030\003 \001(\0162\032.Image.GetImageErrorStatusH\000" +
      "B\010\n\006status\"C\n\024GetUserImagesRequest\022\017\n\007us" +
      "er_id\030\001 \001(\t\022\014\n\004size\030\002 \001(\005\022\014\n\004page\030\003 \001(\005\"",
      "y\n\025GetUserImagesResponse\022$\n\004page\030\001 \001(\0132\024" +
      ".Image.UserImagePageH\000\0220\n\005error\030\002 \001(\0162\037." +
      "Image.GetUserImagesErrorStatusH\000B\010\n\006stat" +
      "us\"E\n\020LikeImageRequest\022\020\n\010image_id\030\001 \001(\t" +
      "\022\017\n\007user_id\030\002 \001(\t\022\016\n\006unlike\030\003 \001(\010\"C\n\021Lik" +
      "eImageResponse\022.\n\006status\030\001 \001(\0162\036.Image.L" +
      "ikeImageResponseStatus\"?\n\017GetLikesReques" +
      "t\022\020\n\010image_id\030\001 \001(\t\022\014\n\004size\030\002 \001(\005\022\014\n\004pag" +
      "e\030\003 \001(\005\"p\n\020GetLikesResponse\022+\n\005error\030\001 \001" +
      "(\0162\032.Image.GetLikesErrorStatusH\000\022%\n\004page",
      "\030\002 \001(\0132\025.Image.ImageLikesPageH\000B\010\n\006statu" +
      "s\"c\n\023SearchImagesRequest\022\022\n\010hash_tag\030\001 \001" +
      "(\tH\000\022\022\n\010user_tag\030\002 \001(\tH\000\022\014\n\004size\030\003 \001(\005\022\014" +
      "\n\004page\030\004 \001(\005B\010\n\006search\"y\n\024SearchImagesRe" +
      "sponse\022&\n\004page\030\001 \001(\0132\026.Image.ImageSearch" +
      "PageH\000\022/\n\005error\030\002 \001(\0162\036.Image.SearchImag" +
      "esErrorStatusH\000B\010\n\006status\"\222\001\n\017ImageSearc" +
      "hPage\022\022\n\010hash_tag\030\001 \001(\tH\000\022\022\n\010user_tag\030\002 " +
      "\001(\tH\000\022\014\n\004size\030\003 \001(\005\022\014\n\004page\030\004 \001(\005\022\023\n\013tot" +
      "al_count\030\005 \001(\005\022\034\n\006images\030\006 \003(\0132\014.Image.I",
      "mageB\010\n\006search\"~\n\rUserImagePage\022\017\n\007user_" +
      "id\030\001 \001(\t\022\014\n\004size\030\002 \001(\005\022\014\n\004page\030\003 \001(\005\022\r\n\005" +
      "count\030\004 \001(\005\022\023\n\013total_count\030\005 \001(\005\022\034\n\006imag" +
      "es\030\006 \003(\0132\014.Image.Image\"\260\001\n\005Image\022\n\n\002id\030\001" +
      " \001(\t\022\021\n\tmime_type\030\002 \001(\t\022\r\n\005width\030\003 \001(\005\022\016" +
      "\n\006height\030\004 \001(\005\022\017\n\007user_id\030\005 \001(\t\022\017\n\007capti" +
      "on\030\006 \001(\t\022\022\n\ncreated_at\030\007 \001(\t\022\021\n\tuser_tag" +
      "s\030\010 \003(\t\022\021\n\thash_tags\030\t \003(\t\022\r\n\005likes\030\n \001(" +
      "\005\"}\n\016ImageLikesPage\022\020\n\010image_id\030\001 \001(\t\022\014\n" +
      "\004size\030\002 \001(\005\022\014\n\004page\030\003 \001(\005\022\023\n\013users_count",
      "\030\004 \001(\005\022\031\n\021total_users_count\030\005 \001(\005\022\r\n\005use" +
      "rs\030\006 \003(\t*\035\n\tImageType\022\007\n\003PNG\020\000\022\007\n\003JPG\020\001*" +
      "\214\001\n\026CreateImageErrorStatus\022\035\n\031CREATE_IMA" +
      "GE_SERVER_ERROR\020\000\022\024\n\020CONTENT_TOO_LONG\020\001\022" +
      "\025\n\021CREATOR_NOT_FOUND\020\002\022\020\n\014INVALID_DATA\020\003" +
      "\022\024\n\020CAPTION_TOO_LONG\020\004*S\n\021DeleteImageSta" +
      "tus\022\035\n\031DELETE_IMAGE_SERVER_ERROR\020\000\022\027\n\023DE" +
      "LETABLE_NOT_FOUND\020\001\022\006\n\002OK\020\002*F\n\023GetImageE" +
      "rrorStatus\022\032\n\026GET_IMAGE_SERVER_ERROR\020\000\022\023" +
      "\n\017IMAGE_NOT_FOUND\020\001*P\n\030GetUserImagesErro",
      "rStatus\022 \n\034GET_USER_IMAGES_SERVER_ERROR\020" +
      "\000\022\022\n\016USER_NOT_FOUND\020\001*x\n\027LikeImageRespon" +
      "seStatus\022\033\n\027LIKE_IMAGE_SERVER_ERROR\020\000\022\031\n" +
      "\025IMAGE_NOT_FOUND_ERROR\020\001\022\030\n\024USER_NOT_FOU" +
      "ND_ERROR\020\002\022\013\n\007LIKE_OK\020\003*P\n\023GetLikesError" +
      "Status\022\032\n\026GET_LIKES_SERVER_ERROR\020\000\022\035\n\031GE" +
      "T_LIKES_IMAGE_NOT_FOUND\020\001*K\n\027SearchImage" +
      "sErrorStatus\022\036\n\032SEARCH_IMAGES_SERVER_ERR" +
      "OR\020\000\022\020\n\014EMPTY_SEARCH\020\0012\305\004\n\006Images\022H\n\013Cre" +
      "ateImage\022\031.Image.CreateImageRequest\032\032.Im",
      "age.CreateImageResponse\"\000(\001\022F\n\013DeleteIma" +
      "ge\022\031.Image.DeleteImageRequest\032\032.Image.De" +
      "leteImageResponse\"\000\022=\n\010GetImage\022\026.Image." +
      "GetImageRequest\032\027.Image.GetImageResponse" +
      "\"\000\022K\n\014GetImageData\022\032.Image.GetImageDataR" +
      "equest\032\033.Image.GetImageDataResponse\"\0000\001\022" +
      "L\n\rGetUserImages\022\033.Image.GetUserImagesRe" +
      "quest\032\034.Image.GetUserImagesResponse\"\000\022I\n" +
      "\014SearchImages\022\032.Image.SearchImagesReques" +
      "t\032\033.Image.SearchImagesResponse\"\000\022@\n\tLike",
      "Image\022\027.Image.LikeImageRequest\032\030.Image.L" +
      "ikeImageResponse\"\000\022B\n\rGetImageLikes\022\026.Im" +
      "age.GetLikesRequest\032\027.Image.GetLikesResp" +
      "onse\"\000B3\n!com.instagram_clone.image_serv" +
      "iceB\014ImageServiceP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Image_CreateImageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Image_CreateImageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_CreateImageRequest_descriptor,
        new java.lang.String[] { "MetaData", "Data", "Part", });
    internal_static_Image_Metadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Image_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_Metadata_descriptor,
        new java.lang.String[] { "Caption", "CreatorId", "ImageType", });
    internal_static_Image_CreateImageResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Image_CreateImageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_CreateImageResponse_descriptor,
        new java.lang.String[] { "Image", "Error", "Status", });
    internal_static_Image_DeleteImageRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Image_DeleteImageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_DeleteImageRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_Image_DeleteImageResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Image_DeleteImageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_DeleteImageResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_Image_GetImageRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Image_GetImageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_GetImageRequest_descriptor,
        new java.lang.String[] { "ImageId", });
    internal_static_Image_GetImageResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Image_GetImageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_GetImageResponse_descriptor,
        new java.lang.String[] { "Image", "Error", "Status", });
    internal_static_Image_GetImageDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Image_GetImageDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_GetImageDataRequest_descriptor,
        new java.lang.String[] { "ImageId", });
    internal_static_Image_GetImageDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Image_GetImageDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_GetImageDataResponse_descriptor,
        new java.lang.String[] { "Data", "ImageType", "Error", "Status", });
    internal_static_Image_GetUserImagesRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Image_GetUserImagesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_GetUserImagesRequest_descriptor,
        new java.lang.String[] { "UserId", "Size", "Page", });
    internal_static_Image_GetUserImagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_Image_GetUserImagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_GetUserImagesResponse_descriptor,
        new java.lang.String[] { "Page", "Error", "Status", });
    internal_static_Image_LikeImageRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_Image_LikeImageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_LikeImageRequest_descriptor,
        new java.lang.String[] { "ImageId", "UserId", "Unlike", });
    internal_static_Image_LikeImageResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_Image_LikeImageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_LikeImageResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_Image_GetLikesRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_Image_GetLikesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_GetLikesRequest_descriptor,
        new java.lang.String[] { "ImageId", "Size", "Page", });
    internal_static_Image_GetLikesResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_Image_GetLikesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_GetLikesResponse_descriptor,
        new java.lang.String[] { "Error", "Page", "Status", });
    internal_static_Image_SearchImagesRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_Image_SearchImagesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_SearchImagesRequest_descriptor,
        new java.lang.String[] { "HashTag", "UserTag", "Size", "Page", "Search", });
    internal_static_Image_SearchImagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_Image_SearchImagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_SearchImagesResponse_descriptor,
        new java.lang.String[] { "Page", "Error", "Status", });
    internal_static_Image_ImageSearchPage_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_Image_ImageSearchPage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_ImageSearchPage_descriptor,
        new java.lang.String[] { "HashTag", "UserTag", "Size", "Page", "TotalCount", "Images", "Search", });
    internal_static_Image_UserImagePage_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_Image_UserImagePage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_UserImagePage_descriptor,
        new java.lang.String[] { "UserId", "Size", "Page", "Count", "TotalCount", "Images", });
    internal_static_Image_Image_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_Image_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_Image_descriptor,
        new java.lang.String[] { "Id", "MimeType", "Width", "Height", "UserId", "Caption", "CreatedAt", "UserTags", "HashTags", "Likes", });
    internal_static_Image_ImageLikesPage_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_Image_ImageLikesPage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_ImageLikesPage_descriptor,
        new java.lang.String[] { "ImageId", "Size", "Page", "UsersCount4", "TotalUsersCount", "Users6", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
