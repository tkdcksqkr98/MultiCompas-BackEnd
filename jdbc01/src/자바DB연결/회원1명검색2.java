package 자바DB연결;

import java.util.Scanner;

import javax.swing.JOptionPane;

import 화면DB연결.BbsVO;
import 화면DB연결.MemberVO;

public class 회원1명검색2 {

	public static void main(String[] args) {
		
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할no 를 입력하세요");
		
		int no2 = sc.nextInt();
		
		
		BbsDAO dao = new BbsDAO();
		BbsVO bag = dao.one(no2);
		String total = bag.getNo() + ", " +
			           bag.getTitle() + ", " +
			           bag.getContent() + ", " +
			           bag.getWriter();
		JOptionPane.showMessageDialog(null, total);
	}

}
