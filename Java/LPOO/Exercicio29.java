import java.util.Scanner;
public class Exercicio29{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe 5 numeros separados por um 'ENTER':");
    int num1 = read.nextInt();
    int num2 = read.nextInt();
    int num3 = read.nextInt();
    int num4 = read.nextInt();
    int num5 = read.nextInt();
    int result = (num1 + num2 + num3 + num4 + num5) / 5;
    System.out.println("A media dos numeros e " +result);
  }
}
