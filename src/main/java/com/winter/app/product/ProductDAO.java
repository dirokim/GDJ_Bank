package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSeesion;
	private final String namespace = "com.winter.app.product.";
	
	
	//c리스트 r추가 u수정하기 d삭제하기 
	public int delete(ProductDTO productDTO) throws Exception {
		return sqlSeesion.delete(namespace+"delete",productDTO);
		
	}
	public int update(ProductDTO productDTO) throws Exception {
		return sqlSeesion.update(namespace+"update",productDTO);
		
	}
	public int add(ProductDTO productDTO) throws Exception{
		return	sqlSeesion.insert(namespace+"add",productDTO);
		
	}
	
	
	public ProductDTO detail(ProductDTO productDTO) throws Exception{
		 return  sqlSeesion.selectOne(namespace+"detail",productDTO);
	}
	
	public List<ProductDTO> list() throws Exception{
		return	 sqlSeesion.selectList(namespace+"lsit");
	}
}
