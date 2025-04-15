package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringGetHostNameTest {
	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		email = null;
	}
	
	
	//Tests Get Host Name when hostname is set
	@Test
	public void testGetHostNameNotNull() throws Exception {
		email.setHostName("localhost");
		
		assertEquals("localhost", email.getHostName());
	}
	
	//Tests GetHostName when hostname is null
	@Test
	public void testGetHostNameNull() throws Exception {
		assertNull(email.getHostName());
	}

}
