package 생성자;

public class 컴퓨터 {
	int 가격; // 돈
	String 제조회사; // 제조회사
	int 모니터크키; // 사이즈

	public 컴퓨터(int 가격, String 제조회사, int 모니터크기) {

		this.가격 = 가격;
		this.제조회사 = 제조회사;
		this.모니터크키 = 모니터크키;
	}

	@Override
	public String toString() {
		return "컴퓨터 [가격=" + 가격 + ", 제조회사=" + 제조회사 + ", 모니터크키=" + 모니터크키 + "]";
	}

	
}
