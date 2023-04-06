package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component //싱글톤을 만드렁라
public class MemberDAO {
	
	//mybatis 싱글톤 객체 찾아서 주소를 넣어주세요.!
	@Autowired
	SqlSessionTemplate my;
	/*
	 * public int login(MemberVO bag) { return result; }
	 * 
	 * public ArrayList<MemberVO> list() { return list; }
	 * 
	 * public MemberVO one(String id) { 
	 * return bag;
	 * 
	 * }
	 * 
	 */
	  public int delete(String id) { 
		  int result = my.delete("member.delete", id);
		  return result; 
		  }
	  
	  public int update(MemberVO bag){
		  int result = my.update("member.update", bag);
		  
		  return result; }
	
	  public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		return result;
	}

}
