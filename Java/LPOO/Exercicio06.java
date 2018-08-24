import java.util.Scanner;
public class Exercicio06{
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = read.nextInt();
        if(num >= 5 && num <= 20){
            num = (int) Math.pow(num, 3);
            System.out.println("O resultado deste número ao cubo é igual a: " +num);
    		}else{
            System.out.println("O resultado deste número ao cubo é igual a: " +num);
        }
    }
}
