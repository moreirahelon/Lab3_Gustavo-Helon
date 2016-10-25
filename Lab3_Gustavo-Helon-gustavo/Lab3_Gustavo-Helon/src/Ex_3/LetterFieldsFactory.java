package Ex_3;


public class LetterFieldsFactory {
	protected String language;
	
	public void setLanguage(String language){
		this.language = language;
		
	}
	
	public LetterFields createLetterFields(String name, String address, String phone, String email, String date){		
		if (language.equals("english"))
			return new LetterFieldsEnglish(name,address,phone,email,date);
		if (language.equals("portuguese"))
			return new LetterFieldsPortuguese(name,address,phone,email,date);
		return new LetterFieldsPortuguese(name,address,phone,email,date);
		
	}

}
