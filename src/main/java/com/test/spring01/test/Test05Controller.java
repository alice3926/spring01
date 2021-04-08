package com.test.spring01.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test05Controller {
	@RequestMapping("/test05.do")
	public String test05() {
		return "test05/exam01";
		
	}
	
	
	@RequestMapping("/test05Proc.do")
	public String test05Proc(
		@ModelAttribute Test05DTO2 dto,
		Model model
		) {
		
		dto.proc();
		model.addAttribute("dto", dto);
		
//		String name = dto.getName();
//		int kor = dto.getKor();
//		int eng = dto.getEng();
//		int mat = dto.getMat();
//		int sci = dto.getSci();
//		int his = dto.getHis();
//		int tot = dto.tot(kor, eng, mat, sci, his);
//		double avg =dto.avg(tot);
//		
//		model.addAttribute("name",name);	
//		model.addAttribute("kor",kor);
//		model.addAttribute("eng",eng);
//		model.addAttribute("mat",mat);
//		model.addAttribute("sci",sci);
//		model.addAttribute("his",his);
//		model.addAttribute("tot",tot);
//		model.addAttribute("avg",avg);
		
		return "test05/exam01Result";
		
		
	}
}
