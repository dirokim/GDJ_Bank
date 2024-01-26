package com.winter.app.product;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.util.Pager;

@Service
public class ReplyService {

	@Autowired
	private ReplyDAO replyDAO;
	
	public Map<String,Object> setList (ReplyDTO replyDTO,Pager pager) throws Exception {
		Map<String,Object> map = new HashMap<String, Object>();
		Long totalCount = replyDAO.totalCount(replyDTO);
		pager.makeRow();
		pager.setPerPage(5L);
		pager.makePage(totalCount);
		map.put("pager",pager);
		map.put("replyDTO", replyDTO);
		map.put("list",replyDAO.setList(map));
		return map;
				
		
	}
	
		
	public int setReply (ReplyDTO replyDTO) throws Exception { 
		return	replyDAO.setReply(replyDTO);	

	}
}
