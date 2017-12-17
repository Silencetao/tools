package com.silencetao.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.silencetao.demo.bean.Cat;

public interface Cat2Repository extends Repository<Cat, Integer> {

	public Cat findByCatName(String catName);
	
	@Query("from Cat where catName = :catName")
	public Cat findByMyCatName(@Param("catName") String catName);
}
