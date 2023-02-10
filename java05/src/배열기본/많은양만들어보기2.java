package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] jumsu2 = new int[1000];
		
		Random r = new Random(42);
		// 2부터 20까지 임의로 만들어서
		// 배열에 넣어보세요
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2;
			for (int x : jumsu2) {
				System.out.println(x);
				// 전체 프린트
			}
		}

		
		//3이상인 숫자 몇 개인지 프린트!
		//배열은 전체를 가지고 와서, 3이상인 체크 후
		//갯수를 세주세요.
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu2[i] >= 15) {
				count++;
				sum = sum + jumsu2[i];
			}
		}
		System.out.println("15이상 갯수: " + count);
		System.out.println("15이상 총합: " + sum);
	}

}
