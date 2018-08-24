import java.util.Scanner;
public class Exercicio07{
    public static void main(String [] args){
        Scanner read = new Scanner (System.in);
        int num1 = 0;
        int num2 = 0;
        while(num1 <= 0){
            System.out.println("Informe um número maior que zero: ");
            num1 = read.nextInt();
        }
        while(num2 <= 0){
        System.out.println("Informe mais um número maior que zero: ");
        num2 = read.nextInt();
        }
        int result = num1 - num2;
        result = Math.abs(result);
        System.out.println("A diferença entre os dois números é: " +result);
    }
}
