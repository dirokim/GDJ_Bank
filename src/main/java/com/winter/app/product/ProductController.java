package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public ModelAndView setList ( ) throws Exception {	
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> ar = productService.serList();
		mv.addObject("list",ar);
		mv.setViewName("product/list");
		return mv;
	}
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public ModelAndView setDetail(ProductDTO productDTO) throws Exception {
		productDTO = productService.serDetail(productDTO);
		ModelAndView mv = new ModelAndView();
		mv.addObject("dto",productDTO);
		mv.setViewName("product/detail");
		return mv;
	}
	@RequestMapping(value="add",method=RequestMethod.GET)
	public void setAdd()throws Exception {
		
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
