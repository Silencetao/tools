package com.silencetao.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silencetao.demo.bean.Cat;
import com.silencetao.demo.dao.CatDao;
import com.silencetao.demo.repository.Cat2Repository;
import com.silencetao.demo.repository.CatRepository;

/**
 * 
 * @author Silence
 * create time 2017年11月25日 下午9:03:12
 * @version 1.0.1
 */
@Service
public class CatService {

	@Autowired
	private CatRepository catRepository;
	
	@Autowired
	private Cat2Repository repository;
	
	@Autowired
	private CatDao catDao;
	
	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}
	
	@Transactional
	public void delete(Cat cat) {
		catRepository.delete(cat);
	}
	
	public Iterable<Cat> getAll() {
		return catRepository.findAll();
	}
	
	public Cat findByCatName(String catName) {
		return repository.findByCatName(catName);
	}
	
	public Cat selectCatByName(String catName) {
		return catDao.selectByCatByName(catName);
	}
}
