package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Jvm {
    @JsonProperty("max_uptime")
    String maxUptime;
    @JsonProperty("max_uptime_in_millis")
    Long maxUptimeInMillis;
    Versions[] versions;
    Mem mem;
    Long threads;

    public String getMaxUptime() {
        return maxUptime;
    }

    public void setMaxUptime(String maxUptime) {
        this.maxUptime = maxUptime;
    }

    public Long getMaxUptimeInMillis() {
        return maxUptimeInMillis;
    }

    public void setMaxUptimeInMillis(Long maxUptimeInMillis) {
        this.maxUptimeInMillis = maxUptimeInMillis;
    }

    public Versions[] getVersions() {
        return versions;
    }

    public void setVersions(Versions[] versions) {
        this.versions = versions;
    }

    public Mem getMem() {
        return mem;
    }

    public void setMem(Mem mem) {
        this.mem = mem;
    }

    public Long getThreads() {
        return threads;
    }

    public void setThreads(Long threads) {
        this.threads = threads;
    }
}
