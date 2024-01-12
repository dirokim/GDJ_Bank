package com.winter.app.product;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE ="com.winter.app.product.productDAO." ;
	
	public void list() {
		sqlSession.selectList(NAMESPACE+"");
	}
	
}
