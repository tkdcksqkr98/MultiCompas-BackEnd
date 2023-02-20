package 형변환;

import java.util.LinkedList;

public class 시험일정문제 {

	public static void main(String[] args) {
		//Queue 대기줄, 먼저 들어온 요소(element)가 먼저 나감
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println(test);
		
		test.remove();
		System.out.println(test);
		test.remove();
		System.out.println(test);
		test.remove();
		System.out.println(test);
	}

}
