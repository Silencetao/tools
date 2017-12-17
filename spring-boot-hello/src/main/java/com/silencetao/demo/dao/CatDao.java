package com.silencetao.demo.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.silencetao.demo.bean.Cat;

/**
 * 使用@Repository注解，标注这是一个持久化操作
 * @author Silence
 * create time 2017年11月26日 上午11:20:06
 * @version 1.0.1
 */
@Repository
public class CatDao {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public Cat selectByCatByName(String catName) {
		/*
		 * 1、定义一个SQL语句
		 * 2、定义一个RowMapper
		 * 3、执行查询语句
		 */
		String sql = "select * from cat where cat_name = ?";
		RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
		Cat cat = jdbcTemplate.queryForObject(sql, new Object[] {catName}, rowMapper);
		
		return cat;
	}
}
