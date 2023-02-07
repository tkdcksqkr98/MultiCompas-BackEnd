package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 순차문 입력--> 처리--> 출력
		//입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것!! 사용해보자.!
		//다이얼로그 곳에서 입력한 값은 컴퓨터는 무조건 String으로 인식!!
		String name = JOptionPane.showInputDialog("이름을 입력하세요 ");
		String age = JOptionPane.showInputDialog("나이를 입력하세요 ");
		String com = JOptionPane.showInputDialog("소속을 입력하세요 ");
		
		String result = name + "의 나이는" + age + "이고, 소속은 " + com; //결과는 String
		
		//출력 -> 모니터 화면에 보이고 싶음.
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	}

}
