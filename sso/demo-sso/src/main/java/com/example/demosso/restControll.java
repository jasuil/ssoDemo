package com.example.demosso;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demosso.service.MainService;





@RestController
@RequestMapping(value = "/rest")
public class restControll {

	@Resource(name="mainservice")
	MainService mainService;
	   	  
	@RequestMapping(value = "/tokenVerify", method = RequestMethod.GET)
	public String tokenVerify(HttpServletRequest request, Model model, HttpServletResponse response){
		
		HashMap<String, String> vo = mainService.getUsr() ;
		return "<script>alert('yesy" + vo + "')</script>";
	}
	
	@RequestMapping(value = "/loginCk", method = RequestMethod.POST)
	public Map<String, String> loginCk(HttpServletRequest request,@RequestBody Map<String, String> getBody,  HttpServletResponse response) {
		//TODO: process POST request
		String id = getBody.get("id");
		Map<String, String> returnValue =  new HashMap<>();
		
		try {
			returnValue = mainService.findUser(id);		
			
			returnValue.put("msg", "ok");
			returnValue.put("expire", "3600");
		}catch(Exception e) {
			returnValue.put("msg", "you're not a member");
		}
		
		return returnValue;	
	}
	

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public Map<String, String> logout(HttpServletRequest request,@RequestBody Map<String, String> getBody) {
		
		String id = getBody.get("id");
		Map<String, String> returnValue =  new HashMap<>();
		
		try {
			returnValue = mainService.findUser(id);		
			
			returnValue.put("msg", "ok");
			returnValue.put("expire", "0");
		}catch(Exception e) {
			returnValue.put("msg", "you're not a member");
		}
		
		return returnValue;
	}
}
