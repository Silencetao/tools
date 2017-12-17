package com.silencetao.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silencetao.demo.bean.Cat;
import com.silencetao.demo.service.CatService;

/**
 * 
 * @author Silence
 * create time 2017年11月25日 下午9:07:15
 * @version 1.0.1
 */
@RestController
public class CatController {

	@Autowired
	private CatService catService;
	
	@RequestMapping(value = "/save")
	public Cat save() {
		Cat cat = new Cat();
		cat.setCatName("Tom");
		cat.setCatAge(2);
		catService.save(cat);
		
		return cat;
	}
	
	@RequestMapping(value = "delete")
	public void delete() {
		Cat cat = new Cat();
		cat.setId(1);
		cat.setCatName("Tom");
		cat.setCatAge(2);
		catService.delete(cat);
	}
	
	@RequestMapping(value = "getall")
	public Iterable<Cat> getAll() {
		return catService.getAll();
	}
	
	@RequestMapping(value = "findbyname")
	public Cat findByName(String catName) {
		return catService.findByCatName(catName);
	}
	
	@RequestMapping(value = "selectcatbyname")
	public Cat selectCatByName(String catName) {
		return catService.selectCatByName(catName);
	}
}
