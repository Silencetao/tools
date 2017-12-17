package com.silencetao.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.silencetao.demo.bean.Cat;

/**
 * CatRepository接口
 * @author Silence
 * create time 2017年11月25日 下午9:01:46
 * @version 1.0.1
 */
public interface CatRepository extends CrudRepository<Cat, Integer> {

}
