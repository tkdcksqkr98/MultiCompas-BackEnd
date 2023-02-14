package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {
	public static void main(String[] args) {

		강아지 name = new 강아지();
		강아지 s = new 강아지();
		s.잠을자다();
		s.밥을먹다();
		s.s1 = 25;
		s.s2 = "까미";
		System.out.println("강아지의 나이: " + s.s1);
		System.out.println("강아지의 이름: " + s.s2);
		
		
		
		
		
	}
}
