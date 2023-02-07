package 조건문;

import javax.swing.JOptionPane;

public class 추가문제 {

	public static void main(String[] args) {
	//1.두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
	//2.두 수를 입력받아 정수로 변환하여 정수변수에 저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
		
	//1
		String a = JOptionPane.showInputDialog("첫 번째 수를 입력하세요.");
		String b = JOptionPane.showInputDialog("두 번째 수를 입력하세요.");
		String c = JOptionPane.showInputDialog("사칙연산을 할 기호를 입력하세요");
		
		int a1 =Integer.parseInt(a);
		int b1 =Integer.parseInt(b);
		
		
		if (c.equals("+")) {
			System.out.println(a1 + b1);
		} else if(c.equals("-")){
			System.out.println(a1 - b1);
		} else if(c.equals("*") || c.equals("x")) {
			System.out.println(a1 * b1);
		} else {
			System.out.println(a1 / b1);
		}
		
		
		
	//2
		String e = JOptionPane.showInputDialog("첫 번째 수를 입력하세요.");
		String f = JOptionPane.showInputDialog("두 번째 수를 입력하세요.");
		
		double e1 =Integer.parseInt(e);
		double f1 =Integer.parseInt(f);
		double result = (e1 /f1);
		System.out.printf("%.2f", result);
	}

}
