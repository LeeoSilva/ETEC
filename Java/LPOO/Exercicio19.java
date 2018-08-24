import java.util.Scanner;
public class Exercicio19{
  public static void main (String args []){
   Scanner read = new Scanner (System.in);
   System.out.println("Informe um numero para calcular seu fatorial: ");
   int num = read.nextInt();
   int result = 1;
   for(int i = 1; i <= num;){
    result = result * i;
     i++;
   }
   System.out.println("O resultado do fatorial e " +result);
  }
}
