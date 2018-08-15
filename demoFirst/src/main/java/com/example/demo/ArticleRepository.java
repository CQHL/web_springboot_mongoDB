package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * @author heling
 *	connect to database step4: write repository interface
 *		1.entends MongoRepository<className,typeName of database key>
 *		2.write the methods needed to realize
 *	
 *		scence we finish the 4 steps for connecting to database,
 *		we can use the repository to contact with database using:
 *			@Autowired
 *			**Repository repository;
 *			repository.add(**); 
 *			repository.findAll();
 *		to standard the code, we was suggested to 
 *		write service interface and serviceImpl class with repository
 */


public interface ArticleRepository extends MongoRepository<Article, String>{
	
	public List<Article> findByType(String type);
}
