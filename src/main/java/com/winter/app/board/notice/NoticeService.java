package com.winter.app.board.notice;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;
import com.winter.app.board.BoardService;
import com.winter.app.util.FileManager;
import com.winter.app.util.Pager;


@Service("noticeService")
public class NoticeService implements BoardService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	@Autowired
	private FileManager fileManager;
	@Autowired
	private ServletContext servletContext;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {

		pager.makeRow();
		Long totalCount = noticeDAO.getTotalCount(pager);
		if (totalCount < 1) {
			totalCount = 1L;
		}
		pager.makePage(totalCount);
		List<BoardDTO> ar = noticeDAO.getList(pager);
		return ar;
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {

		return noticeDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO, MultipartFile[] attachs) throws Exception {
		int result = noticeDAO.setAdd(boardDTO);
		String path = servletContext.getRealPath("/resources/upload/notice");

		for (MultipartFile f : attachs) {
			if (f.isEmpty()) {
				continue;
			}

			String fileName = fileManager.fileSave(path, f);
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(f.getOriginalFilename());
			boardFileDTO.setNoticeNum(boardDTO.getNoticeNum());
			result = noticeDAO.setFileAdd(boardFileDTO);
		}

		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO, MultipartFile[] attachs) throws Exception {
		return noticeDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		List<BoardFileDTO> ar = noticeDAO.getFileList(boardDTO);
		String path = servletContext.getRealPath("/resources/upload/notice");
		for (BoardFileDTO d : ar) {

			fileManager.fileDelete(path, d.getFileName());

		}

		noticeDAO.setFileDelete(boardDTO);

		int result = noticeDAO.setDelete(boardDTO);

		return result;
	}
	
	
}
