package com.example.demosso.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MyMapper {
	  public HashMap<String, String> myt();
	  public List<Map<String, String>> findAll();
	  public HashMap<String, String> findUser(String id);
}
