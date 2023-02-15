package 생성자맛보기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문정보시스템 {
	static int count; //0으로 초기화, 전역변수!
	final static int PRICE = 5000; //final은 변경불가, 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame f = new JFrame("음식주문시스템");
		f.setSize(500, 677);
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("짬뽕");
		b1.setBorderPainted(false);
		JButton b2 = new JButton("우동");
		b2.setBorderPainted(false);
		JButton b3 = new JButton("짜장");
		b3.setBorderPainted(false);
		Font font = new Font("고딕", Font.BOLD, 20);
		b1.setFont(font);
		b1.setBackground(Color.pink);
		b2.setFont(font);
		b2.setBackground(Color.yellow);
		b3.setFont(font);
		b3.setBackground(Color.cyan);
		
		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("집.png");
		imgLabel.setIcon(icon);
		
		
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("짬뽕.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("우동.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("짜장.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
