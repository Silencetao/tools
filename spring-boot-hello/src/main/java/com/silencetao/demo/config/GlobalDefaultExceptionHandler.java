package com.silencetao.demo.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

/**
 * 全局异常处理
 * 1、添加注解@ControllerAdvice
 * 2、在class上只添加一个方法
 * 3、在方法上添加ExceptionHandler拦截相应的异常信息
 * 4、如果返回的是View，方法直接返回ModelAndView
 * 5、如果需要返回json，方法加上@ResponseBody
 * @author Silence
 * create time 2017年11月26日 下午10:02:50
 * @version 1.0.1
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String defaultExceptionHandler(HttpServletRequest request, Exception e) {
		return "发生异常";
	}
}
