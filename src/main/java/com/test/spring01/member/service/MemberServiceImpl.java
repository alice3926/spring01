package com.test.spring01.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.test.spring01.member.model.dao.MemberDAO;
import com.test.spring01.member.model.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	MemberDAO memberDao;
	
	
	@Override
	public List<MemberDTO> list() {
		return memberDao.list();
	}

	@Override
	public MemberDTO view(String id) {
		return memberDao.view(id);
	}

	@Override
	public void insert(MemberDTO dto) {
		memberDao.insert(dto);
	}

	@Override
	public void update(MemberDTO dto) {
		memberDao.update(dto);
	}

	@Override
	public void delete(String id, String passwd) {
		memberDao.delete(id, passwd);
	}

	@Override
	public int checkPasswd(String id, String passwd) {
		return memberDao.checkPasswd(id, passwd);
	}

}
