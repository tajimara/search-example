package io.test.www.dto.elastic.cluster.state;

import java.util.Map;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class RoutingTableIndices {
    private Map<String, Shards[]> shards;

    public Map<String, Shards[]> getShards() {
        return shards;
    }

    public void setShards(Map<String, Shards[]> shards) {
        this.shards = shards;
    }
}
