import java.util.Scanner;
public class Exercicio18{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    double FLAG = 0;
    while (FLAG == 0){
      System.out.print("Informe um numero: ");
      double num = read.nextDouble();
      num = Math.pow(num, 2);
      System.out.println(num);
      if(num == 0){
        break;
      }
    }

  }
}
