package io.test.www.dto.elastic.cluster.stats;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Docs {
    Integer count;
    Integer deleted;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
