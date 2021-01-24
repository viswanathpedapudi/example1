import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class testing {

	public static void main(String[] args) throws SQLException 
	{
		
		Connection cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/chapter1","root","9347370743");
		Statement stmm = cons.createStatement();
		String s ="select book_name from books where book_id='102'";
		stmm.execute(s);
		cons.close();
		

	

}}
