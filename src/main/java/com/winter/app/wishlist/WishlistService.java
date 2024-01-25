package com.winter.app.wishlist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.account.AccountDTO;
import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;
import com.winter.app.util.Pager;

@Service
public class WishlistService {
	
	@Autowired
	private WishlistDAO wishlistDAO;
	
	public Map<String,Object> setList(AccountDTO accountDTO,HttpSession session,Pager pager) throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setUserName(memberDTO.getUserName());
		pager.makeRow();
		Long totalCount = wishlistDAO.totalCount(accountDTO);
		pager.makePage(totalCount);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pager", pager);
		map.put("accountDTO", accountDTO);
		map.put("list", wishlistDAO.list(map));
		return map;	
	}
	
	public int setAdd(AccountDTO accountDTO,HttpSession session) throws Exception {
	 	MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
	 	accountDTO.setUserName(memberDTO.getUserName());
		
		return wishlistDAO.add(accountDTO);
	}
}
