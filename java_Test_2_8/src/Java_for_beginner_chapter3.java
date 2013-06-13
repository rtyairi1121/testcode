public class Java_for_beginner_chapter3 {
	public static void main(String[] args){
/*
		int x = 5;
		int y = 10;
		String ans = "x+y=" + (x + y);
		System.out.println(ans);

		System.out.println("‚æ‚¤‚±‚»è‚¢‚ÌŠÙ‚Ö");
		System.out.println("‚ ‚È‚½‚Ì–¼‘O‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		String name = new java.util.Scanner (System.in).nextLine();
		System.out.println("‚ ‚È‚½‚Ì”N—î‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		String ageString = new java.util.Scanner (System.in).nextLine();
		int age = Integer.parseInt ( ageString );
		int fortune = new java.util.Random ( ).nextInt(4);
		fortune++;
		System.out.println("è‚¢‚ÌŒ‹‰Ê‚ª‚Å‚Ü‚µ‚½I");
		System.out.println(age + "Î‚Ì" + name + "‚³‚ñA‚ ‚È‚½‚Ì‰^‹C”Ô†‚Í" + fortune + "‚Å‚·");
		System.out.println("1:‘å‹g@2:’†‹g@3:‹g@4:‹¥");
*/
/*
		for (int i = 0; i < 10 ; i++){

			if(i == 3 ){
				continue;
			}
			System.out.println(i);
		}
		*/
		System.out.println("[menue] 1:search 2:regster 3:delete 4:change");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected)
		{
			case 1:
				System.out.println("ŒŸõ‚µ‚Ü‚·");
			break;

			case 2:
				System.out.println("“o˜^‚µ‚Ü‚·");
			break;

			case 3:
				System.out.println("íœ‚µ‚Ü‚·");
			break;

			case 4:
				System.out.println("•ÏX‚µ‚Ü‚·");
			break;

		}

	}
}

