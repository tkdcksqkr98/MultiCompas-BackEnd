package 프로그래머스기본;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		int n = 3; //양꼬치 주문수
		Solution2 sol = new Solution2();
		int answer = sol.solution(n); //1
		System.out.println(answer);
	}
}

class Solution2 {
    public int solution(int n) {
    	int answer = 0;
    	if (answer <= 7) {
			answer = 1;
		} else if(answer % 7 == 0){
			answer = answer / 7;
		}else {
			answer = answer / 7 + 1;
		}
        return answer;
    }
}