package io.test.www.dto.elastic.cluster.stats;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class IndexShards {
    Integer min;
    Integer max;
    Double avg;

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }
}
