package com.kishore;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class JunitAndMockitoConfigurationTests {

	@Mock
	private MockData data;

	@InjectMocks
	private MockService service;
	
	private Map<String, String> dummyUsers;

	@Before
	public void setUp() throws Exception {
		
		dummyUsers = new HashMap<>();
		
		dummyUsers.put("1", "User 1");
		dummyUsers.put("2", "User 2");
		dummyUsers.put("3", "User 3");
		dummyUsers.put("4", "User 4");
		dummyUsers.put("5", "User 5");
		
		
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testMockService_Valid_User() {
		String expected = "User 3";
		when(data.listAllUsers()).thenReturn(dummyUsers);
		String actual = service.getUserName("3");
		assertEquals(expected, actual);
	}

	@Test
	public void testMockService_Invalid_User() {
		String expected = null;
		when(data.listAllUsers()).thenReturn(dummyUsers);
		String actual=service.getUserName("10");
		assertEquals(expected, actual);
	}

}
