package Ex_2;

public abstract class LetterFields {
	protected  String address;
	protected  String email;
	protected  String phone;
	protected  String name;
	protected  String date;
	
	public LetterFields (String name, String address, String phone, String email, String date) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.date = date;
	}
	public String getAddress(){
		return address;
	}
	public String getEmail(){
		return email;
	}
	public String getPhone(){
		return phone;
	}
	public String getName(){
		return name;
	}
	public String getDate(){
		return date;
	}
}
