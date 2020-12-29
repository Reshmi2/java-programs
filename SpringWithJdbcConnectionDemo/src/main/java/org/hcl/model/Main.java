package org.hcl.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hcl.config.AppConfig;
import org.hcl.model.Emp;
import org.hcl.service.EmpService;
import org.hcl.service.EmpServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {
		/*for the xml based configuration
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring-bean.xml"); EmpService service =
		 * context.getBean("EmpService", EmpServiceImpl.class); List<Emp> emp =
		 * service.getEmployees(); emp.stream().forEach(e ->{
		 * System.out.println("The employee id is "+e.getEno()
		 * +"\n The employee name is "+e.getName()+"\n and the address is "+e.getAddress
		 * ()); });
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DataSource datasource = (DataSource) context.getBean("datasource");
		Connection con = datasource.getConnection();
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println(dbmd.getDatabaseProductVersion());
	}

}
