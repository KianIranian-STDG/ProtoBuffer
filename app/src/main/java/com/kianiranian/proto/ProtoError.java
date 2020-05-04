// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Error.proto

package com.kianiranian.proto;

public final class ProtoError {
  private ProtoError() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ErrorResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ErrorResponse)
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
     * <code>uint32 major_code = 2;</code>
     * @return The majorCode.
     */
    int getMajorCode();

    /**
     * <code>uint32 minor_code = 3;</code>
     * @return The minorCode.
     */
    int getMinorCode();

    /**
     * <code>uint32 wait = 4;</code>
     * @return The wait.
     */
    int getWait();

    /**
     * <code>string message = 5;</code>
     * @return The message.
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 5;</code>
     * @return The bytes for message.
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code proto.ErrorResponse}
   */
  public  static final class ErrorResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.ErrorResponse)
      ErrorResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ErrorResponse.newBuilder() to construct.
    private ErrorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ErrorResponse() {
      message_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ErrorResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ErrorResponse(
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

              majorCode_ = input.readUInt32();
              break;
            }
            case 24: {

              minorCode_ = input.readUInt32();
              break;
            }
            case 32: {

              wait_ = input.readUInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              message_ = s;
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
      return com.kianiranian.proto.ProtoError.internal_static_proto_ErrorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kianiranian.proto.ProtoError.internal_static_proto_ErrorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kianiranian.proto.ProtoError.ErrorResponse.class, com.kianiranian.proto.ProtoError.ErrorResponse.Builder.class);
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

    public static final int MAJOR_CODE_FIELD_NUMBER = 2;
    private int majorCode_;
    /**
     * <code>uint32 major_code = 2;</code>
     * @return The majorCode.
     */
    public int getMajorCode() {
      return majorCode_;
    }

    public static final int MINOR_CODE_FIELD_NUMBER = 3;
    private int minorCode_;
    /**
     * <code>uint32 minor_code = 3;</code>
     * @return The minorCode.
     */
    public int getMinorCode() {
      return minorCode_;
    }

    public static final int WAIT_FIELD_NUMBER = 4;
    private int wait_;
    /**
     * <code>uint32 wait = 4;</code>
     * @return The wait.
     */
    public int getWait() {
      return wait_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 5;
    private volatile java.lang.Object message_;
    /**
     * <code>string message = 5;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 5;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (majorCode_ != 0) {
        output.writeUInt32(2, majorCode_);
      }
      if (minorCode_ != 0) {
        output.writeUInt32(3, minorCode_);
      }
      if (wait_ != 0) {
        output.writeUInt32(4, wait_);
      }
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, message_);
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
      if (majorCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, majorCode_);
      }
      if (minorCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, minorCode_);
      }
      if (wait_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, wait_);
      }
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, message_);
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
      if (!(obj instanceof com.kianiranian.proto.ProtoError.ErrorResponse)) {
        return super.equals(obj);
      }
      com.kianiranian.proto.ProtoError.ErrorResponse other = (com.kianiranian.proto.ProtoError.ErrorResponse) obj;

      if (hasResponse() != other.hasResponse()) return false;
      if (hasResponse()) {
        if (!getResponse()
            .equals(other.getResponse())) return false;
      }
      if (getMajorCode()
          != other.getMajorCode()) return false;
      if (getMinorCode()
          != other.getMinorCode()) return false;
      if (getWait()
          != other.getWait()) return false;
      if (!getMessage()
          .equals(other.getMessage())) return false;
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
      hash = (37 * hash) + MAJOR_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getMajorCode();
      hash = (37 * hash) + MINOR_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getMinorCode();
      hash = (37 * hash) + WAIT_FIELD_NUMBER;
      hash = (53 * hash) + getWait();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.kianiranian.proto.ProtoError.ErrorResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kianiranian.proto.ProtoError.ErrorResponse parseFrom(
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
    public static Builder newBuilder(com.kianiranian.proto.ProtoError.ErrorResponse prototype) {
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
     * Protobuf type {@code proto.ErrorResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ErrorResponse)
        com.kianiranian.proto.ProtoError.ErrorResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.kianiranian.proto.ProtoError.internal_static_proto_ErrorResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.kianiranian.proto.ProtoError.internal_static_proto_ErrorResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.kianiranian.proto.ProtoError.ErrorResponse.class, com.kianiranian.proto.ProtoError.ErrorResponse.Builder.class);
      }

      // Construct using com.kianiranian.proto.ProtoError.ErrorResponse.newBuilder()
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
        majorCode_ = 0;

        minorCode_ = 0;

        wait_ = 0;

        message_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.kianiranian.proto.ProtoError.internal_static_proto_ErrorResponse_descriptor;
      }

      @java.lang.Override
      public com.kianiranian.proto.ProtoError.ErrorResponse getDefaultInstanceForType() {
        return com.kianiranian.proto.ProtoError.ErrorResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.kianiranian.proto.ProtoError.ErrorResponse build() {
        com.kianiranian.proto.ProtoError.ErrorResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.kianiranian.proto.ProtoError.ErrorResponse buildPartial() {
        com.kianiranian.proto.ProtoError.ErrorResponse result = new com.kianiranian.proto.ProtoError.ErrorResponse(this);
        if (responseBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseBuilder_.build();
        }
        result.majorCode_ = majorCode_;
        result.minorCode_ = minorCode_;
        result.wait_ = wait_;
        result.message_ = message_;
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
        if (other instanceof com.kianiranian.proto.ProtoError.ErrorResponse) {
          return mergeFrom((com.kianiranian.proto.ProtoError.ErrorResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.kianiranian.proto.ProtoError.ErrorResponse other) {
        if (other == com.kianiranian.proto.ProtoError.ErrorResponse.getDefaultInstance()) return this;
        if (other.hasResponse()) {
          mergeResponse(other.getResponse());
        }
        if (other.getMajorCode() != 0) {
          setMajorCode(other.getMajorCode());
        }
        if (other.getMinorCode() != 0) {
          setMinorCode(other.getMinorCode());
        }
        if (other.getWait() != 0) {
          setWait(other.getWait());
        }
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
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
        com.kianiranian.proto.ProtoError.ErrorResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.kianiranian.proto.ProtoError.ErrorResponse) e.getUnfinishedMessage();
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

      private int majorCode_ ;
      /**
       * <code>uint32 major_code = 2;</code>
       * @return The majorCode.
       */
      public int getMajorCode() {
        return majorCode_;
      }
      /**
       * <code>uint32 major_code = 2;</code>
       * @param value The majorCode to set.
       * @return This builder for chaining.
       */
      public Builder setMajorCode(int value) {
        
        majorCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 major_code = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMajorCode() {
        
        majorCode_ = 0;
        onChanged();
        return this;
      }

      private int minorCode_ ;
      /**
       * <code>uint32 minor_code = 3;</code>
       * @return The minorCode.
       */
      public int getMinorCode() {
        return minorCode_;
      }
      /**
       * <code>uint32 minor_code = 3;</code>
       * @param value The minorCode to set.
       * @return This builder for chaining.
       */
      public Builder setMinorCode(int value) {
        
        minorCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 minor_code = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinorCode() {
        
        minorCode_ = 0;
        onChanged();
        return this;
      }

      private int wait_ ;
      /**
       * <code>uint32 wait = 4;</code>
       * @return The wait.
       */
      public int getWait() {
        return wait_;
      }
      /**
       * <code>uint32 wait = 4;</code>
       * @param value The wait to set.
       * @return This builder for chaining.
       */
      public Builder setWait(int value) {
        
        wait_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wait = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearWait() {
        
        wait_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 5;</code>
       * @return The message.
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 5;</code>
       * @return The bytes for message.
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 5;</code>
       * @param value The message to set.
       * @return This builder for chaining.
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string message = 5;</code>
       * @param value The bytes for message to set.
       * @return This builder for chaining.
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        message_ = value;
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


      // @@protoc_insertion_point(builder_scope:proto.ErrorResponse)
    }

    // @@protoc_insertion_point(class_scope:proto.ErrorResponse)
    private static final com.kianiranian.proto.ProtoError.ErrorResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.kianiranian.proto.ProtoError.ErrorResponse();
    }

    public static com.kianiranian.proto.ProtoError.ErrorResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ErrorResponse>
        PARSER = new com.google.protobuf.AbstractParser<ErrorResponse>() {
      @java.lang.Override
      public ErrorResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ErrorResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.kianiranian.proto.ProtoError.ErrorResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ErrorResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ErrorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Error.proto\022\005proto\032\016Response.proto\"y\n\r" +
      "ErrorResponse\022!\n\010response\030\001 \001(\0132\017.proto." +
      "Response\022\022\n\nmajor_code\030\002 \001(\r\022\022\n\nminor_co" +
      "de\030\003 \001(\r\022\014\n\004wait\030\004 \001(\r\022\017\n\007message\030\005 \001(\tB" +
      "#\n\025com.kianiranian.protoB\nProtoErrorb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.kianiranian.proto.ProtoResponse.getDescriptor(),
        });
    internal_static_proto_ErrorResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_ErrorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ErrorResponse_descriptor,
        new java.lang.String[] { "Response", "MajorCode", "MinorCode", "Wait", "Message", });
    com.kianiranian.proto.ProtoResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
