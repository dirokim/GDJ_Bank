package com.winter.app.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardService;
import com.winter.app.util.Pager;
@Controller
@RequestMapping(value = "/qna/*")
public class QnaController {
	
	@Autowired
	@Qualifier("qnaService")

	private QnaService qnaService;
	
	
	
	
	@ModelAttribute("bbs")
	public Integer getKind() {
		return 1;
	}
	
	@ModelAttribute("board")
	public String getBoard() {
		return"qna";
	}
	
	
	@PostMapping("update")
	public String setUpdate (BoardDTO boardDTO,Model model,MultipartFile [] attachs)throws Exception {
		int result = qnaService.setUpdate(boardDTO,attachs);
		model.addAttribute("boardDTO",boardDTO);
		return "board/list";
	}
	
	@GetMapping("update")
	public String setUpdate (BoardDTO boardDTO,Model model)throws Exception {
		boardDTO = qnaService.getDetail(boardDTO);
		model.addAttribute("boardDTO",boardDTO);
		return "board/update";
	}
	
	
	
	
	@PostMapping("delete")
	public String setDelete(QnaDTO boardDTO)throws Exception {
		boardDTO.setFlag(1);
		int result = qnaService.setDelete(boardDTO);
		
		return "redirect:./list";
	}
	
	
	@PostMapping("reply")
	public String setReply(QnaDTO qnaDTO) throws Exception {
		int result = qnaService.setReply(qnaDTO);
		return "redirect:./list";
	}
	
	@GetMapping("reply")
	public String setReply(BoardDTO boardDTO,Model model) throws Exception {
		model.addAttribute("dto",boardDTO);
		return "board/reply";
	}
	
	@GetMapping("list")
	public String getList(Pager pager,Model model) throws Exception {
		
		List<BoardDTO> ar = qnaService.getList(pager);
		model.addAttribute("list",ar);
		model.addAttribute("pager",pager);
		return "board/list";
	}
	
	@GetMapping("detail")
	public String getDetail(BoardDTO boardDTO,Model model) throws Exception {
		boardDTO = (QnaDTO)qnaService.getDetail(boardDTO);
		model.addAttribute("boardDTO",boardDTO);
		return "board/detail";
	}
	@GetMapping("add")
	public String getAdd () throws Exception {
		return "board/add";
	}
	@PostMapping("add")
	public String getAdd (BoardDTO boardDTO,MultipartFile [] attachs) throws Exception {
		int result = qnaService.setAdd(boardDTO,attachs);
		return "redirect:./list";
	}
	
}
