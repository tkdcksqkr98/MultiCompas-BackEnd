package 화면DB연결;

public class MemberVO2 {
	// MemberV0가방에 넣은 데이터는 Member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜 줌.
	private int no;
	private String name;
	private String store;

	public int getNo() {
		return no;
	}

	@Override
	public String toString() {
		return "MemberVO2 [no=" + no + ", name=" + name + ", store=" + store + "]";
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

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

}
