package 문자열;

import java.util.Arrays;

public class 스트링을배열로3 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		System.out.println(all);
		
		//1.String[]로 바꾸어보세요.
		String[] all2 = all.split(",");
		System.out.println(all2.length);
		System.out.println(all2[1]);
		
		//2.바꾸었더니 공백이 포함되어 있다면, 공백을 모두 제거 후, 다시
		//  배열에 넣으세요.
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].contains(" ")) {
				all2[i] = all2[i].trim();
			}
		}
		System.out.println(all2[1]);
		//3.과목수는?
		System.out.println("과목수는: " + all2.length);
		//4.컴퓨터의 위치는?
		System.out.println(Arrays.toString(all2));
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].equals("컴퓨터")) {
				System.out.println(i);
			}
		}
		//5.과목명이 3들자 미만인 과목수는?
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println(count);
	}

}
