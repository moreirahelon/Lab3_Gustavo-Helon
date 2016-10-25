package Ex_5;

public class LetterFieldsEnglishDDD extends LetterFieldsEnglish{

	public LetterFieldsEnglishDDD(String name, String address, String phone, String email, String date) {
		super(name, address, phone, email, date);
	}
	@Override
	public String getPhone(){
		//(12) 123456789
		String DDD, phonenumber, answer;
		DDD = this.phone.substring(1, 3);
		phonenumber = this.phone.substring(5);
		answer = "DDD: " + DDD + " Tel: " + phonenumber;
				
		return answer;
	}

}
