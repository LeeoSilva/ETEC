import java.util.Scanner;
public class Exercicio11{
  public static void main(String args []){
    //Usando a estrutura de selecao (switch/case)
    //elabore um programa que leia o numero do dia da semana (1 a 7) sendo que Domingo corresponde ao numero 1.
    //Caso o numero digitado nao corresponda a nenhum dia semana, mostre uma mensagem de erro correspondente.
    Scanner read = new Scanner (System.in);
    System.out.println("Informe um numero correspondente ao dia da semana(1-7): ");
    int dia = read.nextInt();
    switch(dia){
      case 1:
        System.out.println("DOMINGO");
        break;
      case 2:
        System.out.println("SEGUNDA-FEIRA");
        break;
      case 3:
        System.out.println("TERCA-FEIRA");
        break;
      case 4:
        System.out.println("QUARTA-FEIRA");
        break;
      case 5:
        System.out.println("QUINTA-FEIRA");
        break;
      case 6:
        System.out.println("SEXTA-FEIRA");
        break;
      case 7:
        System.out.println("SABADO");
        break;
      default:
        System.out.println("Numero Invalido.");
    }
  }
}
