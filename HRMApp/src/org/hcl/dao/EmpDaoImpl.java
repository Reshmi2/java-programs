package org.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;  
import org.hcl.util.DBCredentials;
import org.hcl.model.Emp;
import org.hcl.util.DbUtil;

public class EmpDaoImpl implements EmpDao {
	DBCredentials credentials = DbUtil.getCredentials();

	public List<Emp> getAll() {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Emp> empList = new ArrayList();

		try {
			con = DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if(con!=null) {
				
				pst = con.prepareStatement("select*from emp");
				while(rs.next()) {
				rs = pst.executeQuery();
				empList.add(new Emp(rs.getInt(1), rs.getString(2), rs.getString(3)));
				}
				
				con.close();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return empList;
		
	}
	

}
