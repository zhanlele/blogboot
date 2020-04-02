package com.quanle.controller;

import com.quanle.dto.RequestParamDTO;
import com.quanle.dto.ResponseDTO;
import com.quanle.pojo.Article;
import com.quanle.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author quanle
 * @date 2020/4/1 10:58 PM
 */
@Controller
public class BlogController {


    @Autowired
    private ArticleService articleService;

    /**
     * 默认跳转index页面
     *
     * @return
     */
    @RequestMapping("/")
    public String toIndex() {
        return "forward:index";
    }

    @RequestMapping("/index")
    public String aaaa(RequestParamDTO requestParamDTO, Model model) {

        ResponseDTO byPage = articleService.findByPage(requestParamDTO.getPageSize(), requestParamDTO.getPageNo());
        model.addAttribute("articleList", byPage.getArticles());
        model.addAttribute("total", byPage.getTotal());
        model.addAttribute("pages", byPage.getPages());
        model.addAttribute("currentPage", byPage.getPageNo());
        model.addAttribute("pageSize", byPage.getPageNo());

        return "index";
    }
}
