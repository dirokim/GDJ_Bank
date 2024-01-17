package com.winter.app.product;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.FileManager;
import com.winter.app.util.Pager;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private ServletContext servletContext; 
	@Autowired
	private FileManager fileManager;
	
	public List<ProductDTO> serList(Pager pager) throws Exception {
		pager.makeRow();
		Long totalCount = productDAO.getTotal();
		pager.makePage(totalCount);
		List<ProductDTO> ar = this.productDAO.list(pager);
	return ar;
	}
	
	public ProductDTO serDetail(ProductDTO productDTO) throws Exception {
	return productDTO = productDAO.detail(productDTO);
	}
	
	public int serAdd(ProductDTO productDTO,MultipartFile file) throws Exception {
	int result = productDAO.add(productDTO);
		String path = servletContext.getRealPath("/resources/upload/product");
		String fileName = fileManager.fileSave(path,file);
		
		
		
	return 	result;
	}
	
	public int serUpdate(ProductDTO produtDTO) throws Exception{
	int result = productDAO.update(produtDTO);
		return result;
	}
}
