// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnumType.proto

package com.github.bean.protobuf;

public final class EnumTypeProtos {
  private EnumTypeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.github.bean.protobuf.EnumType}
   */
  public enum EnumType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNIVERSAL = 0;</code>
     */
    UNIVERSAL(0),
    /**
     * <code>WEB = 1;</code>
     */
    WEB(1),
    /**
     * <code>IMAGES = 2;</code>
     */
    IMAGES(2),
    /**
     * <code>LOCAL = 3;</code>
     */
    LOCAL(3),
    /**
     * <code>NEWS = 4;</code>
     */
    NEWS(4),
    /**
     * <code>PRODUCTS = 5;</code>
     */
    PRODUCTS(5),
    /**
     * <code>VIDEO = 6;</code>
     */
    VIDEO(6),
    ;

    /**
     * <code>UNIVERSAL = 0;</code>
     */
    public static final int UNIVERSAL_VALUE = 0;
    /**
     * <code>WEB = 1;</code>
     */
    public static final int WEB_VALUE = 1;
    /**
     * <code>IMAGES = 2;</code>
     */
    public static final int IMAGES_VALUE = 2;
    /**
     * <code>LOCAL = 3;</code>
     */
    public static final int LOCAL_VALUE = 3;
    /**
     * <code>NEWS = 4;</code>
     */
    public static final int NEWS_VALUE = 4;
    /**
     * <code>PRODUCTS = 5;</code>
     */
    public static final int PRODUCTS_VALUE = 5;
    /**
     * <code>VIDEO = 6;</code>
     */
    public static final int VIDEO_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EnumType valueOf(int value) {
      return forNumber(value);
    }

    public static EnumType forNumber(int value) {
      switch (value) {
        case 0: return UNIVERSAL;
        case 1: return WEB;
        case 2: return IMAGES;
        case 3: return LOCAL;
        case 4: return NEWS;
        case 5: return PRODUCTS;
        case 6: return VIDEO;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EnumType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EnumType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EnumType>() {
            public EnumType findValueByNumber(int number) {
              return EnumType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.github.bean.protobuf.EnumTypeProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final EnumType[] VALUES = values();

    public static EnumType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EnumType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.github.bean.protobuf.EnumType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016EnumType.proto\022\030com.github.bean.protob" +
      "uf*\\\n\010EnumType\022\r\n\tUNIVERSAL\020\000\022\007\n\003WEB\020\001\022\n" +
      "\n\006IMAGES\020\002\022\t\n\005LOCAL\020\003\022\010\n\004NEWS\020\004\022\014\n\010PRODU" +
      "CTS\020\005\022\t\n\005VIDEO\020\006B*\n\030com.github.bean.prot" +
      "obufB\016EnumTypeProtos"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
