package praktika;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
// import java.sql.Statement;


public class Praktikum1 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@ora14.informatik.haw-hamburg.de:1521:inf14","acm474","PW");
			
/*			Statement statement = connection.createStatement();
			int update = statement.executeUpdate("insert into first_program values(1, 'acm474','PW')");
			System.out.println(update+" Row Inserted"); */
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
