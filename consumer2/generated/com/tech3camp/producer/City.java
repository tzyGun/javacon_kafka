/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.tech3camp.producer;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class City extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4779733431974507550L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"City\",\"namespace\":\"com.tech3camp.producer\",\"fields\":[{\"name\":\"cityname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"voivodeship\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"weatherDatas\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"WeatherData\",\"fields\":[{\"name\":\"temperature\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"pressure\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"message\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String cityname;
  @Deprecated public java.lang.String voivodeship;
  @Deprecated public java.util.List<com.tech3camp.producer.WeatherData> weatherDatas;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public City() {}

  /**
   * All-args constructor.
   * @param cityname The new value for cityname
   * @param voivodeship The new value for voivodeship
   * @param weatherDatas The new value for weatherDatas
   */
  public City(java.lang.String cityname, java.lang.String voivodeship, java.util.List<com.tech3camp.producer.WeatherData> weatherDatas) {
    this.cityname = cityname;
    this.voivodeship = voivodeship;
    this.weatherDatas = weatherDatas;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return cityname;
    case 1: return voivodeship;
    case 2: return weatherDatas;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: cityname = (java.lang.String)value$; break;
    case 1: voivodeship = (java.lang.String)value$; break;
    case 2: weatherDatas = (java.util.List<com.tech3camp.producer.WeatherData>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'cityname' field.
   * @return The value of the 'cityname' field.
   */
  public java.lang.String getCityname() {
    return cityname;
  }

  /**
   * Sets the value of the 'cityname' field.
   * @param value the value to set.
   */
  public void setCityname(java.lang.String value) {
    this.cityname = value;
  }

  /**
   * Gets the value of the 'voivodeship' field.
   * @return The value of the 'voivodeship' field.
   */
  public java.lang.String getVoivodeship() {
    return voivodeship;
  }

  /**
   * Sets the value of the 'voivodeship' field.
   * @param value the value to set.
   */
  public void setVoivodeship(java.lang.String value) {
    this.voivodeship = value;
  }

  /**
   * Gets the value of the 'weatherDatas' field.
   * @return The value of the 'weatherDatas' field.
   */
  public java.util.List<com.tech3camp.producer.WeatherData> getWeatherDatas() {
    return weatherDatas;
  }

  /**
   * Sets the value of the 'weatherDatas' field.
   * @param value the value to set.
   */
  public void setWeatherDatas(java.util.List<com.tech3camp.producer.WeatherData> value) {
    this.weatherDatas = value;
  }

  /**
   * Creates a new City RecordBuilder.
   * @return A new City RecordBuilder
   */
  public static com.tech3camp.producer.City.Builder newBuilder() {
    return new com.tech3camp.producer.City.Builder();
  }

  /**
   * Creates a new City RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new City RecordBuilder
   */
  public static com.tech3camp.producer.City.Builder newBuilder(com.tech3camp.producer.City.Builder other) {
    return new com.tech3camp.producer.City.Builder(other);
  }

  /**
   * Creates a new City RecordBuilder by copying an existing City instance.
   * @param other The existing instance to copy.
   * @return A new City RecordBuilder
   */
  public static com.tech3camp.producer.City.Builder newBuilder(com.tech3camp.producer.City other) {
    return new com.tech3camp.producer.City.Builder(other);
  }

  /**
   * RecordBuilder for City instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<City>
    implements org.apache.avro.data.RecordBuilder<City> {

    private java.lang.String cityname;
    private java.lang.String voivodeship;
    private java.util.List<com.tech3camp.producer.WeatherData> weatherDatas;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.tech3camp.producer.City.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.cityname)) {
        this.cityname = data().deepCopy(fields()[0].schema(), other.cityname);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.voivodeship)) {
        this.voivodeship = data().deepCopy(fields()[1].schema(), other.voivodeship);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.weatherDatas)) {
        this.weatherDatas = data().deepCopy(fields()[2].schema(), other.weatherDatas);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing City instance
     * @param other The existing instance to copy.
     */
    private Builder(com.tech3camp.producer.City other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.cityname)) {
        this.cityname = data().deepCopy(fields()[0].schema(), other.cityname);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.voivodeship)) {
        this.voivodeship = data().deepCopy(fields()[1].schema(), other.voivodeship);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.weatherDatas)) {
        this.weatherDatas = data().deepCopy(fields()[2].schema(), other.weatherDatas);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'cityname' field.
      * @return The value.
      */
    public java.lang.String getCityname() {
      return cityname;
    }

    /**
      * Sets the value of the 'cityname' field.
      * @param value The value of 'cityname'.
      * @return This builder.
      */
    public com.tech3camp.producer.City.Builder setCityname(java.lang.String value) {
      validate(fields()[0], value);
      this.cityname = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'cityname' field has been set.
      * @return True if the 'cityname' field has been set, false otherwise.
      */
    public boolean hasCityname() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'cityname' field.
      * @return This builder.
      */
    public com.tech3camp.producer.City.Builder clearCityname() {
      cityname = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'voivodeship' field.
      * @return The value.
      */
    public java.lang.String getVoivodeship() {
      return voivodeship;
    }

    /**
      * Sets the value of the 'voivodeship' field.
      * @param value The value of 'voivodeship'.
      * @return This builder.
      */
    public com.tech3camp.producer.City.Builder setVoivodeship(java.lang.String value) {
      validate(fields()[1], value);
      this.voivodeship = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'voivodeship' field has been set.
      * @return True if the 'voivodeship' field has been set, false otherwise.
      */
    public boolean hasVoivodeship() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'voivodeship' field.
      * @return This builder.
      */
    public com.tech3camp.producer.City.Builder clearVoivodeship() {
      voivodeship = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'weatherDatas' field.
      * @return The value.
      */
    public java.util.List<com.tech3camp.producer.WeatherData> getWeatherDatas() {
      return weatherDatas;
    }

    /**
      * Sets the value of the 'weatherDatas' field.
      * @param value The value of 'weatherDatas'.
      * @return This builder.
      */
    public com.tech3camp.producer.City.Builder setWeatherDatas(java.util.List<com.tech3camp.producer.WeatherData> value) {
      validate(fields()[2], value);
      this.weatherDatas = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'weatherDatas' field has been set.
      * @return True if the 'weatherDatas' field has been set, false otherwise.
      */
    public boolean hasWeatherDatas() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'weatherDatas' field.
      * @return This builder.
      */
    public com.tech3camp.producer.City.Builder clearWeatherDatas() {
      weatherDatas = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public City build() {
      try {
        City record = new City();
        record.cityname = fieldSetFlags()[0] ? this.cityname : (java.lang.String) defaultValue(fields()[0]);
        record.voivodeship = fieldSetFlags()[1] ? this.voivodeship : (java.lang.String) defaultValue(fields()[1]);
        record.weatherDatas = fieldSetFlags()[2] ? this.weatherDatas : (java.util.List<com.tech3camp.producer.WeatherData>) defaultValue(fields()[2]);
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
