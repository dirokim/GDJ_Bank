package com.winter.app.account;

import java.util.List;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;
import com.winter.app.util.Pager;

@Controller
@RequestMapping(value = "/account/*")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping("add")
	public void setAdd()throws Exception {
		
	}
	
	@GetMapping("list")
	public ModelAndView setList(ModelAndView mv,HttpSession session,AccountDTO accountDTO,Pager pager) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setUserName(memberDTO.getUserName());
		List<ProductDTO> ar = accountService.getList(accountDTO,pager);
		mv.addObject("list",ar);
		
		System.out.println(ar.get(0).getProductName());
		
		return mv;
	}
	
	@PostMapping("add")
	public String setAdd(AccountDTO accountDTO,Model model,HttpSession session)throws Exception {
		int result = accountService.getAdd(accountDTO,session);
		String msg ="등록 실패";
		if(result>0) {
			msg="등록 성공";
		}
		
		model.addAttribute("msg",msg);
		model.addAttribute("path","/product/list");
		return "commons/result";
	}
}
