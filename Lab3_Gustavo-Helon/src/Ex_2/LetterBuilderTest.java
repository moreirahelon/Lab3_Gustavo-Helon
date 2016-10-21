package Ex_2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;              

public class LetterBuilderTest {
	private LetterFields SenderEnglish;
	private LetterFields DestinataryEnglish;
	public Letter mockedLetter;
	private LetterBuilder mockedBuilder;
	private LetterFieldsFactory factory;
	
	@Before
	public void setup(){
		factory = new LetterFieldsFactory();
		SenderEnglish = factory.createLetterFields("english","Joaozim",  "Rua H8 C, no 317",  "(12) 123456789", "zimjoao@email.com","10/06/2016");
		DestinataryEnglish = factory.createLetterFields("english","Joanazinha",  "Rua H8 A, no 731",  "(12) 987654321", "zinhajoana@email.com","10/06/2016");
		
	}
	
	@Test
	public void testComercialLetter() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.commercialLetter(SenderEnglish, DestinataryEnglish);
		mockedLetter.setBody("this is the body of the commercial letter");
		String answer = "06/10/2016\n\nJoaozim\n317, H8 C Street\nJoanazinha\n731, H8 A Street\nthis is the body of the commercial letter\nSincerely,\n\n\n"
				         + "             " + "Joaozim\n"
				         + "             " + "(12) 123456789\n"
				         + "             " + "zimjoao@email.com\n";
		assertTrue(mockedLetter.model().equals(answer));
	}
	
	@Test
	public void testEmailLetter() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.email(SenderEnglish, DestinataryEnglish);
		mockedLetter.setBody("this is the body of the email letter");
		String answer = "06/10/2016\nFrom: Joaozim (zimjoao@email.com)\nTo: Joanazinha (zinhajoana@email.com)"
				+ "\nthis is the body of the email letter\nSincerely,\n\n"
		         + "Joaozim\n"
		         +"(12) 123456789\n"
		         + "zimjoao@email.com\n";
		assertTrue(mockedLetter.model().equals(answer));
	}

	@Test
	public void testPersonalLetter() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.personalLetter(SenderEnglish, DestinataryEnglish);
		mockedLetter.setBody("this is the body of the personal letter");
		String answer = "Joaozim to Joanazinha\nJoanazinha"
				+ "\nthis is the body of the personal letter\nhugs,\n"
		         + "Joaozim";		
		assertTrue(mockedLetter.model().equals(answer));
	}
	@Test
	public void testEnglishDate(){
		assertTrue(SenderEnglish.getDate().equals("06/10/2016"));
	}
	@Test
	public void testEnglishName(){
		SenderEnglish = factory.createLetterFields("english","Sr.Joaozim",  "Rua H8 C, no 317",  "(12) 123456789", "zimjoao@email.com","10/06/2016");
		assertTrue(SenderEnglish.getName().equals("Mr.Joaozim"));		
	}
	@Test
	public void testEnglishAddress(){
		assertTrue(SenderEnglish.getAddress().equals("317, H8 C Street"));
		
	}
	
	
	
	
}