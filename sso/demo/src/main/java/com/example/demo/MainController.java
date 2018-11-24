package com.example.demo;

import java.util.HashMap;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.MainService;


@Controller
public class MainController {
 
  @Resource(name="mainservice")
  MainService mainService;
   
  @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Locale locale, Model model) {
         
	  	HashMap<String, String> vo = mainService.getUsr() ;
        
        model.addAttribute("usr", vo );
 
        return "index";
    }
 
}