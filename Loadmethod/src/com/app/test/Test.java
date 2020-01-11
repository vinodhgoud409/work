package com.app.test;

import org.hibernate.Session;

import com.app.Util.HibernateUtil;
import com.app.model.Employee;

public class Test {
	public static void main(String[] args) {
		try(Session ses=HibernateUtil.getSf().openSession()){
			
			Employee emp=ses.load(Employee.class, 409);
			System.out.println(emp);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
