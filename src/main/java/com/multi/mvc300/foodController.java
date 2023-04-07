package com.multi.mvc300;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class foodController {
	
	@Autowired
	foodDAO dao;//100
	
	@RequestMapping("insert4")
	public void insert(foodVO bag) {
		
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("update4")
	public void update(foodVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete4")
	public void delete(String id) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		dao.delete(id);
	}
	
	@RequestMapping("one4")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		foodVO bag = dao.one(id);
		model.addAttribute("bag", bag);
		//bag에 검색결과 다 들어있음.
		//views아래 one.jsp로 쓸 수 있도록 설정해주어야 함.
		//views까지 전달할 속성으로 추가해주세요.
	}
	
	@RequestMapping("list4")
	public void list(Model model) {
		List<foodVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
