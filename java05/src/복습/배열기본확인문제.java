package 복습;

public class 배열기본확인문제 {

	public static void main(String[] args) {
		String[] t = {"코타키나 발루", "속초", "동남아시아", "을왕리"};
		for (String x : t) {
			System.out.print(x + " ");
		}
		System.out.println();
		char[] c = {'r', 'g', 'b', 'p'};
		for (char y : c) {
			System.out.print(y + " ");
		}
		System.out.println();
		double[] k = {158.1, 180.6, 179.5, 165.2};
		for (double d : k) {
			System.out.print(d + " ");
		}
	}

}
