package com.test.spring01.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

		@RequestMapping("/")
		public String index(Model model) {
			model.addAttribute("name","이성순");
			model.addAttribute("msg","안녕하세요?");
			return "index";
			
		}
		
}
