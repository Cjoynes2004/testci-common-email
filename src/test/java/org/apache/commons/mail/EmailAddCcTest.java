package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailAddCcTest {
	
	private static final String TEST_EMAIL = "ab@bc.com";
	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		
	}
	
	//Test addCc(String email) function
	@Test
	public void testAddCc() throws Exception {
		email.addCc(TEST_EMAIL);
		
		assertEquals(1, email.getCcAddresses().size());
		
	}

}
