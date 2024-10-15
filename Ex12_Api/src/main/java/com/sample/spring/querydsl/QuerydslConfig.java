package com.sample.spring.querydsl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor //autowired랑 똑같은 것임. 그거 안쓰고 final로 쓴것.
public class QuerydslConfig {

	@Autowired
	private final EntityManager em;
	
	@Bean
	public JPAQueryFactory queryFactory() {
		return new JPAQueryFactory(em);
	}
	
}
