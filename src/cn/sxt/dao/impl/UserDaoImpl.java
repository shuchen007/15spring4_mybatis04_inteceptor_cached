package cn.sxt.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import cn.sxt.dao.UserDao;
import cn.sxt.vo.User;

public class UserDaoImpl implements UserDao{
	private SqlSessionTemplate sqlSession;
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<User> selectUser(User u) {
		return sqlSession.selectList("cn.sxt.vo.user.mapper.selectAll",u);
	}

	@Override
	public List<User> addUser(User u) {
//		Map map = new HashMap();
//		map.put("name", "sun");
//		map.put("pwd", "fd");

		sqlSession.insert("cn.sxt.vo.user.mapper.add",u);
		return sqlSession.selectList("cn.sxt.vo.user.mapper.selectAll",u);
	}

}
