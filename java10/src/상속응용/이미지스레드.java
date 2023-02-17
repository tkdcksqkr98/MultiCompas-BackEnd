package 상속응용;

public class 이미지스레드 extends Thread {
	
	public void run() {
		String[] images = {"계산기.jpg", "딴딴따단.jpg","뉴진스.PNG","아이유.PNG","로그인.PNG",
				"계산기.jpg", "딴딴따단.jpg","뉴진스.PNG","아이유.PNG","로그인.PNG",
				"계산기.jpg", "딴딴따단.jpg","뉴진스.PNG","아이유.PNG","로그인.PNG",
				"계산기.jpg", "딴딴따단.jpg","뉴진스.PNG","아이유.PNG","로그인.PNG",
				"계산기.jpg", "딴딴따단.jpg","뉴진스.PNG","아이유.PNG","로그인.PNG",
				"계산기.jpg", "딴딴따단.jpg","뉴진스.PNG","아이유.PNG","로그인.PNG",
				"계산기.jpg", "딴딴따단.jpg","뉴진스.PNG","아이유.PNG","로그인.PNG",
				"계산기.jpg", "딴딴따단.jpg","뉴진스.PNG","아이유.PNG","로그인.PNG"};
		for (int i = 0; i < images.length; i++) {
			System.out.println("이미지>> " + images[i]);
			
		try {
			Thread.sleep(5000);
		} catch ( Exception e) {
			// TODO: handle exception
			System.out.println("cpu 연결 문제 생김.");
		}	
		}
	}
}
