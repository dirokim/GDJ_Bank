package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
		
	public Integer getDelete (ProductDTO productDTO) throws Exception {
		return productDAO.delete(productDTO);
	}
	
	
	public Integer getUpdate(ProductDTO prodcutDTO) throws Exception {
		return productDAO.update(prodcutDTO);
	}
	
	
	public Integer getAdd(ProductDTO productDTO) throws Exception {
	return productDAO.add(productDTO);
	}
	
	public ProductDTO getDetail (ProductDTO productDTO) throws Exception {
		return productDAO.detail(productDTO);
	}
	
	public List<ProductDTO> getList() throws Exception {
		List<ProductDTO>ar = productDAO.list();
		return ar;
	}
}
