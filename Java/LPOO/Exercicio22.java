import java.util.Scanner;
import java.io.Console;
public class Exercicio22{
  public static void main (String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe um nome: ");
    String nome0 = read.nextLine();
    System.out.println("Informe um segundo nome: ");
    String nome1 = read.nextLine();
    System.out.println("Informe um terceiro nome: ");
    String nome2 = read.nextLine();
    System.out.println("Informe um quarto nome: ");
    String nome3 = read.nextLine();
    System.out.println("Informe um quinto nome: ");
    String nome4 = read.nextLine();
    System.out.print("\n\n");
    System.out.println(nome0);
    System.out.println(nome1);
    System.out.println(nome2);
    System.out.println(nome3);
    System.out.println(nome4);
  }
}
