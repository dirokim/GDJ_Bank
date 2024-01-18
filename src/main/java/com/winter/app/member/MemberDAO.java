package com.winter.app.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.winter.app.member.MemberDAO.";
	
	public int joinAdd (MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"joinAdd",memberDTO);	
	}
	public int addAvatar (Avatar avatar) throws Exception {
		return sqlSession.insert(NAMESPACE+"addAvatar",avatar);
	}
	

}
