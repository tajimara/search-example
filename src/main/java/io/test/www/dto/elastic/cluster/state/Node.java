package io.test.www.dto.elastic.cluster.state;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class Node {
    private String state;
    private boolean primary;
    private String node;
    @JsonProperty("relocating_node")
    private String relocatingNode;
    private Integer shard;
    private String index;
    private Long version;
    @JsonProperty("allocation_id")
    private AllocationId allocationId;
    @JsonProperty("unassigned_info")
    private UnassignedInfo unAssignedInfo;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getRelocatingNode() {
        return relocatingNode;
    }

    public void setRelocatingNode(String relocatingNode) {
        this.relocatingNode = relocatingNode;
    }

    public Integer getShard() {
        return shard;
    }

    public void setShard(Integer shard) {
        this.shard = shard;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public AllocationId getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(AllocationId allocationId) {
        this.allocationId = allocationId;
    }

    public UnassignedInfo getUnAssignedInfo() {
        return unAssignedInfo;
    }

    public void setUnAssignedInfo(UnassignedInfo unAssignedInfo) {
        this.unAssignedInfo = unAssignedInfo;
    }
}
