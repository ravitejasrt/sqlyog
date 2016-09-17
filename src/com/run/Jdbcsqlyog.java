package com.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbcsqlyog {

	public static void main(String[] args) {
      try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Apad12@98");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("SELECT actor_id,first_name,last_name,last_update FROM `sakila`.actor");
	    while(rs.next()){
	    	String actid=rs.getString("actor_id");
	    	String fstname=rs.getString("first_name");
	    	String lstname=rs.getString("last_name");
	    	String lup=rs.getString("last_update");
	    	System.out.println(actid+" "+fstname+" "+lstname+" "+lup);
	    }
      
      } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}

}
