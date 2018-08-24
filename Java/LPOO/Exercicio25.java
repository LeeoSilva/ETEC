import java.util.Scanner;
public class Exercicio25{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    String aluno = " ";
    double nota1 = 0;
    double nota2 = 0;
    double first = 0;
    double second = 0;
    double anual = 0;
    for(int i = 0; i < 5; i++){
      aluno = "";
      nota1 = 0;
      nota2 = 0;
      first = 0;
      second = 0;
      anual = 0;
      System.out.println("Informe o nome do aluno: ");
      aluno = read.nextLine();
      System.out.println("Informe a nota 1 do primeiro semestre: ");
      nota1 = read.nextInt();
      if(nota1 < 0 || nota1 > 10){
        System.exit(0);
      }
      System.out.println("Informe a nota 2 do primeiro semestre: ");
      nota2 = read.nextInt();
      if(nota2 < 0 || nota1 > 10){
        System.exit(0);
      }
      first = (nota1 + nota2) / 2;
      System.out.println("Informe a nota 1 do segundo semestre: ");
      nota1 = read.nextInt();
      if(nota1 < 0 || nota1 > 10){
        System.exit(0);
      }
      System.out.println("Informe a notra 2 do segundo semestre: ");
      nota2 = read.nextInt();
      if(nota2 < 0 || nota1 > 10){
        System.exit(0);
      }
      second = (nota1 + nota2) / 2;
      anual = (first + second) / 2;
      System.out.println("A nota anual do aluno " +aluno +" Foi " +anual);
    }
  }
}
