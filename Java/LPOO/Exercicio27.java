import java.util.Scanner;
public class Exercicio27{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe um numero: ");
    double num = read.nextInt();
    if(num == 0){
      System.out.println("Numero NULO");
      System.exit(0);
    }else if(num < 0){
      System.out.println("Numero Negativo");
      System.exit(0);
    }else if(num > 0){
      System.out.println("Numero Positivo");
      System.exit(0);
    }else{
      System.out.println("Numero nao reconhecido");
    }
  }
}
