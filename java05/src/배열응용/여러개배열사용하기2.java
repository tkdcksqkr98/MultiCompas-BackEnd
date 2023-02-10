package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 2학기 성적이 오른 학생 몇명?
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count2++;
			}
		}
		System.out.println("2학기 성적이 오른 학생은 " + count2 + "명");
		// 2. 1학기, 2학기 성적이 동일한 학생 몇명?
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count3++;
			}
		}
		System.out.println("1학기, 2학기성적이 동일한 학생은 " + count3 + "명");
		// 3. 2학기 학생 중 만점(100) 인 학생의 이름과 번호는?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 학생 중 만점인 학생의 이름는" + names[i] + "이며 번호는 " + i + "입니다");

			}
		}
		// 4. 1학기 성적의 평균과 2학기 성적이 평균 중 누가 더 높았나요??
		int sum = 0;
		for (int x : term1) {
			sum = sum + x;
		}
		for (int x : term2) {
			sum = sum + x;
		}
		double avg = (double) sum / term1.length;
		double avg2 = (double) sum / term2.length;
		if (avg > avg2) {
			System.out.println("1학기 성적의 평균이 더 높습니다");

		} else if(avg < avg2){
			System.out.println("2학기 성적의 평균이 더 높습니다");

		}else {
			System.out.println("1학기 성적의 평균과 2학기 성적의 평균이 같습니다.");
			
		}
		// 5. 심화) 뉴진스의 1학기 성적, 2학기 성적은?
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 위치는은" + i);		
				System.out.println("뉴진스의 1학기 성적은" + term1[i] + " 뉴진스의 2학기 성적은" + term2[i]);		
			}
		}
		
		
	
	
	
	}
		
	}


