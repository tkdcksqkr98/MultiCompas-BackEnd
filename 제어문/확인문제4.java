package 제어문;

import javax.swing.JOptionPane;

public class 확인문제4 {

	public static void main(String[] args) {
		
		String hobby = JOptionPane.showInputDialog("취미를 입력하세요.");
		double a = 0.01;
		int  b = 100;
		char c = '끝';
		boolean d = true;
		String result = "나의 취미는 배터리가 "+ b + "에서 " + a + c +"까지 " + hobby + "하기 입니다." + d;   
		System.out.println(result);
	}

}
