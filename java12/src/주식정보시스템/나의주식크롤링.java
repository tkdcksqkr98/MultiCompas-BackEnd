package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 나의주식크롤링 {
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 주식 크롤링");
		f.setSize(300, 500);
		f.getContentPane().setBackground(Color.black);;
		f.setLayout(new FlowLayout());
		Font font = new Font("궁서", Font.BOLD, 40);
		
		JButton b1 = new JButton("삼성전자");
		JButton b2 = new JButton("카 카 오");
		JButton b3 = new JButton("네 이 버");
		JButton b4 = new JButton("크롤링 시작");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		
		b1.setBackground(Color.pink);
		b2.setBackground(Color.cyan);
		b3.setBackground(Color.yellow);
		b4.setBackground(Color.gray);
		b4.setForeground(Color.white);
		
		//액션기능 
		//1) 액션기능추가, 
		//2) 클릭했을 때 누가 담당할지 부품을 만들어주세요.
		//3) 클릭했을 때 어떻게 처리할 지를 코딩!!
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용 써주세요
				// 삼성전자코드005930
				// 크롤링하는 부품에게 크롤링기능 요청!
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("005930");
			}
		});
b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용 써주세요
				// 삼성전자코드005930
				// 크롤링하는 부품에게 크롤링기능 요청!
				네이버증권크롤링3 c2 = new 네이버증권크롤링3();
				c2.naver("035720");
			}
		});
b3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 처리내용 써주세요
		// 삼성전자코드005930
		// 크롤링하는 부품에게 크롤링기능 요청!
		네이버증권크롤링3 c3 = new 네이버증권크롤링3();
		c3.naver("035420");
	}
});
		
		JLabel label = new JLabel("CODE");
		label.setForeground(Color.white);;
		
		JTextField text = new JTextField(7);
		text.setFont(font);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}
