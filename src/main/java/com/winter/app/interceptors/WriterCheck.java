package com.winter.app.interceptors;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


import com.winter.app.board.BoardDTO;
import com.winter.app.board.notice.NoticeDAO;
import com.winter.app.board.qna.QnaDAO;
import com.winter.app.member.MemberDTO;

@Component
public class WriterCheck extends HandlerInterceptorAdapter {
	//작성자가 맞는지 판단
	
	
	@Autowired
	private NoticeDAO noticeDAO;
	@Autowired
	private QnaDAO qnaDAO;
	
	
	/*
	 * @Override public boolean preHandle(HttpServletRequest request,
	 * HttpServletResponse response, Object handler) throws Exception { String path
	 * = request.getRequestURI(); path = path.substring(0,path.lastIndexOf("/"));
	 * //num Long n = Long.parseLong(request.getParameter("boardNum")); BoardDTO
	 * boardDTO = new BoardDTO(); boardDTO.setNoticeNum(n);
	 * 
	 * if(path.equals("/qna")) { boardDTO = qnaDAO.getDetail(boardDTO); }else {
	 * boardDTO = noticeDAO.getDetail(boardDTO); } MemberDTO memberDTO =
	 * (MemberDTO)request.getSession().getAttribute("member");
	 * if(boardDTO.getNoticeWriter().equals(memberDTO.getUserName())) { return true
	 * ; }else { RequestDispatcher v =
	 * request.getRequestDispatcher("/WEB-INF/views/commons/result.jsp");
	 * v.forward(request, response); request.setAttribute("path", "./list");
	 * request.setAttribute("msg", "작성자만 가능합니다"); return false; }
	 * 
	 * }
	 */
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		String method = request.getMethod();
				
		if(method.toUpperCase().equals("POST")) {
			return;
		};
		Map<String,Object> map = modelAndView.getModel();
		/* Iterator<String>it = map.keySet().iterator(); */
		BoardDTO boardDTO = (BoardDTO)map.get("boardDTO");
		MemberDTO memberDTO = (MemberDTO)request.getSession().getAttribute("member");
		if(!boardDTO.getNoticeWriter().equals(memberDTO.getUserName())) {
			modelAndView.addObject("msg","작성자만 가능합니다.");
			modelAndView.addObject("path","./list");
			modelAndView.setViewName("commons/result");
		}
		System.out.println(modelAndView.getViewName());
		
		
		
	}
}
