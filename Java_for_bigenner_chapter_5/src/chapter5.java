public class chapter5 {
	public static void main(String[] args){
		System.out.println("メソッドを呼び出します");
		hello("花子");
		int ans=add(100,200);
		System.out.println("addの結果は"+ ans);
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

		String title = "はじめまして";
		String address = "onga@kddi.com";
		String text = "こんにちは。どうぞよろしくお願いします";
		email(title,address,text);
		email(address,text);

		double bottom = 10.0;
		double height = 5.0;
		double radius = 4.0;
		double area1 = calcTriangleArea(bottom,height);
		double area2 = calcCircleArea(radius);
		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、" + "面積は" + area1 + "平方cm");
		System.out.println("円の半径が" + radius + "cmの場合、円の面積は" + area2 + "平方cm");


		System.out.println("メソッドの呼び出しが終わりました");
	}
		public static void hello (String name){
		System.out.println(name + "さん、こんにちは");
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
			System.out.println("身長は" + height + "体重は" + weight + "名前は" + name);
		}

		public static void email(String title,String address,String text){
			System.out.println(address + "に、以下のメールを送信しました");
			System.out.println("件名:" + title);
			System.out.println("本文:" + text);
		}

		public static void email(String address,String text){
			System.out.println(address + "に、以下のメールを送信しました");
			System.out.println("件名:無題");
			System.out.println("本文:" + text);
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
