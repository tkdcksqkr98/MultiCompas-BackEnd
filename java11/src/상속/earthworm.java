package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class earthworm extends JFrame {

	public static void main(String[] args) {
		earthworm f = new earthworm();

	}

	public earthworm() {
		setTitle("지렁이들의 경주");
		setSize(700, 700);
		MyThread car1 = new MyThread("지렁이1.png", 100, 0);
		MyThread car2 = new MyThread("지렁이2.jpg", 100, 200);
		MyThread car3 = new MyThread("지렁이3.jpg", 100, 500);

		car1.start();
		car2.start();
		car3.start();

		setVisible(true);

	}

	public class MyThread extends Thread {
		int x, y;
		JLabel label; // 전역변수로 선언!

		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 150, 150);
			add(label);
			// jframe에 붙은 위치 지정
		}

		@Override
		public void run() {
			// 동시에 실행하고 싶은 내용!!
			// 모든 스레드가 오른쪽으로 움직이고 싶음.
			// 화면에서 오른쪽으로 움직이는 것은 x를 늘려주는 것.!
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50); // 0~49
				x = x + move; // 100+45
				System.out.println(x);
				label.setBounds(x, y, 200, 100);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
