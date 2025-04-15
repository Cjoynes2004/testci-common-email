package org.apache.commons.mail;

import static org.junit.Assert.assertNotNull;

import javax.mail.internet.MimeMultipart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VoidBuildMimeMessage {

	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		email = null;
	}
	
	//Testing with all objects filled.
	@Test
	public void testBuildMimeMessageFull() throws Exception {
		
		email.setFrom("abc@123.com");
		email.addTo("123@abc.com");
		email.setSubject("Test Subject");
		email.setMsg("Test message");
		email.addBcc("apple@banana.com");
		email.addCc("testing@123.com");
		email.setContent(email, "Content");
		email.addReplyTo("foo@bar.com");
		email.addHeader("John", "1");
		
		email.setHostName("localhost");
		
		email.buildMimeMessage();
		
		assertNotNull(email.getMimeMessage());
	}
	
	//Testing with minimal objects filled, only required "from" and "to" field.
	@Test
	public void testBuildMimeMessageEmpty() throws Exception {
		email.setHostName("localhost");
		email.setFrom("abc@123.com");
		email.addTo("123@abc.com");
		
		email.buildMimeMessage();
		
		assertNotNull(email.getMimeMessage());
	}
	
	//Testing with two buildMimeMessage function called
	@Test(expected = IllegalStateException.class)
	public void testBuildMimeMessageTwice() throws Exception {
		email.setHostName("localhost");
		email.setFrom("abc@123.com");
		email.addTo("123@abc.com");
		
		email.buildMimeMessage();
		email.buildMimeMessage();	
	}
	
	//Testing without setting from, expecting EmailException
	@Test(expected = EmailException.class)
	public void testBuildMimeMessageNull() throws EmailException {
		email.setHostName("localhost");
		email.buildMimeMessage();
		
	}
	
	
}
