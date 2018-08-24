import javax.swing.JOptionPane;

public class Carro {

    private String Modelo;
    private String Cor;
    private String Marca;
    private int Ano;
    private int idade;
    private double Preco;

    Carro(){
        this.setMarca();
        this.setModelo();
        this.setCor();
        this.setAno();
        this.setPreco();
    }
    

    // Get Functions  

    public String getMarca() {
        // Gets the Marca of the car
        return this.Marca;
    }

    public String getModelo() {
        // Get the Modelo of the car
        return this.Modelo;
    }
    
    public String getCor() {
        // Get the Cor of the car
        return this.Cor;
    }

    public int getAno() {
        // Gets the Ano of the car
        return this.Ano;
    }

    public double getPreco() {
        // Gets Preco of the car
        return this.Preco;
    }

    public int getIdade(int ano) {
        // Gets the age of the car
        return this.idade = Math.abs(ano - this.Ano);
    }

    // Set Functions

    public void setMarca() {
        // Sets the Marca variable of the function.
        while(true){
            String aux = JOptionPane.showInputDialog("Informe a marca do veiculo: ");
            if( aux != "" ){
                this.Marca = aux;
                break;
            }
        }
    }

    public void setModelo() {
        // Sets the Modelo varible of the Object.
        while(true){
            String aux = JOptionPane.showInputDialog("Informe o modelo do veiculo: ");
            if ( aux != "" ){
                this.Modelo = aux;
                break;
            }
        }
    }

    public void setAno() {
        // Sets the Ano variable of the Object.
        while (true) {
            int aux = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veiculo: "));
            if ( aux >= 0 ){
                this.Ano = aux;
                break;
            }
        }
    }

    public void setCor(){
        // Sets the Cor variable of the object.
        while (true) {
            String aux = JOptionPane.showInputDialog("Informe a cor do veiculo: ");
            if ( aux != "" ){
                this.Cor = aux;
                break;
            }
        }
    }

    public void setPreco(){
        // Sets the Preco variable of the object.
        while (true) {
            float aux = Float.parseFloat(JOptionPane.showInputDialog("Informe o Preco do veiculo: "));
            if ( aux >= 0 ){
                this.Preco = aux;
                break;
            }
        }
    }

    public StringBuffer info(){
        StringBuffer info = new StringBuffer();
        info.append("Marca: " + this.getMarca() + "\n");
        info.append("Modelo: " + this.getModelo() + "\n");
        info.append("Ano: " + this.getAno() + "\n");
        info.append("Cor: " + this.getCor() + "\n");
        info.append("Preco: " + this.getPreco() + "\n");
        info.append("Idade do Carro: " + this.getIdade(2017) + "\n");
        return info;
    }
}
