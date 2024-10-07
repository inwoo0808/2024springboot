package com.sample.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class MyController {
	@Autowired
	private IMyUserDao dao;
	
	@RequestMapping("/")
	public @ResponseBody  String root() {
		return "jdbc test";
	}
	
	@RequestMapping("/user")
	public String userlistpage(Model model) {
		System.out.println("dao()");
		model.addAttribute("users", dao.list());
		return "userlist";
	}
}
