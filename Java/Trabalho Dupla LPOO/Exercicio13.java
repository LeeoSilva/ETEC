import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio13{
  public static void main (String args []){
    JOptionPane window = new JOptionPane();
    DecimalFormat format = new DecimalFormat("0.##");
    double height = Integer.parseInt(window.showInputDialog("Informe a altura do terreno: "));
    double width = Integer.parseInt(window.showInputDialog("Informe o comprimento do terreno: "));
    double depth = Integer.parseInt(window.showInputDialog("Infome a profundidade da piscina: "));
    double area = height * width * depth;
    double value = area / 45.00;
    String secvalue = format.format(value);
    window.showMessageDialog(null, "Valores fornecidos: " +height +", " +width +", " +depth +"\n"
    +"A piscina solicitada tem " +area +" metros cubicos" +"\n"
    +"O valor da construcao sera de R$ " +secvalue
    );
  }
}
