package cn.sxt.vo;

import cn.sxt.util.Common;

public class User extends Common
{
	public User() {
	}

	public User(String name, String pwd, int deptId) {
		this.name = name;
		this.pwd = pwd;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", pwd='" + pwd + '\'' +
				", deptId=" + deptId +
				'}';
	}

	private int id;
	private String name;
	private String pwd;
	private int deptId;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
}
