package com.example.demosso.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demosso.mapper.MyMapper;
import com.example.demosso.service.MainService;

@Service("mainservice")
public class MainServiceImpl implements MainService{
	
  @Autowired
  MyMapper mainRepository;
   
  public HashMap<String, String> getUsr() {
    return mainRepository.myt();
  }
  
  public HashMap<String, String> findUser(String id){
	  return mainRepository.findUser(id);
  }
}