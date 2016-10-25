package Ex_5;


public class LetterBuilder {
	private String _language;
	// Layout das cartas em modelo americano
	protected Letter commercialLetter(LetterFields sender, LetterFields destinatary){
		if(_language.equals("english"))
			return this.commercialLetterUSA(sender, destinatary);
		if(_language.equals("portuguese"))
			return this.commercialLetterBR(sender, destinatary);		
		//retorno default
		return this.commercialLetterUSA(sender, destinatary);
		
	}
	public void setLanguage(String language){
		this._language = language;
	}
	protected Letter commercialLetterUSA(LetterFields sender, LetterFields destinatary) {
		
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
	
	// Layout das cartas no formato Brasileiro
	
protected Letter commercialLetterBR(LetterFields sender, LetterFields destinatary) {
		
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

		letter.setHeader("Carta Comercial \n\n" + header.toString());						// cabecalho
		letter.setConclusion("\nSinceramente,\n");						// conclusao
		letter.setSignature(signature.toString());					// assinatura

		return letter;
	}

	protected Letter emailBR(LetterFields sender, LetterFields destinatary) {

		Letter letter = new Letter();
		StringBuilder header = new StringBuilder();
		StringBuilder signature = new StringBuilder();

		header.append(sender.getDate() + "\n" + "De: " + sender.getName() + " (" + sender.getEmail() + ")\n" + "Para: "
				+ destinatary.getName() + " (" + destinatary.getEmail() + ")\n");

		signature.append("\n" + sender.getName() + "\n" + sender.getPhone() + "\n" + sender.getEmail() + "\n");

		letter.setHeader(header.toString()); // cabecalho
		letter.setConclusion("\nAtenciosamente,\n"); // conclusao
		letter.setSignature(signature.toString()); // assinatura

		return letter;
	}
	
	protected Letter personalLetterBR(LetterFields sender, LetterFields destinatary) {

		Letter letter = new Letter();
		StringBuilder header = new StringBuilder();

		header.append(sender.getName() + " para " 
						+ destinatary.getName() + "\n");

		letter.setHeader(header.toString()); // cabecalho
		letter.setConclusion("\nAbs,\n"); // conclusao
		letter.setSignature(sender.getName()); // assinatura

		return letter;
	}
	
}