package com.example.demo.mapper;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.vo.usrVO;


public interface MyMapper {
	  public HashMap<String, String> myt();
	  public List<Map<String, String>> findAll();
}
