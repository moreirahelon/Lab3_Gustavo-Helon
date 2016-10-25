package Ex_2;


public class LetterFieldsFactory {
	
	public LetterFields createLetterFields(String language,String name, 
			String address, String phone, String email, String date){		
		if (language.equals("english"))
			return new LetterFieldsEnglish(name,address,phone,email,date);
		if (language.equals("portuguese"))
			return new LetterFieldsPortuguese(name,address,phone,email,date);
		return new LetterFieldsPortuguese(name,address,phone,email,date);

		
	}

}
