import javax.swing.JOptionPane;

public class Exercicio10{
  public static void main (String args []){
    JOptionPane window = new JOptionPane();
    int num1 = Integer.parseInt(window.showInputDialog("Informe um valor: "));
    int num2 = Integer.parseInt(window.showInputDialog("Informe um segundo valor: "));
    int num3 = Integer.parseInt(window.showInputDialog("Informe um terceiro valor: "));
    int num4 = Integer.parseInt(window.showInputDialog("Informe um quarto valor: "));

    int somatoria = (num1 + num2 + num3 + num3);
    double media = (somatoria / 4);
    double div1 = (somatoria % num1);
    double div2 = (somatoria % num2);
    double div3 = (somatoria % num3);
    double div4 = (somatoria % num4);

JOptionPane.showMessageDialog(null,
     "Numeros fornecidos: " +num1 +", " +num2 +", " +num3 +", " +num4 +"\n"
    +"Media entre os valores = " +media +"\n"
    +"Somatorio = " +somatoria +"\n"
    +"Resto da divisao entre a somatoria e o primeiro numero: " +div1 +"\n"
    +"Resto da divisao entre a somatoria e o segundo numero: " +div2 +"\n"
    +"Resto da divisao entre a somatoria e o terceiro numero: " +div3 +"\n"
    +"Resto da divisao entre a somatoria e o quarto numero: " +div4 +"\n"
    );
  }
}
