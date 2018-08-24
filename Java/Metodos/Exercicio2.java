import java.util.*;
import javax.swing.*;
import java.time.*;
import java.lang.*;

public class Exercicio2{
	public static JOptionPane window = new JOptionPane();
	
	// public static void Parametros(int exercicio){
	// 	// Faz a passagem de par\u00e2metros.
	// 	String desc = "";
		
	// 	if( exercicio == 0 ){

	// 	}else if( exercicio == 1 ){
	// 		desc = 		"Receba o nome completo de uma pessoa (passagem por par\u00e2metro),\nem seguida mostre somente o sobrenome.";
	// 		window.showMessageDialog(null, desc, "Descri\u00e7\u00e3o", window.INFORMATION_MESSAGE);
	// 		String nome = window.showInputDialog(null, "Informe seu nome completo: ");
	// 		Sobrenome(nome);

	// 	}else if( exercicio == 2 ){
	// 		desc = 		"Receba o nome completo de uma pessoa (passagem por par\u00e2metro),\nem seguida mostre seu nome no formato: Sobrenome, Nome; - Silva, Rafael Rodrigues.";
	// 		window.showMessageDialog(null, desc, "Descri\u00e7\u00e3o", window.INFORMATION_MESSAGE);
	// 		String nome = window.showInputDialog(null, "Informe seu nome completo: ");
	// 		FormatoNome(nome);

	// 	}else if( exercicio == 3 ){
	// 		desc = 		"Receba o nome completo de uma pessoa (passagem por par\u00e2metro), em seguida mostre\nsomente o primeiro nome, Com uma mensagem de boas vindas. Exemplo: Ol\u00e1 Waldycleidson.";
	// 		window.showMessageDialog(null, desc, "Descri\u00e7\u00e3o", window.INFORMATION_MESSAGE);
	// 		String nome = window.showInputDialog(null, "Informe seu nome completo: ");			

	// 	}else if( exercicio == 4 ){
	// 		desc =		"Receba uma palavra qualquer (passagem por par\u00e2metro), em seguida mostre esta palavra\nescrita de forma invertida.";
	// 		window.showMessageDialog(null, desc, "Descri\u00e7\u00e3o", window.INFORMATION_MESSAGE);
	// 		String palavra = window.showInputDialog(null, "Informe uma palara");
	// 		Invertida(palavra);

	// 	}else if( exercicio == 5 ){
	// 		desc =		"Receba a sua data de nascimento no formato 'dd/mm/aaaa', e mostre quantos dias você viveu\n(aproximadamanete).";
	// 		window.showMessageDialog(null, desc, "Descri\u00e7\u00e3o", window.INFORMATION_MESSAGE);
	// 		String data = window.showInputDialog(null, "Informe sua data de nascimento [dd/mm/aaaa]: ");
	// 		Dias(data);

	// 	}else if( exercicio == 6 ){
	// 		desc = 		"Mostre o dia da semana a partir da data do servidor.\nExemplo: Segunda-feira, Terça-feira, Quarta-feira, etc...";


	// 	}else if( exercicio == 7 ){
	// 		desc =		"Mostre a expressão 'Cidade, dia de mês de ano'\n,Exemplo: São Paulo, 13 de setembro de 2016.";

	// 	}else if( exercicio == 8 ){
	// 		desc = 		"Crie uma classe que atenda as operações identidicadas (figuras), sendo\nque a chama da do m\u00e9todo dever\u00e9 representar o elemento ques estar\u00e9\nsendo calculado, conforme descrito no exercício.";

	// 	}else if( exercicio == 9 ){
	// 		desc = "Usando como base o exercício 08, tente criar um único m\u00e9todo que\nconsiga calcular qualquer um dos perímetros.";

	// 	}else{
	// 		System.out.println("Error");
	// 	}

		


	// }
	
	// public static void Menu(){
	// 	JOptionPane window = new JOptionPane();
	// 	Object[] exercicios = {"Exerc\u00edcio 1", "Exerc\u00edcio 2", "Exerc\u00edcio 3", "Exerc\u00edcio 4", "Exerc\u00edcio 5", "Exerc\u00edcio 7", "Exerc\u00edcio 8", "Desafio"};
	// 	int option = Integer.parseInt(window.showInputDialog(null, "Selecione o m\u00e9todo: ", "Sele\u00e7\u00e3o", null, window.QUESTION_MESSAGE, null, exercicios, null));
	// 	Parametros(option);
	// }



	public static String Sobrenome(String nome){
		// Receba o nome completo de uma pessoa (passagem por par\u00e2metro),
		 // em seguida mostre somente o sobrenome.

		String[] splited = nome.trim().split(" ");
		int index = splited.length-1;


		String sobrenome =  splited[index];

		return sobrenome;
	}

	public static String FormatoNome(String nome){
		// Receba o nome completo de uma pessoa (passagem por par\u00e2metro), em seguida mostre
		// seu nome no formato: Sobrenome, Nome; - Silva, Rafael Rodrigues.

		String[] splited = nome.trim().split(" ");
		String sobrenome = splited[1];
		String primeiro = splited[0];

		String format = sobrenome + primeiro;

		return format;
	}

	

	public static String PrimeiroNome(String nome){
		// Receba o nome completo de uma pessoa (passagem por par\u00e2metro), em seguida mostre
		// somente o primeiro nome, Com uma mensagem de boas vindas. Exemplo: Ol\u00e9 Waldycleidson.
		
		String[] splited = nome.trim().split(" ");
		String primeiro = splited[0];

		return primeiro;
	}

	public static String Invertida(String palavra){
		// Receba uma palavra qualquer (passagem por par\u00e2metro), em seguida mostre esta palavra
		// escrita de forma invertida.

		String[] a = palavra.split(" ");
		String word = "";
		for ( int i = a.length - 1; i >= 0; i-- ){
			word += a[i];
		}

		return word;
	}


	public static int Dias(Date data;){
		// Receba a sua data de nascimento no formato 'dd/mm/aaaa', e mostre quantos dias você viveu
		// (aproximadamanete).
		Date hoje = new Date();
		long dif = hoje.getTime() - data.getTime();
		int result = (int) dif / (1000 * 60 * 60 * 24);

		return result;
	}

	public static String diaSemana(){
		// Mostre o dia da semana a partir da data do servidor.
		// Exemplo: Segunda-feira, Terça-feira, Quarta-feira, etc...
		Calendar c = Calendar.getInstance();

		int dia = c.get(Calendar.DAY_OF_MONTH);
		int mes  = c.get(Calendar.MONTH);
		String diaSemana = "";


		switch (mes) {
			case 1: break;
			case 2:	dia += 31; break;
			case 3:	dia += 59; break;
			case 4: dia += 90; break;
			case 5: dia += 120; break;
			case 6: dia += 151; break;
			case 7: dia += 181; break;
			case 8: dia += 212; break;
			case 9: dia += 243; break;
			case 10: dia += 273; break;
			case 11: dia += 304; break;
			case 12: dia += 334; break;
		}

		switch (dia % 7) {
			case 0: diaSemana = "Segunda-feira"; break;
			case 1: diaSemana = "Terca-feira"; break;
			case 2: diaSemana = "Quarta-feira"; break;
			case 3: diaSemana = "Quinta-feira"; break;
			case 4: diaSemana = "Sexta-feira"; break;
			case 5: diaSemana = "Sabado"; break;
			case 6: diaSemana = "Domingo"; break;
			default: break;
		}


		return diaSemana;
	}

	public static String CidadeDia(){
		// Mostre a expressão "Cidade, dia de mês de ano",
		// Exemplo: São Paulo, 13 de setembro de 2016.
		Calendar c = Calendar.getInstance();
		int dia = c.get(Calendar.DAY_OF_MONTH);
		int mes = c.get(Calendar.MONTH);
		int ano = c.get(Calendar.YEAR);
		return  "Sao Paulo, " + dia + " de " + mes + " de " + ano;
	}



	public static class Operacoes{
		// Crie uma classe que atenda as operações identidicadas (figuras), sendo
		// que a chama da do m\u00e9todo dever\u00e9 representar o elemento ques estar\u00e9
		// sendo calculado, conforme descrito no exercício.
		float perimeter = 0;			

		public float Retangulo(float height, float width){
			// P = 2(h + b)
			float h = height;
			float b = width;
			perimeter = 2 * (h+b);
			return perimeter;
		}


		public float Quadrado(float side){
			// P = 4a
			float a = side;
			perimeter = a * 4;
			return perimeter;
		}




		public float Paralelogramo(float side1, float side2){
			// P = 2( a + b )
			float h = side1;
			float b = side2;
			perimeter = 2 * (h+b);
			return perimeter;

		}


		public float Trapezio(float side1, float side2, float side3, float side4){
			// P = a + b + c + d
			float a = side1;
			float b = side2;
			float c = side3;
			float d = side4;
			perimeter = a + b + c + d;
			return perimeter;
		}



		
		
		public float Desafio(float side1, float side2, float side3, float side4){
			// Usando como base o exercício 08, tente criar um único m\u00e9todo que
			// consiga calcular qualquer um dos perímetros.

			float[] values = {side1, side2, side3, side4};
			boolean quadrado = false;
			boolean paralelogramo = false;
			boolean trapezio = false;

			if( values[3] != 0 ){
				trapezio = true;
			}else{
				trapezio = false;
			}

			if( values[1] != 0 ){
				paralelogramo = true;
			}else{
				paralelogramo = false;
				quadrado = true;
			}

			
			if( quadrado ){
				// P = 4a

				float a = side1;
				perimeter = a * 4;
				return perimeter;
			
			}else if( paralelogramo ){
				// P = 2( a + b )

				float h = side1;
				float b = side2;
				perimeter = 2 * (h+b);
				return perimeter;	

			}else if( trapezio ){
				// P = a + b + c + d

				float a = side1;
				float b = side2;
				float c = side3;
				float d = side4;
				perimeter = a + b + c + d;
				return perimeter;

			}

			return perimeter;
		}
	
	}
		

	public static void main (String [] args){
		


	}
}