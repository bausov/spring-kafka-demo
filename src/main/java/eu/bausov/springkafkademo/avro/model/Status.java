/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package eu.bausov.springkafkademo.avro.model;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum Status {
    RETIRED, SALARY, HOURLY, PART_TIME;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"Status\",\"namespace\":\"eu.bausov.springkafkademo.avro.model\",\"symbols\":[\"RETIRED\",\"SALARY\",\"HOURLY\",\"PART_TIME\"]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }
}
