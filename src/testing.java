import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class testing {

	public static void main(String[] args) throws SQLException 
	{
		
		Connection cons = DriverManager.getConnection("com.mysql.jdbc.Driver");
		Statement stmm = cons.createStatement();
		String s ="UPDATE bujjikam SET age=16 WHERE namee='ramya'";
		stmm.execute(s);
		cons.close();
		

	

}}
