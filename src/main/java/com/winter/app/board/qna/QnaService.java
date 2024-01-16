package com.winter.app.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardService;
import com.winter.app.util.Pager;

@Service("qnaService")
public class QnaService implements BoardService {

	@Autowired
	@Qualifier("qnaDAO")
	private QnaDAO boardDAO;
	
	
	
	public int setReply(QnaDTO qnaDTO)throws Exception{
		// board Num 부모의 글번호
		// title  답글 제목
		// writer 답글 작성자
		//contents 답글 내용
		//1. 부모의 정보 조회  - 디테일 (ref , step ,depth 
	  QnaDTO parent = (QnaDTO)boardDAO.getDetail(qnaDTO);
	  	//2.답글 정보 저장(REF,STEP,DEPTH)
	  	qnaDTO.setNoticeRef(parent.getNoticeRef());
	  	qnaDTO.setNoticeStep(parent.getNoticeStep()+1);
	  	qnaDTO.setNoticeDepth(parent.getNoticeDepth()+1);
	  	//3.step 을 업데이트
	  	int result = boardDAO.setReplyUpdate(parent);
	  	result = boardDAO.setReplyAdd(qnaDTO);
		return result;
	}
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		pager.makeRow();
		return	boardDAO.getList(pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		return boardDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO,MultipartFile[]attachs) throws Exception {

		return boardDAO.setAdd(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
