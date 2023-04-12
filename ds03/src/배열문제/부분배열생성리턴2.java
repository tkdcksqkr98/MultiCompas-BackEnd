package 배열문제;

import java.util.Arrays;

public class 부분배열생성리턴2 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] end = Arrays.copyOfRange(array, 1, 4);
		System.out.println(Arrays.toString(end));
	}
}