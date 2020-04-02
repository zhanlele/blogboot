package com.quanle.dto;

/**
 * @author quanle
 * @date 2020/4/1 11:17 PM
 */
public class RequestParamDTO {

    private Integer pageSize = 2;
    private Integer pageNo = 1;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
}
