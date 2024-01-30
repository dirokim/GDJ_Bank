package com.winter.app.interceptors;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.winter.app.member.MemberDTO;
import com.winter.app.member.role.RoleDTO;

@Component
public class AdminCheckInterceptor extends HandlerInterceptorAdapter{

	
	//컨트롤러 진입전 
	//컨트롤러 나갈떄
	//jsp 만들고 난다음에
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		MemberDTO memberDTO =  (MemberDTO)request.getSession().getAttribute("member");
		List<RoleDTO> ar = memberDTO.getRoleDTOs();
		System.out.println("관리자 권한 체크 인터셉터");
		for(RoleDTO r : ar) {
			if(r.getRoleName().equals("ROLE_ADMIN")) {
				System.out.println("관리자 권한입니다");
				request.setAttribute("msg", "관리자 권한인 필요합니다");
				request.setAttribute("path", "/");
				return true;
			}else {
				return false;
			}
			
			
		}
		System.out.println("관리자 권한입니다");
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/commons/result.jsp");
		view.forward(request, response);
		return super.preHandle(request, response, handler);
	}
	
	
}
