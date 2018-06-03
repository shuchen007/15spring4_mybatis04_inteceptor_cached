package cn.sxt.test;

import cn.sxt.dao.DeptDao;
import cn.sxt.vo.Dept;
import cn.sxt.vo.User;
import org.mybatis.generator.api.ShellRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.dao.UserDao;

public class Test {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = (UserDao)context.getBean("userDao");
//		DeptDao userDao = (DeptDao)context.getBean("deptDao");
		for (int i = 0; i < 10; i++) {
			User u = new User("hao"+i,"sd1"+i,1);
			u.setPagebegin(1);
			u.setPagesize(3);
			userDao.addUser(u);
		}

//		Dept u1 = new Dept();
//		u1.setId(2);
//		u1.setDeptName("sun1");
//		System.out.println(userDao.selectUser(u));
//		System.out.println(userDao.addDept());
//		System.out.println(userDao.updateDept(u1));

		long end = System.currentTimeMillis();
		System.out.println(end-start);//innoDb=161543

		//生成实体
//		args = new String[] { "-configfile", "src\\resources\\mybatis-generator-config.xml", "-overwrite" };
//		ShellRunner.main(args);
	}
}
