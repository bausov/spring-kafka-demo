/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package eu.bausov.springkafkademo.avro.model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PhoneNumber extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PhoneNumber\",\"namespace\":\"eu.bausov.springkafkademo.avro.model\",\"fields\":[{\"name\":\"areaCode\",\"type\":\"string\"},{\"name\":\"countryCode\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"prefix\",\"type\":\"string\"},{\"name\":\"number\",\"type\":\"string\"}]}");
    private static final long serialVersionUID = -2014595274009901575L;
    private static final org.apache.avro.io.DatumWriter
            WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
    private static final org.apache.avro.io.DatumReader
            READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);
    @Deprecated
    public java.lang.CharSequence areaCode;
    @Deprecated
    public java.lang.CharSequence countryCode;
    @Deprecated
    public java.lang.CharSequence prefix;
    @Deprecated
    public java.lang.CharSequence number;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public PhoneNumber() {
    }

    /**
     * All-args constructor.
     * @param areaCode The new value for areaCode
     * @param countryCode The new value for countryCode
     * @param prefix The new value for prefix
     * @param number The new value for number
     */
    public PhoneNumber(java.lang.CharSequence areaCode, java.lang.CharSequence countryCode, java.lang.CharSequence prefix, java.lang.CharSequence number) {
        this.areaCode = areaCode;
        this.countryCode = countryCode;
        this.prefix = prefix;
        this.number = number;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Creates a new PhoneNumber RecordBuilder.
     * @return A new PhoneNumber RecordBuilder
     */
    public static eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder newBuilder() {
        return new eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder();
    }

    /**
     * Creates a new PhoneNumber RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new PhoneNumber RecordBuilder
     */
    public static eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder newBuilder(eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder other) {
        return new eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder(other);
    }

    /**
     * Creates a new PhoneNumber RecordBuilder by copying an existing PhoneNumber instance.
     * @param other The existing instance to copy.
     * @return A new PhoneNumber RecordBuilder
     */
    public static eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder newBuilder(eu.bausov.springkafkademo.avro.model.PhoneNumber other) {
        return new eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder(other);
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return areaCode;
            case 1:
                return countryCode;
            case 2:
                return prefix;
            case 3:
                return number;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                areaCode = (java.lang.CharSequence) value$;
                break;
            case 1:
                countryCode = (java.lang.CharSequence) value$;
                break;
            case 2:
                prefix = (java.lang.CharSequence) value$;
                break;
            case 3:
                number = (java.lang.CharSequence) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'areaCode' field.
     * @return The value of the 'areaCode' field.
     */
    public java.lang.CharSequence getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the 'areaCode' field.
     * @param value the value to set.
     */
    public void setAreaCode(java.lang.CharSequence value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the 'countryCode' field.
     * @return The value of the 'countryCode' field.
     */
    public java.lang.CharSequence getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the 'countryCode' field.
     * @param value the value to set.
     */
    public void setCountryCode(java.lang.CharSequence value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the 'prefix' field.
     * @return The value of the 'prefix' field.
     */
    public java.lang.CharSequence getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the 'prefix' field.
     * @param value the value to set.
     */
    public void setPrefix(java.lang.CharSequence value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the 'number' field.
     * @return The value of the 'number' field.
     */
    public java.lang.CharSequence getNumber() {
        return number;
    }

    /**
     * Sets the value of the 'number' field.
     * @param value the value to set.
     */
    public void setNumber(java.lang.CharSequence value) {
        this.number = value;
    }

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    /**
     * RecordBuilder for PhoneNumber instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PhoneNumber>
            implements org.apache.avro.data.RecordBuilder<PhoneNumber> {

        private java.lang.CharSequence areaCode;
        private java.lang.CharSequence countryCode;
        private java.lang.CharSequence prefix;
        private java.lang.CharSequence number;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.areaCode)) {
                this.areaCode = data().deepCopy(fields()[0].schema(), other.areaCode);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.countryCode)) {
                this.countryCode = data().deepCopy(fields()[1].schema(), other.countryCode);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.prefix)) {
                this.prefix = data().deepCopy(fields()[2].schema(), other.prefix);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.number)) {
                this.number = data().deepCopy(fields()[3].schema(), other.number);
                fieldSetFlags()[3] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing PhoneNumber instance
         * @param other The existing instance to copy.
         */
        private Builder(eu.bausov.springkafkademo.avro.model.PhoneNumber other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.areaCode)) {
                this.areaCode = data().deepCopy(fields()[0].schema(), other.areaCode);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.countryCode)) {
                this.countryCode = data().deepCopy(fields()[1].schema(), other.countryCode);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.prefix)) {
                this.prefix = data().deepCopy(fields()[2].schema(), other.prefix);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.number)) {
                this.number = data().deepCopy(fields()[3].schema(), other.number);
                fieldSetFlags()[3] = true;
            }
        }

        /**
         * Gets the value of the 'areaCode' field.
         * @return The value.
         */
        public java.lang.CharSequence getAreaCode() {
            return areaCode;
        }

        /**
         * Sets the value of the 'areaCode' field.
         * @param value The value of 'areaCode'.
         * @return This builder.
         */
        public eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder setAreaCode(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.areaCode = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'areaCode' field has been set.
         * @return True if the 'areaCode' field has been set, false otherwise.
         */
        public boolean hasAreaCode() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'areaCode' field.
         * @return This builder.
         */
        public eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder clearAreaCode() {
            areaCode = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'countryCode' field.
         * @return The value.
         */
        public java.lang.CharSequence getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the 'countryCode' field.
         * @param value The value of 'countryCode'.
         * @return This builder.
         */
        public eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder setCountryCode(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.countryCode = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'countryCode' field has been set.
         * @return True if the 'countryCode' field has been set, false otherwise.
         */
        public boolean hasCountryCode() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'countryCode' field.
         * @return This builder.
         */
        public eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder clearCountryCode() {
            countryCode = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'prefix' field.
         * @return The value.
         */
        public java.lang.CharSequence getPrefix() {
            return prefix;
        }

        /**
         * Sets the value of the 'prefix' field.
         * @param value The value of 'prefix'.
         * @return This builder.
         */
        public eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder setPrefix(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.prefix = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'prefix' field has been set.
         * @return True if the 'prefix' field has been set, false otherwise.
         */
        public boolean hasPrefix() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'prefix' field.
         * @return This builder.
         */
        public eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder clearPrefix() {
            prefix = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'number' field.
         * @return The value.
         */
        public java.lang.CharSequence getNumber() {
            return number;
        }

        /**
         * Sets the value of the 'number' field.
         * @param value The value of 'number'.
         * @return This builder.
         */
        public eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder setNumber(java.lang.CharSequence value) {
            validate(fields()[3], value);
            this.number = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'number' field has been set.
         * @return True if the 'number' field has been set, false otherwise.
         */
        public boolean hasNumber() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'number' field.
         * @return This builder.
         */
        public eu.bausov.springkafkademo.avro.model.PhoneNumber.Builder clearNumber() {
            number = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        @Override
        public PhoneNumber build() {
            try {
                PhoneNumber record = new PhoneNumber();
                record.areaCode = fieldSetFlags()[0] ? this.areaCode : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.countryCode = fieldSetFlags()[1] ? this.countryCode : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.prefix = fieldSetFlags()[2] ? this.prefix : (java.lang.CharSequence) defaultValue(fields()[2]);
                record.number = fieldSetFlags()[3] ? this.number : (java.lang.CharSequence) defaultValue(fields()[3]);
                return record;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

}
