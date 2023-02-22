package 인터페이스;

public class 애플컴퓨터 implements Computer{

	@Override
	public void 컴퓨터를만들다() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 만들어보자!");
	}

	@Override
	public void 컴퓨터를조립하다() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 조립해보자!");
	}

	@Override
	public void 컴퓨터를사용하다() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 사용해보자!");
	}

}
