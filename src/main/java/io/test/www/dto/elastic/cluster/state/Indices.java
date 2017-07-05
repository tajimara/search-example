package io.test.www.dto.elastic.cluster.state;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class Indices {
    private String state;
    private Settings settings;
    private Map<String, Mappings> mappings;
    private Aliases[] aliases;
    @JsonProperty("primary_terms")
    private Map<String, Integer> primaryTerms;
    @JsonProperty("in_sync_allocations")
    private Map<String, String[]> inSyncAllocations;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Map<String, Mappings> getMappings() {
        return mappings;
    }

    public void setMappings(Map<String, Mappings> mappings) {
        this.mappings = mappings;
    }

    public Aliases[] getAliases() {
        return aliases;
    }

    public void setAliases(Aliases[] aliases) {
        this.aliases = aliases;
    }

    public Map<String, Integer> getPrimaryTerms() {
        return primaryTerms;
    }

    public void setPrimaryTerms(Map<String, Integer> primaryTerms) {
        this.primaryTerms = primaryTerms;
    }

    public Map<String, String[]> getInSyncAllocations() {
        return inSyncAllocations;
    }

    public void setInSyncAllocations(Map<String, String[]> inSyncAllocations) {
        this.inSyncAllocations = inSyncAllocations;
    }
}
