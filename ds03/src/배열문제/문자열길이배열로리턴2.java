package 배열문제;

import java.util.Arrays;

public class 문자열길이배열로리턴2 {

	public static void main(String[] args) {
		String[] strlist = {"I" , "Love", "Programmers."};
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(strlist); //1
		System.out.println(Arrays.toString(answer));
	}
}

class Solution3 {
    public int[] solution(String[] strlist) {
    	//{"I" , "Love", "Programmers."}
    	//반복문 돌면서, 하나씩 꺼내온다.
    	//꺼낸 데이터의 글자수를 구해서
    	//int[]배열에 넣는다
    	int[] answer = new int[strlist.length];
    	for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
        return answer;
    }
}