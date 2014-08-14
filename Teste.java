import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {


		Connection conn;
		PreparedStatement preparedStatement;
		Statement stm;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/biblioteca?user=root&password=123456");
			
			stm = conn.createStatement();
			
			//Exibir usuarios
//        
//			ResultSet rs = stm.executeQuery("SELECT * FROM usuario"); 
//			while(rs.next())  
//			{  
//
//				int id = rs.getInt("idUsuario");  
//				String nome = rs.getString("nome");  
//				String endereco = rs.getString("endereco");
//				int cpf = rs.getInt("cpf");
//				
//				System.out.println("ID: "+id+" NOME: "+nome+" ENDERECO:"+endereco+" CPF:"+cpf);
//			
//			}
			
			//exibir livros
//			ResultSet rm = stm.executeQuery("SELECT * FROM livro"); 
//			while(rm.next())  
//			{  
//
//				int isbn = rm.getInt("isbn");  
//				String autor = rm.getString("autor");  
//				String titulo = rm.getString("titulo");
//				int edicao = rm.getInt("edicao");
//				
//				System.out.println("isbn: "+isbn+" titulo: "+titulo+" autor:"+autor+" edicao:"+edicao);
//			
//			}
			
			
//			//Inserir usuario	
//			Scanner sc = new Scanner(System.in);
//			String opcao;
//						
//			System.out.println("nome:");
//			opcao = sc.nextLine();
//			System.out.println("endereço:");
//			String opcao2 = sc.nextLine();
//			System.out.println("CPF");
//			int opcao3 = sc.nextInt();
//			
//			String insertTableSQL = "INSERT INTO usuario"
//			+ "( nome, endereco, cpf) VALUES"
//			+ "(?,?,?)";
//			
//			//PREPARA DOS DADOS do usuario
//			preparedStatement = conn.prepareStatement(insertTableSQL);
//			preparedStatement.setString(1,opcao);
//			preparedStatement.setString(2, opcao2);
//			preparedStatement.setInt(3, opcao3);
//			
//			// execute insert SQL stetement (sei nao pra que serve)			
//			int resultado = preparedStatement.executeUpdate();
//			System.out.println(resultado);	
			

//			//Inserir livro	
//			Scanner sc = new Scanner(System.in);
//			Scanner sc2 = new Scanner(System.in);
//			Scanner sc3 = new Scanner(System.in);
//						
//			System.out.println("ISBN");
//			int opcao = sc.nextInt();
//			System.out.println("Autor:");
//			String opcao2 = sc2.nextLine();
//			System.out.println("Titulo:");
//			String opcao3 = sc3.nextLine();
//			System.out.println("Edicao");
//			int opcao4 = sc.nextInt();
//			
//			
//			
//			String insertTableSQL = "INSERT INTO livro"
//			+ "(isbn, autor, titulo, edicao) values"
//			+ "(?,?,?,?)";
//			
//			//PREPARA DOS DADOS do usuario
//			preparedStatement = conn.prepareStatement(insertTableSQL);
//			preparedStatement.setInt(1, opcao);
//			preparedStatement.setString(2,opcao2);
//			preparedStatement.setString(3, opcao3);
//			preparedStatement.setInt(4, opcao4);
//			
//			// execute insert SQL stetement (sei nao pra que serve)			
//			int resultado = preparedStatement.executeUpdate();
//			System.out.println(resultado);
//			
			
			
			
//			
//			//Alterar o usuario
//			Scanner sc = new Scanner(System.in);
//			Scanner sc2 = new Scanner(System.in);
//			Scanner sc3 = new Scanner(System.in);
//			
//			System.out.println("digite o ID do usuario");
//			int op = sc.nextInt();
//			System.out.println("Nome:");
//			String op2 = sc2.nextLine();
//			System.out.println("Endereço");
//			String op3 = sc3.nextLine();
//			System.out.println("CPF:");
//			int op4 = sc.nextInt();
//			
//			String sql = "UPDATE usuario SET nome='"+op2+"',endereco='"+op3+"',cpf='"+op4+"' WHERE idUsuario ="+op+"";    
//			int updateCount = stm.executeUpdate(sql);  
//			System.out.println(updateCount);
	
			
//			//Alterar o livro
//			Scanner sc = new Scanner(System.in);
//			Scanner sc2 = new Scanner(System.in);
//			Scanner sc3 = new Scanner(System.in);
//			
//			System.out.println("digite o isbn do livro");
//			int op = sc.nextInt();
//			System.out.println("Autor:");
//			String op2 = sc2.nextLine();
//			System.out.println("Titulo");
//			String op3 = sc3.nextLine();
//			System.out.println("Edicao:");
//			int op4 = sc.nextInt();
//			
//			String sql = "UPDATE livro SET autor='"+op2+"',titulo='"+op3+"',edicao='"+op4+"' WHERE isbn ="+op+"";    
//			int updateCount = stm.executeUpdate(sql);  
//			System.out.println(updateCount);
			
			
			
			
			
//		     //deletar usuario	    
//			Scanner sc = new Scanner(System.in);
//			System.out.print("Digite o id do usuario a ser deletado:");
//			int op = sc.nextInt();
//			String sql = "DELETE FROM usuario WHERE idUsuario=?";  
//		     PreparedStatement pstmt = conn.prepareStatement(sql);   
//		     pstmt.setInt(1, op);  
//     	     int deleteCount = pstmt.executeUpdate(); 
//     	     System.out.println(deleteCount);
			
			
//			//Deletar livro    
//			Scanner sc = new Scanner(System.in);
//			System.out.print("Digite o isbn do livro a ser deletado:");
//			int op = sc.nextInt();
//			String sql = "DELETE FROM livro WHERE isbn=?";  
//		     PreparedStatement pstmt = conn.prepareStatement(sql);   
//		     pstmt.setInt(1, op);  
//     	     int deleteCount = pstmt.executeUpdate(); 
//     	     System.out.println(deleteCount);
			
			
//insert into emprestimo (emprestimo, devolucao, isbnLivro, idUsuario ) values ('2014-01-20', '2014-01-30', 0, 1 );

			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Scanner sc3 = new Scanner(System.in);
			Scanner sc4 = new Scanner(System.in);
			
			System.out.println("Digite a ID do usuario");
			String opcao4 = sc.nextLine();
			System.out.println("Digite a ISBN do livro para emprestimo");
			String opcao3 = sc2.nextLine();
			System.out.println("data do emprestimo:");
			String opcao= sc3.nextLine();
			System.out.println("data para devolucao:");
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
			
			
			
			
			
			
		} catch (SQLException e) {
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
