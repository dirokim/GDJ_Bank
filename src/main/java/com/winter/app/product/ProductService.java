package com.winter.app.product;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
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
	
	
	
	public int getDelete (ProductDTO productDTO) throws Exception {
		List<ProductFileDTO> ar = productDAO.getListFile(productDTO);
		int result = productDAO.delete(productDTO);
		
		for(ProductFileDTO f: ar) {
		String path = servletContext.getRealPath("resources/upload/product");
			fileManager.fileDelete(path,f.getFileName());
		}
		
		//db 삭제 
		return result;
	}
	
	
	public int getUpdate(ProductDTO prodcutDTO) throws Exception {
		return productDAO.update(prodcutDTO);
	}
	
	
	public int getAdd(ProductDTO productDTO,MultipartFile[]file) throws Exception {
		  productDAO.add(productDTO);
	
	String path = servletContext.getRealPath("/resources/upload/product");	
	FileManager fileManager = new FileManager();
	
	for(MultipartFile f : file) {
			if(f.isEmpty()) {
			 continue;
			}
		String fileName = fileManager.fileSave(path,f); // 파일저장
		ProductFileDTO dto = new ProductFileDTO();
		dto.setProductNum(productDTO.getProductNum());  // db 정보저장
		dto.setFileName(fileName);
		dto.setOriName(f.getOriginalFilename());
		productDAO.addFile(dto);		
	}
	
	return 1;
	}
	
	public ProductDTO getDetail (ProductDTO productDTO) throws Exception {
		return   productDAO.detail(productDTO);
		
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
