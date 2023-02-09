package 배열;

public class 배열개념2 {

	public static void main(String[] args) {
		// 여러개의 데이터를 램에 저장해두고 cpu가 접근하여 사용하고
		// 싶은 경우 사용하는 부품
		//1. 값을 이미 알고 있는 경우
		int[] week = {1, 2, 3, 4, 5, 6, 7}; //length만들어서 몇개인지 세서 값을 넣어줌
		System.out.println(week[0]);
		System.out.println(week[1]);
		System.out.println("전체 개수 :" + week.length);
		System.out.println(week[2]=10);
		System.out.println(week[4]=12);
		
		
		
		int[] tour = new int[3];
		tour[0] = 20;
		tour[2] = 30;
		System.out.println(tour[0]);
		System.out.println(tour[2]);
		System.out.println("tour 변수의 개수 :" + tour.length);
	}

}
