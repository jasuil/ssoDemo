package com.example.demo;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MainService;



@RestController
public class restControll {

	@Resource(name="mainservice")
	MainService mainService;
	   	  
	@RequestMapping(value = "/tokenVerify", method = RequestMethod.GET)
	public String tokenVerify(HttpServletRequest request, Model model, HttpServletResponse response){
		
		HashMap<String, String> vo = mainService.getUsr() ;
		return "<script>alert('yesy" + vo + "')</script>";
	}
	
}
