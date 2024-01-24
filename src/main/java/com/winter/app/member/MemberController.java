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
	
	@GetMapping("idCheck")
	public String getIdCheck (MemberDTO memberDTO,Model model)throws Exception{
		 memberDTO = memberService.getDetail(memberDTO);
		int result =0;
		if(memberDTO==null) {
			result = 1 ;
		}
		 model.addAttribute("result",result);
		 return "commons/ajaxResult";
	}
	

	@PostMapping("update")
	public String setUpdate(MemberDTO memberDTO,HttpSession session) throws Exception {
		//디비에 업데이트후 마이페이지로 리다이렉트 
		MemberDTO m = (MemberDTO) session.getAttribute("member");
		memberDTO.setUserName(m.getUserName()); 	
		memberService.getUpdate(memberDTO);
		 return "redirect:./mypage";
	}
	
	@GetMapping("mypage")
	public String setMypage (HttpSession session,Model model) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		memberService.getDetail(memberDTO);
		model.addAttribute("member",memberDTO);
		return "member/mypage";
		
		
	}
	
	@GetMapping("update")
	public void setUpdate(HttpSession session,Model model) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		memberDTO = memberService.getDetail(memberDTO);
		
		model.addAttribute("member",memberDTO);
		
	}
	
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

			return "member/login";
		}
		
		 session.setAttribute("member", memberDTO);
		 
		 return "redirect:../";
	}
	
	@GetMapping("agreement")
	public void setAgreement()throws Exception {
		
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
