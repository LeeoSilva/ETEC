// 3.Essa classe deverá ter os atributos:
// Empresa
// Endereço Completo (utilize agregação)
// Telefone
// E-Mail
// Preco_Promocional
// Vencimento
// Preco_Normal

class Comunicacao extends Servicos{
	protected String	empresa;
	protected String	endereco;
	protected int	 	telefone;
	protected String	mail;
	protected float	 	promoPrice;
	protected String	vencimento;
	protected float	 	normalPrice; 
}

public class Comunicacao{

	public Servicos serv = new Servicos();
	public TV tv = new TV();
	public Telefonia tel = new Telefonia();
	public Internet net = new Internet();
	public Comunicacao com = new Comunicacao();

	public static void main(String args []){
		// Faça a entrada dos dados da Internet; 
		// Faça a entrada dos dados da Telefonia;
		// Faça a entrada dos dados da TV;
		// Mostre os dados dos três serviços:
		// Informe uma data e mostre os valores dos 3 serviços e o valor total a ser pago

		



	}
}
