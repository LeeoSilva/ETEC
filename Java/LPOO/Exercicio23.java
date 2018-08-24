import java.util.Scanner;
public class Exercicio23{
  public static void main (String args []){
    Scanner read = new Scanner (System.in);
    double[] num = new double[5];
    for(int i = 0; i <= 4; i++){
      System.out.println("Informe um numero");
      num[i] = read.nextDouble();
      double number = (num[i] / 2);
      System.out.println("A metade de " +num[i] +" e igual a " +number);
      number = 0;
    }
  }
}
