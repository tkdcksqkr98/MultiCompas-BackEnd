package 상속기본;

public class Car {
	String color;

	public void run() {
		System.out.println("하늘을 날아요!");
	}
	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
	
}
