package com.quanle.service;

import com.quanle.dto.ResponseDTO;
import com.quanle.mapper.ArticleMapper;
import com.quanle.pojo.Article;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author quanle
 * @date 2020/4/2 9:19 PM
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;


    @Cacheable(cacheNames = "article", unless = "#result==null")
    public List<Article> findAll() {
        List<Article> all = articleMapper.findAll();
        System.out.println("all article is" + all.size());
        return all;
    }

    public ResponseDTO findByPage(Integer pageSize, Integer pageNo) {
        List<Article> all = findAll();
        if (CollectionUtils.isEmpty(all)) {
            return null;
        }
        int total = all.size();
        int p1 = total / pageSize;
        int p2 = total % pageSize;
        if (p2 > 0) {
            p1 += 1;
        }
        int start = (pageNo - 1) * pageSize;
        int end = pageNo * pageSize - 1;
        int trulyEnd = Math.min(end, total);

        List<Article> articles = all.subList(start, trulyEnd);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setArticles(articles);
        responseDTO.setTotal(total);
        responseDTO.setPageNo(pageNo);
        responseDTO.setPageSize(pageSize);
        responseDTO.setPages(p1);

        return responseDTO;
    }

}
