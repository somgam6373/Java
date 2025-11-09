package ch04.sec08;

public class CoutinueExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int[] scores = {1,2,3};
		print(new int[] {1,2,4});
	}
	public static void print(int []scores) {
		for(int i = 0; i<scores.length;i++) {
			System.out.println(scores[i]);
		}
	}

}
