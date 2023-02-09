package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1.자주써서 RAM에 언제든 사용할 수 있도록 준비되어있음.
		//   망치
		//   부품명.기능()
		
		// 2.쓸때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어 RAM에 
		//   저장해두고 사용
		//   벽돌
		//   JFrame f = new JFram()
		JFrame f = new JFrame();
		f.setSize(400, 300);
		
		f.getContentPane().setBackground(Color.pink);
		
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요.");
		
		JTextField t = new JTextField(20); 
		
		JButton b = new JButton();
		
		FlowLayout flow = new FlowLayout();
		
		Font font = new Font("D2Coding",1,20);
		Font font2 = new Font("D2Coding",1,30);
		
		
		
		f.add(l);
		f.add(b);
		f.add(t);
		
		
		l.setFont(font);
		l.setForeground(Color.black);
		
		b.setBackground(Color.black);
		b.setForeground(Color.white);
		b.setFont(font2);
		b.setText("숫자 맞추기 게임");
		f.setLayout(flow);
		
		t.setBackground(Color.cyan);
		t.setForeground(Color.white);
		
		
		// 맨 아래에!!
		f.setVisible(true);
		
		
		
	}

}
