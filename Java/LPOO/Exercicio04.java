import java.util.Scanner;
public class Exercicio04{
	public static void main (String [] agrs){
		Scanner read = new Scanner(System.in);
    System.out.println("Digite um valor:");
		double x = read.nextDouble();
    System.out.println("Digite outro valor:");
		double y = read.nextDouble();
    System.out.println("Digite mais um valor:");
		double z = read.nextDouble();
		double soma = (x + y + z);
		soma = Math.pow(soma, 2);
		System.out.println("O quadrado dos numeros inteiros eh: " +soma);
	}
}
