package io.odpf.dagger.core.processors.external;

import io.odpf.dagger.core.processors.common.OutputMapping;
import io.odpf.dagger.core.processors.external.es.EsSourceConfig;
import io.odpf.dagger.core.processors.external.grpc.GrpcSourceConfig;
import io.odpf.dagger.core.processors.external.http.HttpSourceConfig;
import io.odpf.dagger.core.processors.external.pg.PgSourceConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ExternalSourceConfigTest {

    private ArrayList<HttpSourceConfig> http;
    private ArrayList<EsSourceConfig> es;
    private List<PgSourceConfig> pg;
    private List<GrpcSourceConfig> grpc;

    @Before
    public void setUp() {
        HashMap<String, OutputMapping> httpOutputMapping = new HashMap<>();
        httpOutputMapping.put("http_field_1", new OutputMapping(""));
        httpOutputMapping.put("http_field_2", new OutputMapping(""));
        HttpSourceConfig httpSourceConfig = new HttpSourceConfig("endpoint", "POST", "/some/patttern/%s", "variable", "123", "234", false, "type", "20", new HashMap<>(), httpOutputMapping, "metricId_01", false);
        http = new ArrayList<>();
        http.add(httpSourceConfig);
        es = new ArrayList<>();
        HashMap<String, OutputMapping> esOutputMapping = new HashMap<>();
        esOutputMapping.put("es_field_1", new OutputMapping(""));
        EsSourceConfig esSourceConfig = new EsSourceConfig("host", "port", "", "", "endpointPattern",
                "endpointVariable", "type", "30", "123", "234",
                "345", "456", false, esOutputMapping, "metricId_01", false);
        es.add(esSourceConfig);
        pg = new ArrayList<>();
        HashMap<String, String> pgOutputMapping = new HashMap<>();
        pgOutputMapping.put("pg_field_1", "constant");
        PgSourceConfig pgSourceConfig = new PgSourceConfig("host", "port", "user", "password", "db", "type", "30", "123", pgOutputMapping, "234", "345", "", "", true, "metricId_01", false);
        pg.add(pgSourceConfig);

        grpc = new ArrayList<>();
        HashMap<String, OutputMapping> grpcOutputMapping = new HashMap<>();
        grpcOutputMapping.put("grpc_field_1", new OutputMapping("data.key"));
        GrpcSourceConfig grpcSourceConfig = new GrpcSourceConfig("localhost", 8080, "TestGrpcRequest", "test.GrpcResponse", "test/TestMethod", "{'field1': '%s' , 'field2' : 'val2'}",
                "customer_id", "123", "234", true, "http://localhost/feast-proto/latest", null, true,
                new HashMap<>(), grpcOutputMapping, "metricId_02", 30);
        grpc.add(grpcSourceConfig);
    }

    @Test
    public void shouldGetHttpConfig() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, es, pg, grpc);

        Assert.assertEquals(http, externalSourceConfig.getHttpConfig());
    }

    @Test
    public void shouldGetEsConfig() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, es, pg, grpc);

        Assert.assertEquals(es, externalSourceConfig.getEsConfig());
    }

    @Test
    public void shouldGetPgConfig() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, es, pg, grpc);

        Assert.assertEquals(pg, externalSourceConfig.getPgConfig());
    }

    @Test
    public void shouldGetGrpcConfig() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, es, pg, grpc);

        Assert.assertEquals(grpc, externalSourceConfig.getGrpcConfig());
    }

    @Test
    public void shouldBeEmptyWhenAllConfigsAreEmpty() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, null, null, null);

        Assert.assertTrue(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenEsConfigIsPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, es, null, null);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenHttpConfigIsPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, null, null, null);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenPgConfigIsPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, null, pg, null);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenGrpcConfigIsPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, null, null, grpc);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenHttpAndEsConfigIsPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, es, null, null);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenHttpAndPgConfigIsPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, null, pg, null);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenEsAndPgConfigIsPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, es, pg, null);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenEsAndGrpcConfigIsPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, es, null, grpc);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenGrpcAndPgConfigIsPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, null, pg, grpc);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenGrpcAndHttpConfigIsPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, null, null, grpc);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyWhenAllConfigsArePresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, es, pg, grpc);

        Assert.assertFalse(externalSourceConfig.isEmpty());
    }

    @Test
    public void shouldGetOutputColumnNamesFromAllExternalSources() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, es, pg, grpc);

        List<String> columnNames = Arrays.asList("http_field_1", "http_field_2", "es_field_1", "pg_field_1", "grpc_field_1");

        Assert.assertEquals(columnNames, externalSourceConfig.getOutputColumnNames());

    }


    @Test
    public void shouldGetOutputColumnNamesFromEsAndHttp() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, es, null, null);

        List<String> columnNames = Arrays.asList("http_field_1", "http_field_2", "es_field_1");

        Assert.assertEquals(columnNames, externalSourceConfig.getOutputColumnNames());

    }

    @Test
    public void shouldGetOutputColumnNamesFromPgAndHttp() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, null, pg, null);

        List<String> columnNames = Arrays.asList("http_field_1", "http_field_2", "pg_field_1");

        Assert.assertEquals(columnNames, externalSourceConfig.getOutputColumnNames());

    }

    @Test
    public void shouldGetOutputColumnNamesFromPgAndEs() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, es, pg, null);

        List<String> columnNames = Arrays.asList("es_field_1", "pg_field_1");

        Assert.assertEquals(columnNames, externalSourceConfig.getOutputColumnNames());

    }

    @Test
    public void shouldGetOutputColumnNamesFromEsWhenOthersAreNotPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, es, null, null);

        List<String> columnNames = Collections.singletonList("es_field_1");

        Assert.assertEquals(columnNames, externalSourceConfig.getOutputColumnNames());

    }

    @Test
    public void shouldGetOutputColumnNamesFromHttpWhenOthersAreNotPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(http, null, null, null);

        List<String> columnNames = Arrays.asList("http_field_1", "http_field_2");

        Assert.assertEquals(columnNames, externalSourceConfig.getOutputColumnNames());
    }

    @Test
    public void shouldGetOutputColumnNamesFromPgWhenOthersAreNotPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, null, pg, null);

        List<String> columnNames = Collections.singletonList("pg_field_1");

        Assert.assertEquals(columnNames, externalSourceConfig.getOutputColumnNames());
    }

    @Test
    public void shouldGetOutputColumnNamesFromGrpcWhenOthersAreNotPresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, null, null, grpc);

        List<String> columnNames = Collections.singletonList("grpc_field_1");

        Assert.assertEquals(columnNames, externalSourceConfig.getOutputColumnNames());
    }

    @Test
    public void shouldGetEmptyOutputColumnNamesWhenNonePresent() {
        ExternalSourceConfig externalSourceConfig = new ExternalSourceConfig(null, null, null, null);

        Assert.assertEquals(new ArrayList<>(), externalSourceConfig.getOutputColumnNames());
    }
}
