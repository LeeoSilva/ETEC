import java.util.Scanner;
public class Exercicio23{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe um nome: ");
    String nome1 = read.next();
    System.out.println("Informe um segundo nome: ");
    String nome2 = read.next();
    System.out.println("Informe um terceiro nome: ");
    String nome3 = read.next();
    System.out.println("Informe um quarto nome: ");
    String nome4 = read.next();
    System.out.println("Informe um quinto e ultimo nome: ");
    String nome5 = read.next();
    //Clear the console.
    for (int i = 0; i <= 20; i++){
      System.out.println("\n");
    }
    System.out.println(nome1);
    System.out.println(nome2);
    System.out.println(nome3);
    System.out.println(nome4);
    System.out.println(nome5);
  }
}
