package cn.sxt.dao;

import java.util.List;

import cn.sxt.vo.User;

public interface UserDao {
	public List<User> selectUser(User u);
	List<User> addUser(User u);
}
