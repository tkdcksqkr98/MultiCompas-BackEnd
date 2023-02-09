package 조건문;

import java.util.Scanner;

public class 콘솔연습 {

	public static void main(String[] args) {
		System.out.println("나에 대한 정보");
		System.out.println("------------");
		System.out.print("이름 입력 >> ");
		Scanner sc = new Scanner(System.in); //컴퓨터.키보드
		String data1 = sc.next();
		System.out.println("나의 이름은 " + data1 +" 입니다." );
		System.out.print("나이 입력 >> ");
		String data2 = sc.next();
		System.out.println("제 나이는 " + data2 + "세 입니다.");
		
		System.out.print("취미 입력 >> ");
		String data3 = sc.next();
		System.out.println("제 취미는 " + data3 + " 입니다.");
		
		
		sc.close();

	}

}
