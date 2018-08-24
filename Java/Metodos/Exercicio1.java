import javax.swing.*;
import java.lang.*;

public class Exercicio1 extends ExercicioMet1{
  public static int num = 0;
  public static int number = 0;
  public static double ray = 0;
  public static double height = 0;
  public static Object sex = null;
  public static int[] vetor = new int[20];
  public static int k = 0;
  public static void main(String args []){
    Object[] options = {"M", "F"};
    JOptionPane window = new JOptionPane();
    // ---ItemA
    // Crie um método que receba um numero inteiro positivo N
    // como parâmetro e retorne a soma dos N numeros inteiros
    // existentes entre o numero 1 e esse numero.
    while (true){
      num = Integer.parseInt(window.showInputDialog(null, "Informe um n\u00famero para saber a soma entre 1 e o mesmo: "));
      if(num <= 1){
        window.showMessageDialog(null, "Valor incorreto\nDigite novamente.");
      }else{
        break;
      }
    }
    System.out.println(SumN(num));
    //Fim do ItemA

    // ---ItemB
    // Crie um metodo que receba, por parametro, o raio de uma esfera,
    // e retorne seu volume.
    while (true){
      ray = Double.parseDouble(window.showInputDialog(null, "Informe o raio da esfera para saber seu volume: "));
      if(ray <= 0){
        window.showMessageDialog(null, "Valor incorreto!\nDigite novamente.");
      }else{
        break;
      }
    }
    System.out.println(VolEspher(ray));
    //Fim do ItemB

    // ---ItemC
    // Crie um metodo que receba, por parametro, a altura e o sexo(char) de uma pessoa e
    // retorne seu peso ideal.
    while (true){
      double height = Double.parseDouble(window.showInputDialog(null, "Informe sua altura: "));
      if(height <= 0){
        window.showMessageDialog(null, "Valor incorreto!\nDigite novamente.");
      }else{
        break;
      }
    }
    while (true){
      sex = window.showInputDialog(null, "Informe seu sexo[M/F]: ", null, window.INFORMATION_MESSAGE, null, options, options[0]);
      if(sex == null || sex == ""){
        window.showMessageDialog(null, "Valor Incorreto!\nDigite novamente.");
      }else{
        break;
      }
    }

    System.out.println(IdealWeight(height, sex));
    //Fim do ItemC

    // ---ItemD
    // Crie um metodo que receva por parametro um valor inteiro e positivo N
    // e retorne o valor de S, onde a 1 parcela da soma em N=1, a parcela tem N=2
    // ate N ser igual ao valor digitado.
    while (true){
      int number = Integer.parseInt(window.showInputDialog(null, "Informe o valor de N: "));
      if(number <= 0){
        window.showMessageDialog(null, "Valor incorreto!\nDigite novamente");
      }else{
        break;
      }
    }
    System.out.println(PG(number));
    //Fim do ItemD

    // ---ItemE
    // Faca um metodo que receba um vetor X de 15 numeros int, por parametro, e
    // mostre a quantidade de valores pares em X.


    //   int[] vector = new int[15];
    //   for(int i = 0; i < vector.length; i++){
    //     vector[i] = Integer.parseInt(window.showInputDialog(null, "Informe o " +(i+1) +"\u00b0 valor do vetor: "));
    //     if(vector[i] == 0){
    //       window.showMessageDialog(null, "Valor invalido!\nDigite novamente.");
    //       i--;
    //     }else{
    //       break;
    //     }
    //   }
    // System.out.println(Even(vector));


    //Fim do ItemE

    // ---ItemF
    // Faca um metodo que receba um vetor A de 20 numeros int e um numero int k.
    // Este metodo deve retornar o proprio vetor A onde cada um de seus elementos
    // foi multiplicado por k.
    for(int i = 0; i < vetor.length; i++){
      vetor[i] = Integer.parseInt(window.showInputDialog(null, "Informe o " +(i+1) +"\u00b0 valor do vetor: "));
    }
    k = Integer.parseInt(window.showInputDialog(null, "Informe o valor a ser multiplicado: "));
    System.out.println(VectorMultiply(vetor, k));

    //Fim do ItemF
  }
}
