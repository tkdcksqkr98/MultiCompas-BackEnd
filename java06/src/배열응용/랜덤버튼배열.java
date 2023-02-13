package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		// 배열에는 기본형만 들어가는 것이 아니고, 참조형도 가능
		// 정수, 실수, 문자1, 논리 + String,JButton, ...
		// 기본형은 변수에 값이 저장
		// 참조형은 무조건 주소가 저장
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		JButton[] buttons =new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i); 
		}
		
		f.setLayout(null); //위치 자동으로 잡아주는 부품 안씀.
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x =r.nextInt(800);
			int y =r.nextInt(700);
			buttons[i].setBounds(x, y, 100, 50);
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}

}
