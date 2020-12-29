package org.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SetterInjection-Bean.xml");
		Emp e = context.getBean(Emp.class);
		System.out.println("The employee id is "+e.getEno()+"\n The employee name is "+e.getEname()+"\n and the address is "+e.getAddress());
		ApplicationContext context1 = new ClassPathXmlApplicationContext("ConstructorInjection-Bean.xml");
		Emp e1 = context.getBean(Emp.class);
		System.out.println("The employee id is "+e1.getEno()+"\n The employee name is "+e1.getEname()+"\n and the address is "+e1.getAddress());

	}

}
