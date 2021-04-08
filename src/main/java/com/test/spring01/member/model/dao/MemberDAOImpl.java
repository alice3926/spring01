package com.test.spring01.member.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.test.spring01.member.model.dto.MemberDTO;
@Repository
public class MemberDAOImpl implements MemberDAO {
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<MemberDTO> list() {
		return sqlSession.selectList("member.list");
	}

	@Override
	public MemberDTO view(String id) {
		return sqlSession.selectOne("member.view",id);
	}

	@Override
	public void insert(MemberDTO dto) {
		sqlSession.insert("member.insert",dto);
	}

	@Override
	public void update(MemberDTO dto) {
		sqlSession.update("member.update",dto);
	}

	@Override
	public void delete(String id, String passwd) {
		Map<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("passwd", passwd);
		sqlSession.delete("member.delete",map);
	}
	@Override
	public int checkPasswd(String id,String passwd) {
		int result=0;
		Map<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("passwd", passwd);
		result =  sqlSession.selectOne("member.checkPasswd",map);
		return result;
	}
	
}
