package jdbc;

/*
 * Aluna: La�s Gon�alves Senna
 * Matr�cula: 0050015880
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final String DRIVE = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/poo"; 
	private static final String USER = "root"; 
	private static final String SENHA = ""; 
	
	
	public static Connection getConnection() {
        try {
        	        	
            return DriverManager.getConnection(URL, USER, SENHA);
        } 
        catch (SQLException e) {
           
        	throw new RuntimeException("Erro na conex�o com o Banco de Dados!",e);
        }
	}
	public static void closeConnection(Connection con) {
		if(con != null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void closeConnection(Connection con, PreparedStatement stmt)
	{
		closeConnection(con);
		
		if(stmt != null)
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
