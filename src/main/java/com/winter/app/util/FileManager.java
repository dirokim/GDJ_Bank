package com.winter.app.util;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {
	

	public String fileSave(String path,MultipartFile file) throws Exception {
		System.out.println(path);
	File f = new File(path);
		if(f.exists()) { 
		}else {
			f.mkdirs();
		}
		Calendar ca =  Calendar.getInstance();
		String fileName = ca.getTimeInMillis()+"_"+file.getOriginalFilename();
		f = new File(f,fileName);
		FileCopyUtils.copy(file.getBytes(), f);
		return fileName;	
	}
}
