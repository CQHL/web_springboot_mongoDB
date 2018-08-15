package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Article;
import com.example.demo.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleRepository repository;

	@Override
	public List<Article> findViewTopArticle(int count) {
		// TODO Auto-generated method stub
		Sort sort = new Sort(Sort.Direction.DESC,"viewCount");
		List<Article> allSorted = repository.findAll(sort);
		List<Article> res = new ArrayList<Article>();
		for(int i = 0; i < count && i < allSorted.size() ; i++) {
			res.add( allSorted.get(i));
		}
		return res;
	}

	@Override
	public List<Article> findCommentTopArticle(int count) {
		Sort sort = new Sort(Sort.Direction.DESC,"commentCount");
		List<Article> allSorted = repository.findAll(sort);
		List<Article> res = new ArrayList<Article>();
		for(int i = 0; i < count && i < allSorted.size() ; i++) {
			res.add( allSorted.get(i));
		}
		return res;
	}

	@Override
	public List<Article> findNewTopArticle(int count) {
		Sort sort = new Sort(Sort.Direction.DESC,"publishTime");
		List<Article> allSorted = repository.findAll(sort);
		List<Article> res = new ArrayList<Article>();
		for(int i = 0; i < count && i < allSorted.size() ; i++) {
			res.add( allSorted.get(i));
		}
		return res;
	}

	@Override
	public List<Article> findArticleByType(String typeId) {
		// TODO Auto-generated method stub
		//repository.findByType(typeId);
		
		return repository.findByType(typeId);
	}

	@Override
	public Optional<Article> findArticleById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void save(Article article) {
		// TODO Auto-generated method stub
		repository.save(article);
	}

	@Override
	public void edit(Article article) {
		// TODO Auto-generated method stub
		repository.save(article);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	
	public List<Article> findAll() {
		return repository.findAll();
	}
}
