package 제어문;

import javax.swing.JOptionPane;

public class 확인문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력: 데이터를 가지고 와요!
		// 처리: 특정한 작업 수행
		// 출력: 처리한 내용을 보여주세요!
		//자바는 자주 사용하는 부품은 대문자로 쓸 수 있어요!
		//외부에서 대화창같은 것으로 입력받는 경우는 무조건 컴퓨터는 String(문자열)로 인식	
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String what = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		
		//처리
		String result = "오늘 " + day + "에 수업후 나는 "+ what +"할 예정";
		
		//출력
		System.out.println(result);
		
		int num1 = 30;
		int num2 = 40;
		
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);

	}

}
