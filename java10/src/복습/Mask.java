package 복습;

public class Mask {
	// 멤버변수
	String color;
	int price;
	int count;
	public Mask(String color, int price, int count) {
		
		this.color = color;
		this.price = price;
		this.count = count;
	}
	@Override
	public String toString() {
		return "마스크 [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	//클래스 이름과 동일한 메서드를 만들어ㅜㅈ면, 
	//new 를 가지고 객체생성시 자동호출
}
