package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000); //Object <-업캐스팅- Integer <-오토박싱- int
		me.add(189.1); //Object <- Double <- double
		me.add(false); //Object <- Boolean <- boolean
		me.add('남'); //Object <- Character <- char
		
		System.out.println(me);
		int money = (Integer)me.get(0)+ 1000;
		System.out.println(money);
		//int <-오토언박싱- Integer <-다운캐스팅- Object
		
		double key = (Double)me.get(1)+ 10;
		System.out.println(key);
		//double <- Double <- Object
		
		boolean food = (boolean)me.get(2);
		if (food) {
			System.out.println("배고파요");
		}
		else {
			System.out.println("배불러요");
		}
		//boolean <- Boolean <- Object
		
		char gender = (char)me.get(3);
		if (gender == '남') {
			System.out.println("주민번호는 1, 3예요");
		} else {
			System.out.println("주민번호는 2, 4예요 ");
		}
		//char <- Character <- Object
	
	}
	
}
