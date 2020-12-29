package org.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hcl.model.DbCredentials;
import org.hcl.model.Product;
import org.hcl.util.DbUtil;

public class ProductDaoImpl implements ProductDao {
	DbCredentials credentials = DbUtil.getCredentials();
	@Override
	public List<Product> getAll() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Product> list = new ArrayList<Product>();
		boolean b = false;
		try {
			con = DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUser(), credentials.getPwd());
		if(con!=null) {
			st = con.createStatement();
			rs = st.executeQuery("select * from products");
			while(rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
			}	
		}
		con.close();
		}catch (Exception e) {
			e.printStackTrace();
	}
		return list;

	}
	@Override
	public boolean addProduct(Product product) {
		Connection con = null;
		PreparedStatement pst = null;
		boolean b = false;
		try {
			con = DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUser(), credentials.getPwd());
			if(con!=null) {
				pst = con.prepareStatement("insert into products values(?,?,?,?,?)");
				pst.setInt(1, product.getProductId());
				pst.setString(2, product.getProductName());
				pst.setString(3, product.getImageUrl());
				pst.setString(4, product.getDescription());
				pst.setInt(5, product.getPrice());
				int i = pst.executeUpdate();
				if(i>0) {
					b=true;
				}
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
}
