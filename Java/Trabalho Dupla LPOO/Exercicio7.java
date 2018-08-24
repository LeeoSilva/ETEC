import java.util.Scanner;
public class Exercicio7{
  public static void main (String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe um numero: ");
    int n1 = read.nextInt();
    System.out.println("Informe um segundo numero: ");
    int n2 = read.nextInt();
    System.out.println("Informe um terceiro numero: ");
    int n3 = read.nextInt();
    if (n1 >= n2 && n2 >= n3){
      System.out.println(n1);
      System.out.println(n2);
      System.out.println(n3);
    }else if (n1 >= n3 && n3 >= n2){
      System.out.println(n1);
      System.out.println(n3);
      System.out.println(n2);
    }else if (n2 >= n1 && n1 >= n3){
      System.out.println(n2);
      System.out.println(n1);
      System.out.println(n3);
    }else if (n2 >= n3 && n3 >= n1){
      System.out.println(n2);
      System.out.println(n3);
      System.out.println(n1);
    }else if (n3 >= n1 && n1 >= n2){
      System.out.println(n3);
      System.out.println(n1);
      System.out.println(n2);
    }else if(n3 >= n2 && n2 >= n1){
      System.out.println(n3);
      System.out.println(n2);
      System.out.println(n1);
    }
  }
}
