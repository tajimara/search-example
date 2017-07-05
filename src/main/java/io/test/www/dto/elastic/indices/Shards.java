package io.test.www.dto.elastic.indices;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class Shards {
    private long total;
    private long successful;
    private long failed;
    private Failure[] failures;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getSuccessful() {
        return successful;
    }

    public void setSuccessful(long successful) {
        this.successful = successful;
    }

    public long getFailed() {
        return failed;
    }

    public void setFailed(long failed) {
        this.failed = failed;
    }

    public Failure[] getFailures() {
        return failures;
    }

    public void setFailures(Failure[] failures) {
        this.failures = failures;
    }
}
