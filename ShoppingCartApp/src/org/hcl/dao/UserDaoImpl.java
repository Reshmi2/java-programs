package org.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;

import org.apache.catalina.startup.CredentialHandlerRuleSet;
import org.hcl.model.DbCredentials;
import org.hcl.model.User;
import org.hcl.util.DbUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean insert(User user) {
		Connection con = null;
		PreparedStatement pst = null;
		DbCredentials credentials = DbUtil.getCredentials();
		boolean b = false;
		try {
			con = DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUser(), credentials.getPwd());
		if(con!=null) {
			pst = con.prepareStatement("insert into user values(?,?,?,?,?)");
			pst.setInt(1, user.getUserid());
			pst.setString(2, user.getUserName());
			pst.setString(3, user.getPassword());
			pst.setString(4, user.getGender());
			pst.setString(5, user.getDesignation());
			int i = pst.executeUpdate();
			if(i>0) {
				b = true;
			}
		}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean validate(User user) {
		boolean b = false;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		DbCredentials credentials = DbUtil.getCredentials();
		try {
			con = DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUser(), credentials.getPwd());
			if(con!=null) {
				pst = con.prepareStatement("select * from user where username = ? and password = ?");
				pst.setString(1, user.getUserName());
				pst.setString(2, user.getPassword());
				rs = pst.executeQuery();
				b= rs.next();
				con.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b;
	}
	@Override
	public Optional<User> getUserByUsername(String username) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Optional<User> optionalUser = null;
		DbCredentials credentials = DbUtil.getCredentials();
		try {
			con = DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUser(), credentials.getPwd());
			if(con != null) {
				pst = con.prepareStatement("select * from user where username = ?");
				pst.setString(1, username);
				rs = pst.executeQuery();
				rs.next();
				User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				optionalUser = Optional.ofNullable(user);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return optionalUser;
	}

}
