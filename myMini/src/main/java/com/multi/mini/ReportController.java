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
	public String insert(ReportVO bag) {
		dao.insert(bag);
		return "redirect:report.jsp";
	}
	
	@RequestMapping("delete")
	public String delete(String title) {
		dao.delete(title);
		return "redirect:report.jsp";
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
	public List<ReportVO> list(Model model) {
		List<ReportVO> list = dao.list();
		model.addAttribute("list", list);
		return list;
	}
}
