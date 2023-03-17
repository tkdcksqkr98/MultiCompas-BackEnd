package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//import 화면DB연결.MemberVO;
//import java.sql.PreparedStatement;

public class GradeDAO {

	/// 메서드를 만드는 것
	// 메서드를 정의했다고 실행되는 것은 아니다.!
	// 메서드를 쓰는 것 ==> 메서드 호출(call)!
	public ArrayList<GradeVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList
		ArrayList<GradeVO> list = new ArrayList<>();
		GradeVO bag = null;
		try {
			// 1.오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자.(java ---oracle)
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mySQL 연결 성공");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select * from grade";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) {// 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1.검색결과가 있으면,
				System.out.println("검색결과 있음. 성공.");
				// 2.각 컬럼에서 값들을 꺼내오자.
				bag = new GradeVO();
				bag.setId(rs.getInt("id")); 
				bag.setSubject(rs.getString("Subject"));
				bag.setScore(rs.getInt("Score"));
				bag.setName(rs.getString("Name"));
				bag.setImg(rs.getString("Img"));
				// 4. list에 bag을 추가해주자.
				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();
			// System.out.println(result);
		} catch (Exception e) {

			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 한다.
		return list;
	}
	public GradeVO one(int id) {
		//검색결과가 null이 뜨는 경우에는
		//입력값은 id를 출력해보세요.!!
		System.out.println(id);
		//출력값(리턴값)을 출력해보세요.!!!
		
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가! 들어가 있음.
		// 참조형 변수를 초기화할 때는 null(주소가 없다라는 의미)
		GradeVO bag = null;
		try {
			// 1.오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자.(java ---oracle)
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mySQL 연결 성공");

			String sql = "select * from grade where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select의 결과는 항목명+Row 테이블!!
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				bag = new GradeVO();
				bag.setId(rs.getInt("id")); 
				bag.setSubject(rs.getString("Subject"));
				bag.setScore(rs.getInt("Score"));
				bag.setName(rs.getString("Name"));
				bag.setImg(rs.getString("Img"));
			} else {
				System.out.println("검색결과 없음. 성공.");
			}
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(bag);
		return bag;

	}
	public int delete(int id) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자.(java ---oracle)
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mySQL 연결 성공");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "delete from grade where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, id);
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("수정 성공");
			}

			// System.out.println(result);
		} catch (Exception e) {
			result = 0;
			// e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	// 1. 가방을 받아서 저장해두자.
	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자.
	public int update(GradeVO bag) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자.(java ---oracle)
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mySQL 연결 성공");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "update grade set score = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, bag.getScore());
			ps.setInt(2, bag.getId());
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("수정 성공");
			}

			// System.out.println(result);
		} catch (Exception e) {
			result = 0;
			// e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	// public void add2(){
	public int insert(GradeVO bag) {
		
		System.out.println(bag.toString());
		int result = 0;

		try {
			// 1.오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자.(java ---oracle)
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mySQL 연결 성공");

			// ipdaaress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특성한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품 !!

			String sql = "insert into grade values(?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con 부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// R빼고, 인덱스0부터 시작!!
			// 유일하게 db는 인덱스가 1부터 시작!!
			// 2. 가방에서 값들을 하나씩 꺼내 쓰세요.
			ps.setInt(1, bag.getId());
			ps.setString(2, bag.getSubject());
			ps.setInt(3, bag.getScore());
			ps.setString(4, bag.getName());
			ps.setString(5, bag.getImg());
			// ==> insert into hr.MEMBER values('a', 'a' ,'a', 'a');
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");

			result = ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
			// System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행
			// 실행된 Row수가 없으므로 Result에 0을 넣어주.자.
			result = 0;
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

}
