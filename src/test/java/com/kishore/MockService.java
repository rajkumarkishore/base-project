package com.kishore;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MockService {

	@Autowired
	private MockData data;

	public String getUserName(String id) {
		Map<String,String> users = data.listAllUsers();
		return users.get(id);
	}
}
