package com.winter.app.product;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.winter.app.util.Pager;

@Controller
@RequestMapping(value="/product/*")
public class ProductController {
	

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String delete(ProductDTO productDTO , Model model) throws Exception {
	 int result =productService.getDelete(productDTO);
	 String message = "삭제 실패";
	 if(result>0) {
		 message="삭제 성공";
		 model.addAttribute("msg",message);
		 model.addAttribute("path", "./list");
		  }
	 
	 return "commons/result";
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public ModelAndView update(ProductDTO productDTO,ModelAndView mv) throws Exception {
		int result = productService.getUpdate(productDTO);
		String message = "수정 실패";
		if(result>0) {
			message = "수정 성공";		
			}
		mv.addObject("msg",message);
		mv.addObject("path","./list");
		
		mv.setViewName("commons/result");
		return mv;
	}
	
	@RequestMapping(value="update",method=RequestMethod.GET)
	public void update (ProductDTO productDTO,Model model) throws Exception {
		productDTO = productService.getDetail(productDTO);
		model.addAttribute("dto",productDTO);
	}
	
	
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(ProductDTO productDTO,Model model) throws Exception {
		int result = productService.getAdd(productDTO);
	
		 String msg = "추가 실패";
		 if(result>0) {
			 msg="추가 성공";
		 }
		 model.addAttribute("msg",msg);
		 model.addAttribute("path", "./list");
		 return "commons/result";
	}
	

	
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public String detail(Long productNum,Model model) throws Exception {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductNum(productNum);
		productDTO = productService.getDetail(productDTO);
		model.addAttribute("dto",productDTO);
		return "product/detail";	
	}
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public ModelAndView List(Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> ar = productService.getList(pager);
		mv.addObject("pager",pager);
		mv.addObject("list",ar);
		mv.setViewName("product/list");
		return mv;
	}
}
