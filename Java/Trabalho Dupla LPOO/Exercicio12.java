import javax.swing.JOptionPane;

public class Exercicio12{
  public static void main (String args []){
    JOptionPane window = new JOptionPane();
    int result = ((1 * 3) * (5 * 7) * (9 * 11) * (13 * 15));
    window.showMessageDialog(null, "Total = " +result);
  }
}
