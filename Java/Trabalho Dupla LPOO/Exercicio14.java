import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio14{
  public static void main (String args []){
    JOptionPane window = new JOptionPane();
    DecimalFormat format = new DecimalFormat("0.##");
    window.showMessageDialog(null, "Codigo\t%aumento\n1     \t15\n3     \t20\n4     \t35\n8     \t40");
    System.out.println("Codigo\t%aumento\n1     \t15\n3     \t20\n4     \t35\n8     \t40");
    double produto = Integer.parseInt(window.showInputDialog("Forneca o valor do produto: "));
    int codigo = Integer.parseInt(window.showInputDialog("Forneca o codigo do aumento: "));
    double result = 0;
    switch(codigo){
      case 1:
        result = produto * (15 / 100);
        break;
      case 3:
        result = produto * (20 / 100);
        break;
      case 4:
        result = produto * (35 / 100);
        break;
      case 8:
        result = produto * (40 / 100);
        break;
    }
    String secresult = format.format(result);
    window.showMessageDialog(null, "Valor com aumento: " +secresult);
    System.exit(0);
  }
}
