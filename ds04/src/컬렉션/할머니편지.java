package 컬렉션;

public class 할머니편지 {

	public static void main(String[] args) {
		String letter = "할머니 사랑해요!!!";
		Solution0 sol = new Solution0();
		int answer = sol.solution(letter); //1
		System.out.println(answer);
	}
}

class Solution0 {
    public int solution(String letter) {
    	int answer = letter.length()*2;
    	
        return answer;
    }
}