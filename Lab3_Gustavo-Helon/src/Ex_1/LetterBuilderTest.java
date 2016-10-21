package Ex_1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;              
												// APAGAR OS PRINTLN  !!!

public class LetterBuilderTest {
	private LetterFields Sender;
	private LetterFields Destinatary;
	public Letter mockedLetter;
	private LetterBuilder mockedBuilder;
	
	@Before
	public void setup(){
		Sender = new LetterFields("Joaozim",  "Rua H8 C, no 317",  "(12) 123456789", "zimjoao@email.com","10/06/2016");
		Destinatary = new LetterFields("Joanazinha",  "Rua H8 A, no 731",  "(12) 987654321", "zinhajoana@email.com","10/06/2016");
		
	}
	
	@Test
	public void testComercialLetter() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.commercialLetter(Sender, Destinatary);
		mockedLetter.setBody("this is the body of the commercial letter");
		String answer = "10/06/2016\n\nJoaozim\nRua H8 C, no 317\nJoanazinha\nRua H8 A, no 731\nthis is the body of the commercial letter\nSincerely,\n\n\n"
				         + "             " + "Joaozim\n"
				         + "             " + "(12) 123456789\n"
				         + "             " + "zimjoao@email.com\n";
		
		assertTrue(mockedLetter.model().equals(answer));
	}
	
	@Test
	public void testEmailLetter() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.email(Sender, Destinatary);
		mockedLetter.setBody("this is the body of the email letter");
		String answer = "10/06/2016\nFrom: Joaozim (zimjoao@email.com)\nTo: Joanazinha (zinhajoana@email.com)"
				+ "\nthis is the body of the email letter\nSincerely,\n\n"
		         + "Joaozim\n"
		         +"(12) 123456789\n"
		         + "zimjoao@email.com\n";
		assertTrue(mockedLetter.model().equals(answer));
	}

	@Test
	public void testPersonalLetter() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.personalLetter(Sender, Destinatary);
		mockedLetter.setBody("this is the body of the personal letter");
		String answer = "Joaozim to Joanazinha\nJoanazinha"
				+ "\nthis is the body of the personal letter\nhugs,\n"
		         + "Joaozim";		
		assertTrue(mockedLetter.model().equals(answer));
		
			
	}
}