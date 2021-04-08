package com.test.spring01.member.model.dao;

import java.util.List;

import com.test.spring01.member.model.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> list();
	public MemberDTO view(String id);
	public void insert(MemberDTO dto);
	public void update(MemberDTO dto);
	public void delete(String id, String passwd);
	
	
	public int checkPasswd(String id,String passwd);
}
