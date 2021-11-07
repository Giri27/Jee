package com.xworkz.trainee.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TraineeDAO {
	
	private String url = "jdbc:mysql://localhost:3306/jee";
	private String username = "root";
	private String password = "giri@123";
	private String dbDriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String insert(Trainee trainee) {
		
		Connection con = getConnection();
		String result = "Data entered Successfully";
		String sql = "insert into jee.xworkztrainee values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, trainee.getName());
			ps.setString(2, trainee.getType());
			ps.setString(3, trainee.getYop());
			ps.setString(4, trainee.getEducation());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result = "Enter the data again";
		}
		return sql;
	}

}
