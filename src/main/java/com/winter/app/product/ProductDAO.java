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
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.winter.app.product.ProductDAO.";
	
	
	//c리스트 r추가 u수정하기 d삭제하기 
	public int delete(ProductDTO productDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"delete",productDTO);
		
	}
	public int update(ProductDTO productDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"update",productDTO);
		
	}
	public int addFile(ProductFileDTO productFileDTO)throws Exception {
		return sqlSession.insert(NAMESPACE+"addFile",productFileDTO);
	}
	public int add(ProductDTO productDTO) throws Exception{
		return	sqlSession.insert(NAMESPACE+"add",productDTO);
		
	}
	
	public List<ProductFileDTO> getListFile(ProductDTO productDTO) throws Exception {
		return sqlSession.selectList(NAMESPACE+"getListFile",productDTO);
	}
	
	public productDTO detail(ProductDTO productDTO) throws Exception{
		 return  sqlSession.selectList(NAMESPACE+"detail",productDTO);
	}
	
	public List<ProductDTO> list(Pager pager) throws Exception{
		return	 sqlSession.selectList(NAMESPACE+"list",pager);
	}
	public Long total() throws Exception {
		return sqlSession.selectOne(NAMESPACE+"total");
	}
}
