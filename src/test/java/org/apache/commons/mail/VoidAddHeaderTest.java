package org.apache.commons.mail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VoidAddHeaderTest {
	
	private EmailConcrete email;
	private String name;
	private String value;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		email = null;
	}
	
	//Testing with null value
	@Test(expected = IllegalArgumentException.class)
	public void testAddHeaderNullValue() throws Exception {
		name = "John";
		value = null;
		
		email.addHeader(name, value);
	}
	
	//Testing with null name
	@Test(expected = IllegalArgumentException.class)
	public void testAddHeaderNullName() throws Exception {
		name = null;
		value = "1";
		
		email.addHeader(name, value);
	}
	
	//Testing with valid name and value
	@Test
	public void testAddHeader() throws Exception {
		name = "John";
		value = "1";
		
		email.addHeader(name, value);
	}

}
