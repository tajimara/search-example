package io.test.www.dto.elastic.cluster.state;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class State {
    @JsonProperty("cluster_name")
    private String clusterName;
    private Long version;
    @JsonProperty("state_uuid")
    private String stateUuid;
    @JsonProperty("master_node")
    private String masterNode;
    private Blocks blocks;
    private Map<String, NestedNodes> nodes;
    private Metadata metadata;
    @JsonProperty("routing_table")
    private RoutingTable routingTable;
    @JsonProperty("routing_nodes")
    private RoutingNodes routingNodes;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getStateUuid() {
        return stateUuid;
    }

    public void setStateUuid(String stateUuid) {
        this.stateUuid = stateUuid;
    }

    public String getMasterNode() {
        return masterNode;
    }

    public void setMasterNode(String masterNode) {
        this.masterNode = masterNode;
    }

    public Blocks getBlocks() {
        return blocks;
    }

    public void setBlocks(Blocks blocks) {
        this.blocks = blocks;
    }

    public Map<String, NestedNodes> getNodes() {
        return nodes;
    }

    public void setNodes(Map<String, NestedNodes> nodes) {
        this.nodes = nodes;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public RoutingTable getRoutingTable() {
        return routingTable;
    }

    public void setRoutingTable(RoutingTable routingTable) {
        this.routingTable = routingTable;
    }

    public RoutingNodes getRoutingNodes() {
        return routingNodes;
    }

    public void setRoutingNodes(RoutingNodes routingNodes) {
        this.routingNodes = routingNodes;
    }
}
