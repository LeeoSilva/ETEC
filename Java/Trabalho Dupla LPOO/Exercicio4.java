import java.util.Scanner;

public class Exercicio4{
  public static void main(String args []){
    Scanner read = new Scanner(System.in);
    int mulheres = 0, homens = 0;
    for(int i = 0; i < 5; i++){
      System.out.println("Informe o seu sexo (M/F): ");
      char sexo = read.nextLine().charAt(0);
      if(sexo == 'M' || sexo == 'm'){
        homens++;
      }else if(sexo == 'F' || sexo == 'f'){
        mulheres++;
      }else{
        System.exit(0);
      }
      sexo = '\0';
    }
    System.out.println("Mulheres: " +mulheres);
    System.out.println("Homens: " +homens);
  }
}
