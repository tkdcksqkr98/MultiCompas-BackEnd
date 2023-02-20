package 형변환;

import java.util.ArrayList;

public class 스키문제 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		System.out.println("스키대회 순위: \n" + 
		"1등: " + list.get(0) + "\n2등: " + list.get(1) + "\n3등: " 
		+ list.get(2) + "\n4등: " + list.get(3));
		list.remove(1);
		System.out.println("2등이 반칙하여 탈락! 스키대회 시상자는!\n" + list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "등: " + list.get(i));
		}
		System.out.println(list.contains("김연아"));
		System.out.println(list.size());
		
		ArrayList list2 = new ArrayList();
		list2.add("이스키");
		list2.add("박스키");
		list2.add("양스키");
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println(list2.isEmpty());
		list2.clear();
		
		System.out.println(list2);
	}

}
