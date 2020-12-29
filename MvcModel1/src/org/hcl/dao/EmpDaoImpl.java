package org.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hcl.model.DbCredentials;
import org.hcl.model.Emp;
import org.hcl.util.DbUtil;

public class EmpDaoImpl implements EmpDao {
		
	@Override
	public List<Emp> getEmployees() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Emp> employees = new ArrayList<Emp>();
		boolean b = true;
		DbCredentials credentials =DbUtil.getCredentials(); 
		try {
			con = DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if (con != null) {
			st = con.createStatement();
			rs = st.executeQuery("select * from emp");
			while(rs.next()) {
				employees.add(new Emp(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}	
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return employees;
	}

}
