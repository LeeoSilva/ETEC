import java.util.Scanner;
public class Exercicio17{
  public static void main (String args []){
    Scanner read = new Scanner (System.in);
    for(int i = 0; i <= 49; i++){
      System.out.print("Informe um nome: ");
      String nome = read.nextLine();
      System.out.println(+nome);
      nome = " ";
    }
  }
}
