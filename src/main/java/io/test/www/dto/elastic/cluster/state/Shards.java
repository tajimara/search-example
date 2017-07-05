package io.test.www.dto.elastic.cluster.state;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class Shards {
    @JsonProperty("shards")
    private Map<String, Node[]> nestedShards;

    public Map<String, Node[]> getNestedShards() {
        return nestedShards;
    }

    public void setNestedShards(Map<String, Node[]> nestedShards) {
        this.nestedShards = nestedShards;
    }
}
