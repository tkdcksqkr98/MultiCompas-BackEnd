package 인터페이스;

public class 바나나컴퓨터 implements Computer{

	@Override
	public void 컴퓨터를만들다() {
		// TODO Auto-generated method stub
		System.out.println("부품을 구매해볼까?");
	}

	@Override
	public void 컴퓨터를조립하다() {
		// TODO Auto-generated method stub
		System.out.println("부품을 조립해볼까?");
		
	}

	@Override
	public void 컴퓨터를사용하다() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 켜볼까?");
		
	}

}
