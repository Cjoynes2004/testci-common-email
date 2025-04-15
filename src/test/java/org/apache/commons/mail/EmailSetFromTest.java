package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import javax.mail.internet.InternetAddress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailSetFromTest {
	
	private EmailConcrete email;
	private InternetAddress address;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		
	}
	
	//Tests setfrom to ensure it correctly sets the from address
	@Test
	public void testSetFrom() throws Exception {
		address = new InternetAddress("abc@123.com");
		email.setFrom("abc@123.com");
		assertEquals(email.getFromAddress(), address);
	}
}
