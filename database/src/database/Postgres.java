package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Postgres {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			String url="jdbc:postgresql://localhost:5432/periodic_table";
			conn = DriverManager.getConnection(url, "postgres", "postgres");
			st = conn.createStatement();
			rs = st.executeQuery("select * from periodic_table limit 5");
			while (rs.next()) {
				System.out.print("Column 2 returned ");
				System.out.println(rs.getString(2));
			}
			conn.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Success");
		}
	}

}
