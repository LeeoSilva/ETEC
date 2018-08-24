import java.util.Scanner;
public class Exercicio12{
  public static void main (String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe um numero correspondente ao cardapio: ");
    int num = read.nextInt();
    switch(num){
      case 1:
        System.out.println("1\tCachorro-Quente  \tR$ 6,50");
        break;
      case 2:
        System.out.println("2\tX-Salada           \tR$  8,00");
        break;
      case 7:
        System.out.println("7\tX-Burger           \tR$ 12,90");
        break;
      case 15:
        System.out.println("15\tX-Tudo            \tR$ 19,70");
        break;
      default:
        System.out.println("Nao registrado");
        break;
     }
  }
}
