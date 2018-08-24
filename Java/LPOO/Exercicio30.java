import java.util.Scanner;
public class Exercicio30{
  public static void main (String args []){
    Scanner read = new Scanner(System.in);
    System.out.println("Insira um numero:");
    int num = read.nextInt();
    for (int i = 0; i <= 1000; i++){
      if(i % num == 0){
        System.out.println(i);
      }else{
        i = i;
      }
    }
  }
}
