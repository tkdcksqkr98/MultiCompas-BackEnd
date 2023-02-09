package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		
		//인기투표해봅시다.!!
		//1)아이유  2)유재석  3)BTS
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표 해주세요! 1)아이유 2)유재석 3)BTS");
			if (data.equals("1")) {
				a++;
			}else if (data.equals("2")) {
				b++;
			}else {
				c++;
			}
			System.out.println("아이유를 투표한 사람은 "+ a + "명");
			System.out.println("유재석를 투표한 사람은 "+ b + "명");
			System.out.println("BTS를 투표한 사람은 "+ c + "명");
		}
	}

}
