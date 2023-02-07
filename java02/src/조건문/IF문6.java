package 조건문;


import java.io.ObjectInputStream.GetField;
import java.util.Date;

import javax.swing.JOptionPane;

public class IF문6 {

	public static void main(String[] args) {
		Date date = new Date();
		
		
		if (date.getYear() >= 2000) {
			System.out.println("밀레니엄 세대시군요!");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요!");
		}
		
		Date day = new Date();
		if (date.getDay() == 0 || date.getDay() == 1) {
			System.out.println("쉬~~~~~~~~자!!");
		} else {
			System.out.println("열~~심히 공부하자!!");
		}
		
		int month = date.getMonth() +1 ;
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
			default:
				System.out.println("31일까지");
				break;
				
		}
		
        String date1 = JOptionPane.showInputDialog("암호를 대시오");
		
		//String은 기본형 데이터가 아니여서 명령어(함수)를 사용해야함.
		if (date1.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요");

		}
		
        String menu1 = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는?");
		
		if (menu1.equals("자장면")) {
			System.out.println("중국집으로 가요!!");
		} else if(menu1.equals("라면")){
			System.out.println("분식집으로 가요");
		} else if(menu1.equals("회")){
			System.out.println("횟으로 가요");
		} else {
			System.out.println("그냥 안먹어요");
		}
	}

}
