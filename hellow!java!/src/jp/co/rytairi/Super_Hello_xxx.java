package jp.co.rytairi;

public class Super_Hello_xxx extends Hello_xxx {
	private String hello;
	public Super_Hello_xxx(){
		this.hello = "null";
	}
	public String getHello(){
		return this.hello;
	}
	public void setHello( String hello){
		this.hello = hello;
	}
	public void outputMessage(){
		System.out.println("Super_Hello�̃N���X");
	}
	public void testOutputMessage(){
		super.outputMessage();
	}
}
