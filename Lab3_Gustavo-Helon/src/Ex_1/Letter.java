package Ex_1;

public class Letter {
	private String header = "";
	private String body = "";
	private String conclusion = "";
	private String signature = "";
	
	public Letter() {}
	
	public String model() {
		return "-------------------------------\n" + 
	             header + body + conclusion + signature +
	             "\n-------------------------------\n";
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
}