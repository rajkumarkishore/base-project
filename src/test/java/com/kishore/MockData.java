package com.kishore;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MockData {
	
	public Map<String,String> listAllUsers() {
		return new HashMap<>();
	}

}
