package 생성자;

public class 회사창업 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		직원 work1 = new 직원("홍길동", 25, "여");
		직원 work2 = new 직원("김길동", 24, "남");
		직원 work3 = new 직원("송길동", 26, "여");
		
		System.out.println("우리 회사의 직원수는 : " + 직원.count);
		//"우리 회사의 직원 각각의 정보를 프린트"
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		System.out.println(직원.sum / (double)직원.count);
	}

}
