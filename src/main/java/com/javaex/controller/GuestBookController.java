package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.guestVo.GuestVo;
import com.javaex.dao.GuestDao;

@Controller
@RequestMapping("/guest")
public class GuestBookController {
	
	@Autowired
	GuestDao dao;
	
	@RequestMapping("/main")
	public String main(Model model) {
		
		List<GuestVo> gList = dao.getList();
		System.out.println(gList.toString());
		model.addAttribute("gList", gList);
		
		return "addList";
	}
	
	@RequestMapping("/deleteForm")
	public String deleteForm(Model model, @RequestParam("no") String no) {
		model.addAttribute("no", no);
		return "deleteForm";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("no") int no,
						 @RequestParam("pass") String inputNum) {
		
		dao.delete(no, inputNum);
		return "redirect:/guest/main";
	}
	
	@RequestMapping("/insert")
	public String update(@ModelAttribute GuestVo guestVo) {
		
		dao.addList(guestVo);
		return "redirect:/guest/main";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
