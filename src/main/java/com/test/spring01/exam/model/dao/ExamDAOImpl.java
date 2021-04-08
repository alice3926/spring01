package com.test.spring01.exam.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.test.spring01.exam.model.dto.ExamDTO;
import com.test.spring01.member.model.dto.MemberDTO;
@Repository
public class ExamDAOImpl implements ExamDAO {
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<ExamDTO> list() {
		return sqlSession.selectList("exam.list");
	}

	@Override
	public ExamDTO view(int no) {
		return sqlSession.selectOne("exam.view",no);
	}

	@Override
	public void insert(ExamDTO dto) {
		sqlSession.insert("exam.insert",dto);
	}

	@Override
	public void update(ExamDTO dto) {
		sqlSession.update("exam.update",dto);
	}

	@Override
	public void delete(int no) {
		sqlSession.delete("exam.delete",no);
	}
	@Override
	public int checkJuming(int no,int jumin) {
		int result=0;
		Map<String, Object> map = new HashMap<>();
		map.put("no", no);
		map.put("jumin", jumin);
		result =  sqlSession.selectOne("exam.checkJuming",map);
		return result;
	}
	
}
