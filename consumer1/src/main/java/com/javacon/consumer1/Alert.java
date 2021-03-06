/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.javacon.consumer1;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Alert extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3643129960681368251L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Alert\",\"namespace\":\"com.tech3camp.consumer1\",\"fields\":[{\"name\":\"message\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Alert() {}

  /**
   * All-args constructor.
   * @param message The new value for message
   */
  public Alert(java.lang.String message) {
    this.message = message;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return message;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: message = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.String value) {
    this.message = value;
  }

  /**
   * Creates a new Alert RecordBuilder.
   * @return A new Alert RecordBuilder
   */
  public static Alert.Builder newBuilder() {
    return new Alert.Builder();
  }

  /**
   * Creates a new Alert RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Alert RecordBuilder
   */
  public static Alert.Builder newBuilder(Alert.Builder other) {
    return new Alert.Builder(other);
  }

  /**
   * Creates a new Alert RecordBuilder by copying an existing Alert instance.
   * @param other The existing instance to copy.
   * @return A new Alert RecordBuilder
   */
  public static Alert.Builder newBuilder(Alert other) {
    return new Alert.Builder(other);
  }

  /**
   * RecordBuilder for Alert instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Alert>
    implements org.apache.avro.data.RecordBuilder<Alert> {

    private java.lang.String message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Alert.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.message)) {
        this.message = data().deepCopy(fields()[0].schema(), other.message);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Alert instance
     * @param other The existing instance to copy.
     */
    private Builder(Alert other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.message)) {
        this.message = data().deepCopy(fields()[0].schema(), other.message);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.String getMessage() {
      return message;
    }

    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public Alert.Builder setMessage(java.lang.String value) {
      validate(fields()[0], value);
      this.message = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public Alert.Builder clearMessage() {
      message = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public Alert build() {
      try {
        Alert record = new Alert();
        record.message = fieldSetFlags()[0] ? this.message : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
