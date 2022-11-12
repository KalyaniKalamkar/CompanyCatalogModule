package com.Company.CatalogModule;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Service;



@Service
public class UserOperation {

	public String userInfo(UserModule ac) {
		String status="";
		Connection con;
		PreparedStatement pst;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bzrmtozvhz0atspovaxl-mysql.services.clever-cloud.com:3306/bzrmtozvhz0atspovaxl?user=uy2uq2mvfn9z6x1i&password=BN7IqBWBenELiU0VhZI8");

			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogmodule?user=root&password=Kalyani@123");
			pst=con.prepareStatement("insert into custlog values(?,?,?,default);");
			pst.setInt(1, ac.getCustid());
			pst.setString(2,ac.getCustnm());
			pst.setString(3,ac.getPass());
			
			pst.executeUpdate();
			con.close();
			status="success";
		}
		catch(Exception e)
		{
			status="error";
			
		}
		
		
		return status;
		
	}

	public String checkComInfo(UserModule ac) {
		String Status="";
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bzrmtozvhz0atspovaxl-mysql.services.clever-cloud.com:3306/bzrmtozvhz0atspovaxl?user=uy2uq2mvfn9z6x1i&password=BN7IqBWBenELiU0VhZI8");

			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogmodule?user=root&password=Kalyani@123");
			pst=con.prepareStatement("select * from custlog where custid=? and pass=?;");
			pst.setInt(1, ac.getCustid());
			pst.setString(2,ac.getPass());
			
			rs=pst.executeQuery();
			if(rs.next())
			{
				if(rs.getString("usertype").equals("Admin"))
				{
					Status="Admin";
				}
				else
				{
					Status="Customer";
				}
			}
			else
				Status="notfound";
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Status;
	}

	public ArrayList<UserModule> custReport() {
		ArrayList<UserModule> lst=new ArrayList<>();
		UserModule acc;
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bzrmtozvhz0atspovaxl-mysql.services.clever-cloud.com:3306/bzrmtozvhz0atspovaxl?user=uy2uq2mvfn9z6x1i&password=BN7IqBWBenELiU0VhZI8");

			// con=DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogmodule?user=root&password=Kalyani@123");
			pst=con.prepareStatement("select * from custlog;");
			rs=pst.executeQuery();
			
			while(rs.next())
			{
				acc=new UserModule();
				acc.setCustid(rs.getInt("custid"));
				acc.setCustnm(rs.getString("custnm"));
				acc.setPass(rs.getString("pass"));
				acc.setUsertype(rs.getString("usertype"));
				
				lst.add(acc);
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lst;
	}

	
}
