import java.util.Scanner;
public class Exercicio2{
  public static void main(String args []){
    Scanner read  = new Scanner (System.in);
    System.out.println("Informe o custo do Teatro: ");
    double custo = read.nextInt();
    if(custo <= 0){
      System.exit(0);
    }
    System.out.println("Informe o preco do convite: ");
    double convite = read.nextInt();
    if(convite <= 0){
      System.exit(0);
    }
    double cont = 0;
    for(int i = 1; i <= 1000; i++){
      cont = cont + convite;
      if(cont >= custo){
        System.out.println("Sera necessario " +i +" Convites para igualar ou exceder esse valor");
        System.exit(0);
      }
    }
  }
}
