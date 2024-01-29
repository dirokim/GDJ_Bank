package com.winter.app.product;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.member.MemberDTO;
import com.winter.app.util.Pager;

@Controller
@RequestMapping("/reply/*")
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	
	@GetMapping("list")
	public String getList(ReplyDTO replyDTO,Model model, Pager pager) throws Exception {
		Map<String,Object> map = replyService.setList(replyDTO,pager);
		model.addAttribute("list",map.get("list"));
		model.addAttribute("pager",map.get("pager"));
		
		//[{"userName":"???","contents":"???","date":"????"},
		//{"userName":"???","contents":"???","date":"????"}
		//{"userName":"???","contents":"???","date":"????"}
		//]
		
		
		return "product/replyList";
	}
	
	@PostMapping("add")
	public String setReply (ReplyDTO replyDTO,HttpSession session,Model model,Pager pager) throws Exception {
	MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		replyDTO.setUserName(memberDTO.getUserName());
		replyService.setReply(replyDTO);
		
		Map<String,Object> map = replyService.setList(replyDTO,pager);
		model.addAttribute("list",map.get("list"));
		model.addAttribute("pager",map.get("pager"));
		return "product/replyList";
	
	}
}
