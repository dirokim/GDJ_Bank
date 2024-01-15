package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardService;
import com.winter.app.util.Pager;

@Controller
@RequestMapping(value = "/notice/*")
public class NoticeController {
	
	@Autowired
	@Qualifier("noticeService")
	private BoardService boardService;
	
	//@RequestMapping(value = "list",method = RequestMethod.GET)
	@GetMapping("list")
	public String getList(Pager pager,Model model) throws Exception {
		List<BoardDTO> ar = boardService.getList(pager);
		model.addAttribute("list",ar);
		return "board/list";
	}
	
	@GetMapping("detail")
	public String getDetail(BoardDTO boardDTO,Model model) throws Exception {
		boardDTO = (NoticeDTO)boardService.getDetail(boardDTO);
		model.addAttribute("boardDTO",boardDTO);
		return "board/detail";
	}
	
}
