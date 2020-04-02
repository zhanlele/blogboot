package com.quanle.dto;

import com.quanle.pojo.Article;

import java.util.List;

/**
 * @author quanle
 * @date 2020/4/2 9:29 PM
 */
public class ResponseDTO {

    private Integer pageSize;
    private Integer pageNo;
    private List<Article> articles;
    private Integer total;
    private Integer pages;


    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

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

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
