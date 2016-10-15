package Ex_1;

import Ex_1.Date;
import Ex_1.Letter;
import Ex_1.Person;

public class LetterBuilder {
	
	public Letter commercialLetter(Person sender, Person destinatary, Date date) {
		
		Letter letter = new Letter();
		StringBuilder header = new StringBuilder();
		StringBuilder signature = new StringBuilder();
		
		header.append(date.date + "\n\n"
					 + sender.name + "\n"
					 + sender.address + "\n"
					 + destinatary.name + "\n"
					 + destinatary.address + "\n");

		signature.append("\n\n"
						+ "             " + sender.name + "\n"
						+ "             " + sender.phone + "\n"
						+ "             " + sender.email + "\n");

		letter.setHeader(header.toString());						// cabecalho
		letter.setBody("\n\nDear " + destinatary.name + ",\n");		// corpo
		letter.setConclusion("\nSincerely,\n");						// conclusao
		letter.setSignature(signature.toString());					// assinatura

		return letter;
	}
	
	public Letter email(Person sender, Person destinatary, Date date) {
		
		Letter letter = new Letter();
		StringBuilder header = new StringBuilder();
		StringBuilder signature = new StringBuilder();
		
		header.append(date.date + "\n"
					 + "From: " + sender.name
				     + " (" + sender.email + ")\n"
					 + "To: " + destinatary.name
					 + " (" + destinatary.email + ")\n");

		signature.append("\n"
						+ sender.name + "\n"
						+ sender.phone + "\n"
						+ sender.email + "\n");
				
		letter.setHeader(header.toString()); 					// cabecalho
		letter.setBody("\n\nDear " + destinatary.name + ",\n"); 	// corpo
		letter.setConclusion("\nSincerely,\n");					// conclusao
		letter.setSignature(signature.toString()); 				// assinatura
		
		return letter;
	}
	
	public Letter personalLetter(Person sender, Person destinatary, Date date) {
		
		Letter letter = new Letter();
		StringBuilder header = new StringBuilder();
		StringBuilder signature = new StringBuilder();
		
		header.append(sender.name + " to "
					 + destinatary.name + "\n"
					 + sender.name + "\n");
				
		letter.setHeader(header.toString());									// cabecalho
		letter.setBody("\n\n" + "Dear friend," + destinatary.name + ",\n");		// corpo
		letter.setConclusion("\nhugs,\n");										// conclusao
		letter.setSignature(signature.toString());								// assinatura
		
		return letter;
	}
}
