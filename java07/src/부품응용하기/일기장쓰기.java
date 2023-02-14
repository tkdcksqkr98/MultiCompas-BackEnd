package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	//멤버변수 - 안써도 됨.
	//멤버메서드
	public void open() {
		//jframe화면이 보이게 하자.!!기능을 정의하도록 함.
		//System.out.println("화면이 open 될거에요..");
		JFrame f = new JFrame("내 일기장 로그인");
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1 , 30);
		
		JLabel l = new JLabel("오늘의 날짜 : ");
		JLabel l1 = new JLabel("오늘의 제목 : ");
		JLabel l2 = new JLabel("오늘의 내용 : ");
		l.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		
		JTextField lText = new JTextField(10);
		JTextField l1Text = new JTextField(10);
		lText.setHorizontalAlignment(JTextField.CENTER);
		l1Text.setHorizontalAlignment(JTextField.CENTER);
		lText.setFont(font);
		l1Text.setFont(font);

		JTextArea l2Text = new JTextArea(5, 10);
		l2Text.setFont(font);
		
		JButton btn = new JButton("파일에 일기 저장");
		btn.setFont(font);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String ll = lText.getText();
				String l11 = l1Text.getText();
				String l22 = l2Text.getText();
				System.out.println(ll + " " + l11 + " " + l22);
				//파일도 만들어주고, 자바프로그램과 file간의 연결통로(강물, stream)을
				//만들어준다.
				//외부에 있는 파일, 네트워크나 cpu등을 자바에서 연결할 때는
				//아주 위험한 상황이라고 인식한다.
				//이렇게 위험한 상황에서 만약 문제가 발생하면 어떻게 처리할지를
				//꼭 써주어야 한다.
				try {
					FileWriter file = new FileWriter(ll + ".txt");
					file.write(ll + "\n");
					file.write(l11 + "\n");
					file.write(l22 + "\n");
					file.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("파일로 저장하는 중 문제가 생김.!");
				}
				
			}
		});
		
		
		
		
		f.add(l); 
		f.add(lText); 
		f.add(l1); 
		f.add(l1Text); 
		f.add(l2); 
		f.add(l2Text); 
		f.add(btn);
		
		f.setVisible(true);
	}
	
	
	
	
	
	
}
