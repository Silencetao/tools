package com.silencetao.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 实体类
 * @author Silence
 * create time 2017年11月25日 下午8:56:35
 * @version 1.0.1
 */
@Entity
public class Cat {

	/**
	 * 主键
	 * 指定主键生成策略为自动增加
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	/**
	 * 名字
	 */
	private String catName;
	
	/**
	 * 年龄
	 */
	private int catAge;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatAge() {
		return catAge;
	}

	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
}
