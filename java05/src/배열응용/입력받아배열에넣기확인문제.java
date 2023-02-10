package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] data = new String[3];
		String[] data2 = new String[3];
		// 작년에 가고 싶었던 곳 세곳을 입력받아 넣으세요.
		// 제주도, 양양, 속초
		for (int i = 0; i < data.length; i++) {
			System.out.print("작년 여행지 입력>> ");
			data[i] = sc.next();
		}
		System.out.println();
		for (int i = 0; i < data2.length; i++) {
			System.out.print("올해 여행지 입력>> ");
			data2[i] = sc.next();
		}
		int count = 0;
		// 올해에 가고 싶었던 곳 세곳을 입력받아 넣으세요.
		// 제주도, 부산, 울산
		for (int i = 0; i < data2.length; i++) {
			if (data[i].equals(data2[i])) {
				count++;
			}
		}
		System.out.println("작년과 올해 가고 싶은곳과 우선순위가 동일한 곳은 " + count + "곳 입니다");
		//위 입력은 우선순위에 따라 입력한 것임
		//작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 몇 곳인가?
		// =>> 같은 위치에 있는 장소 끼리만 비교해주세요.
	}

}
