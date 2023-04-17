package 문자열;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.sound.sampled.ReverbType;

public class 문자열내림차순배치2 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		
		//1-1. 내림차순으로 정렬을 한 후, 
		//문자들을 하나씩 떨어뜨려야 한다. ==>ArrayList, 배열
		char[] c = s.toCharArray();
		Arrays.sort(c);//오름차순 정렬
		
		String s2 = new String(c);
		System.out.println(s2);
		//1-2. for문을 이용해서 뒤에서 부터 charAt()으로 하나씩 꺼내온다.
		//2. answer에 붙인다.
		StringBuilder sb1 = new StringBuilder(s);
		sb1.reverse().toString();
		System.out.println(sb1);
		
		for (int i = 0; i < sb1.length(); i++) {
		}
	
		
		
	}

}
