package 화면DB연결;

public class MemberVO {
	//MemberV0가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌.
	private String name;
	private int price ;
	private String store;
	
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", price=" + price + ", store=" + store + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRes() {
		return store;
	}
	public void setRes(String store) {
		this.store = store;
	}
	
	
	
	
}
