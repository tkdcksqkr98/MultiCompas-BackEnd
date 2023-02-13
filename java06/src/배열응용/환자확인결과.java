package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 환자확인결과 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("코로나 검사확인 시스템");
		f.setSize(500, 500);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton[] b = new JButton[20];
		Font font = new Font("함초롱바탕", 1, 20);
		JLabel l = new JLabel("검사 완료한 사람 수");
		l.setBackground(Color.red);
		l.setFont(font);

		int[] com = new int[20];
		for (int i = 0; i < com.length; i++) {
			b[i] = new JButton(i + "번 환자");
			b[i].setFont(font);
			f.add(b[i]);
			b[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					if (com[no] == 1) {
						l.setText("검사 완료자 입니다.");
						l.setBackground(Color.pink);
					} else {
						com[no] = 1;
						l.setText(text + " 검사 미완료자 입니다.");
						l.setBackground(Color.red);
						l.setEnabled(false);
						l.setForeground(Color.red);
					}
				}
			});

		}
		JButton total = new JButton("전체 검사자 수");
		total.setBackground(Color.blue);
		total.setForeground(Color.black);
		total.setFont(font);
		f.add(l);
		f.add(total);
		
		f.add(l);
		f.setVisible(true);

	}
}

