package com.multi.withPuppy.report;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class ReportController {
	
	@Autowired    
	ReportDAO dao;
	
	@RequestMapping("report/insertRe")
	public String insert(ReportVO bag) {
		dao.insert(bag);
		return "redirect:report.jsp";
	}
	
	@RequestMapping("report/delete")
	public String delete(String title) {
		dao.delete(title);
		return "redirect:report.jsp";
	}
	@RequestMapping("report/update")
	public void update(ReportVO bag) {
		dao.update(bag);
	}
	
	@RequestMapping("report/report")
	public void report() {
	}

	@RequestMapping("insertRe1")
	public void report1() {
	}
	
	
	
	@RequestMapping("report/one")
	public void one(int number, Model model) {
		ReportVO vo = dao.one(number);
		model.addAttribute("vo", vo);
	}
	@RequestMapping("report/list")
	public String list(Model model) {
		List<ReportVO> list = dao.list();
		model.addAttribute("list", list);
		return "report/list";
	}
}