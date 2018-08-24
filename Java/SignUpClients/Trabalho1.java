import javax.swing.JOptionPane;
import java.util.*;

// Faça um programa para cadastro de clientes contendo
// inclusão, alteração, pesquisa por nome e cidade,
// exclusão e listagem. Considere o registro do cliente
// como tendo os seguintes campos:

// Nome, Endereço, Cidade, Telefone, email.

// O programa deve ter as seguintes funcionalidades:

// A) Considerar um vetor de até 30 posições para o
// armazenamento dos dados dos clientes e o código
// de busca como sendo do tipo sequencial.

// B) As rotinas de busca por nome e busca por cidade
// devem ser feitas usando métodos.

// C) Antes da rotina de alteração o usuário deve 
// indicar qual registro deseja alterar.

// D) Deve existir um método que liste todos os
// registros com todos os seus campos.

// E) Não deve existir dois nomes iguais no cadastro
// e, caso isso ocorrar, o usuário deverá ser informado
// para alterá-lo.

// Sequência de Eventos:
// I) Solicitar entrada de dados para novo cadastro.
	// 1)Verificar se é possível inserir um novo registro.
	// 2)Checar se o nome já existe e solicitar modificação
	// caso positivo

// II) Solicitar o nome que deseja alterar e efetuar a alteração
//  III)Efetuar busca por nome.
// IV) Efetuar busca por cidade.
// V) Solicitar o nome que deseja excluir.
	// 1) Excluir o registro selecionado.
	// 2) Deslocar o próximo registro (caso exista)
	// para a posição que foi excluída.
// VI) Listar todos os registros com todos os campos.

public class Trabalho1{

	public static JOptionPane window 	 = new JOptionPane(); // Alias for JOptionPane.
	public static String 	  nome   	 = new String[30]; 	  // Array for names (lenght 30) storage.
	public static String 	  endereco 	 = new String[30]; 	  // Array for adress (lenght 30) storage.
	public static String 	  cidade  	 = new String[30]; 	  // Array for city (lenght 30) storage.
	public static String 	  email	  	 = new String[30]; 	  // Array for email (lenght 30) storage.
	public static int	 	  telefone 	 = new int[30];	   	  // Array for phone number (lenght 30) storage.
	public static int	 	  id	 	 = 0;				  // ID of each single register.
	public static int 		  dev 		 = 1;				  // Verification for Developer Mode.

		public static void Menu(){
			Object[] options = {"Adicionar usu\u00e1rio", "Remover Usu\u00e1rio", "Alterar Usu\u00e1rio", "Buscar"};
			int aux = window.showInputDialog(null, "Informe seu m\u00e9todo: ", "Menu", window.QUESTION_MESSAGE, options, options[0]);
			if(aux == options[0]){
				int id = window.showInputDialog(null, "Informe o ID do usu\u00e1rio: ");
				Input.Nome(id);
			}else if(aux == options[1]){
				int id = window.showInputDialog(null, "Informe o ID do usu\u00e1rio: ");
				Remove(id);
			}else if(aux == options[2]){
				int id = window.showInputDialog(null ,"Informe o ID do usu\u00e1rio: ");
				Alter(id);
			}else if(aux == options[3]){
				int cidade = window.showInputDialog(null, "Buscar pela cidade: ");
				Search(cidade);
			}
		} // End Menu window.
		

		public static class Input{

		
		public static String Nome(int id){
			if(id <= 30 && id > 0){
				while(true){
					String aux = window.showInputDialog(null, "Informe seu nome: ", id + "° Posi\u00e7\u00e3o.");
					if(aux == ""){
						window.showMessageDialog(null, "N\u00famero inv\00e1lido!");
					}else{
						nome[id] = aux;
						
					}
				}
			}
		} // End input nome

		public static String Endereco(int id){
			if(id <= 30 && id > 0){		
				while(true){
					String aux = window.showInputDialog(null, "Informe seu endere\u00e3o: ");
					if(aux == ""){
						window.showMessageDialog(null, "N\u00famero inv\u00e1lido!");
					}else{
						endereco[id] = aux;
						
						break;
					}	
				}
			}
		} // End input Endereço.

		public static String Cidade(int id){
			if(id <= 30 && id > 0){
				while(true){
					String aux = window.showInputDialog(null, "Informe sua cidade atual: ");
					if(aux == ""){
						window.showMessageDialog(null, "N\u00famero inv\u00e1lido!");
					}else{
						cidade[id] = aux;
					}
				}
			} 
	} // End Input Cidade

		public static String Email(int id){
			if(id <= 30 && id > 0){
				while(true){
					String aux = window.showInputDialog(null, "Informe seu email: ");
					if(aux == ""){
						window.showMessageDialog(null, "N\u00famero inv\u00e1lido!");
					}else{
						email[id] = aux;
					}
				}
			} 
		} // End Input Email

		public static int Telefone(int id){
			if(id <= 30 && id > 0){
				while(true){
					int aux = Integer.parseInt(window.showInputDialog(null, "Informe seu telefone: "));
					if(aux == ""){
						window.showMessageDialog(null, "N\u00famero inv\u00e1lido!");
					}else{
						telefone[id] = aux;
					}
				}
			} 
	} // End Input Telefone

} // End Input class

	public static void main(String args []){
		// Structure of the program.
		System.out.println("Oi");
		Menu();
		return;
	}
}