import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

// 1. Crie um projeto chamado Automoveis.
// 2. Crie uma classe chamada Carro.
// 3. Essa classe devera ter os atributos:

// Marca
// Modelo
// Ano
// Cor
// Preco 


// 4. Essa classe devera ter os metodos

// Construtor
// Metodos SET e GET para cada um dos atributos
// Metodo que recebe o ano atual o e calcula a idade do Automovel
 
// Prazo de entrega: 25/10 

public class Automoveis extends Carro{
    public static void main(String Args []){

        // Gets the actual date.
        LocalDate localDate = LocalDate.now();
        int date = Integer.parseInt(DateTimeFormatter.ofPattern("yyy").format(localDate));

        // Faça a entrada dos dados do primeiro Carro, criando o objeto Carro1;
        JOptionPane.showMessageDialog(null, "Fa\u00e7a a entrada dos dados do primeiro Carro, criando o objeto Carro1", "Exerc\u00edcio 1", JOptionPane.INFORMATION_MESSAGE);
        Carro Car1 = new Carro();
        
        // Faça a entrada dos dados do segundo Carro, criando o objeto Carro2;
        JOptionPane.showMessageDialog(null, "Fa\u00e7a a entrada dos dados do segundo Carro, criando o objeto Carro2", "Exerc\u00edcio 2", JOptionPane.INFORMATION_MESSAGE);
        Carro Car2 = new Carro();

        // Mostre os dados dos dois Carros;
        JOptionPane.showMessageDialog(null, "Mostre os dados dos dois carros.", "Exerc\u00edcio 3", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Carro 1: \n" + Car1.info(), null, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Carro 2: \n" + Car2.info(), null, JOptionPane.INFORMATION_MESSAGE);

        // Faça a alteração do Modelo e do Ano do primeiro Carro;
        JOptionPane.showMessageDialog(null, "Fa\000e7a a altera\u00e7\u00e3o do modelo e do ano do primeiro carro.", "Exerc\u00edcio 4", JOptionPane.INFORMATION_MESSAGE);
        Car1.setModelo();
        Car1.setAno();

        // Mostre a idade dos dois Carros;
        JOptionPane.showMessageDialog(null, "Mostre a idade dos dois carros.", "Exerc\u00edcio 5", JOptionPane.INFORMATION_MESSAGE);
        Car1.getIdade(date);
        Car2.getIdade(date);

        // Mostre qual o Carro mais novo;
        JOptionPane.showMessageDialog(null, "Mostre qual o carro mais novo.", "Exerc\u00edcio 6", JOptionPane.INFORMATION_MESSAGE);

        if( Car1.getIdade(date) > Car2.getIdade(date) ){
            JOptionPane.showMessageDialog(null, "O " + Car1.getModelo() + " é mais novo: \n" + Car1.info());
        }else if( Car2.getIdade(date) > Car1.getIdade(date) ){
            JOptionPane.showMessageDialog(null, "O " + Car2.getModelo() + " é mais novo: \n" + Car2.info());
        }else{
            JOptionPane.showMessageDialog(null, "Ambos os carros tem a mesma idade.");
        }
    }
}
