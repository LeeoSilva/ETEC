package Exercicios; 
import java.util.Scanner;
public class Exercicio09{
    public static void main(String args[]){
        Scanner read = new Scanner (System.in);
        String aluno;
        double media = 0;
        System.out.println("Informe o nome do aluno: ");
        aluno = read.next();
        System.out.println("Informe a media do aluno: ");
        media = read.nextInt();
        if(media >=6 ){
        System.out.println("O aluno foi aprovado : " +media );
        }
        else {
        System.out.println("O aluno nao foi aprovado :" +media);
            }
    }
}