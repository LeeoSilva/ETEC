import java.util.Scanner;
public class Exercicio26{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe um numero");
    int num = read.nextInt();
    if(num > 5){
      num /= 2;
    }
    System.out.println(num);
  }
}
