package Ex_1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;              
												// APAGAR OS PRINTLN  !!!

public class LetterBuilderTest {
	private Person Sender;
	private Person Destinatary;
	private Date Date;
	public Letter mockedLetter;
	private LetterBuilder mockedBuilder;
	
	@Before
	public void setup(){
		Sender = new Person("Joaozim",  "Rua H8 C, no 317",  "(12) 123456789", "zimjoao@email.com");
		Destinatary = new Person("Joanazinha",  "Rua H8 A, no 731",  "(12) 987654321", "zinhajoana@email.com");
		Date = new Date("10/06/16");
		
	}
	
	@Test
	public void testComercialLetter() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.commercialLetter(Sender, Destinatary, Date);
		mockedLetter.body = "this is the body of the commercial letter";
		
		assertEquals(mockedLetter.model(), mockedLetter.header + mockedLetter.body + mockedLetter.conclusion + mockedLetter.signature);
		System.out.println(mockedLetter.header + mockedLetter.body + mockedLetter.conclusion + mockedLetter.signature);
	}
	
	@Test
	public void testEmailLetter() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.email(Sender, Destinatary, Date);
		mockedLetter.body = "this is the body of the email letter";
		
		assertEquals(mockedLetter.model(), mockedLetter.header + mockedLetter.body + mockedLetter.conclusion + mockedLetter.signature);
		System.out.println(mockedLetter.header + mockedLetter.body + mockedLetter.conclusion + mockedLetter.signature);
	}

	@Test
	public void testPersonalLetter() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.personalLetter(Sender, Destinatary, Date);
		mockedLetter.body = "this is the body of the personal letter";
		
		assertEquals(mockedLetter.model(), mockedLetter.header + mockedLetter.body + mockedLetter.conclusion + mockedLetter.signature);
		System.out.println(mockedLetter.header + mockedLetter.body + mockedLetter.conclusion + mockedLetter.signature);
	}
}