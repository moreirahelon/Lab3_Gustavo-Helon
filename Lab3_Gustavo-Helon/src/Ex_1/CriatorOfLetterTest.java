package Ex_1;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex_1.Date;
import Ex_1.Person;
import Ex_1.Letter;
import Ex_1.CriatorOfLetter;

public class CriatorOfLetterTest {
	
	public static Person mockSender() {
		return new Person("Joaozim", "Rua H8 C, no 317", "(12) 123456789", "zimjoao@email.com");
	}

	public static Person mockDestinatary() {
		return new Person("Joanazinha",  "Rua H8 A, no 731",  "(12) 987654321", "zinhajoana@email.com");
	}	
	
	public static Date mockDate() {
		return new Date ("10/06/16");
	}

	@Test
	public void test() {
		
	}

}
