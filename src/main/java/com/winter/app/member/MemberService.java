package com.winter.app.member;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

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
	
	
	
	
	public void getUpdate (MemberDTO memberDTO) throws Exception {
		memberDAO.setUpdate(memberDTO);
	}
	
	public MemberDTO getLogin (MemberDTO memberDTO) throws Exception {
		MemberDTO m = memberDAO.getDetail(memberDTO);
		 
		if(m!=null) {
			 if(m.getPassword().equals(memberDTO.getPassword())) {
				 
				 return m;
			 }else {
				 m = null;
			 }
		 }
		return m;

	}
	
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
