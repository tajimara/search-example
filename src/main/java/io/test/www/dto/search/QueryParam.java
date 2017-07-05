package io.test.www.dto.search;


public class QueryParam {
    private String q;
    private String fq;
    private String rate;
    private String author;
    private String startPrice;
    private String endPrice;
    private String rateFacet;
    private String authorFacet;
    private String priceFrom;
    private String priceTo;
    private int from = 0;
    private int size = 10;
    private int page = 1;
    private String sort;
    private String pt;
    private String d = "10";

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getFq() {
        return fq;
    }

    public void setFq(String fq) {
        this.fq = fq;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(String startPrice) {
        this.startPrice = startPrice;
    }

    public String getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(String endPrice) {
        this.endPrice = endPrice;
    }

    public String getRateFacet() {
        return rateFacet;
    }

    public void setRateFacet(String rateFacet) {
        this.rateFacet = rateFacet;
    }

    public String getAuthorFacet() {
        return authorFacet;
    }

    public void setAuthorFacet(String authorFacet) {
        this.authorFacet = authorFacet;
    }

    public String getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(String priceFrom) {
        this.priceFrom = priceFrom;
    }

    public String getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(String priceTo) {
        this.priceTo = priceTo;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
}


