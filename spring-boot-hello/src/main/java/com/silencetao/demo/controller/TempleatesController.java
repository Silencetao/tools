package com.silencetao.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Silence
 * create time 2017年11月27日 下午9:45:30
 * @version 1.0.1
 */
@Controller
@RequestMapping(value = "/temp")
public class TempleatesController {

	/**
	 * /temp/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String toHello() {
		return "hello";
	}
	
	@RequestMapping("/helloFtl")
	public String helloFtl() {
		return "springhello";
	}
}
