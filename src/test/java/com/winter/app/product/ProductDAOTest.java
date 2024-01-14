package com.winter.app.product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;

public class ProductDAOTest extends MyTest{

	@Autowired
	private ProductDAO productDAO;
 	
	
 	
//	@Test
//	public void getListTest() throws Exception {
//		productDAO.list();
////		productDAO.
//	 List<ProductDTO>ar=productDAO.list();
//
//		assertNotNull(ar);
//	}
	
	
}
