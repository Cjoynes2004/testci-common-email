package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateGetSentDateTest {
	
	private EmailConcrete email;
	private Date date;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
		date = new Date(04262010);
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		
	}
	
	//Tests Sent date when sent date is not void (04/26/2010)
	@Test
	public void testGetSentDate() throws Exception {
		email.setSentDate(date);
		
		assertEquals(date, email.getSentDate());
		
	}

}
