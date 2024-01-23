package com.winter.app.account;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	
	public List<ProductDTO> getList(AccountDTO accountDTO) throws Exception {
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
