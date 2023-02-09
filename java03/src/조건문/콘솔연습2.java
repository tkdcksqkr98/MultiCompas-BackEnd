package 조건문;

import java.util.Scanner;

public class 콘솔연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 >>");
		String data1 = sc.next();
		
		System.out.println("나이 입력 >>");
		int age = sc.nextInt();
		
		System.out.println("키 입력 >>");
		double key = sc.nextDouble();
		
		System.out.println("저녁을 먹었나요?(true/false)");
		boolean food = sc.nextBoolean();
		
		System.out.println("올해의 목표는");
		sc.nextLine();
		String life = sc.nextLine();
		
		
		System.out.println("===============");
		System.out.println("내 이름는 " + data1 + " 입니다.");
		System.out.println("내년 나이는 " + (age + 1));
		System.out.println("내년 키는" + (key + 10));
		if (food) {
			System.out.println("배가 부르시겠군요!");
		}else {
			System.out.println("배가 고프시겠군요!");
		}
		
		
		
		
		
		
		sc.close();

	}

}
