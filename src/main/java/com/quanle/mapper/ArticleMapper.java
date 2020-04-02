package com.quanle.mapper;

import com.quanle.pojo.Article;

import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @author quanle
 * @date 2020/4/1 10:38 PM
 */
public interface ArticleMapper {

    @Select("select * from t_article")
    public List<Article> findAll();
}
