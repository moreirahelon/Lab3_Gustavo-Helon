package Ex_5;

public class LetterFieldsEnglish extends LetterFields{

	public LetterFieldsEnglish(String name, String address, String phone, String email, String date) {
		super(name, address, phone, email, date);
	}
	
	@Override
	public String getDate(){
		String day,month,year;
		day = date.substring(0,2);
		month = date.substring(3,5);
		year = date.substring(6);
		return month + "/" + day + "/" + year;
				
		// 30/10/2016
	}
	
	@Override
	//só trabalha com Sr
	public String getName(){
		if(name.startsWith("Sr"))
			return "Mr." + name.substring(3);
		else
			return name;
	}
	
	@Override
	//esse código só trabalha com ruas
	public String getAddress(){
		String number, local;
		number = address.substring(address.indexOf("no")+3);
		local = address.substring(4,address.lastIndexOf(","));
		return number + ", " +local + " Street" ;
		//Rua H8 C, no 317
		//317, H8 C Street
	}
}
