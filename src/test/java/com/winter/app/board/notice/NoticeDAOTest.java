package com.winter.app.board.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;
import com.winter.app.board.BoardDTO;
import com.winter.app.util.Pager;

public class NoticeDAOTest extends MyTest{
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void getList() throws Exception {
		Pager pager = new Pager();
		pager.makeRow();
		List<BoardDTO> ar =noticeDAO.getList(pager);
		assertNotEquals(0,ar.size());
	}
	
	public void add() throws Exception{
		
	}

}
