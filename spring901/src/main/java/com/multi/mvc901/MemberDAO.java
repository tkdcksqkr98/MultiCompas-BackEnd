package com.multi.mvc901;

import java.util.List;

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
	public void delete(String id) {
		int result = my.delete("member.delete", id);
		System.out.println(result);
	}
	public void update(MemberVO bag) {
		int result = my.update("member.update", bag);
		System.out.println(result);
	}
	public MemberVO one(String id) {
		MemberVO vo = my.selectOne("member.one", id);
		return vo;
	}
	public List<MemberVO> list() {
		List<MemberVO> list = my.selectList("member.all");
		return list;
	}
}
