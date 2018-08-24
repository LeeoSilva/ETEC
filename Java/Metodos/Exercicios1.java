import java.util.*;
import javax.swing.JOptionPane;

public class Exercicios1{
  public static void main (String args []){
    JOptionPane window = new JOptionPane();
    Object options = ["M", "F"]
    public static class Itens(){

      void SumN(double n){
        // Recebe um valor inteiro e positivo como parametro e
        // Retorna a soma dos N numeros existentes entro N e 1;
        int n = window.showInputDialog("Informe o valor de N: ");
        int soma = 0;
        if(n <= 0){
          window.showInputDialog("N\u00famero inv\u00e1lido!");
        }
        for(int i = 1; i < n; i+=1){
          soma += i;
        }
        return soma;
      }//End of SomarN

      void VolEspher(double ray){
        //Calcular volume de uma esfera, recebendo seu volume
        vol = 4 * Math.PI * Math.power(ray, 3);
        return vol;
      }//End of VolEspher

      void IdealWeight(double height, char sex){
        //Man = 72.7 * height - 58
        //Woman = 62.1 * height - 44.7
        if(sex == 'M'){
          calc = 72.7 * height - 58;
          return calc;
        }else if(sex == 'F'){
          calc = 62.1 * height - 44.7;
          return calc;
        }
      }//End of IdealWeight

      void pg(int n){



      }


    }//End of the class
  }
}
