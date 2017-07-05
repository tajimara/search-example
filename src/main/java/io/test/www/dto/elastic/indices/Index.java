package io.test.www.dto.elastic.indices;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class Index {
    private IndexStats primaries;
    private IndexStats total;

    public IndexStats getPrimaries() {
        return primaries;
    }

    public void setPrimaries(IndexStats primaries) {
        this.primaries = primaries;
    }

    public IndexStats getTotal() {
        return total;
    }

    public void setTotal(IndexStats total) {
        this.total = total;
    }
}
