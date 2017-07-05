package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Segments {
    Long count;
    String memory;
    @JsonProperty("memory_in_bytes")
    Long memoryInBytes;
    @JsonProperty("terms_memory")
    String termMemory;
    @JsonProperty("terms_memory_in_bytes")
    Long termsMemoryInBytes;
    @JsonProperty("stored_fields_memory")
    String storedFieldMemory;
    @JsonProperty("stored_fields_memory_in_bytes")
    Long storedFieldsMemoryInBytes;
    @JsonProperty("term_vectors_memory")
    String termVectorsMemory;
    @JsonProperty("term_vectors_memory_in_bytes")
    Long termVectorsMemoryInBytes;
    @JsonProperty("norms_memory")
    String normsMemory;
    @JsonProperty("norms_memory_in_bytes")
    Long normsMemoryInBytes;
    @JsonProperty("points_memory")
    String pointsMemory;
    @JsonProperty("points_memory_in_bytes")
    Long pointsMemoryInBytes;
    @JsonProperty("doc_values_memory")
    String docValuesMemory;
    @JsonProperty("doc_values_memory_in_bytes")
    Long docValuesMemoryInBytes;
    @JsonProperty("index_writer_memory")
    String indexWriterMemory;
    @JsonProperty("index_writer_memory_in_bytes")
    Long indexWriterMemoryInBytes;
    @JsonProperty("index_writer_max_memory")
    String indexWriterMaxMemory;
    @JsonProperty("index_writer_max_memory_in_bytes")
    Long indexWriterMaxMemoryInBytes;
    @JsonProperty("version_map_memory")
    String versionMapMemory;
    @JsonProperty("version_map_memory_in_bytes")
    Long versionMapMemoryInBytes;
    @JsonProperty("fixed_bit_set")
    String fixedBitSet;
    @JsonProperty("fixed_bit_set_memory_in_bytes")
    Long fixedBitSetMemoryInBytes;
    @JsonProperty("max_unsafe_auto_id_timestamp")
    private Long maxUnsafeAutoIdTimestamp;
    @JsonProperty("file_sizes")
    private Map<String, Object> fileSizes;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Long getMemoryInBytes() {
        return memoryInBytes;
    }

    public void setMemoryInBytes(Long memoryInBytes) {
        this.memoryInBytes = memoryInBytes;
    }

    public String getTermMemory() {
        return termMemory;
    }

    public void setTermMemory(String termMemory) {
        this.termMemory = termMemory;
    }

    public Long getTermsMemoryInBytes() {
        return termsMemoryInBytes;
    }

    public void setTermsMemoryInBytes(Long termsMemoryInBytes) {
        this.termsMemoryInBytes = termsMemoryInBytes;
    }

    public String getStoredFieldMemory() {
        return storedFieldMemory;
    }

    public void setStoredFieldMemory(String storedFieldMemory) {
        this.storedFieldMemory = storedFieldMemory;
    }

    public Long getStoredFieldsMemoryInBytes() {
        return storedFieldsMemoryInBytes;
    }

    public void setStoredFieldsMemoryInBytes(Long storedFieldsMemoryInBytes) {
        this.storedFieldsMemoryInBytes = storedFieldsMemoryInBytes;
    }

    public String getTermVectorsMemory() {
        return termVectorsMemory;
    }

    public void setTermVectorsMemory(String termVectorsMemory) {
        this.termVectorsMemory = termVectorsMemory;
    }

    public Long getTermVectorsMemoryInBytes() {
        return termVectorsMemoryInBytes;
    }

    public void setTermVectorsMemoryInBytes(Long termVectorsMemoryInBytes) {
        this.termVectorsMemoryInBytes = termVectorsMemoryInBytes;
    }

    public String getNormsMemory() {
        return normsMemory;
    }

    public void setNormsMemory(String normsMemory) {
        this.normsMemory = normsMemory;
    }

    public Long getNormsMemoryInBytes() {
        return normsMemoryInBytes;
    }

    public void setNormsMemoryInBytes(Long normsMemoryInBytes) {
        this.normsMemoryInBytes = normsMemoryInBytes;
    }

    public String getPointsMemory() {
        return pointsMemory;
    }

    public void setPointsMemory(String pointsMemory) {
        this.pointsMemory = pointsMemory;
    }

    public Long getPointsMemoryInBytes() {
        return pointsMemoryInBytes;
    }

    public void setPointsMemoryInBytes(Long pointsMemoryInBytes) {
        this.pointsMemoryInBytes = pointsMemoryInBytes;
    }

    public String getDocValuesMemory() {
        return docValuesMemory;
    }

    public void setDocValuesMemory(String docValuesMemory) {
        this.docValuesMemory = docValuesMemory;
    }

    public Long getDocValuesMemoryInBytes() {
        return docValuesMemoryInBytes;
    }

    public void setDocValuesMemoryInBytes(Long docValuesMemoryInBytes) {
        this.docValuesMemoryInBytes = docValuesMemoryInBytes;
    }

    public String getIndexWriterMemory() {
        return indexWriterMemory;
    }

    public void setIndexWriterMemory(String indexWriterMemory) {
        this.indexWriterMemory = indexWriterMemory;
    }

    public Long getIndexWriterMemoryInBytes() {
        return indexWriterMemoryInBytes;
    }

    public void setIndexWriterMemoryInBytes(Long indexWriterMemoryInBytes) {
        this.indexWriterMemoryInBytes = indexWriterMemoryInBytes;
    }

    public String getIndexWriterMaxMemory() {
        return indexWriterMaxMemory;
    }

    public void setIndexWriterMaxMemory(String indexWriterMaxMemory) {
        this.indexWriterMaxMemory = indexWriterMaxMemory;
    }

    public Long getIndexWriterMaxMemoryInBytes() {
        return indexWriterMaxMemoryInBytes;
    }

    public void setIndexWriterMaxMemoryInBytes(Long indexWriterMaxMemoryInBytes) {
        this.indexWriterMaxMemoryInBytes = indexWriterMaxMemoryInBytes;
    }

    public String getVersionMapMemory() {
        return versionMapMemory;
    }

    public void setVersionMapMemory(String versionMapMemory) {
        this.versionMapMemory = versionMapMemory;
    }

    public Long getVersionMapMemoryInBytes() {
        return versionMapMemoryInBytes;
    }

    public void setVersionMapMemoryInBytes(Long versionMapMemoryInBytes) {
        this.versionMapMemoryInBytes = versionMapMemoryInBytes;
    }

    public String getFixedBitSet() {
        return fixedBitSet;
    }

    public void setFixedBitSet(String fixedBitSet) {
        this.fixedBitSet = fixedBitSet;
    }

    public Long getFixedBitSetMemoryInBytes() {
        return fixedBitSetMemoryInBytes;
    }

    public void setFixedBitSetMemoryInBytes(Long fixedBitSetMemoryInBytes) {
        this.fixedBitSetMemoryInBytes = fixedBitSetMemoryInBytes;
    }

    public Long getMaxUnsafeAutoIdTimestamp() {
        return maxUnsafeAutoIdTimestamp;
    }

    public void setMaxUnsafeAutoIdTimestamp(Long maxUnsafeAutoIdTimestamp) {
        this.maxUnsafeAutoIdTimestamp = maxUnsafeAutoIdTimestamp;
    }

    public Map<String, Object> getFileSizes() {
        return fileSizes;
    }

    public void setFileSizes(Map<String, Object> fileSizes) {
        this.fileSizes = fileSizes;
    }
}
