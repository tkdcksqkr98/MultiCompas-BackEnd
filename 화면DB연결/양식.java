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

public class 양식 {

	public void open() {
		// jframe화면이 보이게 하자.!!기능을 정의하도록 함.
		// System.out.println("화면이 open 될거에요..");
		JFrame f = new JFrame("양식 메뉴 추천");
		f.setSize(650, 300);
		f.getContentPane().setBackground(Color.orange);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("삼립호빵", 1, 30);

		JLabel l1 = new JLabel("원하시는 가게 브랜드명을 입력해주세요!");
		JLabel l2 = new JLabel("가게 이름");
		JTextField t1 = new JTextField(10);

		l1.setFont(font);
		l2.setFont(font);
		t1.setFont(font);

		JButton b1 = new JButton("검색 결과 확인");
		b1.setFont(font);
		b1.setBackground(Color.pink);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("양식 메뉴");
				String name1 = t1.getText();
				MemberDAO dao = new MemberDAO();
				MemberVO2 bag = dao.one(name1);
				JOptionPane.showMessageDialog(f, bag.getName());
			}
		});
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(b1);

		f.setVisible(true);
	}

}



