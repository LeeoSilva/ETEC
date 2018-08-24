package Exercicios;
import java.util.Scanner;
public class Bonus{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
            System.out.println("Digite um n\u00famero: ");
            String num = read.next();
            System.out.println("N\u00famero de casas deste n\u00famero: " +num.length());
        }
}
