package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by jcjang on 2017. 2. 16..
 */
public class NetworkType {
    @JsonProperty("transport_types")
    private Map<String, Object> transportTypes;
    @JsonProperty("http_types")
    private Map<String, Object> httpTypes;
}
