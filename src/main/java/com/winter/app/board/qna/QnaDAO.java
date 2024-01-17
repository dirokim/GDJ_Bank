package com.winter.app.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;
import com.winter.app.util.Pager;

@Repository("qnaDAO")
public class QnaDAO implements BoardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.winter.app.board.qna.QnaDAO.";
	

	
	public int setReplyAdd (QnaDTO qnaDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setReplyAdd",qnaDTO);
	}
	
	public int setReplyUpdate (QnaDTO qnaDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"setReplyUpdate",qnaDTO);
	}
	
	@Override
	public Long getTotalCount() throws Exception {

		return sqlSession.selectOne(NAMESPACE+"getTotalCount");
	}

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		
		return sqlSession.selectList(NAMESPACE+"getList",pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getDetail",boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setAdd",boardDTO);
	}
	
	public int setAddFile(BoardFileDTO boardFileDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setAddFile",boardFileDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
	
		return sqlSession.update(NAMESPACE+"setUpdate",boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"setDelete",boardDTO);
	}
	public List<BoardFileDTO> getFileList (BoardDTO boardDTO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getFileList",boardDTO);
	}
	public int setFileDelete (BoardDTO boardDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"setFileDelete",boardDTO);
	}
}
