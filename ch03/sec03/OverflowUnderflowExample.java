package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
		for(int i = 0; i<5;i++)
		{
			var1++;
			System.out.println("var1: "+var1);
		}
		System.out.println("--------------------");
		
		byte var2 = -125;
		for(int i =0;i<5;i++)
		{
			var2--;
			System.out.println("var2: "+var2);
		}
	}

}
/*
 var1: 0111 1110
 var1: 0111 1111
 var1: 1000 0000
 var1: 1000 0001
 var1: 1000 0010
 
 var2: 1000 0010
 var2: 1000 0001
 var2: 1000 0000
 var2: 0111 1111
 var2: 0111 1110
 * */
