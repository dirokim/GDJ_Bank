package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.Pager;




@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSeesion;
	private final String NAMESPACE = "com.winter.app.product.ProductDAO.";
	
	
	//c리스트 r추가 u수정하기 d삭제하기 
	public int delete(ProductDTO productDTO) throws Exception {
		return sqlSeesion.delete(NAMESPACE+"delete",productDTO);
		
	}
	public int update(ProductDTO productDTO) throws Exception {
		return sqlSeesion.update(NAMESPACE+"update",productDTO);
		
	}
	public int add(ProductDTO productDTO) throws Exception{
		return	sqlSeesion.insert(NAMESPACE+"add",productDTO);
		
	}
	
	
	public ProductDTO detail(ProductDTO productDTO) throws Exception{
		 return  sqlSeesion.selectOne(NAMESPACE+"detail",productDTO);
	}
	
	public List<ProductDTO> list(Pager pager) throws Exception{
		return	 sqlSeesion.selectList(NAMESPACE+"list",pager);
	}
}
