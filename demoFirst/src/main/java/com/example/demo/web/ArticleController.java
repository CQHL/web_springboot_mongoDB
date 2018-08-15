package com.example.demo.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Article;
import com.example.demo.service.ArticleService;

@Controller
public class ArticleController {

	@Resource
	private ArticleService service;
	
	@RequestMapping("/")
//	@ResponseBody
	String index(Model model) {
		
		List<Article> articlesComment=service.findCommentTopArticle(10);
		List<Article> articlesView=service.findViewTopArticle(10);
		List<Article> articlesNew=service.findNewTopArticle(10);
		List<Article> articlesType=service.findArticleByType("02");
		//List<Article> articlesall=service.findNewTopArticle(10);
		
        model.addAttribute("articlesComment", articlesComment);
        model.addAttribute("articlesView", articlesView);
        model.addAttribute("articlesNew", articlesNew);
        model.addAttribute("articlesType", articlesType);
		return "index";
	}
	
}
