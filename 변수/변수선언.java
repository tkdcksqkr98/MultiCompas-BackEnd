package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바는 변수를 만들 때, 어떤 타입의 데이터를 넣을지 미리 결정
		// 선언!! 타입 변수명!! ==> 변수가 생성됨!
		// 기본 데이터 => 정수, 실수, 문자1, 논리
		int num = 100; //정수변수
		double num2 =22.2; //실수변수, 22.0, 22(정수를 넣을 수 있음.)
		char c ='한'; //글자 1글자 ==>' '
		boolean b =true; //false
		num = 200;
		//b = 300;
		System.out.println("정수값은 " + num);
		System.out.println("실수값은 " + num2);
		System.out.println("문자1개값 은 " + c);
		System.out.println("부울렌 값은 " + b);
		
	}

}
