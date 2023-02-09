package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		//1.
		int[] a = new int[5];
		//2.
		System.out.println(a.length);
		//3.
		a[0] = 100; 
		System.out.println(a[0]);
		//4.
		a[4] = 500;
		System.out.println(a[4]);
		//5.
		a[2] = 200;
		System.out.println(a[2]);
		//6.
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
			
		}
		// 7.
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + ": " + a[i]);
			
		}
		
		
	}

}
