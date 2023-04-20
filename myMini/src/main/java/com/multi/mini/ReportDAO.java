package com.multi.mini;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //싱글톤을 만드렁라
public class ReportDAO {
	//특정한 방법으로 실행하는 클래스(model, 방법) MVC 중 M
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(ReportVO bag) {
		my.insert("report.create", bag);
	}
	public void delete(String no) {
		int result = my.delete("report.delete", no);
		System.out.println(result);
	}
	public void update(ReportVO bag) {
		int result = my.update("report.update", bag);
		System.out.println(result);
	}
	public ReportVO one(String no) {
		ReportVO vo = my.selectOne("report.one", no);
		return vo;
	}
	public List<ReportVO> list() {
		List<ReportVO> list = my.selectList("report.all");
		return list;
	}
}
