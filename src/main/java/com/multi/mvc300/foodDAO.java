package com.multi.mvc300;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class foodDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(foodVO bag) {
		System.out.println("------" + my);
		int result = my.insert("food.create", bag);
		return result;
	}
	
	public int update(foodVO bag) {
		int result = my.update("food.update", bag);
		  return result; 
		  }

	public int delete(String id) {
		int result = my.delete("food.delete", id);
		return result;
	}
	
	public foodVO one(String id) {
		foodVO bag = my.selectOne("food.one", id);
		return bag;
	}

	public List<foodVO> list() {
		List<foodVO> list = my.selectList("food.all");
		return list;
	}
	
}