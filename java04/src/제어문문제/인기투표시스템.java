package 제어문문제;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 인기투표시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iu = 0 , bts = 0 , c = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("인기투표 시스템\n==========");
		while (true) {
			System.out.print("(1.iu 2.bts 3.c 4.종료)");
			int choice = sc.nextInt();
			{
				if (choice == 4) {
					System.out.println("시스템을 종료합니다.");
					break;
				} else if (choice == 1) {
					iu++;
				} else if (choice == 2) {
					bts++;
				} else if (choice == 3) {
					c++;
				} else {
					System.out.println("해당 번호가 없습니다.");
				}

			} 
		}
	sc.close();
	
	System.out.println("1)아이유 :" + iu + "표, 2)방탄 :" + bts + "표, 3)뉴진스 :" + c );
	}
	
}
