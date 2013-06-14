package jp.co.rytairi;

public class BasicClass {

	private String name;
	private String name1;
	private String name2;

	public BasicClass(String name1, String name2){
		this.name = name1;
		this.name1= name2;
	}


	public void setName(String name)
	{
		this.name = name;
	}
	public String getName(){
		return(this.name);
	}
	public void outputMessage(){
		System.out.println("Hello‚ÌƒNƒ‰ƒX");
	}
}

