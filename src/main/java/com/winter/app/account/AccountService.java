package com.winter.app.account;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;
import com.winter.app.util.Pager;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	
	
	public List<ProductDTO> getList(AccountDTO accountDTO,Pager pager) throws Exception {
		pager.makeRow();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("Pager", pager);
		
		return accountDAO.list(accountDTO);
	}
	
	
	
	
	
	
	public int getAdd(AccountDTO accountDTO,HttpSession session) throws Exception {
	 MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
	 Calendar ca =  Calendar.getInstance();
	 
	 accountDTO.setAccountNum(ca.getTimeInMillis());
	 accountDTO.setUserName(memberDTO.getUserName());
	 int result = accountDAO.add(accountDTO);
	 
	 return  result;
		
	}
}
