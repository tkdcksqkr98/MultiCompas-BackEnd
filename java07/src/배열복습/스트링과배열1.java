package 배열복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스트링의 일부를 추출, 확인사용하는 메서드
		String s = "나는 프로그래머야";
		String s2 = "진짜!!";
		System.out.println(s + s2);
		System.out.println(s.concat(s2)); //String
		System.out.println(s.charAt(0));
		char c =s.charAt(0); // 한 문자만 추출
		System.out.println(s.endsWith("야")); //true //false
		boolean result = (s.endsWith("야"));
		String result2 = s.substring(3); //인덱스 3부터 끝까지 추출 => 프로그래머
		String result3 = s.substring(3, 8); //인덱스 3부터 7까지 추출
		boolean resule4 = s.contains(s2); //boolean
		int index = s.lastIndexOf("프"); //8
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length()); //글자갯수
		s = s.replace("나", "너"); //비파괴함수, cpu에서만 변경했음.
		System.out.println(s);
	
	
	
	
	
	
	
	
	}

}
