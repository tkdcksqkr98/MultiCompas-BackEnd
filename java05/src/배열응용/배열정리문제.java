package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		
		System.out.println("첫번째와 세번째를 더한 값은: " + (data[0]+data[2]));
		
		
		String[] s = new String[3];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		
		System.out.println(s[0] + " 보다는 " + s[1]);
		
	}

}
