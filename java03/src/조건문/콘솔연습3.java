package 조건문;

import java.util.Scanner;

public class 콘솔연습3 {

	public static void main(String[] args) {
		//1.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("아이디를 입력하세요.");
//		String id = sc.next();
//		
//		System.out.println("비밀번호를 입력하세요.");
//		String pw = sc.next();
//		
//		if (id.equals("root")  && pw.equals("1234")) {
//			System.out.println("로그인 성공!");
//		}else {
//			System.out.println("로그인 실패!");
//		}
		
		//2.
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("사과 구매 갯수");
//		int data1 = sc1.nextInt();
//		System.out.println("사과 한 개당 가격입력");
//		int data2 = sc1.nextInt();
//		int i =data1 *data2;
//		
//		System.out.println("딸기 구매 갯수");
//		int data3 = sc1.nextInt();
//		System.out.println("딸기 한 개당 가격입력");
//		int data4 = sc1.nextInt();
//		int i2 =data3 *data4;
//		
//		
//		System.out.println("사과 구매 가격은" + (data1 * data2) + "원 입니다.");
//		System.out.println("딸기 구매 가격은" + (data3 * data4) + "원 입니다.");
//		System.out.println("전체 구매 가격은" + (i + i2) + "원 입니다.");
		
		//3.
//		Scanner sc3 = new Scanner(System.in);
//		System.out.println("시작값을 입력하세요.");
//		int a = sc3.nextInt();
//		
//		System.out.println("종료값을 입력하세요.");
//		int b = sc3.nextInt();
//		
//		int sum = 0;
//		for (int i = a; i <= b; i++) {
//			sum = sum + i;
//		}
//		System.out.println("시작값부터 종료값 까지 모두 더한 값은" + sum + "입니다.");
		
		//4.
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값을 입력하세요.");
		int a = sc.nextInt();
		System.out.println("종료값을 입력하세요.");
		int b = sc.nextInt();
		System.out.println("점프값을 입력하세요.");
		int c = sc.nextInt();
		
		int sum1 = 0;
		for (int i = a; i < b; i++) {
			sum1 = sum1 +c +a;
			if (sum1 < 100) {
			System.out.println("점프 값을 포함한 더한 값은" + sum1 + "입니다.");
				break;
			}else {
				System.out.println("더한 값이 100을 넘었으므로 프로그램을 종료합니다.");
				break;
		}
	}
		sc.close();
	}
}
