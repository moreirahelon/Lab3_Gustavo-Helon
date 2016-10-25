package Ex_5;


public class LetterFieldsFactory {
	protected String _flag;
	protected String language;
	
	public void setLanguage(String language){
		this.language = language;
		
	}
	public void setFlag(String flag){
		this._flag = flag;
	}
	LetterFieldsFactory(){
		this._flag = "Default";
	}
	
	public LetterFields createLetterFields(String name, String address, String phone, String email, String date){		
		if (language.equals("english") && _flag.equals("Default"))
			return new LetterFieldsEnglish(name,address,phone,email,date);		
		if (language.equals("english") && _flag.equals("DDD"))
			return new LetterFieldsEnglishDDD(name,address,phone,email,date);
		if (language.equals("portuguese") && _flag.equals("Default"))
			return new LetterFieldsPortuguese(name,address,phone,email,date);
		return new LetterFieldsPortuguese(name,address,phone,email,date);
		
	}

}
