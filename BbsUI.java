package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(430, 700);
		
		JLabel l1 = new JLabel("<<<나의 게시판>>>");
		JLabel l6 = new JLabel("---------------");
		JLabel l2 = new JLabel("게시판 id");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 작성자");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시물 작성 완료");
		JButton b2 = new JButton("게시물 삭제 완료");
		JButton b3 = new JButton("게시물 검색 완료");
		
		//f에 위에 있는 요소들을 add로 붙여주어야하는데,
		//붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		//물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();
		
		//폰트를 설정하기 위해 font부품 필요
		Font font = new Font("궁서", Font.BOLD, 35);
		/////////필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝/////////
		///조립을 시작해보자.///
		f.setLayout(flow);
		
		
		
		
		f.add(l1);
		f.add(l6);
		
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1); f.add(b2);
		f.add(b3); 
		
		l1.setFont(font);
		l6.setFont(font);
		l2.setFont(font);
		t1.setFont(font);
		l3.setFont(font);
		t2.setFont(font);
		l4.setFont(font);
		t3.setFont(font);
		l5.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		t1.setBackground(Color.white);
		t1.setForeground(Color.black);
		t2.setBackground(Color.white);
		t2.setForeground(Color.black);
		t3.setBackground(Color.white);
		t3.setForeground(Color.black);
		t4.setBackground(Color.white);
		t4.setForeground(Color.black);
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.black);
		b2.setBackground(Color.cyan);
		b2.setForeground(Color.black);
		b3.setBackground(Color.gray);
		b3.setForeground(Color.black);
		
		f.getContentPane().setBackground(Color.green);
		
		
		
		
		
		
		
		f.setLayout(flow);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);

	}

}
