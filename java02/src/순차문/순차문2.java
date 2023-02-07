package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 순차문 입력--> 처리--> 출력
		//입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것!! 사용해보자.!
		//다이얼로그 곳에서 입력한 값은 컴퓨터는 무조건 String으로 인식!!
		String data1 = JOptionPane.showInputDialog("키를 입력하세요 ");
		String data2 = JOptionPane.showInputDialog("몸무게를 입력하세요 ");
		
		//처리 -> 숫자 더하기 연산
		//		String으로 int로 변경해주어야 함.
		double data3 = Double.parseDouble(data1);
		double data4 = Double.parseDouble(data2);
		
		double result = data4 / (data3 * data3); //결과는 String
		
		//출력 -> 모니터 화면에 보이고 싶음.
		System.out.println(result);
	}

}
