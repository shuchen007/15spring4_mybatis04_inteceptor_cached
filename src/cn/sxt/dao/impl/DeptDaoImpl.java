package cn.sxt.dao.impl;

import cn.sxt.dao.DeptDao;
import cn.sxt.dao.UserDao;
import cn.sxt.vo.Dept;
import cn.sxt.vo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class DeptDaoImpl implements DeptDao {
	private SqlSessionTemplate sqlSession;
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<Dept> selectUser(Dept u) {
		return sqlSession.selectList("cn.sxt.vo.user.mapper.selectAll",u);
	}

	@Override
	public List<Dept> addDept() {
//		Map map = new HashMap();
//		map.put("name", "sun");
//		map.put("pwd", "fd");
		Dept user = new Dept("hineses","liujun");
		sqlSession.insert("cn.sxt.vo.dept.mapper.add",user);
		return sqlSession.selectList("cn.sxt.vo.dept.mapper.selectAll");
	}

	@Override
	public List<Dept> updateDept(Dept u) {
		sqlSession.update("cn.sxt.vo.dept.mapper.update",u);
		return sqlSession.selectList("cn.sxt.vo.dept.mapper.selectAll");
	}

}
