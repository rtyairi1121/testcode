public class Java_for_beginner_chapter3 {
	public static void main(String[] args){
/*
		int x = 5;
		int y = 10;
		String ans = "x+y=" + (x + y);
		System.out.println(ans);

		System.out.println("�悤�����肢�̊ق�");
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		String name = new java.util.Scanner (System.in).nextLine();
		System.out.println("���Ȃ��̔N�����͂��Ă�������");
		String ageString = new java.util.Scanner (System.in).nextLine();
		int age = Integer.parseInt ( ageString );
		int fortune = new java.util.Random ( ).nextInt(4);
		fortune++;
		System.out.println("�肢�̌��ʂ��ł܂����I");
		System.out.println(age + "�΂�" + name + "����A���Ȃ��̉^�C�ԍ���" + fortune + "�ł�");
		System.out.println("1:��g�@2:���g�@3:�g�@4:��");
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
				System.out.println("�������܂�");
			break;

			case 2:
				System.out.println("�o�^���܂�");
			break;

			case 3:
				System.out.println("�폜���܂�");
			break;

			case 4:
				System.out.println("�ύX���܂�");
			break;

		}

	}
}
