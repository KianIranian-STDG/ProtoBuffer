// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PushUserInfoExpired.proto

package com.kianiranian.proto;

public final class ProtoPushUserInfoExpired {
  private ProtoPushUserInfoExpired() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PushUserInfoExpiredResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.PushUserInfoExpiredResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.proto.Response response = 1;</code>
     * @return Whether the response field is set.
     */
    boolean hasResponse();
    /**
     * <code>.proto.Response response = 1;</code>
     * @return The response.
     */
    com.kianiranian.proto.ProtoResponse.Response getResponse();
    /**
     * <code>.proto.Response response = 1;</code>
     */
    com.kianiranian.proto.ProtoResponse.ResponseOrBuilder getResponseOrBuilder();

    /**
     * <code>uint64 user_id = 2;</code>
     * @return The userId.
     */
    long getUserId();
  }
  /**
   * Protobuf type {@code proto.PushUserInfoExpiredResponse}
   */
  public  static final class PushUserInfoExpiredResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.PushUserInfoExpiredResponse)
      PushUserInfoExpiredResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PushUserInfoExpiredResponse.newBuilder() to construct.
    private PushUserInfoExpiredResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PushUserInfoExpiredResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PushUserInfoExpiredResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PushUserInfoExpiredResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.kianiranian.proto.ProtoResponse.Response.Builder subBuilder = null;
              if (response_ != null) {
                subBuilder = response_.toBuilder();
              }
              response_ = input.readMessage(com.kianiranian.proto.ProtoResponse.Response.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(response_);
                response_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              userId_ = input.readUInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kianiranian.proto.ProtoPushUserInfoExpired.internal_static_proto_PushUserInfoExpiredResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kianiranian.proto.ProtoPushUserInfoExpired.internal_static_proto_PushUserInfoExpiredResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse.class, com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse.Builder.class);
    }

    public static final int RESPONSE_FIELD_NUMBER = 1;
    private com.kianiranian.proto.ProtoResponse.Response response_;
    /**
     * <code>.proto.Response response = 1;</code>
     * @return Whether the response field is set.
     */
    public boolean hasResponse() {
      return response_ != null;
    }
    /**
     * <code>.proto.Response response = 1;</code>
     * @return The response.
     */
    public com.kianiranian.proto.ProtoResponse.Response getResponse() {
      return response_ == null ? com.kianiranian.proto.ProtoResponse.Response.getDefaultInstance() : response_;
    }
    /**
     * <code>.proto.Response response = 1;</code>
     */
    public com.kianiranian.proto.ProtoResponse.ResponseOrBuilder getResponseOrBuilder() {
      return getResponse();
    }

    public static final int USER_ID_FIELD_NUMBER = 2;
    private long userId_;
    /**
     * <code>uint64 user_id = 2;</code>
     * @return The userId.
     */
    public long getUserId() {
      return userId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (userId_ != 0L) {
        output.writeUInt64(2, userId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (response_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getResponse());
      }
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, userId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse)) {
        return super.equals(obj);
      }
      com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse other = (com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse) obj;

      if (hasResponse() != other.hasResponse()) return false;
      if (hasResponse()) {
        if (!getResponse()
            .equals(other.getResponse())) return false;
      }
      if (getUserId()
          != other.getUserId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasResponse()) {
        hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getResponse().hashCode();
      }
      hash = (37 * hash) + USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUserId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code proto.PushUserInfoExpiredResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.PushUserInfoExpiredResponse)
        com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.kianiranian.proto.ProtoPushUserInfoExpired.internal_static_proto_PushUserInfoExpiredResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.kianiranian.proto.ProtoPushUserInfoExpired.internal_static_proto_PushUserInfoExpiredResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse.class, com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse.Builder.class);
      }

      // Construct using com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (responseBuilder_ == null) {
          response_ = null;
        } else {
          response_ = null;
          responseBuilder_ = null;
        }
        userId_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.kianiranian.proto.ProtoPushUserInfoExpired.internal_static_proto_PushUserInfoExpiredResponse_descriptor;
      }

      @java.lang.Override
      public com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse getDefaultInstanceForType() {
        return com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse build() {
        com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse buildPartial() {
        com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse result = new com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse(this);
        if (responseBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseBuilder_.build();
        }
        result.userId_ = userId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse) {
          return mergeFrom((com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse other) {
        if (other == com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse.getDefaultInstance()) return this;
        if (other.hasResponse()) {
          mergeResponse(other.getResponse());
        }
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.kianiranian.proto.ProtoResponse.Response response_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.kianiranian.proto.ProtoResponse.Response, com.kianiranian.proto.ProtoResponse.Response.Builder, com.kianiranian.proto.ProtoResponse.ResponseOrBuilder> responseBuilder_;
      /**
       * <code>.proto.Response response = 1;</code>
       * @return Whether the response field is set.
       */
      public boolean hasResponse() {
        return responseBuilder_ != null || response_ != null;
      }
      /**
       * <code>.proto.Response response = 1;</code>
       * @return The response.
       */
      public com.kianiranian.proto.ProtoResponse.Response getResponse() {
        if (responseBuilder_ == null) {
          return response_ == null ? com.kianiranian.proto.ProtoResponse.Response.getDefaultInstance() : response_;
        } else {
          return responseBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public Builder setResponse(com.kianiranian.proto.ProtoResponse.Response value) {
        if (responseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          response_ = value;
          onChanged();
        } else {
          responseBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public Builder setResponse(
          com.kianiranian.proto.ProtoResponse.Response.Builder builderForValue) {
        if (responseBuilder_ == null) {
          response_ = builderForValue.build();
          onChanged();
        } else {
          responseBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public Builder mergeResponse(com.kianiranian.proto.ProtoResponse.Response value) {
        if (responseBuilder_ == null) {
          if (response_ != null) {
            response_ =
              com.kianiranian.proto.ProtoResponse.Response.newBuilder(response_).mergeFrom(value).buildPartial();
          } else {
            response_ = value;
          }
          onChanged();
        } else {
          responseBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public Builder clearResponse() {
        if (responseBuilder_ == null) {
          response_ = null;
          onChanged();
        } else {
          response_ = null;
          responseBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public com.kianiranian.proto.ProtoResponse.Response.Builder getResponseBuilder() {
        
        onChanged();
        return getResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public com.kianiranian.proto.ProtoResponse.ResponseOrBuilder getResponseOrBuilder() {
        if (responseBuilder_ != null) {
          return responseBuilder_.getMessageOrBuilder();
        } else {
          return response_ == null ?
              com.kianiranian.proto.ProtoResponse.Response.getDefaultInstance() : response_;
        }
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.kianiranian.proto.ProtoResponse.Response, com.kianiranian.proto.ProtoResponse.Response.Builder, com.kianiranian.proto.ProtoResponse.ResponseOrBuilder> 
          getResponseFieldBuilder() {
        if (responseBuilder_ == null) {
          responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.kianiranian.proto.ProtoResponse.Response, com.kianiranian.proto.ProtoResponse.Response.Builder, com.kianiranian.proto.ProtoResponse.ResponseOrBuilder>(
                  getResponse(),
                  getParentForChildren(),
                  isClean());
          response_ = null;
        }
        return responseBuilder_;
      }

      private long userId_ ;
      /**
       * <code>uint64 user_id = 2;</code>
       * @return The userId.
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>uint64 user_id = 2;</code>
       * @param value The userId to set.
       * @return This builder for chaining.
       */
      public Builder setUserId(long value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 user_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserId() {
        
        userId_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:proto.PushUserInfoExpiredResponse)
    }

    // @@protoc_insertion_point(class_scope:proto.PushUserInfoExpiredResponse)
    private static final com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse();
    }

    public static com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PushUserInfoExpiredResponse>
        PARSER = new com.google.protobuf.AbstractParser<PushUserInfoExpiredResponse>() {
      @java.lang.Override
      public PushUserInfoExpiredResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PushUserInfoExpiredResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PushUserInfoExpiredResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PushUserInfoExpiredResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.kianiranian.proto.ProtoPushUserInfoExpired.PushUserInfoExpiredResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PushUserInfoExpiredResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PushUserInfoExpiredResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031PushUserInfoExpired.proto\022\005proto\032\016Resp" +
      "onse.proto\"Q\n\033PushUserInfoExpiredRespons" +
      "e\022!\n\010response\030\001 \001(\0132\017.proto.Response\022\017\n\007" +
      "user_id\030\002 \001(\004B1\n\025com.kianiranian.protoB\030" +
      "ProtoPushUserInfoExpiredb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.kianiranian.proto.ProtoResponse.getDescriptor(),
        });
    internal_static_proto_PushUserInfoExpiredResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_PushUserInfoExpiredResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PushUserInfoExpiredResponse_descriptor,
        new java.lang.String[] { "Response", "UserId", });
    com.kianiranian.proto.ProtoResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
