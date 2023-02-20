package 형변환;

import java.util.ArrayList;
import java.util.HashMap;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		//1.
		ArrayList list = new ArrayList();
		list.add("속초");
		list.add("다낭");
		list.add("코타키나 발루");
		list.add("일본");
		list.add("방콕");
		System.out.println(list);
		
		//2.
		HashMap map = new HashMap();
		map.put("안방", "TV");
		map.put("거실", "쇼파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
		//1)
		System.out.println(map);
		//2)
		System.out.println(map.get("현관")); //get(키)
		System.out.println(map);
		//3)
		map.replace("거실", "책상");
		System.out.println(map);
		
		//3.
		ArrayList list2 = new ArrayList();
		list2.add("눕기");
		list2.add("먹기");
		list2.add("자바");
		list2.add("씻기");
		list2.add("자기");
		//1)
		System.out.println(list2);
		//2)
		System.out.println(list2.get(0));
		System.out.println(list2.get(4));
		//3)
		list2.set(1, "청소");
		System.out.println(list2);
	}
	

}
