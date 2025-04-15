package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailAddReplyToTest {
	
private EmailConcrete email;

private InternetAddress address;
private InternetAddress address2;

private String userEmail;
private String name;
private String charset;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		
	}
	
	//Tests AddReplyTo to ensure addresses get correctly added to replyList
	@Test
	public void testAddReplyTo() throws AddressException, UnsupportedEncodingException, EmailException {
		userEmail = "abc@123.com";
		name = "Bob";
		address = new InternetAddress(userEmail);
		address.setPersonal(name);
		
		email.addReplyTo(userEmail, name);
		
		address2 = email.replyList.get(0);
		
		assertEquals(address, address2);

	}

}
