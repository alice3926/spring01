package com.test.spring01.exam.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.spring01.exam.model.dao.ExamDAO;
import com.test.spring01.exam.model.dto.ExamDTO;

@Controller
public class ExamController {
	@Inject //의존성 주입
	ExamDAO examDao;
	
	@RequestMapping("examList.do") //URL Mapping
	public String examList(Model model) {
		List<ExamDTO> list = examDao.list();
		System.out.println("no;"+list.get(0).getNo());
		
		model.addAttribute("list",list);
		return "exam/list";
	}
	@RequestMapping("examView.do") //URL Mapping
	public String examView(
			@RequestParam(value="no",defaultValue="") String no,
			
			Model model
			) {
			System.out.println("no:"+no);
			int no_ = Integer.parseInt(no);
			ExamDTO dto = examDao.view(no_);
			model.addAttribute("dto",dto);
		return "exam/view";
	}
	
	//회원가입
	@RequestMapping("examChuga.do") //URL Mapping
	public String examChuga() {
		return "exam/chuga";
	}
	@RequestMapping("examChugaProc.do") //URL Mapping
	public String examChugaProc(
//			@RequestParam(value="no",defaultValue="") String no,
//			@RequestParam(value="passwd",defaultValue="") String passwd,
//			@RequestParam(value="name",defaultValue="") String name,
//			@RequestParam(value="email",defaultValue="") String email,
//			Model model
			
			@ModelAttribute ExamDTO dto
			) {
			System.out.println("추가프록들어옴");
			dto.proc();
			examDao.insert(dto);
			return "redirect:examList.do";
	}
	
	//회원정보수정
	@RequestMapping("examSujung.do") //URL Mapping
	public String examSujung(
			@RequestParam(value="no",defaultValue="") int no,
			
			Model model
			) {
		System.out.println("no:"+no);
		ExamDTO dto = examDao.view(no);
		model.addAttribute("dto",dto);
		return "exam/sujung";
		
	}
	@RequestMapping("examSujungProc.do") //URL Mapping
	public String examSujungProc(@ModelAttribute ExamDTO dto) {
		System.out.println(dto.getNo());
		System.out.println(dto.getName());
		System.out.println(dto.getJumin());
		System.out.println(dto.getGender());
		System.out.println(dto.getAge());
		System.out.println(dto.getRegi_date());
		examDao.update(dto);
		return "redirect:examView.do?no="+dto.getNo();
	}
	//회원정보삭제
	@RequestMapping("examSakje.do") //URL Mapping
	public String examSakje(
			@RequestParam(value="no",defaultValue="") String no,
			
			Model model
			) {
		System.out.println("no:"+no);	
		int no_ = Integer.parseInt("no");
		ExamDTO dto = examDao.view(no_);
		model.addAttribute("dto",dto);
		return "exam/sakje";
	}
	@RequestMapping("examSakjeProc.do") //URL Mapping
	public String examSakjeProc(@ModelAttribute ExamDTO dto) {
		examDao.delete(dto.getNo());
		return "redirect:examList.do";
	}
}
