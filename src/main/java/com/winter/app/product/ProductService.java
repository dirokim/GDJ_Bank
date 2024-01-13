package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO productDAO;
	
	
	public List<ProductDTO> serList() throws Exception {
	 List<ProductDTO> ar = productDAO.list();
	return ar;
	}
	public ProductDTO serDetail(ProductDTO productDTO) throws Exception {
	return productDTO = productDAO.detail(productDTO);
	}
	
}
