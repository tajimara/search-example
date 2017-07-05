package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.*;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Nodes {
    Count count;
    String[] versions;
    Os os;
    Process process;
    Jvm jvm;
    Fs fs;
    Plugins[] plugins;
    @JsonProperty("network_types")
    NetworkType networkTypes;

    public Count getCount() {
        return count;
    }

    public void setCount(Count count) {
        this.count = count;
    }

    public String[] getVersions() {
        return versions;
    }

    public void setVersions(String[] versions) {
        this.versions = versions;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public Jvm getJvm() {
        return jvm;
    }

    public void setJvm(Jvm jvm) {
        this.jvm = jvm;
    }

    public Fs getFs() {
        return fs;
    }

    public void setFs(Fs fs) {
        this.fs = fs;
    }

    public Plugins[] getPlugins() {
        return plugins;
    }

    public void setPlugins(Plugins[] plugins) {
        this.plugins = plugins;
    }
}
