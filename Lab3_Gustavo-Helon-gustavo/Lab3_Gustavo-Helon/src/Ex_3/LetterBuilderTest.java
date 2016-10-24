package Ex_3;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Ex_3.Letter;              

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
		
		Sender = factory.createLetterFields("Joaozim",  "Rua H8 C, no 317",  "(12) 123456789", "zimjoao@email.com","10/06/2016");
		Destinatary = factory.createLetterFields("Joanazinha",  "Rua H8 A, no 731",  "(12) 987654321", "zinhajoana@email.com","10/06/2016");
		
	}
	
	// ------ testes corespondentes ao Ex 1 com as modificacoes do Ex3 
	@Test
	public void testComercialLetter() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.commercialLetter(Sender, Destinatary);
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
		mockedLetter = mockedBuilder.email(Sender, Destinatary);
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
		mockedLetter = mockedBuilder.personalLetter(Sender, Destinatary);
		mockedLetter.setBody("this is the body of the personal letter");
		String answer = "Joaozim to Joanazinha\nJoanazinha"
				+ "\nthis is the body of the personal letter\nhugs,\n"
		         + "Joaozim";		
		assertTrue(mockedLetter.model().equals(answer));
	}
	
	// ------ testes corespondentes ao Ex 2 com as modificacoes do Ex3 
	@Test
	public void testEnglishDate(){
		assertTrue(Sender.getDate().equals("06/10/2016"));
	}
	
	@Test
	public void testEnglishName(){
		Sender = factory.createLetterFields("Sr.Joaozim",  "Rua H8 C, no 317",  "(12) 123456789", "zimjoao@email.com","10/06/2016"); // nao seta idioma
		assertTrue(Sender.getName().equals("Mr.Joaozim"));		
	}
	
	@Test
	public void testEnglishAddress(){
		assertTrue(Sender.getAddress().equals("317, H8 C Street"));
		
	}
	
	// ------ testes corespondentes ao Ex 3 para o cado usuario querer layout também em formato brasileiro
	@Test
	public void testComercialLetterBR() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.commercialLetterBR(Sender, Destinatary);
		mockedLetter.setBody("este eh o corpo de uma carta comercial");
		String answer = "Carta Comercial \n\n06/10/2016\n\nJoaozim\n317, H8 C Street\nJoanazinha\n731, H8 A Street\neste eh o corpo de uma carta comercial\nSinceramente,\n\n\n"
				         + "             " + "Joaozim\n"
				         + "             " + "(12) 123456789\n"
				         + "             " + "zimjoao@email.com\n";
		assertTrue(mockedLetter.model().equals(answer));
	}
	
	@Test
	public void testEmailLetterBR() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.emailBR(Sender, Destinatary);
		mockedLetter.setBody("este eh o corpo de um email");
		String answer = "06/10/2016\nDe: Joaozim (zimjoao@email.com)\nPara: Joanazinha (zinhajoana@email.com)"
				+ "\neste eh o corpo de um email\nAtenciosamente,\n\n"
		         + "Joaozim\n"
		         +"(12) 123456789\n"
		         + "zimjoao@email.com\n";
		assertTrue(mockedLetter.model().equals(answer));
	}
	
	@Test
	public void testPersonalLetterBR() {
		mockedBuilder = new LetterBuilder();
		mockedLetter = mockedBuilder.personalLetterBR(Sender, Destinatary);
		mockedLetter.setBody("este eh o corpo de uma carta para um amigo");
		String answer = "Joaozim para Joanazinha"
				+ "\neste eh o corpo de uma carta para um amigo\nAbs,\n"
		         + "Joaozim";
		assertTrue(mockedLetter.model().equals(answer));
	}
}