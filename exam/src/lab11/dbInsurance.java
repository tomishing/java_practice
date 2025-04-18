package lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class dbInsurance {
	private String ins;
	private int cost;
	private boolean op;
	private boolean op1;

	public dbInsurance(String ins, int cost, boolean op, boolean op1) {
		this.ins = ins;
		this.cost = cost;
		this.op = op;
		this.op1 = op1;
	}

	public void insertTable() {
		String url = "jdbc:postgresql://localhost:5432/climate";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
				Statement st = conn.createStatement()) {
			st.executeUpdate("DROP TABLE IF EXISTS insurance");

			// Create table
			st.executeUpdate("""
					CREATE TABLE insurance (
					id serial primary key,
					Insurance varchar(20),
					Dental varchar(20),
					Vision varchar(20),
					price int)
					""");
			
			// parametize 
			PreparedStatement ps = conn.prepareStatement("""
					insert into insurance (Insurance, Dental, Vision, price)
					values (?,?,?,?)
					""");
			ps.setString(1, ins);
			ps.setString(2,  op ? "Yes":"NO");
			ps.setString(3,  op1 ? "Yes":"NO");
			ps.setInt(4,  cost);
			ps.executeUpdate();
			System.out.println("Data inserted successfully.");
			ps.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
