package com.winter.app.product;

import java.util.List;

import com.winter.app.account.AccountDTO;

public class ProductDTO {

	
	private Long productNum;
	private String productName;
	private String productContents;
	private Long productRate;
	private Long productJumsu;
	private Long productCount;
	private Long productSale;
	private List<AccountDTO> accountDTOs;
	
	
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
	public Long getProductRate() {
		return productRate;
	}
	public void setProductRate(Long productRate) {
		this.productRate = productRate;
	}
	public Long getProductJumsu() {
		return productJumsu;
	}
	public void setProductJumsu(Long productJumsu) {
		this.productJumsu = productJumsu;
	}
	public Long getProductCount() {
		return productCount;
	}
	public void setProductCount(Long productCount) {
		this.productCount = productCount;
	}
	public Long getProductSale() {
		return productSale;
	}
	public void setProductSale(Long productSale) {
		this.productSale = productSale;
	}
	public ProductFileDTO getProductFileDTO() {
		return productFileDTO;
	}
	public void setProductFileDTO(ProductFileDTO productFileDTO) {
		this.productFileDTO = productFileDTO;
	}
	public List<AccountDTO> getAccountDTOs() {
		return accountDTOs;
	}
	public void setAccountDTOs(List<AccountDTO> accountDTOs) {
		this.accountDTOs = accountDTOs;
	}
	
	
	
	
	
	
}
