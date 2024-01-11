package com.winter.app.product;

import java.util.List;

public class ProductDTO {
	
	private Long productNum;
	private String productName;
	private String productContents;
	private Double productRate;
	private Double productJumsu;
	private List<ProductFileDTO> productFileDTOs;
	private ProductFileDTO productFileDTO;
	
	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductContents() {
		return productContents;
	}
	public void setProductContents(String productContents) {
		this.productContents = productContents;
	}
	public double getProductRate() {
		return productRate;
	}
	public void setProductRate(Double productRate) {
		this.productRate = productRate;
	}
	public double getProductJumsu() {
		return productJumsu;
	}
	public void setProductJumsu(Double productJumsu) {
		this.productJumsu = productJumsu;
	}
	public List<ProductFileDTO> getProductFileDTOs() {
		return productFileDTOs;
	}
	public void setProductFileDTOs(List<ProductFileDTO> productFileDTOs) {
		this.productFileDTOs = productFileDTOs;
	}
	public ProductFileDTO getProductFileDTO() {
		return productFileDTO;
	}
	public void setProductFileDTO(ProductFileDTO productFileDTO) {
		this.productFileDTO = productFileDTO;
	}
	
	
	
	
	
	
}
