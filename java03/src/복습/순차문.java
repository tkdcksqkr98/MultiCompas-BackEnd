package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력  --> 처리 --> 출력
		// 두 개의 숫자를 입력을 받아서 처리해서 출력
		// 프로그래밍은 손으로 치는 값은 모두다 스트링으로 취급(문자열)
		// 램에 저장공간을 만드는 것 ==> 선언!!!
		// 선언할 때 램에 저장공간인 변수가 만들어진다.
		// 데이터타입 변수명
		// 입력!!
		
		String a =JOptionPane.showInputDialog("첫 번째 숫자를 입력하세요");
		String b =JOptionPane.showInputDialog("두 번째 숫자를 입력하세요");
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		
		System.out.printf("%.2f", a1/(double)b1);
		
	}

}
