package io.odpf.dagger.core.utils;

public class Constants {
    public static final String INTERNAL_VALIDATION_FILED_KEY = "__internal_validation_field__";
    public static final String PROCESSOR_PREPROCESSOR_ENABLE_KEY = "PROCESSOR_PREPROCESSOR_ENABLE";
    public static final boolean PROCESSOR_PREPROCESSOR_ENABLE_DEFAULT = false;
    public static final String PROCESSOR_PREPROCESSOR_CONFIG_KEY = "PROCESSOR_PREPROCESSOR_CONFIG";
    public static final String PROCESSOR_POSTPROCESSOR_ENABLE_KEY = "PROCESSOR_POSTPROCESSOR_ENABLE";
    public static final boolean PROCESSOR_POSTPROCESSOR_ENABLE_DEFAULT = false;
    public static final String PROCESSOR_POSTPROCESSOR_CONFIG_KEY = "PROCESSOR_POSTPROCESSOR_CONFIG";

    public static final String LONGBOW_DURATION_KEY = "longbow_duration";
    public static final String LONGBOW_LATEST_KEY = "longbow_latest";
    public static final String LONGBOW_EARLIEST_KEY = "longbow_earliest";
    public static final String PROCESSOR_LONGBOW_DOCUMENT_DURATION_KEY = "PROCESSOR_LONGBOW_DOCUMENT_DURATION";
    public static final String PROCESSOR_LONGBOW_DOCUMENT_DURATION_DEFAULT = "90d";
    public static final String LONGBOW_DELIMITER = "#";
    public static final String LONGBOW_DATA_KEY = "longbow_data";
    public static final String LONGBOW_PROTO_DATA_KEY = "proto_data";
    public static final String PROCESSOR_LONGBOW_GCP_PROJECT_ID_KEY = "PROCESSOR_LONGBOW_GCP_PROJECT_ID";
    public static final String PROCESSOR_LONGBOW_GCP_PROJECT_ID_DEFAULT = "default-gcp-project";
    public static final String PROCESSOR_LONGBOW_GCP_INSTANCE_ID_KEY = "PROCESSOR_LONGBOW_GCP_INSTANCE_ID";
    public static final String PROCESSOR_LONGBOW_GCP_INSTANCE_ID_DEFAULT = "default-gcp-project";
    public static final String PROCESSOR_LONGBOW_GCP_TABLE_ID_KEY = "PROCESSOR_LONGBOW_GCP_TABLE_ID";
    public static final String LONGBOW_COLUMN_FAMILY_DEFAULT = "ts";
    public static final String LONGBOW_QUALIFIER_DEFAULT = "proto";
    public static final Long PROCESSOR_LONGBOW_ASYNC_TIMEOUT_DEFAULT = 15000L;
    public static final String PROCESSOR_LONGBOW_ASYNC_TIMEOUT_KEY = "PROCESSOR_LONGBOW_ASYNC_TIMEOUT";
    public static final Integer PROCESSOR_LONGBOW_THREAD_CAPACITY_DEFAULT = 30;
    public static final String PROCESSOR_LONGBOW_THREAD_CAPACITY_KEY = "PROCESSOR_LONGBOW_THREAD_CAPACITY";
    public static final String DAGGER_NAME_KEY = "FLINK_JOB_ID";
    public static final String DAGGER_NAME_DEFAULT = "SQL Flink Job";
    public static final String EVENT_TIMESTAMP = "event_timestamp";
    public static final String ROWTIME = "rowtime";
    public static final String MINUTE_UNIT = "m";
    public static final String HOUR_UNIT = "h";
    public static final String DAY_UNIT = "d";
    public static final String FLINK_SQL_QUERY_KEY = "FLINK_SQL_QUERY";
    public static final String FLINK_SQL_QUERY_DEFAULT = "";

    public static final int FLINK_PARALLELISM_DEFAULT = 1;
    public static final String FLINK_PARALLELISM_KEY = "FLINK_PARALLELISM";
    public static final int FLINK_PARALLELISM_MAX_DEFAULT = 50;
    public static final String FLINK_PARALLELISM_MAX_KEY = "FLINK_PARALLELISM_MAX";
    public static final int FLINK_WATERMARK_INTERVAL_MS_DEFAULT = 10000;
    public static final String FLINK_WATERMARK_INTERVAL_MS_KEY = "FLINK_WATERMARK_INTERVAL_MS";
    public static final long FLINK_CHECKPOINT_INTERVAL_MS_DEFAULT = 30000;
    public static final String FLINK_CHECKPOINT_INTERVAL_MS_KEY = "FLINK_CHECKPOINT_INTERVAL_MS";
    public static final long FLINK_CHECKPOINT_TIMEOUT_MS_DEFAULT = 900000;
    public static final String FLINK_CHECKPOINT_TIMEOUT_MS_KEY = "FLINK_CHECKPOINT_TIMEOUT_MS";
    public static final long FLINK_CHECKPOINT_MIN_PAUSE_MS_DEFAULT = 5000;
    public static final String FLINK_CHECKPOINT_MIN_PAUSE_MS_KEY = "FLINK_CHECKPOINT_MIN_PAUSE_MS";
    public static final int FLINK_CHECKPOINT_MAX_CONCURRENT_DEFAULT = 1;
    public static final String FLINK_CHECKPOINT_MAX_CONCURRENT_KEY = "FLINK_CHECKPOINT_MAX_CONCURRENT";
    public static final int FLINK_RETENTION_MIN_IDLE_STATE_HOUR_DEFAULT = 8;
    public static final String FLINK_RETENTION_MIN_IDLE_STATE_HOUR_KEY = "FLINK_RETENTION_MIN_IDLE_STATE_HOUR";
    public static final int FLINK_RETENTION_MAX_IDLE_STATE_HOUR_DEFAULT = 9;
    public static final String FLINK_RETENTION_MAX_IDLE_STATE_HOUR_KEY = "FLINK_RETENTION_MAX_IDLE_STATE_HOUR";
    public static final long FLINK_WATERMARK_DELAY_MS_DEFAULT = 10000;
    public static final String FLINK_WATERMARK_DELAY_MS_KEY = "FLINK_WATERMARK_DELAY_MS";
    public static final String FLINK_ROWTIME_ATTRIBUTE_NAME_DEFAULT = "";
    public static final String FLINK_ROWTIME_ATTRIBUTE_NAME_KEY = "FLINK_ROWTIME_ATTRIBUTE_NAME";
    public static final boolean FLINK_WATERMARK_PER_PARTITION_ENABLE_DEFAULT = false;
    public static final String FLINK_WATERMARK_PER_PARTITION_ENABLE_KEY = "FLINK_WATERMARK_PER_PARTITION_ENABLE";
    public static final String FLINK_JOB_ID_DEFAULT = "SQL Flink job";
    public static final String FLINK_JOB_ID_KEY = "FLINK_JOB_ID";

    public static final String SYNCHRONIZER_BIGTABLE_TABLE_ID_KEY = "bigtable_table_id";
    public static final String SYNCHRONIZER_INPUT_CLASSNAME_KEY = "input_class_name";
    public static final String SYNCHRONIZER_LONGBOW_READ_KEY = "longbow_read_key";

    public static final String SINK_KAFKA_TOPIC_KEY = "SINK_KAFKA_TOPIC";
    public static final String SINK_KAFKA_BROKERS_KEY = "SINK_KAFKA_BROKERS";
    public static final String SINK_KAFKA_PROTO_KEY = "SINK_KAFKA_PROTO_KEY";
    public static final String SINK_KAFKA_PROTO_MESSAGE_KEY = "SINK_KAFKA_PROTO_MESSAGE";
    public static final String SINK_KAFKA_STREAM_KEY = "SINK_KAFKA_STREAM";
    public static final String SINK_KAFKA_PRODUCE_LARGE_MESSAGE_ENABLE_KEY = "SINK_KAFKA_PRODUCE_LARGE_MESSAGE_ENABLE";
    public static final boolean SINK_KAFKA_PRODUCE_LARGE_MESSAGE_ENABLE_DEFAULT = false;
    public static final String SINK_KAFKA_COMPRESSION_TYPE_KEY = "compression.type";
    public static final String SINK_KAFKA_COMPRESSION_TYPE_DEFAULT = "snappy";
    public static final String SINK_KAFKA_MAX_REQUEST_SIZE_KEY = "max.request.size";
    public static final String SINK_KAFKA_MAX_REQUEST_SIZE_DEFAULT = "20971520";

    public static final String ES_TYPE = "ES";
    public static final String HTTP_TYPE = "HTTP";
    public static final String PG_TYPE = "PG";
    public static final String GRPC_TYPE = "GRPC";
    public static final String SQL_PATH_SELECT_ALL_CONFIG_VALUE = "*";

    public static final String LONGBOW_WRITER_PROCESSOR_KEY = "longbow_writer_processor";
    public static final String LONGBOW_READER_PROCESSOR_KEY = "longbow_reader_processor";
    public static final String TRANSFORM_PROCESSOR_KEY = "transform_processor";
    public static final String SQL_TRANSFORMER_CLASS = "io.odpf.dagger.functions.transformers.SQLTransformer";

    public static final String STREAM_INPUT_SCHEMA_EVENT_TIMESTAMP_FIELD_INDEX_KEY = "INPUT_SCHEMA_EVENT_TIMESTAMP_FIELD_INDEX";
    public static final String STREAM_SOURCE_KAFKA_TOPIC_NAMES_KEY = "SOURCE_KAFKA_TOPIC_NAMES";
    public static final String INPUT_STREAM_NAME_KEY = "SOURCE_KAFKA_NAME";

    public static final String METRIC_TELEMETRY_ENABLE_KEY = "METRIC_TELEMETRY_ENABLE";
    public static final boolean METRIC_TELEMETRY_ENABLE_VALUE_DEFAULT = true;
    public static final String METRIC_TELEMETRY_SHUTDOWN_PERIOD_MS_KEY = "METRIC_TELEMETRY_SHUTDOWN_PERIOD_MS";
    public static final long METRIC_TELEMETRY_SHUTDOWN_PERIOD_MS_DEFAULT = 10000;
    public static final String FATAL_EXCEPTION_METRIC_GROUP_KEY = "fatal.exception";
    public static final String NONFATAL_EXCEPTION_METRIC_GROUP_KEY = "non.fatal.exception";

    public static final String FUNCTION_FACTORY_CLASSES_KEY = "FUNCTION_FACTORY_CLASSES";
    public static final String FUNCTION_FACTORY_CLASSES_DEFAULT = "io.odpf.dagger.functions.udfs.factories.FunctionFactory";

    public static final String SINK_INFLUX_LATE_RECORDS_DROPPED_KEY = "influx.late.records.dropped";
    public static final String SINK_INFLUX_DB_NAME_KEY = "SINK_INFLUX_DB_NAME";
    public static final String SINK_INFLUX_DB_NAME_DEFAULT = "";
    public static final String SINK_INFLUX_RETENTION_POLICY_KEY = "SINK_INFLUX_RETENTION_POLICY";
    public static final String SINK_INFLUX_RETENTION_POLICY_DEFAULT = "";
    public static final String SINK_INFLUX_MEASUREMENT_NAME_KEY = "SINK_INFLUX_MEASUREMENT_NAME";
    public static final String SINK_INFLUX_MEASUREMENT_NAME_DEFAULT = "";
    public static final String SINK_INFLUX_URL_KEY = "SINK_INFLUX_URL";
    public static final String SINK_INFLUX_URL_DEFAULT = "";
    public static final String SINK_INFLUX_USERNAME_KEY = "SINK_INFLUX_USERNAME";
    public static final String SINK_INFLUX_USERNAME_DEFAULT = "";
    public static final String SINK_INFLUX_PASSWORD_KEY = "SINK_INFLUX_PASSWORD";
    public static final String SINK_INFLUX_PASSWORD_DEFAULT = "";
    public static final String SINK_INFLUX_BATCH_SIZE_KEY = "SINK_INFLUX_BATCH_SIZE";
    public static final int SINK_INFLUX_BATCH_SIZE_DEFAULT = 0;
    public static final String SINK_INFLUX_FLUSH_DURATION_MS_KEY = "SINK_INFLUX_FLUSH_DURATION_MS";
    public static final int SINK_INFLUX_FLUSH_DURATION_MS_DEFAULT = 0;

    public static final String SOURCE_KAFKA_CONSUME_LARGE_MESSAGE_ENABLE_KEY = "SOURCE_KAFKA_CONSUME_LARGE_MESSAGE_ENABLE";
    public static final boolean SOURCE_KAFKA_CONSUME_LARGE_MESSAGE_ENABLE_DEFAULT = false;
    public static final String SOURCE_KAFKA_MAX_PARTITION_FETCH_BYTES_KEY = "max.partition.fetch.bytes";
    public static final String SOURCE_KAFKA_MAX_PARTITION_FETCH_BYTES_DEFAULT = "5242880";

    public static final int CLIENT_ERROR_MIN_STATUS_CODE = 400;
    public static final int CLIENT_ERROR_MAX_STATUS_CODE = 499;
    public static final int SERVER_ERROR_MIN_STATUS_CODE = 500;
    public static final int SERVER_ERROR_MAX_STATUS_CODE = 599;

    public static final long MAX_EVENT_LOOP_EXECUTE_TIME_DEFAULT = 10000;
    public static final int LONGBOW_OUTPUT_ADDITIONAL_ARITY = 3;
}
