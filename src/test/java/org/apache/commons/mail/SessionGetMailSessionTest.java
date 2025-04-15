package org.apache.commons.mail;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SessionGetMailSessionTest {
	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		
	}
	
	//Tests GetMailSession when SSL is set to True
	@Test
	public void testGetMailSessionSSLTrue() throws Exception {
		email.setSSLOnConnect(true);
		email.setHostName("localhost");
		
		assertNotNull(email.getMailSession());
	}

}
