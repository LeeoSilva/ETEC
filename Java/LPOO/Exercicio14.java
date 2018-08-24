import java.util.Scanner;
public class Exercicio14{
  public static void main (String arg []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe um numero correspondente aos meses: ");
    int num = read.nextInt();
    switch(num){
      case 1:
        System.out.println("O Mes de Janeiro tem 31 dias");
        break;
      case 2:
        System.out.println("O Mes de Fevereiro tem 28 dias");
        break;
      case 3:
        System.out.println("O Mes de Marco tem 31 dias");
        break;
      case 4:
        System.out.println("O Mes de Abril tem 30 dias");
        break;
      case 5:
        System.out.println("O Mes de Maio tem 31 dias");
        break;
      case 6:
        System.out.println("O Mes de Junho tem 30 dias");
        break;
      case 7:
        System.out.println("O Mes de Julho tem 31 dias");
        break;
      case 8:
        System.out.println("O Mes de Agosto tem 31 dias");
        break;
      case 9:
        System.out.println("O Mes de Setembro tem 28 dias");
        break;
      case 10:
        System.out.println("O Mes de Outubro tem 31 dias");
        break;
      case 11:
        System.out.println("O Mes de Novembro tem 30 dias");
        break;
      case 12:
        System.out.println("O Mes de Dezembro tem 31 dias");
        break;
      default:
        System.out.println("Numero Invalido");
        break;
    }
  }
}
