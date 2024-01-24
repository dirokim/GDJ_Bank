package com.winter.app.wishlist;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.account.AccountDTO;
import com.winter.app.member.MemberDTO;

@Service
public class WishlistService {
	
	@Autowired
	private WishlistDAO wishlistDAO;
	
	public int setAdd(AccountDTO accountDTO,HttpSession session) throws Exception {
	 	MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
	 	accountDTO.setUserName(memberDTO.getUserName());
		
		return wishlistDAO.add(accountDTO);
	}
}
