package 생성자;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int sum;
	
	//객체생성하지 클래스이름으로 바로 접근해서 아무때나 원할 때 평균을 구하고 싶은 경우
	//static메서드로 만들어주세요.!
	
	
	public 직원(String name, int age, String gender) {
		super();
		count++;
		sum = sum +age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
