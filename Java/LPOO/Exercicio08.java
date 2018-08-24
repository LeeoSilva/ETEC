package Exercicios;
import java.util.Scanner;
public class Exercicio08{
    public static void main(String args []){
        Scanner read = new Scanner (System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        int record = 0;
        //Verificação 1.
        System.out.println("Digite um número: ");
        num1 = read.nextInt();
        if(num1 > record){
            record = 0;
            record = num1;
            System.out.println("LOG1");
        }
        //Verificação 2.
        System.out.println("Digite outro número: ");
        num2 = read.nextInt();
        if(num2 > record){
            record = 0;
            record = num2;
            System.out.println("LOG2");
        }
        //Verificação 3.
        System.out.println("Digite um ultimo número: ");
        num3 = read.nextInt();
        if(num3 > record){
            record = 0;
            record = num3;
            System.out.println("LOG3");
        }
       System.out.println("O maior dos números é igual a: " +record);   

    }
}