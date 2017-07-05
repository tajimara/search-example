package io.test.www.service.util;

import java.util.List;

public class PageUtil<T> {
    private int pageSize;
    private int pageNum;
    private int rowCount;
    private int pageCount;
    private int rowStart;
    private int everyPageCount;
    private int everyPageStart;
    private int everyPageEnd;
    private boolean hasPrevious;
    private int firstPageNum;
    private int previousPageNum;
    private boolean hasNext;
    private int nextPageNum;
    private int lastPageNum;
    private List<T> list;

    public PageUtil() {

    }

    public PageUtil(String pageNumString, String pageSizeString, int rowCount) {

        this.pageSize = pageSizeString == null ? 3 : Integer.parseInt(pageSizeString);

        this.rowCount = rowCount;

        this.pageCount = (int) Math.ceil(rowCount * 1.0 / pageSize);

        this.pageNum = pageNumString == null ? 1 : Integer.parseInt(pageNumString);

        if (pageNum > pageCount && pageCount > 0) {
            this.pageNum = pageCount;
        }

        this.rowStart = (pageNum - 1) * pageSize;

        this.everyPageCount = 5;

        this.everyPageStart = pageNum - (everyPageCount / 2) < 1 ? 1 : pageNum - (everyPageCount / 2);

        this.everyPageEnd = pageNum + (everyPageCount / 2) > pageCount ? pageCount : pageNum + (everyPageCount / 2);

        if (pageNum > 1) {
            this.hasPrevious = true;

            this.firstPageNum = 1;

            this.previousPageNum = pageNum - 1;
        }

        if (pageNum < pageCount) {
            this.hasNext = true;

            this.nextPageNum = pageNum + 1;

            this.lastPageNum = pageCount;
        }
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getRowStart() {
        return rowStart;
    }

    public void setRowStart(int rowStart) {
        this.rowStart = rowStart;
    }

    public int getEveryPageCount() {
        return everyPageCount;
    }

    public void setEveryPageCount(int everyPageCount) {
        this.everyPageCount = everyPageCount;
    }

    public int getEveryPageStart() {
        return everyPageStart;
    }

    public void setEveryPageStart(int everyPageStart) {
        this.everyPageStart = everyPageStart;
    }

    public int getEveryPageEnd() {
        return everyPageEnd;
    }

    public void setEveryPageEnd(int everyPageEnd) {
        this.everyPageEnd = everyPageEnd;
    }

    public boolean isHasPrevious() {
        return hasPrevious;
    }

    public void setHasPrevious(boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }

    public int getFirstPageNum() {
        return firstPageNum;
    }

    public void setFirstPageNum(int firstPageNum) {
        this.firstPageNum = firstPageNum;
    }

    public int getPreviousPageNum() {
        return previousPageNum;
    }

    public void setPreviousPageNum(int previousPageNum) {
        this.previousPageNum = previousPageNum;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public int getNextPageNum() {
        return nextPageNum;
    }

    public void setNextPageNum(int nextPageNum) {
        this.nextPageNum = nextPageNum;
    }

    public int getLastPageNum() {
        return lastPageNum;
    }

    public void setLastPageNum(int lastPageNum) {
        this.lastPageNum = lastPageNum;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}