package com.winter.app.wishlist;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.account.AccountDTO;

@Controller
@RequestMapping(value = "/wishlist/*")
public class WishlistController {
	
	@Autowired
	private WishlistService wishlistService;
	
	@GetMapping("add")
	public String getAdd(AccountDTO accountDTO,HttpSession session,Model model)throws Exception {
		int result = wishlistService.setAdd(accountDTO,session);
		model.addAttribute("result",result);
		return "commons/ajaxResult";
	}

}
