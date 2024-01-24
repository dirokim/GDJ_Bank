package com.winter.app.wishlist;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WishlistDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE ="com.winter.app.wishlist.WishlistDAO.";
	
}
