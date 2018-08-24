//Escreva um programa que leia um numero e imprima o quadrado de todos os numeros
//entre 1 e o numero passado. (for ou while)

import java.util.Scanner;
public class Exercicio6{
  public static void main(String args []){
    Scanner read = new Scanner (System.in);
    System.out.println("Informe um numero acima de 1: ");
    int num = read.nextInt();
		if(num <= 1){
			System.out.println("Numero Invalido!");
			System.exit(0);
		}
    for(int i = num; i <= num; i--){
      if(i == 0){
        System.exit(0);
      }
      System.out.println(Math.pow(i, 2));
    }
  }
}
