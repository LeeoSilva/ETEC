import java.util.Scanner;
public class Exercicio1{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe um numero inteiro: ");
    int num1 = read.nextInt();
    System.out.println("Informe um segundo numero: ");
    int num2 = read.nextInt();
    for(int i = 1; i < num2; i++){
      num1 *= num1;
    }
    System.out.println(num1);
  }
}
