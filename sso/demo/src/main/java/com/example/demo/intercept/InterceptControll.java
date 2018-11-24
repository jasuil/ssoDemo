package com.example.demo.intercept;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.example.demo.Interceptconfig;

/**
 * 
 * @author home
 *
 */
public class InterceptControll  extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		try {
			
			Interceptconfig d = new Interceptconfig();
			
			String id = null;
			for(Cookie cookies: request.getCookies()) {
				if(cookies.getName().toString().equals("id")) {
					id = cookies.getValue();
				}
			}
			
			//if(session.getAttribute("id") == null) {			
			if(id == null) {
				response.sendRedirect("/loginPage");
								
				//throw new ModelAndViewDefiningException(new ModelAndView("forward:/loginPage"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
}
