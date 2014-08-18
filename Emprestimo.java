import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Emprestimo {

public void menuEmprestimo(){
			
		Connection conn;
		PreparedStatement preparedStatement;
		Statement stm;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/biblioteca?user=root&password=123456");
			
			stm = conn.createStatement();

						Scanner sc = new Scanner(System.in);
						Scanner sc2 = new Scanner(System.in);
						Scanner sc3 = new Scanner(System.in);
						Scanner sc4 = new Scanner(System.in);
						
						System.out.println("Digite a ID do usuario");
						String opcao4 = sc.nextLine();
						System.out.println("Digite a ISBN do livro para emprestimo");
						String opcao3 = sc2.nextLine();
						System.out.println("data do emprestimo(aaaa-mm-dd):");
						String opcao= sc3.nextLine();
						System.out.println("data para devolucao(aaaa-mm-dd):");
						String opcao2 = sc4.nextLine();
						
						String insertTableSQL = "INSERT INTO emprestimo"
						+ "(emprestimo, devolucao, isbnLivro, idUsuario ) values"
						+ "(?,?,?,?)";
						
						preparedStatement = conn.prepareStatement(insertTableSQL);
						preparedStatement.setString(1, opcao);
						preparedStatement.setString(2,opcao2);
						preparedStatement.setString(3, opcao3);
						preparedStatement.setString(4, opcao4);

						int resultado = preparedStatement.executeUpdate();
						System.out.println(resultado);
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
