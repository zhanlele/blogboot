package com.quanle.bbbbbboot;

import com.google.gson.Gson;
import com.quanle.dto.ResponseDTO;
import com.quanle.mapper.ArticleMapper;
import com.quanle.pojo.Article;
import com.quanle.service.ArticleService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class BbbbbbootApplicationTests {


    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleService articleService;

    @Test
    void contextLoads() {
        List<Article> all = articleMapper.findAll();
        for (Article article : all) {
            System.out.println(article.toString());
        }

        ResponseDTO byPage = articleService.findByPage(2, 1);
        Gson gson = new Gson();
        System.out.println(gson.toJson(byPage));

    }

}
