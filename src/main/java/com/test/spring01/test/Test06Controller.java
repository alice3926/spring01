package com.test.spring01.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test06Controller {
	@RequestMapping("/test06.do")
	public String test06() {
		return "test06/exam01";
		
	}
	
	
//	@RequestMapping("/test06Proc.do")
//	public String test06Proc(
//		Model model,
//		@RequestParam String pcode,
//		@RequestParam String pname,
//		@RequestParam String pprice,
//		@RequestParam String salepercent,
//		@RequestParam String pcompany
//		
//		) {
//		
//		
//		int pprice_ = Integer.parseInt(pprice);
//		int salepercent_ = Integer.parseInt(salepercent);
//		double saleamount = (double)pprice_*salepercent_/100;
//		
//		model.addAttribute("pcode", pcode);
//		model.addAttribute("pname", pname);
//		model.addAttribute("pprice", pprice_);
//		model.addAttribute("salepercent", salepercent_);
//		model.addAttribute("saleamount", saleamount);
//		model.addAttribute("pcompany", pcompany);
//		return "test06/exam01Result";
//		
//		
//	}
	
	@RequestMapping("/test06Proc.do")
	public String test06Proc(
		@ModelAttribute Test06DTO dto,
		Model model
		) {
		
		dto.proc();
		model.addAttribute("dto", dto);
		return "test06/exam02Result";
		
		
	}
}
