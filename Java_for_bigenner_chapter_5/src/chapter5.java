public class chapter5 {
	public static void main(String[] args){
		System.out.println("���\�b�h���Ăяo���܂�");
		hello("�Ԏq");
		int ans=add(100,200);
		System.out.println("add�̌��ʂ�"+ ans);
		int[] array = {1,2,3};
		incArray(array);
		for(int i : array){
			System.out.println(i);
		}
		int[] array1 = makeArray(3);
		for (int i : array1){
			System.out.println(i);
		}
		introduceOneself();

		String title = "�͂��߂܂���";
		String address = "onga@kddi.com";
		String text = "����ɂ��́B�ǂ�����낵�����肢���܂�";
		email(title,address,text);
		email(address,text);

		double bottom = 10.0;
		double height = 5.0;
		double radius = 4.0;
		double area1 = calcTriangleArea(bottom,height);
		double area2 = calcCircleArea(radius);
		System.out.println("�O�p�`�̒�ӂ̒�����" + bottom + "cm�A������" + height + "cm�̏ꍇ�A" + "�ʐς�" + area1 + "����cm");
		System.out.println("�~�̔��a��" + radius + "cm�̏ꍇ�A�~�̖ʐς�" + area2 + "����cm");


		System.out.println("���\�b�h�̌Ăяo�����I���܂���");
	}
		public static void hello (String name){
		System.out.println(name + "����A����ɂ���");
	}

		public static int add(int x,int y){
			int ans = x + y;
			System.out.println(ans);
			return ans;
		}

		public static void incArray( int[] array){
			for (int i = 0; i < array.length;i++){
				array[i]++;
			}
		}

		public static int[] makeArray (int size){
			int[] newArray = new int [size];
			for (int i = 0; i < newArray.length ; i++){
				newArray [i] = i;
			}
			return newArray;
		}

		public static void introduceOneself(){
			int height = 170;
			int weight = 60;
			String name = "zawa";
			System.out.println("�g����" + height + "�̏d��" + weight + "���O��" + name);
		}

		public static void email(String title,String address,String text){
			System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂���");
			System.out.println("����:" + title);
			System.out.println("�{��:" + text);
		}

		public static void email(String address,String text){
			System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂���");
			System.out.println("����:����");
			System.out.println("�{��:" + text);
		}

		public static double calcTriangleArea(double bottom,double height){
			double area = bottom * height / 2;
			return area;
		}

		public static double calcCircleArea(double radius){
			double area = radius * radius * 3.14;
			return area;
		}

}