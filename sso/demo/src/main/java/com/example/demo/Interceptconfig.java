package com.example.demo;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.GzipResourceResolver;
import org.springframework.web.servlet.resource.VersionResourceResolver;
import org.springframework.web.servlet.resource.WebJarsResourceResolver;

import com.example.demo.intercept.InterceptControll;

/**
 * declare interceptor
 * @author home
 *
 */
@Configuration
public class Interceptconfig implements WebMvcConfigurer{

	protected final static Logger log = LoggerFactory.getLogger(Interceptconfig.class);
	
	@Bean
	public InterceptControll intercept(){
		return new InterceptControll();
	};
	
	@Override
	public void addInterceptors(InterceptorRegistry reg) {
		log.info("login interceptor run");
		
		ArrayList<String> exSite = new ArrayList<>();
		exSite.add("/");
		exSite.add("/loginPage");
		exSite.add("/webjars/**");
		exSite.add("/rest/**");
		
		reg.addInterceptor(intercept()).addPathPatterns("/**").excludePathPatterns(exSite);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	//	registry.addResourceHandler("/webjars/**").setCachePeriod(3600).resourceChain(true).addResolver(new WebJarsResourceResolver()).addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));
	}
}
