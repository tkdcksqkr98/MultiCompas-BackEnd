package 자바DB연결;

import java.util.Scanner;

public class 회원정보수정2 {

	public static void main(String[] args) {
		
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("title/no순으로 입력하세요.");
		String title = sc.next();
		int no = sc.nextInt();
		
		BbsDAO dao = new BbsDAO();
		dao.update(title, no); 
		

	}

}
