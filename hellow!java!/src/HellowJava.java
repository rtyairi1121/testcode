import jp.co.rytairi.*;
import java.util.Date;

public class HellowJava {

	public static void main(String[] args) {
		String name = "world!!!";
		String hello = "Hello!!!";
		String language;

		Super_Hello_xxx world = new Super_Hello_xxx();
		Interface abst = new AbstClass();
		Interface [] abst2 = new Interface[5];
		abst2[0] = new AbstClass();
		abst2[1] = new AbstClass();
		abst2[2] = new AbstClass();
		abst2[3] = new AbstClass();
		abst2[4] = new AbstClass();

		Date now = new Date();

		world.setName(name);
		world.setHello(hello);


		String words2 = world.getName();
		String words1 = world.getHello();
		abst.style();
		language = abst2[0].language();

		if (abst instanceof AbstClass){
			AbstClass abst1 = (AbstClass) abst;
			abst1.message();
		}

		System.out.println(now);
		System.out.println(now.getTime());
		System.out.println(language);
		System.out.println(words1 + words2);
		world.outputMessage();
		world.testOutputMessage();
	}

}
