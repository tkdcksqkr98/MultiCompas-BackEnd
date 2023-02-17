package 상속응용;

import java.util.Date;

public class 타이머스레드 extends Thread {
	
	public void run() {
		for (int i = 1000; i > 0; i--) {
			Date date = new Date();
			System.out.println("시간>> " + date);
		try {
			Thread.sleep(2000);
		} catch ( Exception e) {
			// TODO: handle exception
			System.out.println("cpu 연결 문제 생김.");
		}	
		}
	}
}
