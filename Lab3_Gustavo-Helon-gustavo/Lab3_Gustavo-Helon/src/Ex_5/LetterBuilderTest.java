package Ex_5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LetterBuilderTest {
	private LanguageChooser chooser;
	private LetterFields Sender;
	private LetterFields Destinatary;
	public Letter mockedLetter;
	private LetterBuilder mockedBuilder;
	private LetterFieldsFactory factory;
	
	@Before
	public void setup(){
		mockedBuilder = new LetterBuilder();
		factory = new LetterFieldsFactory();
		chooser = new LanguageChooser(factory, mockedBuilder);
		chooser.setLanguage("portuguese");        // Agora o usuário escolhe o idioma
		Sender = factory.createLetterFields("Joaozim",  "Rua H8 C, no 317",  "(12) 123456789", "zimjoao@email.com","10/06/2016");
		Destinatary = factory.createLetterFields("Joanazinha",  "Rua H8 A, no 731",  "(12) 987654321", "zinhajoana@email.com","10/06/2016");
		
	}
	
	
	@Test
	public void testComercialLetterDDD() {
		mockedLetter = mockedBuilder.commercialLetter(Sender, Destinatary);
		mockedLetter.setBody("este eh o corpo de uma carta comercial");
		String answer = "Carta Comercial \n\n10/06/2016\n\nJoaozim\nRua H8 C, no 317\nJoanazinha\nRua H8 A, no 731\neste eh o corpo de uma carta comercial\nSinceramente,\n\n\n"
		         + "             " + "Joaozim\n"
		         + "             " + "(12) 123456789\n"
		         + "             " + "zimjoao@email.com\n";
		
		assertTrue(mockedLetter.model().equals(answer));
	}
	
	
}