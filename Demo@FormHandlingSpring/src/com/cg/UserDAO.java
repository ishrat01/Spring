package com.cg;


import javax.sql.DataSource;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.WebApplicationContext;
@Repository
public class UserDAO {

	DataSource datasource ;

	public void setDatasource(DataSource datasource) {
		System.out.println("I am being set");
		this.datasource = datasource;
	}
	
	public void addUser(UserDAO userdao)
	{
		
		if(datasource!=null)
		{
			System.out.println("Data Source Initialised");
		}
		
//		try {
//			Connection con=datasource.getConnection() ;
//			PreparedStatement insert=con.prepareStatement("") ;
//			insert.executeUpdate() ;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
