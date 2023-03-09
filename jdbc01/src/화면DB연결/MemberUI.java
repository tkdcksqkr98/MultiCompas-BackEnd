package 화면DB연결;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.MemberDAO;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("음식 추천 선택창");
		f.setSize(600, 750);

		JLabel l1 = new JLabel("<<<추천 음식 >>>");
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();

		JButton b1 = new JButton("양식 메뉴로 이동");
		JButton b2 = new JButton("일식 메뉴로 이동");
		JButton b3 = new JButton("중식 메뉴로 이동");
		ImageIcon icon = new ImageIcon("양식.png");
		ImageIcon icon2 = new ImageIcon("일식.png");
		ImageIcon icon3 = new ImageIcon("중식.png");
		l2.setIcon(icon);
		l3.setIcon(icon2);
		l4.setIcon(icon3);
		// 가입기능
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("양식 메뉴");
				String name = b1.getText();
					JOptionPane.showMessageDialog(f, "양식 메뉴로 이동합니다");
					양식 food = new 양식();
					food.open();
					f.setVisible(false);
				

			}
		});

		// 탈퇴기능
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = b2.getText();
				JOptionPane.showMessageDialog(f, "일식 메뉴로 이동합니다");
				일식 food = new 일식();
				food.open();
				f.setVisible(false);
			}
		});

		// 수정기능
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = b3.getText();
				JOptionPane.showMessageDialog(f, "중식 메뉴로 이동합니다");
				중식 food = new 중식();
				food.open();
				f.setVisible(false);
			}
		});
		// f에 위에 있는 요소들을 add로 붙여주어야하는데,
		// 붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		// 물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font부품 필요
		Font font = new Font("궁서", Font.BOLD, 35);
		///////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝/////////
		/// 조립을 시작해보자.///
		f.setLayout(flow);

		f.add(l1);
		f.add(l2);
		f.add(b1);
		f.add(l3);
		f.add(b2);
		f.add(l4);
		f.add(b3);

		l1.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);


		b1.setBackground(Color.pink);
		b1.setForeground(Color.black);
		b2.setBackground(Color.pink);
		b2.setForeground(Color.black);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.black);

		f.getContentPane().setBackground(Color.ORANGE);

		f.setLayout(flow);

		f.setVisible(true);

	}

}
