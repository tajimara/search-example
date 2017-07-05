package io.test.www.dto.elastic;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.test.www.dto.elastic.cluster.state.Mappings;
import io.test.www.dto.elastic.indices.Stats;

import java.lang.*;
import java.util.Map;

/**
 * Created by jcjang on 2017. 2. 1..
 */
public class IndexResponse {
    private boolean acknowledged;
    @JsonProperty("shards_acknowledged")
    private boolean shardsAcknowledged;
    private Error error;
    private int status;
    private Stats stats;
    private Map<String, Mappings> mappings;

    public boolean isAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    public boolean isShardsAcknowledged() {
        return shardsAcknowledged;
    }

    public void setShardsAcknowledged(boolean shardsAcknowledged) {
        this.shardsAcknowledged = shardsAcknowledged;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Map<String, Mappings> getMappings() {
        return mappings;
    }

    public void setMappings(Map<String, Mappings> mappings) {
        this.mappings = mappings;
    }
}
