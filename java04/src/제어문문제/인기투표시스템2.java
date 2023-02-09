package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 인기투표시스템2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 1200);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("고딕", 1, 20);
		Font font2 = new Font("고딕", 1, 30);

		JLabel l1 = new JLabel();
		l1.setText("K-POP 인기투표");
		l1.setFont(font);
		
		JLabel l2 = new JLabel();
		l2.setText("1.아이유 ");
		l1.setFont(font);
		
		JLabel l3 = new JLabel();
		l3.setText("2.미유");
		l1.setFont(font);
		
		JLabel l4 = new JLabel();
		l4.setText("3.뉴진스!");
		l1.setFont(font);
		
		JLabel l5 = new JLabel();
		JLabel l6 = new JLabel();
		JLabel l7 = new JLabel();
		l5.setFont(font2);
		l6.setFont(font2);
		l7.setFont(font2);
		l5.setForeground(Color.red);
		l6.setForeground(Color.red);
		l7.setForeground(Color.red);
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		ImageIcon icon1 = new ImageIcon("아이유.png");
		ImageIcon icon2 = new ImageIcon("딴딴따단.jpg");
		ImageIcon icon3 = new ImageIcon("뉴진스.png");
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		
		f.add(l1);
		f.add(b1);
		f.add(l2);
		f.add(l5);
		
		f.add(b2);
		f.add(l3);
		f.add(l6);
		
		f.add(b3);
		f.add(l4);
		f.add(l7);
		
		b1.addActionListener(new ActionListener() {
			int iu = 0;
			int mew = 0;
			int newjeans = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				iu++;
				l5.setText(iu + "표");;
			}
		});
		b2.addActionListener(new ActionListener() {
			int mew = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mew++;
				l6.setText(mew + "표");;
			}
		});
		b3.addActionListener(new ActionListener() {
			int newjeans = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				newjeans++;
				l7.setText(newjeans + "표");;
			}
		});
		
		
		
		f.setVisible(true);
	
	
	
	
	
	}
	
	
}
