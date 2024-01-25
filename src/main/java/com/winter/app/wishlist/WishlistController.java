package com.winter.app.wishlist;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.ast.WhileStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.account.AccountDTO;
import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;
import com.winter.app.util.Pager;

@Controller
@RequestMapping(value = "/wishlist/*")
public class WishlistController {
	
	@Autowired
	private WishlistService wishlistService;
	
	
	
	@PostMapping("delete")
	public String getDelete (Long [] productNum,Model model,HttpSession session) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");   
	int result = wishlistService.setDelete(productNum,memberDTO);
			model.addAttribute("result",result);
		return "commons/ajaxResult";
	}
	
	
	@GetMapping("list")
	public void getList (AccountDTO accountDTO,HttpSession session,Model model,Pager pager) throws Exception {
	Map<String,Object> map = wishlistService.setList(accountDTO,session,pager);
		model.addAttribute("list",map.get("list"));
		model.addAttribute("pager",map.get("pager"));
		return;
	}
	
	@GetMapping("add")
	public String getAdd(AccountDTO accountDTO,HttpSession session,Model model)throws Exception {
		int result = wishlistService.setAdd(accountDTO,session);
		model.addAttribute("result",result);
		return "commons/ajaxResult";
	}

}
