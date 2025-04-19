package lab12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class dbLaos {
	private int member;
	private String room;
	private boolean breakfast;
	private String language;
	private String province;

	public dbLaos(int member, String room, boolean breakfast, String language, String province) {
		this.member = member;
		this.room = room;
		this.breakfast = breakfast;
		this.language = language;
		this.province = province;
	}

	public void insertTable() {
		String url = "jdbc:postgresql://localhost:5432/climate";
		String sql_createtable = ("""
				CREATE TABLE if not exists hotels (
					id serial primary key,
					member int,
					room varchar(20),
					breakfast varchar(20),
					language varchar(50),
					province varchar(50))

				""");
		String sql_insert = ("""
				insert into hotels (member, room, breakfast, language, province)
					values (?,?,?,?,?)
				""");
		try (Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
				Statement st = conn.createStatement()) {

			st.executeUpdate(sql_createtable);

			try (PreparedStatement ps = conn.prepareStatement(sql_insert)) {
				ps.setInt(1, member);
				ps.setString(2, room);
				ps.setString(3, breakfast ? "Yes" : "NO");
				ps.setString(4, language);
				ps.setString(5, province);
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			System.out.println("Database error: " + e.getMessage());
		}
	}

	public void displayTable() {
		String sql = "select * from hotels";
		String url = "jdbc:postgresql://localhost:5432/climate";
		try (Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
				Statement st = conn.createStatement()) {

			try (ResultSet rs = st.executeQuery(sql)) {
				while (rs.next()) {
					System.out.println(rs.getInt(member) + " " + rs.getString(language));
				}
			}

		} catch (SQLException sq) {
			JOptionPane.showMessageDialog(null, sq);

		}
	}

}
