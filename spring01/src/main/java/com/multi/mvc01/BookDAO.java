package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;

//import 화면DB연결.BbsVO;
//import 화면DB연결.MemberVO;
//import java.sql.PreparedStatement;
//테이블 하나당 DAO 하나! ==>
@Component
public class BookDAO {
	
	public void insert(BookVO bag) {
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

			String sql = "insert into book (name, url, img) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con 부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// R빼고, 인덱스0부터 시작!!
			// 유일하게 db는 인덱스가 1부터 시작!!
			ps.setString(1, bag.getName());
			ps.setString(2, bag.getUrl());
			ps.setString(3, bag.getImg());
			// ==> insert into hr.MEMBER values('a', 'a' ,'a', 'a');
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");

			ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public BookVO one(String id) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		BookVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from book where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음. 성공.");
				int id2 = rs.getInt(1); // id
				String name = rs.getString(2); // name
				String url2 = rs.getString(3); // url2
				String img = rs.getString(4); // img
				// 검색결과를 검색화면 UI부분을 주어야 함.
				bag = new BookVO();
				bag.setId(id2);
				bag.setName(name);
				bag.setUrl(url2);
				bag.setImg(img);
			} else {
				System.out.println("검색결과 없음. 성공.");
			}
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag;

	}
	}


