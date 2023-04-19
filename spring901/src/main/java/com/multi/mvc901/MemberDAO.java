package com.multi.mvc901;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //싱글톤을 만드렁라
public class MemberDAO {
	//특정한 방법으로 실행하는 클래스(model, 방법) MVC 중 M
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(MemberVO bag) {
		my.insert("member.create", bag);
	}
}
