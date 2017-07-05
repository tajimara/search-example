package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Process {
    Cpu cpu;
    @JsonProperty("open_file_descriptors")
    OpenFileDescriptors openFileDescriptors;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public OpenFileDescriptors getOpenFileDescriptors() {
        return openFileDescriptors;
    }

    public void setOpenFileDescriptors(OpenFileDescriptors openFileDescriptors) {
        this.openFileDescriptors = openFileDescriptors;
    }
}
