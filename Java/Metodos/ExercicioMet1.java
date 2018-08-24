import java.util.*;
import javax.swing.JOptionPane;

public class ExercicioMet1{
  JOptionPane window = new JOptionPane();
  public static int SumN(int n){
    // Recebe um valor inteiro e positivo como parametro e
    // Retorna a soma dos N numeros existentes entro N e 1;
    int soma = 0;
    for(int i = 1; i < n; i+=1){
      soma += i;
    }
    return soma;
  }//End of SomarN

  public static double VolEspher(double ray){
    //Calcular volume de uma esfera, recebendo seu volume
    double vol = 4 * Math.PI * Math.pow(ray, 3);
    return vol;
  }//End of VolEspher

  public static double IdealWeight(double height, Object sex){
    //Calcular peso ideal.
    //Man = 72.7 * height - 58
    //Woman = 62.1 * height - 44.7
    double calc = 0;
    if(sex == "M"){
      calc = 72.7 * height - 58;
      return calc;
    }else if(sex == "F"){
      calc = 62.1 * height - 44.7;
      return calc;
    }
    return 0;
  }//End of IdealWeight

  public static int PG(int n){
    //Calcular S sendo
    // S = 1 + 1/2 + 1/3 + ... + 1/N
    int s = 0;
    for(int i = 1; i <= n; i++){
      s += 1 / i;
    }
    return s;
  }

  public static int[] Even(int[] vector){
    //Retornar um vetor apenas com numeros pares.
    int[] array = new int[15];
    int j = 0;
    for(int i = 0; i < vector.length; i++){
      if(vector[i] % 2 == 0){
        if(array[j] != 0){
          array[j] = vector[i];
        }else{
          j++;
          i--;
        }
      }
    }
    return array;
  }

  public static String VectorMultiply(int[] vector, int k){
    //Retornar o vetor recebido com cada casa * K.
    for(int i = 0; i < 20; i++){
      vector[i] *= k;
    }
    String VectorMultiplied = Arrays.toString(vector);
    // String VectorMultiplied = String.join(", ", vector);
    return VectorMultiplied;
  }
}
