package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IntGetSocketConnectionTimeoutTest {
	
	private EmailConcrete email;
	private int socketInt;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		
	}
	
	//Tests arbitrary socketInt to ensure set and get functions work properly
	@Test
	public void testGetSocketConnectionTimeout() {
		socketInt = 2;
		email.setSocketConnectionTimeout(socketInt);
		
		assertEquals(socketInt, email.getSocketConnectionTimeout());
	}
}
