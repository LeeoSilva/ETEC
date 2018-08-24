import javax.swing.JOptionPane;

public class Exercicio11{
  public static void main (String args []){
    // JOptionPane window = new JOptionPane();
    int[] tall = new int[28123];
    int result = 0;
    for(int i = 0; i <= 5; i++){
      if(i % 2 != 0){
        tall[i] = i;
        result += tall[i];
      }
    }
    System.out.println("total = " +result);

  }
}
