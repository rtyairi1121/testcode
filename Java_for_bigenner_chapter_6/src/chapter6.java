import jp.calctest.*;

public class chapter6 {
	public static void main(String[] args){
		System.out.println("���������͂��Ă�������");
		int result1;
		int result2;
		int a = new java.util.Scanner(System.in).nextInt();
		int b = new java.util.Scanner(System.in).nextInt();
		result1 = CalcLogic.tasu(a , b);
		result2 = CalcLogic.hiku(a, b);
		System.out.println("��������F" + result1 + ",��������F" + result2);
	}
}