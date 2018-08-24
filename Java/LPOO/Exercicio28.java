import java.util.Scanner;
public class Exercicio28{
  public static void main (String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe seu nome: ");
    String nome = read.nextLine();
    System.out.println("Informe sua idade: ");
    int idade = read.nextInt();
    if(idade >= 18){
      System.out.println("Maior de idade");
    }else if(idade < 18 && idade < 65){
      System.out.println("Menor de idade");
    }else if(idade >= 65){
      System.out.println("Idoso");
    }else{
      System.out.println("Numero Invalido");
    }
  }
}
