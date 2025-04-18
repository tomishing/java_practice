package lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbBook {
	private String title;
	private double price;
	private String genre;

	public dbBook(String title, double price, String genre) {
		this.title = title;
		this.price = price;
		this.genre = genre;
	}

	public dbBook() {
	}

	public void insertTable() {
		String url = "jdbc:postgresql://localhost:5432/climate";
		String sql_createtable = """
				create table if not exists booklist (
				id serial primary key,
				name varchar(100),
				genre varchar(150),
				price numeric(10,2)
				)
				""";
		String sql_insert = """
				insert into booklist (name, genre, price)
				values (?,?,?)
				""";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
				Statement st = conn.createStatement()) {

			st.executeUpdate(sql_createtable);

			try (PreparedStatement ps = conn.prepareStatement(sql_insert)) {
				ps.setString(1, title);
				ps.setString(2, genre);
				ps.setDouble(3, price);
				ps.executeUpdate();
			}

		} catch (SQLException e) {
			System.out.println("Database error: " + e.getMessage());
		}
	}

	public void displayTable() {
		String url = "jdbc:postgresql://localhost:5432/climate";
		String sql = "select * from booklist";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
				Statement st = conn.createStatement()) {

			try (ResultSet rs = st.executeQuery(sql)) {
				while (rs.next()) {
					System.out
							.println(rs.getString("name") + " " + rs.getString("genre") + " " + rs.getDouble("price"));
				}
			}

		} catch (SQLException e) {
			System.out.println("Display error: " + e.getMessage());
		}
	}

}
