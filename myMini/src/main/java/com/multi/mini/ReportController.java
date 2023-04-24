package com.multi.mini;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class ReportController {
	
	@Autowired    
	ReportDAO dao;
	
	@RequestMapping("insert")
	public void insert(ReportVO bag) {
		dao.insert(bag);
	}
	@RequestMapping("delete")
	public void delete(int no) {
		dao.delete(no);
	}
	@RequestMapping("update")
	public void update(ReportVO bag) {
		dao.update(bag);
	}
	@RequestMapping("one")
	public void one(int no, Model model) {
		ReportVO vo = dao.one(no);
		model.addAttribute("vo", vo);
	}
	@RequestMapping("list")
	public void list(Model model) {
		List<ReportVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
