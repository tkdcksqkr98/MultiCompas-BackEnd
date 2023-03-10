package 화면DB연결;

public class MemberVO2 {
	//MemberV0가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌.
	private int no ;
	private String name;
	private int price ;
	private String store;
	
	
	@Override
	public String toString() {
		return "MemberVO2 [no=" + no + ", name=" + name + ", price=" + price + ", store=" + store + "]";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
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
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	
	
	
	
	
	
	
}
