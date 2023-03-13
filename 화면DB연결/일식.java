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
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import 자바DB연결.MemberDAO;

public class 일식 {

	public void open() {
		// jframe화면이 보이게 하자.!!기능을 정의하도록 함.
		// System.out.println("화면이 open 될거에요..");
		JFrame f = new JFrame("일식 메뉴 추천");
		f.setSize(350, 200);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", Font.BOLD, 30);

		JLabel l1 = new JLabel("메뉴를 선택해주세요!");
		l1.setFont(font);

		JButton b1 = new JButton("스시");
		JButton b2 = new JButton("우동");
		JButton b3 = new JButton("라멘");
		JButton b4 = new JButton("돈까스");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				MemberVO2 bag = dao.one(5);
				JOptionPane.showMessageDialog(f, bag.getStore() + "으로 가주세요!");
				
				}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				MemberVO2 bag = dao.one(6);
				JOptionPane.showMessageDialog(f, bag.getStore() + "으로 가주세요!");
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				MemberVO2 bag = dao.one(6);
				JOptionPane.showMessageDialog(f, bag.getStore() + "으로 가주세요!");
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				MemberVO2 bag = dao.one(6);
				JOptionPane.showMessageDialog(f, bag.getStore() + "으로 가주세요!");
				
			}
		});
		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		f.setVisible(true);
	}

}



