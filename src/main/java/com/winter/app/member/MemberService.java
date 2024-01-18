package com.winter.app.member;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.FileManager;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private ServletContext servletContext;
	
	
	public int getJoin (MemberDTO memberDTO,MultipartFile attachs)throws Exception {
	 int result = memberDAO.joinAdd(memberDTO);
		
		
		FileManager fileManager = new FileManager();
		String path =  servletContext.getRealPath("/resources/upload/avatar");
	
		String fileName = fileManager.fileSave(path, attachs);
		Avatar avatar = new Avatar();
		avatar.setUserName(memberDTO.getUserName());
		avatar.setFileName(fileName);
		avatar.setOriName(attachs.getOriginalFilename());
		 memberDAO.addAvatar(avatar);
		
	
		
		return result;

	}
}
