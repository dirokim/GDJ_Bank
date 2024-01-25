package com.winter.app.wishlist;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.account.AccountDTO;
import com.winter.app.product.ProductDTO;

@Repository
public class WishlistDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE ="com.winter.app.wishlist.WishlistDAO.";

	public int delete (Map<String,Object> map) {
		return sqlSession.delete(NAMESPACE+"delete",map);
	}
	
	public Long totalCount (AccountDTO accountDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"totalCount",accountDTO);
	}
	
	public List<ProductDTO> list (Map<String,Object> map) throws Exception {	
		return sqlSession.selectList(NAMESPACE+"list",map);
	}
	
	public int add(AccountDTO accountDTO)throws Exception {
		return sqlSession.insert(NAMESPACE+"add",accountDTO);
	}
	
	
}
