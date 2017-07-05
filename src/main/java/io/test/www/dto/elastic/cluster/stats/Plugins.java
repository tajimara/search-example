package io.test.www.dto.elastic.cluster.stats;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Plugins {
    String name;
    String version;
    String description;
    String url;
    Boolean jvm;
    String classname;
    Boolean isolated;
    Boolean site;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getJvm() {
        return jvm;
    }

    public void setJvm(Boolean jvm) {
        this.jvm = jvm;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Boolean getIsolated() {
        return isolated;
    }

    public void setIsolated(Boolean isolated) {
        this.isolated = isolated;
    }

    public Boolean getSite() {
        return site;
    }

    public void setSite(Boolean site) {
        this.site = site;
    }
}
