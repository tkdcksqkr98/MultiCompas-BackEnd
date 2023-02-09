package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 여러개의 데이터를 램에 저장해두고 cpu가 접근하여 사용하고
		// 싶은 경우 사용하는 부품
		//1. 값을 이미 알고 있는 경우
		int[] juso = {10, 20, 30, 40}; //length만들어서 몇개인지 세서 값을 넣어줌
		System.out.println(juso);
		System.out.println(juso[0]);
		System.out.println(juso[1]);
		System.out.println(juso[2]);
		System.out.println(juso[3]);
		System.out.println("전체 개수: " + juso.length);
	
		
		juso[0] = 100; //첫번째값으로 100을 넣으세요. 10<--100
		System.out.println(juso[0]);
		
		
		//2. 값을 아직 모르고 있는데, 먼저 저장공간 만들어두고
		// 나중에 값을 넣는 경우
		int[] juso2 =new int[4];
		juso2[0] =200;
		System.out.println(juso2[0]);
	}

}
