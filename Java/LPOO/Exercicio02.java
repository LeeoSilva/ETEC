import java.util.Scanner;
public class Exercicio02{
    public static void main (String [] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a altura:");
        double x = read.nextDouble();
        System.out.println("Digite base");
        double y = read.nextDouble();
        double soma = ((x * y) / 2);
        System.out.println("A area do triangulo eh: " +soma);
    }
}
