package com.winter.app.board.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;
import com.winter.app.util.Pager;

@Repository("noticeDAO")
public class NoticeDAO implements BoardDAO {
		
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.winter.app.board.notice.NoticeDAO.";

	@Override
	public Long getTotalCount(Pager pager) throws Exception {

		return sqlSession.selectOne(NAMESPACE + "getTotalCount");
	}

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		return sqlSession.selectList(NAMESPACE + "getList", pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE + "getDetail", boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + "setAdd", boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {

		return sqlSession.update(NAMESPACE + "setUpdate", boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return sqlSession.delete(NAMESPACE + "setDelete", boardDTO);
	}

	public List<BoardFileDTO> getFileList(BoardDTO boardDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "getFileList", boardDTO);
	}

	public int setFileAdd(BoardFileDTO boardFileDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + "setFileAdd", boardFileDTO);
	}

	public int setFileDelete(BoardDTO boardDTO) throws Exception {
		return sqlSession.delete(NAMESPACE + "setFileDelete", boardDTO);
	}
}
