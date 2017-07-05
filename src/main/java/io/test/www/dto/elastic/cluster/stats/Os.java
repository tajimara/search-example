package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Os {
    @JsonProperty("available_processors")
    Integer availableProcessors;
    @JsonProperty("allocated_processors")
    Integer allocatedProcessors;
    Mem mem;
    Names[] names;

    public Integer getAvailableProcessors() {
        return availableProcessors;
    }

    public void setAvailableProcessors(Integer availableProcessors) {
        this.availableProcessors = availableProcessors;
    }

    public Integer getAllocatedProcessors() {
        return allocatedProcessors;
    }

    public void setAllocatedProcessors(Integer allocatedProcessors) {
        this.allocatedProcessors = allocatedProcessors;
    }

    public Mem getMem() {
        return mem;
    }

    public void setMem(Mem mem) {
        this.mem = mem;
    }

    public Names[] getNames() {
        return names;
    }

    public void setNames(Names[] names) {
        this.names = names;
    }
}
