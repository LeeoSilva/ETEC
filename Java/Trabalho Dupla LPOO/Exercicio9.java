import javax.swing.JOptionPane;

public class Exercicio9{
  public static void main (String args []){
    //Just to say that is possible to create a keyword for JOptionPane with this command below.
    JOptionPane window = new JOptionPane();
    //And you can still use JOptionPane as a keyword like i'm using in "quantidade" :)
    int quantidade1 = Integer.parseInt(window.showInputDialog("Informe a quantidade1: "));
    int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da Quantidade1: "));
    int quantidade2 = Integer.parseInt(window.showInputDialog("Informe o quantidade2: "));
    int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da Quantidade2: "));
    int quantidade3 = Integer.parseInt(window.showInputDialog("Informe a Quantidade3: "));
    int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da Quantidade3: "));
    int result = ((quantidade1 * valor1) + (quantidade2 * valor2) + (quantidade3 * valor3));
    window.showMessageDialog(null, "O produto das quantidade e " +result);
  }
}
