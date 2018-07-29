package cn.sxt.test;

import cn.sxt.dao.DeptDao;
import cn.sxt.vo.Dept;
import cn.sxt.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.dao.UserDao;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		UserDao userDao = (UserDao)context.getBean("userDao");
		DeptDao userDao = (DeptDao)context.getBean("deptDao");
//		List<User> list = new ArrayList();
//		for (int i = 0; i < 10000; i++) {
//			User u = new User("hao"+i,"sd1"+i,1);
//			u.setPagebegin(1);
//			u.setPagesize(3);
//			list.add(u);
//		}
//		for (int i = 0; i < 10000; i+=1000) {
////			userDao.addUser(u);
////			insertData(list.subList(i,i+1000));
//			MyThread t1 = new MyThread(list.subList(i,i+1000));
//			Thread t11 = new Thread(t1);
//			t11.start();
//			try {
//				t11.wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}


		Dept u1 = new Dept();
		u1.setId(2);
		u1.setDeptName("sun1");
		System.out.println(userDao.selectall());
//		System.out.println(userDao.s);
		System.out.println(userDao.addDept());
//		System.out.println(userDao.updateDept(u1));

		long end = System.currentTimeMillis();
		System.out.println(end-start);//innoDb=161543

		//生成实体
//		args = new String[] { "-configfile", "src\\resources\\mybatis-generator-config.xml", "-overwrite" };
//		ShellRunner.main(args);
	}

	static class MyThread implements Runnable {
		public MyThread() {
		}

		private List<User> list1;

		public MyThread(List<User> list) {
			this.list1 = list;
		}

		@Override
		public void run() {
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			UserDao userDao = (UserDao) context.getBean("userDao");
			for (int i = 0; i < list1.size(); i++) {
				userDao.addUser(list1.get(i));
			}
		}
	}
	static void insertData(final List<User> list){
		new Thread(new Runnable() {
			@Override
			public void run() {
				ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
				UserDao userDao = (UserDao)context.getBean("userDao");
				for (int i = 0; i < list.size(); i++) {
					userDao.addUser(list.get(i));
				}
			}
		}).start();
	}

}
