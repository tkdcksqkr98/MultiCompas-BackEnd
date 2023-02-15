package 매서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {
	
	static int index = 2; //현재 2부터 시작
	
	public static void main(String[] args) {
		String[] title = { "김씨표류기", "라라랜드", "백두산", "어벤져스", "조커"};
		String[] img = { "001.jpg", "002.jpg", "003.jpg", "004.jpg", "005.jpg"};
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85};
		
		JFrame f = new JFrame("나만의 영화앨범");
		f.setSize(516, 530);
		f.setBackground(Color.green);
		f.getContentPane().setBackground(Color.green);
		
		Font font = new Font("궁서", Font.BOLD, 40); //객체생성을 하는데, 특정한 입력값을 넣지 않으면 못만듬
		Font font2 = new Font("궁서", Font.BOLD, 30); //객체생성을 하는데, 특정한 입력값을 넣지 않으면 못만듬
		
		//배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
		//Borderlayout
		JLabel top = new JLabel(title[2]);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.red);
		f.add(top, BorderLayout.NORTH);
		
		
		
		JLabel center = new JLabel();
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);
		
		
		//String.valueOf() : int, double, ...=> String으로 변환
		//Integer.parse() : double, String, ...=> int로 변환
		//Double.parse() : int, String, ...=>double로 변환
		JLabel under = new JLabel(String.valueOf(jumsu[2]) + "");
		under.setHorizontalAlignment(0);
		under.setFont(font);
		under.setForeground(Color.blue);
		f.add(under, BorderLayout.SOUTH);
		
		JButton left = new JButton("<<");
		left.setFont(font2);
		left.setBackground(Color.cyan);
		f.add(left, BorderLayout.WEST);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					
				top.setText(title[index - 1]);
				ImageIcon icon = new ImageIcon(img[index - 1]);
				center.setIcon(icon);
				under.setText(jumsu[index - 1] + "");
				index--;
				}else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
				}
				
			}
		});
		//1)액션처리 하는 방법 
		//2)액션기능을 add 
		//3)클릭액션이 있을 때 처리할 부품을 만들어주세요.
		//4)클릭액션이 있을 때 어떻게 처리할지 내용을 코딩해주세요.
		JButton right = new JButton(">>");
		right.setFont(font2);
		right.setBackground(Color.cyan);
		f.add(right, BorderLayout.EAST);
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++;
					
				} else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
				}
			}
		});
		
		
		//프로그램이 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}
