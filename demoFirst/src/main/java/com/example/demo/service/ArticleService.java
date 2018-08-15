package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Article;

public interface ArticleService {

	public List<Article> findViewTopArticle(int count);
	
	public List<Article> findCommentTopArticle(int count);
	
	public List<Article> findNewTopArticle(int count);
	
	public List<Article> findArticleByType(String typeId);
	
	public Optional<Article> findArticleById(String id);
	
	public void save (Article article);
	
	public void edit(Article article);
	
	public void delete(String id);
}
