package Ex_2;

public class LetterBuilder {
	
	protected Letter commercialLetter(LetterFields sender, LetterFields destinatary) {
		
		Letter letter = new Letter();
		StringBuilder header = new StringBuilder();
		StringBuilder signature = new StringBuilder();
		
		header.append(sender.getDate() + "\n\n"
					 + sender.getName() + "\n"
					 + sender.getAddress() + "\n"
					 + destinatary.getName() + "\n"
					 + destinatary.getAddress() + "\n");

		signature.append("\n\n"
						+ "             " + sender.getName() + "\n"
						+ "             " + sender.getPhone() + "\n"
						+ "             " + sender.getEmail() + "\n");

		letter.setHeader(header.toString());						// cabecalho
		letter.setConclusion("\nSincerely,\n");						// conclusao
		letter.setSignature(signature.toString());					// assinatura

		return letter;
	}
	
	protected Letter email(LetterFields sender, LetterFields destinatary) {
		
		Letter letter = new Letter();
		StringBuilder header = new StringBuilder();
		StringBuilder signature = new StringBuilder();
		
		header.append(sender.getDate() + "\n"
					 + "From: " + sender.getName()
				     + " (" + sender.getEmail() + ")\n"
					 + "To: " + destinatary.getName()
					 + " (" + destinatary.getEmail() + ")\n");

		signature.append("\n"
						+ sender.getName() + "\n"
						+ sender.getPhone() + "\n"
						+ sender.getEmail() + "\n");
				
		letter.setHeader(header.toString()); 					// cabecalho
		letter.setConclusion("\nSincerely,\n");					// conclusao
		letter.setSignature(signature.toString()); 				// assinatura
		
		return letter;
	}
	
	protected Letter personalLetter(LetterFields sender, LetterFields destinatary) {
		
		Letter letter = new Letter();
		StringBuilder header = new StringBuilder();
		
		header.append(sender.getName() + " to "
					 + destinatary.getName() + "\n"
					 + destinatary.getName() + "\n");
				
		letter.setHeader(header.toString() );									// cabecalho
		letter.setConclusion("\nhugs,\n");										// conclusao
		letter.setSignature(sender.getName());								// assinatura
		
		return letter;
	}
}
