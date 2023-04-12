package 프로그래머스기본;

public class 양꼬치 {

	public static void main(String[] args) {
		int n = 10; //양꼬치 주문수
		int k = 3; //음료수 주문수
		Solution1 sol = new Solution1();
		int answer = sol.solution(n,k); //1
		System.out.println(answer);
	}
}

class Solution1 {
    public int solution(int n, int k) {
        int free = n /10;
    	int answer = n * 12000 + k * 2000 - free * 2000;
        return answer;
    }
}