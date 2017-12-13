/**
 * 
 */
package com.turvo.assesment.data.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClientURI;

/**
 * @author chandrashekarv
 *
 */
@Configuration
public class MongoConfig {

	@Value("${spring.data.mongodb.uri}")
	private String uri;

	
	public @Bean MongoDbFactory mongoDbFactory() {
		return new SimpleMongoDbFactory(new MongoClientURI(uri));
	}

	public @Bean MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoDbFactory());
	}

}
