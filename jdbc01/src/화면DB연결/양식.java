package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 양식 {

	public void open() {
		//jframe화면이 보이게 하자.!!기능을 정의하도록 함.
		//System.out.println("화면이 open 될거에요..");
		JFrame f = new JFrame("양식 메뉴 추천");
		f.setSize(600, 750);
		f.getContentPane().setBackground(Color.orange);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1 , 30);
		
		
		JLabel l = new JLabel();
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		ImageIcon icon = new ImageIcon("피자.png");
		ImageIcon icon2 = new ImageIcon("파스타.png");
		ImageIcon icon3 = new ImageIcon("스테이크.png");
		l.setIcon(icon);
		l1.setIcon(icon2);
		l2.setIcon(icon3);

		
		
		
		JButton b1 = new JButton("해당 추천 맛집으로 이동");
		JButton b2 = new JButton("해당 추천 맛집으로 이동");
		JButton b3 = new JButton("해당 추천 맛집으로 이동");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		
		
		
		
		
		f.add(l); 
		f.add(b1);
		f.add(l1); 
		f.add(b2);
		f.add(l2); 
		f.add(b3);
		
		f.setVisible(true);
	}
	
	
	
	
	
	
}



