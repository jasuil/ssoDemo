package com.example.demo.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MyMapper;
import com.example.demo.service.MainService;

@Service("mainservice")
public class MainServiceImpl implements MainService{
  @Autowired
  MyMapper mainRepository;
   
  public HashMap<String, String> getUsr() {
    return mainRepository.myt();
  }
}