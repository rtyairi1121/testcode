package jp.co.rytairi;

public class AbstClass implements Interface {
	String gengo;
	String hougen;
	public void message(){
		System.out.println("AbstClass���N�����܂���");
	}

	public String language(){
		this.gengo = "Japanese";
		return(this.gengo);
	}
	public void style(){
		this.hougen = "kansai";
	}
}
