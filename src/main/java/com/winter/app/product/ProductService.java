package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.util.Pager;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
		
	public int getDelete (ProductDTO productDTO) throws Exception {
		return productDAO.delete(productDTO);
	}
	
	
	public int getUpdate(ProductDTO prodcutDTO) throws Exception {
		return productDAO.update(prodcutDTO);
	}
	
	
	public int getAdd(ProductDTO productDTO) throws Exception {
	return productDAO.add(productDTO);
	}
	
	public ProductDTO getDetail (ProductDTO productDTO) throws Exception {
		return productDAO.detail(productDTO);
	}
	
	public List<ProductDTO> getList(Pager pager) throws Exception {
		pager.makeRow();
		List<ProductDTO>ar = productDAO.list(pager);
		
		return ar;
	}
}
