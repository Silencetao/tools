package com.silencetao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 启动类
 * 这里使用@SpringBootApplication指定这是一个Spring Boot的应用程序
 * @author Silence
 * create time 2017年11月25日 下午5:37:49
 * @version 1.0.1
 */
@SpringBootApplication
public class App /*extends WebMvcConfigurerAdapter*/ {
	
//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		super.configureMessageConverters(converters);
//		
//		/*
//		 * 1、需要先顶一个convert转换消息的对象
//		 * 2、添加fastJson的配置信息，是否要格式化返回的json数据
//		 * 3、在convert中添加配置信息
//		 * 4、激将convert添加到converters当中
//		 */
//		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//		
//		FastJsonConfig fastJsonConfig = new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		
//		fastConverter.setFastJsonConfig(fastJsonConfig);
//		
//		converters.add(fastConverter);
//	}
	
	/**
	 * 使用@Bean进行注入FastJsonHttpMessageConverter
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		
		List<MediaType> fastMediaTypes = new ArrayList<>();
		//配置字符集为UTF-8
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		
		fastConverter.setSupportedMediaTypes(fastMediaTypes);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		
		HttpMessageConverter<?> converter = fastConverter;
		
		return new HttpMessageConverters(converter);
	}
	
	/**
	 * 在main方法中启动应用程序
	 * @param args
	 */
    public static void main( String[] args ) {
       SpringApplication.run(App.class, args);
    }
}
