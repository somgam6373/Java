package ch03.sec02;

public class ArithmeticOperatorExamlple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2; // 14
		System.out.println("result1: "+result1);
		
		long result2 = v1 + v2 - v4; // 4
		System.out.println("result2: "+result2);
		
		double result3 = (double) v1/v2; // 2.5
		System.out.println("result3: "+ result3);
		
		int result4 =v1%v2; // 0.5
		System.out.println("result4: "+result4);
	}

}
