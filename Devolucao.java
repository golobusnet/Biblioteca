import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Devolucao {

	public void menuDevolucao(){
	
		Connection conn;
		PreparedStatement preparedStatement;
		Statement stm;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/biblioteca?user=root&password=123456");
			
			stm = conn.createStatement();
			
			//Devolucao    
			Scanner devolucao = new Scanner(System.in);
			System.out.print("Digite o ID do emprestimo:");
			int idEmprestimo = devolucao.nextInt();
			String sqlDevolucao = "DELETE FROM emprestimo WHERE idEmprestimo=?";  
		     PreparedStatement pstmt = conn.prepareStatement(sqlDevolucao);   
		     pstmt.setInt(1, idEmprestimo);  
     	     int deleteCount = pstmt.executeUpdate(); 
     	     System.out.println(deleteCount);
	}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			//System.out.println("� ERRO FOI AQUI...");
			e.getMessage();
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}
			
				
		
	}
	
}
