package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
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

public class 중식 {

	public void open() {
		//jframe화면이 보이게 하자.!!기능을 정의하도록 함.
		//System.out.println("화면이 open 될거에요..");
		JFrame f = new JFrame("양식 메뉴 추천");
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.orange);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1 , 30);
		
		JLabel l = new JLabel("오늘의 날짜 : ");
		JLabel l1 = new JLabel("오늘의 제목 : ");
		JLabel l2 = new JLabel("오늘의 내용 : ");
		l.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		
		
		
		
		JButton btn = new JButton("파일에 일기 저장");
		btn.setFont(font);
		
		
		
		
		
		
		f.add(l); 
		f.add(l1); 
		f.add(l2); 
		f.add(btn);
		
		f.setVisible(true);
	}
	
	
	
	
	
	
}



