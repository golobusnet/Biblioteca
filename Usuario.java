import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Usuario {
	public void menuUsuario(){
		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		while(opcao !=0){
		System.out.println("1- Cadastrar usuario");
		System.out.println("2- Alterar usuario");
		System.out.println("3- Verificar situação do usuario");
		System.out.println("4- Excluir usuario");
		System.out.println("5- Listar usuarios");
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
				//Inserir usuario	
				Scanner sc01 = new Scanner(System.in);
					
				System.out.println("nome:");
				String opcao99 = sc.nextLine();
				System.out.println("endereço:");
				String opcao2 = sc.nextLine();
				System.out.println("CPF");
				int opcao3 = sc.nextInt();
				
				String insertTableSQL = "INSERT INTO usuario"
				+ "( nome, endereco, cpf) VALUES"
				+ "(?,?,?)";
				
				//PREPARA DOS DADOS do usuario
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setString(1,opcao99);
				preparedStatement.setString(2, opcao2);
				preparedStatement.setInt(3, opcao3);
				
				// execute insert SQL stetement (sei nao pra que serve)			
				int resultado = preparedStatement.executeUpdate();
				System.out.println(resultado);
				
				break;

			case 2:
				//Alterar o usuario
				Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				Scanner sc3 = new Scanner(System.in);
				
				System.out.println("digite o ID do usuario");
				int op = sc1.nextInt();
				System.out.println("Nome:");
				String op2 = sc2.nextLine();
				System.out.println("Endereço");
				String op3 = sc3.nextLine();
				System.out.println("CPF:");
				int op4 = sc.nextInt();
				
				String sql = "UPDATE usuario SET nome='"+op2+"',endereco='"+op3+"',cpf='"+op4+"' WHERE idUsuario ="+op+"";    
				int updateCount = stm.executeUpdate(sql);  
				System.out.println(updateCount);
					
				break;
				
			case 4:
				
			     //deletar usuario	    
				Scanner scDel = new Scanner(System.in);
				System.out.print("Digite o id do usuario a ser deletado:");
				int opDel = scDel.nextInt();
				String sqlDel = "DELETE FROM usuario WHERE idUsuario=?";  
			     PreparedStatement pstmt = conn.prepareStatement(sqlDel);   
			     pstmt.setInt(1, opDel);  
	     	     int deleteCount = pstmt.executeUpdate(); 
	     	     System.out.println(deleteCount);

				
				break;
				
				
			case 5:			
			//Exibir usuarios
	        
				ResultSet rs = stm.executeQuery("SELECT * FROM usuario"); 
				while(rs.next())  
				{  
	
					int id = rs.getInt("idUsuario");  
					String nome = rs.getString("nome");  
					String endereco = rs.getString("endereco");
					int cpf = rs.getInt("cpf");
					
					System.out.println("ID: "+id+" NOME: "+nome+" ENDERECO:"+endereco+" CPF:"+cpf);
					
				}
			break;
			}
		
			
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
	}
	
	
	
	
	
