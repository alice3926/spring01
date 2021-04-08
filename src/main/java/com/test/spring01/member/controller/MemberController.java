package com.test.spring01.member.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.spring01.member.model.dao.MemberDAO;
import com.test.spring01.member.model.dto.MemberDTO;
import com.test.spring01.member.service.MemberService;

@Controller
public class MemberController {
	@Inject //의존성 주입
	MemberService memberService;
	@Inject //의존성 주입
	MemberDAO memberDao;
	
	int imsi = 0; //0-dao, 1-service
	
	@RequestMapping("memberList.do") //URL Mapping
	public String memberList(Model model) {
		List<MemberDTO> list;
		if(imsi ==0) {
			list = memberDao.list();
		}else {
			list = memberService.list();
		}
		model.addAttribute("list",list);
		return "member/list";
	}
	@RequestMapping("memberView.do") //URL Mapping
	public String memberView(
			@RequestParam(value="id",defaultValue="") String id,
			
			Model model
			) {
			System.out.println("id:"+id);	
			MemberDTO dto;
			if(imsi ==0) {
				dto = memberDao.view(id);
			}else {
				dto = memberService.view(id);
			}
			
			model.addAttribute("dto",dto);
		return "member/view";
	}
	
	//회원가입
	@RequestMapping("memberChuga.do") //URL Mapping
	public String memberChuga() {
		return "member/chuga";
	}
	@RequestMapping("memberChugaProc.do") //URL Mapping
	public String memberChugaProc(
//			@RequestParam(value="id",defaultValue="") String id,
//			@RequestParam(value="passwd",defaultValue="") String passwd,
//			@RequestParam(value="name",defaultValue="") String name,
//			@RequestParam(value="email",defaultValue="") String email,
//			Model model
			
			@ModelAttribute MemberDTO dto
			) {
			System.out.println("추가프록들어옴");
			if(imsi ==0) {
				memberDao.insert(dto);
			}else {
				 memberService.insert(dto);
			}
			return "redirect:memberList.do";
	}
	
	//회원정보수정
	@RequestMapping("memberSujung.do") //URL Mapping
	public String memberSujung(
			@RequestParam(value="id",defaultValue="") String id,
			
			Model model
			) {
		System.out.println("id:"+id);	
		MemberDTO dto;
		if(imsi ==0) {
			dto = memberDao.view(id);
		}else {
			dto = memberService.view(id);
		}
		model.addAttribute("dto",dto);
		return "member/sujung";
		
	}
	@RequestMapping("memberSujungProc.do") //URL Mapping
	public String memberSujungProc(@ModelAttribute MemberDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPasswd());
		System.out.println(dto.getName());
		System.out.println(dto.getEmail());
		if(imsi ==0) {
			memberDao.update(dto);
		}else {
			memberService.update(dto);
		}
		return "redirect:memberView.do?id="+dto.getId();
	}
	//회원정보삭제
	@RequestMapping("memberSakje.do") //URL Mapping
	public String memberSakje(
			@RequestParam(value="id",defaultValue="") String id,
			
			Model model
			) {
		System.out.println("id:"+id);	
		MemberDTO dto;
		if(imsi ==0) {
			dto = memberDao.view(id);
		}else {
			dto = memberService.view(id);
		}
		model.addAttribute("dto",dto);
		return "member/sakje";
	}
	@RequestMapping("memberSakjeProc.do") //URL Mapping
	public String memberSakjeProc(@ModelAttribute MemberDTO dto) {
		if(imsi ==0) {
			memberDao.delete(dto.getId(),dto.getPasswd());
		}else {
			memberService.delete(dto.getId(),dto.getPasswd());
		}
		return "redirect:memberList.do";
	}
}
