package 컬렉션;

import java.util.Arrays;
import java.util.List;

public class 자릿수더하기 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		Solution6 sol = new Solution6();
		int answer = sol.solution(s1,s2);
		System.out.println(answer);
	}
}

class Solution6 {
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		List<String> list2 = Arrays.asList(s2);
		for (String x : s1) {
			if (list2.contains(x)) {
				answer ++;
			}
		}

		return answer;
	}
}