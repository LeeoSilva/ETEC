import java.util.Scanner;
public class Exercicio05{
    public static void main(String args []){
        Scanner read = new Scanner (System.in);
        System.out.println("Informe um n\u00famero: ");
        double num = read.nextDouble();
        if(num >= 150){
            num += 150;
            System.out.println("O valor final do n\u00famero mais 150 e igual a: " +num);
       }else if(num >= 0 && num < 150){
            System.out.println("O valor final do n\u00famero e igual a: " +num);
        }else{
           System.out.println("Valor invalido!");
       }
    }
}
