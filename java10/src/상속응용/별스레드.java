package 상속응용;

//동시에 돌아가게 하는 부품인 Thread를 상속받아서 만들면
//내 부품은 동시에 돌이가는 클래스로 만들어진다.
public class 별스레드 extends Thread{
	//동시에 처리하고 싶은 내용을run()메서드를써주세요.!
	public void run() {
		for (int i = 0; i < 50000; i++) {
			System.out.println(i + "★");
		}
	}
}
