//Escreva uma classe que leia 3 numeros e calcule quantos sao pares e quantos sao
//impares. (contador)

import java.util.Scanner;
public class Exercicio5{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    int pares = 0, impares = 0;
    for(int i = 0; i < 3; i++){
      System.out.println("Informe um numero: ");
      int num = read.nextInt();
      if(num == 0){
        System.out.println("Numero invalido");
        System.exit(0);
      }else if(num % 2 == 0){
        pares++;
      }else if(num % 2 != 0){
        impares++;
      }
    }
    System.out.println("O total de numeros pares e: " +pares);
    System.out.println("O total de numeros impares e: " +impares);
  }
}
