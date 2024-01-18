package com.winter.app.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	
	
	@GetMapping("logout")
	public String getLogout(HttpSession session)throws Exception {
//		session.setAttribute("member",null);
//		session.removeAttribute("member");
//		session.removeValue("member");
		session.invalidate();
		return "redirect:../";
	}
	
	@GetMapping("login")
	public void getLogin ()throws Exception{
		
	}
	@PostMapping("login")
	public String getLogin (MemberDTO memberDTO,HttpSession session,Model model)throws Exception{
		memberDTO = memberService.getLogin(memberDTO);
		if(memberDTO==null) {
			model.addAttribute("msg","id 또는 pw 를 확인하세요");

			return "";
		}
		
		 session.setAttribute("member", memberDTO);
		 
		 return "redirect:../";
	}
	
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
