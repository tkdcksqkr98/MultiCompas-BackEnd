package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class 반복자2 {

	public static void main(String[] args) {
		HashSet<Integer> money = new HashSet<>();
		money.add(1000);
		money.add(2000);
		money.add(3000);
		money.add(2000);
		money.add(4000);
		money.add(2000);
		money.add(3000);
		System.out.println(money);
		//일주일간 받았던 용돈
		//1000, 2000, 3000, 2000, 4000, 2000, 3000
		
		//일주일간 받았던 용돈 중에서 
		//얼마씩 받았는지 전체 프린트
		//1000, 2000, 3000, 4000
		Iterator<Integer> it = money.iterator();
		for (int i = 0; i < money.size(); i++) {
			System.out.println(it.next());
		}
		System.out.println("--------");
		Object[] list = money.toArray();
		for (Object x : list) {
			System.out.println(x);
		}
	}

}
