package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringBuliderTest3 {

	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpong";
		System.out.println(s == s2); 
		
		s2 = "hahaha";
		System.out.println(s == s2);

		StringBuilder sb = new StringBuilder("honghong");
		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb == sb2);
		sb.append("hahaha");
		System.out.println(sb);
		sb2.replace(0, 8, "hahaha");
		System.out.println(sb2);
		sb.delete(0, 4);
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//앞뒤로 바꿀 때 편하다.
		
		StringBuilder sb3 = new StringBuilder(s);
		sb3.reverse();
		System.out.println(sb3);
		
		//정렬된 데이터를 역정렬로 만들기도 편하다.
		String[] s4 = s.split("");
		List<String> list = Arrays.asList(s4);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
