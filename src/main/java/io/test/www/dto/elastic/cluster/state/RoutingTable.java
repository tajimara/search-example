package io.test.www.dto.elastic.cluster.state;

import java.util.Map;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class RoutingTable {
    private Map<String, Shards> indices;

    public Map<String, Shards> getIndices() {
        return indices;
    }

    public void setIndices(Map<String, Shards> indices) {
        this.indices = indices;
    }

}
