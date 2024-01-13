package com.winter.app.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE ="com.winter.app.product.ProductDAO." ;
	
	public List<ProductDTO> list() throws Exception {
	return sqlSession.selectList(NAMESPACE+"list");
	}
	
	public ProductDTO detail(ProductDTO productDTO) throws Exception {
	return sqlSession.selectOne(NAMESPACE+"detail", productDTO);
	}
	public int add(ProductDTO productDTO) throws Exception {
	return sqlSession.insert(NAMESPACE+"add",productDTO);
	}
}
