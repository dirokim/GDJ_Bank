package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.winter.app.util.Pager;

@Controller
@RequestMapping(value = "/product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public ModelAndView setList (Pager pager) throws Exception {	
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> ar = productService.serList(pager);
		mv.addObject("list",ar);
		mv.addObject("pager",pager);
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
	@RequestMapping(value="add",method=RequestMethod.POST)
	public ModelAndView getAdd(ProductDTO productDTO)throws Exception{
		int result = productService.serAdd(productDTO);
		String msg = "등록 실패";
		if(result>0) {
			msg = "등록 성공";
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg",msg);
		mv.addObject("path","product/list");
		mv.setViewName("commons/result");
		return mv;
	}
	@RequestMapping(value="update",method=RequestMethod.GET)
	public void setUpdate() throws Exception{
		return;
	}
	@RequestMapping(value="update",method=RequestMethod.POST)
	public ModelAndView getUpdate(ProductDTO productDTO) throws Exception{
		int result = productService.serUpdate(productDTO);
		ModelAndView mv = new ModelAndView();
		String msg = "수정실패";
		if(result>0) {
			msg = "수정 성공";
		}
		mv.addObject("msg",msg);
		mv.addObject("path","product/list");
		mv.setViewName("commons/result");
		return mv;
	}
}
