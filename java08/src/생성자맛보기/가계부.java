package 생성자맛보기;

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

public class 가계부 {
	static int count = 0;
	static int count1 = 0;
	static int count2 = 0;
	static int count3 = 0;
	static int[] Money= {50000, 32000, 25000};
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("월 지출 내역서");
		f.setSize(500, 600);
		f.getContentPane().setBackground(Color.gray);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		Font font = new Font("함초롱바탕", Font.BOLD, 20);
		
		JLabel textlabel = new JLabel();
		textlabel.setFont(font);
		textlabel.setForeground(Color.BLUE);
		
		JLabel label2 = new JLabel();
		ImageIcon icon = new ImageIcon("돈.jpg");
		label2.setIcon(icon);

		JLabel label1 = new JLabel("총 지출금액");
		label1.setFont(font);
		label1.setForeground(Color.BLUE);
		
		JButton b1 = new JButton("적금");
		b1.setBackground(Color.cyan);
		b1.setForeground(Color.black);
		b1.setBorderPainted(false);
		b1.setFont(font);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("지폐.jpg");
				label2.setIcon(icon);
				count++;
				textlabel.setText(count + "번");
				count1++;
				f.setTitle("적금: " + count1 + "번, 통신비: " + count2 + "번, 교통비" + count3 + "번");
				int total = (count1 * Money[0]) + (count2 * Money[1]) + (count3 * Money[2]);
				label1.setText("총 지출금액은 " + total + "원 입니다.");
			}
		});
		
		
		
		JButton b2 = new JButton("통신비");
		b2.setBackground(Color.pink);
		b2.setForeground(Color.black);
		b2.setBorderPainted(false);
		b2.setFont(font);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("돈다발.jpg");
				label2.setIcon(icon);
				count++;
				textlabel.setText(count + "번");
				count2++;
				f.setTitle("적금: " + count1 + "번, 통신비: " + count2 + "번, 교통비" + count3 + "번");
				int total = (count1 * Money[0]) + (count2 * Money[1]) + (count3 * Money[2]);
				label1.setText("총 지출금액은 " + total + "원 입니다.");
			}
		});
		
		JButton b3 = new JButton("교통비");
		b3.setBackground(Color.yellow);
		b3.setForeground(Color.black);
		b3.setBorderPainted(false);
		b3.setFont(font);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("달러.jpg");
				label2.setIcon(icon);
				count++;
				textlabel.setText(count + "번");
				count3++;
				f.setTitle("적금: " + count1 + "번, 통신비: " + count2 + "번, 교통비" + count3 + "번");
				int total = (count1 * Money[0]) + (count2 * Money[1]) + (count3 * Money[2]);
				label1.setText("총 지출금액은 " + total + "원 입니다.");
			}
		});
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textlabel);
		f.add(label2);
		f.add(label1);
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
