package 조건문;


import java.io.ObjectInputStream.GetField;
import java.util.Date;

import javax.print.attribute.IntegerSyntax;
import javax.swing.JOptionPane;

public class 순차문조건문확인문제 {

	public static void main(String[] args) {
		//1.
		String date1 = JOptionPane.showInputDialog("암호를 대시오");
		
		
		if (date1.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요");

		}
		//2.
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
		
		//3.
		String x = JOptionPane.showInputDialog("두 정수를 입력 받으세요.");
		String y = JOptionPane.showInputDialog("두 정수를 입력 받으세요.");
		
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		
		if (x1 > y1) {
			System.out.println("첫번째 입력 값이 더 큼!");
		} else if(x1 < y1){
			System.out.println("두번째 입력 값이 더 큼!");
		} else {
			System.out.println("두 수는 값이 같습니다.");
		}
		
		//4.
		String no = "A100EX";
		char no1 = no.charAt(0);
		if (no1 == 'A') {
			System.out.println("기획부");
		} else if (no1 == 'B'){
			System.out.println("총무부");
		} else if(no1 == 'C'){
			System.out.println("개발부");
		} else {
			System.out.println("해당부서 없음.");
		}
		
	}

}
