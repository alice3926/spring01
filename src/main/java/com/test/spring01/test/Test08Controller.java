package com.test.spring01.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test08Controller {
	@RequestMapping("/test08.do")
	public String test08() {
		return "test08/exam01";
	}
	
	@RequestMapping("/test08Proc.do")
	public String test08Proc(
			Model model,
			@RequestParam(value="id", defaultValue="") String id,
			@RequestParam(value="passwd", defaultValue="") String passwd
			
			) {
		String msg="";
		if(id.equals("hong")) {
			msg="없는 아이디 입니다.";
		}else {
			if(passwd.equals("1111")) {
				msg="로그인 성공";
			}else {
				msg="로그인 실패";
			}
		}
		
			model.addAttribute("msg",msg);
			if(msg.equals("로그인 성공")) {
				model.addAttribute("id", id);
				model.addAttribute("passwd", passwd);
			}
			return "test08/exam01Result";
	}
}
