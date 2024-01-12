package com.winter.app.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/product/*")
public class ProductController {
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public void getList ( ) throws Exception {
		
		return ;
	}
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public void getDetail() throws Exception {
		
		return;
	}
	@RequestMapping(value="add",method=RequestMethod.GET)
	public void getAdd()throws Exception {
		
		return;
	}
//	@RequestMapping(value="add",method=RequestMethod.POST)
//	public String getAdd()throws Exception{
//		return "produt/list";
//	}
//	@RequestMapping(value="update",method=RequestMethod.GET)
//	public void getUpdate() throws Exception{
//		return;
//	}
//	@RequestMapping(value="update",method=RequestMethod.POST)
//	public void getUpdate() throws Excteption{
//		
//	}
}
