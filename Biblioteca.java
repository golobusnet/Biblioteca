import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Scanner;


public class Biblioteca {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao=1;
		
		while (opcao !=0){
		System.out.println("Sistema de Biblioteca");
		System.out.println("1- Usuario");
		System.out.println("2- Acervo");
		System.out.println("3- Fazer emprestimo");
		System.out.println("4- Fazer devolução");
		System.out.println("0- Sair");
		opcao = sc.nextInt();
		
		
		
		switch(opcao){
		case 1:
			Usuario usuario = new Usuario();
			usuario.menuUsuario();
			
			break;
		case 2:
			
			Livro livro = new Livro();
			livro.menuLivro();
			
			break;	
		case 3:
			Emprestimo emprestimo = new Emprestimo();
			emprestimo.menuEmprestimo();

			
			break;
			
		case 4:
			Devolucao devolucao = new Devolucao();
			devolucao.menuDevolucao();
			
		case 0:
			
		default:
			System.out.println("Este não é um numero válido!");
		
		}
		
		
		
		
	}
	}
}
