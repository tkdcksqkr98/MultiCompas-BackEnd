package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.setLayout(null);
		
		JButton[] buttons = new JButton[500];
		Random r = new Random();
		Color[] colors = {Color.red, Color.blue, Color.white
				, Color.gray, Color.green, Color.orange};
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i);
			int x =r.nextInt(800);
			int y =r.nextInt(700);
			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBackground(colors[r.nextInt(colors.length)]);
			f.add(buttons[i]);
		}
		
		f.getContentPane().setBackground(Color.yellow);

		f.setVisible(true);
	}

}
