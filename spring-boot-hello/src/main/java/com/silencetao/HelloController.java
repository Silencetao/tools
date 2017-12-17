package com.silencetao;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在这里使用@RestController
 * 等价于@Controller和@ResponseBody
 * @author Silence
 * create time 2017年11月25日 下午5:34:15
 * @version 1.0.1
 */
@RestController
public class HelloController {

	/**
	 * 利用@RequestMapping建立请求映射
	 * http://127.0.0.1:8080/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "ffSpring Boot!ggfdgf";
	}
	
	/**
	 * 获取demo对象
	 * Spring Boot默认使用的解析框架是jackson
	 * @return
	 */
	@RequestMapping("/getdemo")
	public Demo getDemo() {
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("陈涛ffffsdfsf");
		demo.setCreateTime(new Date());
		demo.setRemark("备注信息");
		
		return demo;
	}
	
	@RequestMapping("/helloworld")
	public String helloworld() {
		return "ffSpring Boot!4234234ggfdgfgfdgdf";
	}
	
	@RequestMapping("/world")
	public String world() {
		return "Hello Spring Boot!4234234ggfdgfgfdgdf";
	}
}
