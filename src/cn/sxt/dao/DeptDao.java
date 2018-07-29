package cn.sxt.dao;

import cn.sxt.vo.Dept;
import cn.sxt.vo.User;

import java.util.List;

public interface DeptDao {
	public List<Dept> selectUser(Dept u);
	List<Dept> addDept();
	List<Dept> selectall();
	List<Dept> updateDept(Dept u);
}
