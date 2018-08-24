import java.util.Scanner;
public class Exercicio21{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("TABUADA DO 7\n\n");
    for(int i = 1; i<=10; i++){
      int result = (7 * i);
      System.out.println("7 x " +i + " = " +result);
    }
  }
}
