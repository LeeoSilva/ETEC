import java.util.Scanner;
public class Exercicio03{
    public static void main (String [] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite altura do terreno: ");
        double altura = read.nextDouble();
        System.out.print("Digite a base do terreno: ");
        double base = read.nextDouble();
        System.out.print("Digite o preco do terreno metro quadrado: ");
        double preco = read.nextDouble();
        double Area = base * altura;
        double Soma = Area * preco;
        System.out.println("O preco por metro quadrado eh igual a: R$" +Soma);
    }
}
