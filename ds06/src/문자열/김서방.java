package 문자열;

public class 김서방 {

	public static void main(String[] args) {
		String[] s = {"jane", "Kim"};
		String answer = "";
		int findIndex = 0;
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("Kim")) {
				findIndex = i;
			}
		}
		answer = "김서방은" + findIndex + " 에 있다.";
		System.out.println(answer);
		
	}

}
