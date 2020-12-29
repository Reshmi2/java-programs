package org.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hcl.model.Emp;
import org.springframework.stereotype.Repository;
@Repository
public class EmpDaoImpl implements EmpDao {
	private DataSource src;
	public EmpDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public EmpDaoImpl(DataSource src) {
		super();
		this.src = src;
	}
	
	public DataSource getSrc() {
		return src;
	}

	public void setSrc(DataSource src) {
		this.src = src;
	}

	public List<Emp> getAll() {
		List<Emp> emp = new ArrayList();	
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = src.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("select * from emp");
			while(rs.next()) {
				emp.add(new Emp(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

}
