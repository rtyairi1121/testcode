public class Java_for_beginner_chapter3 {
	public static void main(String[] args){
/*
		int x = 5;
		int y = 10;
		String ans = "x+y=" + (x + y);
		System.out.println(ans);

		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner (System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner (System.in).nextLine();
		int age = Integer.parseInt ( ageString );
		int fortune = new java.util.Random ( ).nextInt(4);
		fortune++;
		System.out.println("占いの結果がでました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉　2:中吉　3:吉　4:凶");
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
				System.out.println("検索します");
			break;

			case 2:
				System.out.println("登録します");
			break;

			case 3:
				System.out.println("削除します");
			break;

			case 4:
				System.out.println("変更します");
			break;

		}

	}
}

