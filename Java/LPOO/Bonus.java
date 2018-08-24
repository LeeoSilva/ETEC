package Exercicios;
import java.util.Scanner;
public class Bonus{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
            System.out.println("Digite um número: ");
            String num = read.next();
            System.out.println("O número de casas deste número é: " +num.length());
        }
}
