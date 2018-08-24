import java.util.Scanner;
public class Exercicio31{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe a populacao de mosquitos atual na regiao: ");
    int populacao = read.nextInt();
    System.out.println("Informe a quantidade de meses para serem calculados: ");
    int meses = read.nextInt();
    int aux = (7 / 100) * populacao;
    int result = 0;
    for(int i = 0; i < meses; i++){
      result = result + aux;
    }
    System.out.println("A populacao de mosquitos vai ser igual a " +result);
  }
}
