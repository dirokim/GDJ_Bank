package com.winter.app.product;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.Pager;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private ServletContext servletContext;
	
	
	
	public int getDelete (ProductDTO productDTO) throws Exception {
		return productDAO.delete(productDTO);
	}
	
	
	public int getUpdate(ProductDTO prodcutDTO) throws Exception {
		return productDAO.update(prodcutDTO);
	}
	
	
	public int getAdd(ProductDTO productDTO,MultipartFile file) throws Exception {
		  productDAO.add(productDTO);
	
	String path = servletContext.getRealPath("/resources/upload");
		System.out.println(path);
		File f = new File(path,"product");
		
		if(f.exists()) {
			
		}else {
			f.mkdirs();
		}
	
		Calendar ca =  Calendar.getInstance();
		String filename = ca.getTimeInMillis()+"_"+file.getOriginalFilename();
		f = new File(f,filename);
		FileCopyUtils.copy(file.getBytes(), f);
		
		ProductFileDTO dto = new ProductFileDTO();
		dto.setProductNum(productDTO.getProductNum());
		dto.setFileName(filename);
		dto.setOriName(file.getOriginalFilename());
		
		
				int result = productDAO.addFile(dto);
				return result;
	}
	
	





	public ProductDTO getDetail (ProductDTO productDTO) throws Exception {
		return productDAO.detail(productDTO);
	}
	
	public List<ProductDTO> getList(Pager pager) throws Exception {
		pager.makeRow();
		Long totalCount = productDAO.total();
		pager.makeNum(totalCount);
		List<ProductDTO>ar = productDAO.list(pager);
		
		return ar;
	}


	public ServletContext getServletContext() {
		return servletContext;
	}


	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
	
}
