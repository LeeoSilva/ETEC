// @author LeeoSilva

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class connection{
	public static PreparedStatement prepareStatement(String sql) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	private Connection 	dbconn   = null;
	private String 		dbhost = "localhost";
	private String 		dbname = "avaliacaojava";
	private String 		dbuser = "leeosilva";
	private String 		dbpass = "justkidding0909";
	private String 		dbport = "5432";
	private String 		dblink = "jdbc:postgresql://" +dbhost +":" +dbport +"/" +dbname;

	public connection(){
		try{
			dbconn = DriverManager.getConnection(dblink, dbuser, dbpass);
		}catch(Exception e){
			System.out.println("Error: " +e.getMessage());
			System.exit(0);
		}
	}

	public Connection getConn(){ return dbconn; }
	public static void main(String[] args){ new connection(); }
}
