package 반복문;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			//i = 0, i<3(true), 처리, i++
			System.out.println(i + "내가 반복1");
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("내가 반복2 >>" + i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("내가 반복3>>" + (i +1 ) + "번째 실행중");
	}
	}
}
