package com.winter.app.board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardService;
import com.winter.app.member.MemberDTO;
import com.winter.app.util.Pager;

@Controller
@RequestMapping(value = "/notice/*")
public class NoticeController {
	
	@Autowired
	@Qualifier("noticeService")
	private BoardService boardService;
	
	@ModelAttribute("board")
	public String getBoard() {
		return"notice";
	}
	
	@ModelAttribute("bbs")
	public Integer getKind() {
		return 0;
	}
	
	@GetMapping("update")
	public String setUpdate(BoardDTO boardDTO, Model model) throws Exception {
		boardDTO = boardService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		return "board/update";
	}

	@PostMapping("update")
	public String setUpdate(BoardDTO boardDTO,Model model,MultipartFile [] attachs,HttpSession session) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		boardDTO.setNoticeWriter(memberDTO.getUserName());
		int result = boardService.setUpdate(boardDTO,attachs);
	model.addAttribute("boardDTO",boardDTO);
		return "board/list";
	}

	@PostMapping("delete")
	public String setDelete(BoardDTO boardDTO) throws Exception {
		boardService.setDelete(boardDTO);
		return "redirect:./list";
	}

	@GetMapping("list")
	public String getList(Pager pager, Model model) throws Exception {
		List<BoardDTO> ar = boardService.getList(pager);
		model.addAttribute("list", ar);
		model.addAttribute("pager", pager);
		return "board/list";
	}

	@GetMapping("detail")
	public String getDetail(BoardDTO boardDTO, Model model) throws Exception {
		boardDTO = (NoticeDTO) boardService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		return "board/detail";
	}

	@GetMapping("add")
	public String setAdd() throws Exception {

		return "board/add";
	}

	
	@PostMapping("add")
	public String setAdd(BoardDTO boardDTO,MultipartFile[]attachs,HttpSession session) throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		boardDTO.setNoticeWriter(memberDTO.getUserName());
		System.out.println(boardDTO.getNoticeHead());		
		int result = boardService.setAdd(boardDTO,attachs);
		return "redirect:./list";
	}
}
