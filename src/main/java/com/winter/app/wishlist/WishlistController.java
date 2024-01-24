package com.winter.app.wishlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/wishlist/*")
public class WishlistController {
	
	@Autowired
	private WishlistService wishlistService;
	
	@GetMapping("add")
	public void getAdd()throws Exception {
		wishlistService
		
	}

}
