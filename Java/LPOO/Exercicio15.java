import java.util.Scanner;
public class Exercicio15{
  public static void main (String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("0- Fechar o Programa");
    System.out.println("1- Adicao");
    System.out.println("2- Subtracao");
    System.out.println("3- Multiplicacao");
    System.out.println("4- Divisao");
    int opcao = read.nextInt();
    switch(opcao){
      case 0:
        break;
      case 1:
        System.out.println("Informe um numero:");
        double soma1 = read.nextDouble();
        System.out.println("Informe mais um numero: ");
        double soma2 = read.nextDouble();
        double resultsoma = (soma1 + soma2);
        System.out.println(resultsoma);
        break;
      case 2:
        System.out.println("Informe um numero:");
        double sub1 = read.nextDouble();
        System.out.println("Informe mais um numero: ");
        double sub2 = read.nextDouble();
        double resultsub = (sub1 - sub2);
        System.out.println(resultsub);
        break;
      case 3:
        System.out.println("Informe um numero:");
        double mult1 = read.nextDouble();
        System.out.println("Informe mais um numero:");
        double mult2 = read.nextDouble();
        double resultmult = (mult1 * mult2);
        System.out.println(resultmult);
        break;
      case 4:
        System.out.println("Informe um numero:");
        double div1 = read.nextDouble();
        System.out.println("Informe mais um numero: ");
        double div2 = read.nextDouble();
        double resultdiv = (div1 / div2);
        System.out.println(resultdiv);
        break;
    }
  }
}
