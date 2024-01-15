package com.winter.app.board;

import java.util.List;

import org.springframework.stereotype.Service;

import com.winter.app.util.Pager;
@Service
public interface BoardService {

	

	//목록 가져오기
	public List<BoardDTO> getList(Pager pager) throws Exception;
	
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception;
	
	public int setAdd(BoardDTO boardDTO) throws Exception;
	
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	public int setDelete (BoardDTO boardDTO) throws Exception;
}
