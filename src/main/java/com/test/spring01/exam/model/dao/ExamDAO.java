package com.test.spring01.exam.model.dao;

import java.util.List;

import com.test.spring01.exam.model.dto.ExamDTO;

public interface ExamDAO {
	public List<ExamDTO> list();
	public ExamDTO view(int no);
	public void insert(ExamDTO dto);
	public void update(ExamDTO dto);
	public void delete(int no);
	
	public int checkJuming(int no,int jumin);
}
