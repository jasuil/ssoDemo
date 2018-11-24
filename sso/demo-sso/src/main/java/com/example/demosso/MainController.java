package com.example.demosso;

import java.util.HashMap;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demosso.service.MainService;


@Controller
public class MainController {
 
  @Resource(name="mainservice")
  MainService mainService;
  
  protected final static Logger log = LoggerFactory.getLogger(MainController.class);
	  
   
  @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Locale locale, Model model) {
         
	  	HashMap<String, String> vo = mainService.getUsr() ;
        
        model.addAttribute("usr", vo );
        return "index";
    }  
 
}