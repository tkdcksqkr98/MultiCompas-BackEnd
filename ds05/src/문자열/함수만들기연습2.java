package 문자열;

public class 함수만들기연습2 {

	public static void 세수하기() {
		System.out.println("세수를 한다!");
	}
	public static void 밥먹기(String when) {
		for (int i = 0; i < 20; i++) {
			System.out.println(when + "1. 음식을 준비한다");
			System.out.println(when + "2. 수저를 셋팅한다.");
			System.out.println(when + "3. 음식을 먹는다!.");
		}
	}
	public static void 운동하기(String location) {
		System.out.println("운동을 한다!");
	}
	public static void 잠자기(String when) {
		System.out.println(when + "졸리니까 잔다.");
	}
	
	public static void 화장하기() {
		System.out.println("외출 전 화장하기");
	}
	
	
	public static void main(String[] args) {
		//내가 일어나서 하는 일.
		System.out.println("내가 일어나서 하는 일");
		//1. 세수하기
		세수하기();
		//2. 밥먹기(아침)
		밥먹기("아침");
		//3. 운동하기(운동장)
		운동하기("운동장");
		//4. 잠자기(낮잠)
		잠자기("낮잠");
		//5. 밥먹기(점심)
		밥먹기("점심");
		//6. 세수하기(졸음)
		세수하기();
		//7. 화장기
		화장하기();
		//8. 밥먹기(저녁)
		밥먹기("저녁");
		//9. 운동하기(공원돌기)
		운동하기("공원돌기");
		//10. 잠자기(저녁)
		잠자기("밤잠 자기 ");
		System.out.println("밤에 일찍자기");
	}

}
