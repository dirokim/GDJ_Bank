package com.winter.app.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService; 
	
	@PostMapping("join")
	public String getJoin (MemberDTO memberDTO , MultipartFile attachs,Model model) throws Exception {
		int result = memberService.getJoin(memberDTO, attachs);

		String msg = "등록 실패";
		if(result >0) {
			msg = "등록 성공";
		}
		
		model.addAttribute("msg",msg);
		model.addAttribute("path","/");
		return "commons/result";
	}
	
	
	
	@GetMapping("join")
	public String getJoin () throws Exception {	
		return "member/join";
		
	}
	
}
