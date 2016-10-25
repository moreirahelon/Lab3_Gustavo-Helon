package Ex_4;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LetterBuilderTest {
	private LetterFields Sender;
	private LetterFields Destinatary;
	public Letter mockedLetter;
	private LetterBuilder mockedBuilder;
	private LetterFieldsFactory factory;
	
	@Before
	public void setup(){
		factory = new LetterFieldsFactory();
		factory.setLanguage("english");        // Agora o usuário escolhe o idioma
		factory.setFlag("DDD"); //escolha do DDD
		Sender = factory.createLetterFields("Joaozim",  "Rua H8 C, no 317",  "(12) 123456789", "zimjoao@email.com","10/06/2016");
		Destinatary = factory.createLetterFields("Joanazinha",  "Rua H8 A, no 731",  "(12) 987654321", "zinhajoana@email.com","10/06/2016");
		
	}
	
	
	@Test
	public void testComercialLetterDDD() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.commercialLetter(Sender, Destinatary);
		mockedLetter.setBody("this is the body of the commercial letter");
		String answer = "06/10/2016\n\nJoaozim\n317, H8 C Street\nJoanazinha\n731, H8 A Street\nthis is the body of the commercial letter\nSincerely,\n\n\n"
				         + "             " + "Joaozim\n"
				         + "             " + "DDD: 12 Tel: 123456789\n" //(12) 123456789
				         + "             " + "zimjoao@email.com\n";

		assertTrue(mockedLetter.model().equals(answer));
	}
	
	
}