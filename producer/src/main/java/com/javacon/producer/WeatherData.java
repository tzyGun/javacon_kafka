/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.javacon.producer;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class WeatherData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -99210113214710727L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WeatherData\",\"namespace\":\"com.javacon.producer\",\"fields\":[{\"name\":\"temperature\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"pressure\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"message\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String temperature;
  @Deprecated public java.lang.String pressure;
  @Deprecated public java.lang.String message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WeatherData() {}

  /**
   * All-args constructor.
   * @param temperature The new value for temperature
   * @param pressure The new value for pressure
   * @param message The new value for message
   */
  public WeatherData(java.lang.String temperature, java.lang.String pressure, java.lang.String message) {
    this.temperature = temperature;
    this.pressure = pressure;
    this.message = message;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return temperature;
    case 1: return pressure;
    case 2: return message;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: temperature = (java.lang.String)value$; break;
    case 1: pressure = (java.lang.String)value$; break;
    case 2: message = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'temperature' field.
   * @return The value of the 'temperature' field.
   */
  public java.lang.String getTemperature() {
    return temperature;
  }

  /**
   * Sets the value of the 'temperature' field.
   * @param value the value to set.
   */
  public void setTemperature(java.lang.String value) {
    this.temperature = value;
  }

  /**
   * Gets the value of the 'pressure' field.
   * @return The value of the 'pressure' field.
   */
  public java.lang.String getPressure() {
    return pressure;
  }

  /**
   * Sets the value of the 'pressure' field.
   * @param value the value to set.
   */
  public void setPressure(java.lang.String value) {
    this.pressure = value;
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
   * Creates a new WeatherData RecordBuilder.
   * @return A new WeatherData RecordBuilder
   */
  public static com.javacon.producer.WeatherData.Builder newBuilder() {
    return new com.javacon.producer.WeatherData.Builder();
  }

  /**
   * Creates a new WeatherData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new WeatherData RecordBuilder
   */
  public static com.javacon.producer.WeatherData.Builder newBuilder(com.javacon.producer.WeatherData.Builder other) {
    return new com.javacon.producer.WeatherData.Builder(other);
  }

  /**
   * Creates a new WeatherData RecordBuilder by copying an existing WeatherData instance.
   * @param other The existing instance to copy.
   * @return A new WeatherData RecordBuilder
   */
  public static com.javacon.producer.WeatherData.Builder newBuilder(com.javacon.producer.WeatherData other) {
    return new com.javacon.producer.WeatherData.Builder(other);
  }

  /**
   * RecordBuilder for WeatherData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WeatherData>
    implements org.apache.avro.data.RecordBuilder<WeatherData> {

    private java.lang.String temperature;
    private java.lang.String pressure;
    private java.lang.String message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.javacon.producer.WeatherData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.temperature)) {
        this.temperature = data().deepCopy(fields()[0].schema(), other.temperature);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pressure)) {
        this.pressure = data().deepCopy(fields()[1].schema(), other.pressure);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.message)) {
        this.message = data().deepCopy(fields()[2].schema(), other.message);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing WeatherData instance
     * @param other The existing instance to copy.
     */
    private Builder(com.javacon.producer.WeatherData other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.temperature)) {
        this.temperature = data().deepCopy(fields()[0].schema(), other.temperature);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pressure)) {
        this.pressure = data().deepCopy(fields()[1].schema(), other.pressure);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.message)) {
        this.message = data().deepCopy(fields()[2].schema(), other.message);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'temperature' field.
      * @return The value.
      */
    public java.lang.String getTemperature() {
      return temperature;
    }

    /**
      * Sets the value of the 'temperature' field.
      * @param value The value of 'temperature'.
      * @return This builder.
      */
    public com.javacon.producer.WeatherData.Builder setTemperature(java.lang.String value) {
      validate(fields()[0], value);
      this.temperature = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'temperature' field has been set.
      * @return True if the 'temperature' field has been set, false otherwise.
      */
    public boolean hasTemperature() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'temperature' field.
      * @return This builder.
      */
    public com.javacon.producer.WeatherData.Builder clearTemperature() {
      temperature = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'pressure' field.
      * @return The value.
      */
    public java.lang.String getPressure() {
      return pressure;
    }

    /**
      * Sets the value of the 'pressure' field.
      * @param value The value of 'pressure'.
      * @return This builder.
      */
    public com.javacon.producer.WeatherData.Builder setPressure(java.lang.String value) {
      validate(fields()[1], value);
      this.pressure = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'pressure' field has been set.
      * @return True if the 'pressure' field has been set, false otherwise.
      */
    public boolean hasPressure() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'pressure' field.
      * @return This builder.
      */
    public com.javacon.producer.WeatherData.Builder clearPressure() {
      pressure = null;
      fieldSetFlags()[1] = false;
      return this;
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
    public com.javacon.producer.WeatherData.Builder setMessage(java.lang.String value) {
      validate(fields()[2], value);
      this.message = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public com.javacon.producer.WeatherData.Builder clearMessage() {
      message = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public WeatherData build() {
      try {
        WeatherData record = new WeatherData();
        record.temperature = fieldSetFlags()[0] ? this.temperature : (java.lang.String) defaultValue(fields()[0]);
        record.pressure = fieldSetFlags()[1] ? this.pressure : (java.lang.String) defaultValue(fields()[1]);
        record.message = fieldSetFlags()[2] ? this.message : (java.lang.String) defaultValue(fields()[2]);
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