package io.test.www.dto.elastic.cluster.state;

import java.util.Map;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class RoutingNodes {
    private Node[] unassigned;
    private Map<String, Node[]> nodes;

    public Node[] getUnassigned() {
        return unassigned;
    }

    public void setUnassigned(Node[] unassigned) {
        this.unassigned = unassigned;
    }

    public Map<String, Node[]> getNodes() {
        return nodes;
    }

    public void setNodes(Map<String, Node[]> nodes) {
        this.nodes = nodes;
    }
}
