package Ex_1;

public class Letter {
	String header = "";
	String body = "";
	String conclusion = "";
	String signature = "";
	
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
}
