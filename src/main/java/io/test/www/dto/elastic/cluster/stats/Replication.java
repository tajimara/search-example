package io.test.www.dto.elastic.cluster.stats;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Replication {
    Double min;
    Double max;
    Double avg;

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }
}
