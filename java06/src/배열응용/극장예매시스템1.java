package 배열응용;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame("극장예매시스템");
		f.setSize(400, 350);
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout(); //앞에서부터 차례대로 붙임
		f.setLayout(flow);
		
		JButton[] btn = new JButton[10];
		Font font = new Font("궁서", Font.BOLD, 50);
		JLabel l = new JLabel("결과 보이는 곳");
		l.setForeground(Color.red);
		l.setFont(font);
		
		//예약 여부를 저장하는 배열을 만들어줍시다.!!
		int[] seat = new int[10]; //{0,0,0,0,0,0,0}
		//각 자리에 저장된 값이 0이면 아직 예약안되었음. 예약되면 1로 바꿈!
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
					//e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					if (seat[no] == 1) {
						l.setText("예약불가");
						l.setForeground(Color.blue);
					} else { //아직 예약이 안되어서  0이 들어있음. 예약 가능
						
						seat[no] = 1;
						l.setText(text + "번 예약완료.");
						l.setForeground(Color.red);
					}
				}
			});
		}
	
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.pink);
		total.setFont(font);
		f.add(l);
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열안에 저장된 수 몇개가 1인지 체크해서 카운트
				// 영화예매비 1장당 1만원, 결제금액 출력
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count ++;
					}
				}
				JOptionPane.showMessageDialog(f,  (count * 10000) +"원 결제하시면 됩니다.");
			}
		});
		f.setVisible(true);
	}

}
