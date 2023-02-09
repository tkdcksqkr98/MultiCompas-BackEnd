package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] x = new int[10]; //length: 10
//		//index는 0부터 시작, 마지막 위치의 인덱스는 10보다 작음.
//		//0~9
//		
//		x[0] = 10;
//		x[1] = 20;
//		for (int i = 0; i < 10; i++) {
//			System.out.print(x[i] + " ");
//		}
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		//우리가족의 성별을 char[]로 저장, 프린트
		//우리가족의 이름을 string[]로 저장, 프린트
		//우리가족의 시력을 double[]로 저장, 프린트
		//우리자고이 점심을 먹었는지 boolean[]로 저장, 프린트
		char[] g = {'남', '남', '여', '남'};
		for (int i = 0; i < g.length; i++) {
			System.out.println(g[i]);
		}
		
		String[] name = {"가나", "다라", "마바", "사아"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		double[] eye = {1.0, 0.5, 0.9, 1.2};
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		System.out.println();
		
		boolean[] food = {true, true, true, true}; 
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		
		String[] s = new String[4];
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	
	}

}
