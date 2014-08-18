import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Livro {
	
	public void menuLivro(){
		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		
		while(opcao !=0){
		
		System.out.println("1- Cadastrar acervo");
		System.out.println("2- Alterar acervo");
		//System.out.println("3- Verificar acervo");
		System.out.println("4- Excluir do acervo");
		System.out.println("5- Listar acervo");
		System.out.println("0- Sair");
		opcao = sc.nextInt();
	
			
		Connection conn;
		PreparedStatement preparedStatement;
		Statement stm;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/biblioteca?user=root&password=123456");
			
			stm = conn.createStatement();
			
		switch(opcao){
		case 1:
			
			//Inserir livro	
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Scanner sc3 = new Scanner(System.in);
			Scanner sc4 = new Scanner(System.in);
			Scanner sc5 = new Scanner(System.in);
			
			System.out.println("ISBN");
			int opcaoLivro = sc1.nextInt();
			System.out.println("Autor:");
			String opcaoLivro2 = sc2.nextLine();
			System.out.println("Titulo:");
			String opcaoLivro3 = sc3.nextLine();
			System.out.println("Edicao");
			int opcaoLivro4 = sc4.nextInt();
			System.out.println("Quantidade");
			int opcaoLivro5 = sc5.nextInt();
			
			String insertTableSQL = "INSERT INTO livro"
			+ "(isbn, autor, titulo, edicao, quantidade) values"
			+ "(?,?,?,?,?)";
			
			//PREPARA DOS DADOS do usuario
			preparedStatement = conn.prepareStatement(insertTableSQL);
			preparedStatement.setInt(1, opcaoLivro);
			preparedStatement.setString(2,opcaoLivro2);
			preparedStatement.setString(3, opcaoLivro3);
			preparedStatement.setInt(4, opcaoLivro4);
			preparedStatement.setInt(5, opcaoLivro5);
			
			// execute insert SQL stetement (sei nao pra que serve)			
			int resultado = preparedStatement.executeUpdate();
			System.out.println(resultado);

			break;
			
		case 2:
			
			//Alterar o livro
			Scanner scAlt = new Scanner(System.in);
			Scanner scAlt2 = new Scanner(System.in);
			Scanner scAlt3 = new Scanner(System.in);
			Scanner scAlt4 = new Scanner(System.in);
			Scanner scAlt5 = new Scanner(System.in);
			
			System.out.println("digite o isbn do livro");
			int op = scAlt.nextInt();
			System.out.println("Autor:");
			String op2 = scAlt2.nextLine();
			System.out.println("Titulo");
			String op3 = scAlt3.nextLine();
			System.out.println("Edicao:");
			int op4 = scAlt4.nextInt();
			System.out.println("Quantidade:");
			int op5 = scAlt5.nextInt();
			
			String sql = "UPDATE livro SET autor='"+op2+"',titulo='"+op3+"',edicao='"+op4+"',quantidade='"+op5+"' WHERE isbn ="+op+"";    
			int updateCount = stm.executeUpdate(sql);  
			System.out.println(updateCount);
			
			break;
			
		case 3:
			
			
			
			break;
			
		case 4:
			//Deletar livro    
			Scanner scDelLivro = new Scanner(System.in);
			System.out.print("Digite o isbn do livro a ser deletado:");
			int opDelLivro = scDelLivro.nextInt();
			String sqlDelLivro = "DELETE FROM livro WHERE isbn=?";  
		     PreparedStatement pstmt = conn.prepareStatement(sqlDelLivro);   
		     pstmt.setInt(1, opDelLivro);  
     	     int deleteCount = pstmt.executeUpdate(); 
     	     System.out.println(deleteCount);
			
			
			break;
			
		case 5:
			
			//exibir livros
			ResultSet rm = stm.executeQuery("SELECT * FROM livro"); 
			while(rm.next())  
			{  

				int isbn = rm.getInt("isbn");  
				String autor = rm.getString("autor");  
				String titulo = rm.getString("titulo");
				int edicao = rm.getInt("edicao");
				int quantidade = rm.getInt("quantidade");
				
				System.out.println("isbn: "+isbn+" titulo: "+titulo+" autor:"+autor+" edicao:"+edicao+" Quantidade:"+quantidade);
			
			}			
			
			break;
		
		}//case
		
	}//while
		
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
		
	}//menuLivro
	
}//livro
