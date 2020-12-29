package org.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

import org.hcl.model.DbCredentials;
import org.hcl.model.Emp;
import org.hcl.util.DbUtil;

public class EmpdaoImpl implements EmpDao {

	@Override
	public boolean insert(Emp e) {
		Connection con = null;
		PreparedStatement pst = null;
		boolean b = false;
		DbCredentials credentials = DbUtil.getCredentials();
		try {
			con = DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if (con!= null) {
				pst = con.prepareStatement("insert into emp values(?,?,?)");
				pst.setInt(1, e.getEno());
				pst.setString(2, e.getEname());
				pst.setString(3, e.getAddress());
				int i = pst.executeUpdate();
				if(i>0) {
					b = true;
					System.out.println("succesfully inserted");
				}
				con.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	
		return b;
	}

	@Override
	public boolean delete(int eno, Emp e) {
		Connection con =null;
		PreparedStatement pst = null;
		boolean b = false;
		DbCredentials credentials = DbUtil.getCredentials();
		try {
			con = DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			pst = con.prepareStatement("delete from emp where eno =?");
			pst.setInt(1, eno);
			int i = pst.executeUpdate();
			if (i >0) {
				b = true;
				System.out.println("Successfully deleted");
			}
			con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		return false;
	}
	@Override
	public Optional<Emp> get(int eno) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		DbCredentials credentials = DbUtil.getCredentials();
		Optional<Emp> empOptional = null;
		Emp e = null;
		try {
			con =DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			pst = con.prepareStatement("select * from emp where eno =?");
			pst.setInt(1, eno);
			rs = pst.executeQuery();
			rs.next();
			e = new Emp(rs.getInt(1), rs.getString(2), rs.getString(3));
			empOptional = Optional.ofNullable(e);
			con.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return empOptional;
	}

}
