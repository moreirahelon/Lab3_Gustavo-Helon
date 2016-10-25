package Ex_4;

public class Letter {
	private String header = "";
	private String body = "";
	private String conclusion = "";
	private String signature = "";
	
	public Letter() {}
	
	public String model() {
		return header + body + conclusion + signature;
	}	
	
	public void setHeader(String header) {
		this.header = header;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getHeader(){
		return header;
	}
	public String getBody(){
		return body;
	}
	public String getConclusion(){
		return conclusion;
	}
	public String getSignature(){
		return signature;
	}
}
