import java.util.Scanner;
public class Exercicio3{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe o comprimento do comodo: ");
    int lenght = read.nextInt();
    System.out.println("Informe a largura do comodo: ");
    int width = read.nextInt();
    int area = lenght * width;
    int w = 0;
    int wats = 18;
    for(area = area; w < area; area--){
      w += wats;
    }
    System.out.println(w);

    }
}
