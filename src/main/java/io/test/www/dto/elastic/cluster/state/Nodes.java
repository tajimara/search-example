package io.test.www.dto.elastic.cluster.state;

import java.util.List;
import java.util.Map;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class Nodes {
    private List<Map<String, NestedNodes>> node;

    public List<Map<String, NestedNodes>> getNode() {
        return node;
    }

    public void setNode(List<Map<String, NestedNodes>> node) {
        this.node = node;
    }
}
