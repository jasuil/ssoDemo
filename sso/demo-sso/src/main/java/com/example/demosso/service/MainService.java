package com.example.demosso.service;

import java.util.HashMap;

public interface MainService {
	  HashMap<String, String> getUsr();
	  HashMap<String, String> findUser(String id);
}