package com.winter.app.product;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.winter.app.product.ReplyDAO.";
	
	
	
	public int setDelete (ReplyDTO replyDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"setDelete",replyDTO);
	}
	
	public Long totalCount (ReplyDTO replyDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"totalCount",replyDTO);
	}
	
	public List<ReplyDTO> setList(Map<String,Object> map) throws Exception {
		return sqlSession.selectList(NAMESPACE+"setList",map);
	}
	
	public int setReply(ReplyDTO replyDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setReply",replyDTO);
				
	}
	
}
