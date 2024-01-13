package com.winter.app.board;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface BoardDAO {

	
	public Long getTotalCount() throws Exception;
	
	//목록 가져오기 
	public List<BoardDTO> getList() throws Exception;
	
	
	
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception;
	
	
	
	public int setAdd(BoardDTO boardDTO) throws Exception;
	
	
	
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	
	
	public int setDelete (BoardDTO boardDTO) throws Exception;
}
