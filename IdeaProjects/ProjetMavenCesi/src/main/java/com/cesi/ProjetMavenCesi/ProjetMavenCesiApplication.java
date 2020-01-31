package com.cesi.ProjetMavenCesi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.*;

@SpringBootApplication
public class ProjetMavenCesiApplication {

	public static void main(String[] args) throws SQLException  {
		SpringApplication.run(ProjetMavenCesiApplication.class, args);

		//create connection for a server installed in localhost, with a user "root" with no password
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://website.cnhcdpqyyuwr.eu-west-3.rds.amazonaws.com:3306", "nahjy", "251197")) {
			// create a Statement
			try (Statement stmt = conn.createStatement()) {
				//execute query
				try (ResultSet rs = stmt.executeQuery("SELECT 'Hello World!'")) {
					//position result to first
					rs.first();
					System.out.println(rs.getString(1)); //result is "Hello World!"
				}
			}
		}
	}
}