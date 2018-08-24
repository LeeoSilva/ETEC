// 5.Crie uma subclasse Internet derivada da classe Servicos com as informações:
// Atributos:
// Descricao
// Banda
// Download
// Qtde_Email
// Métodos:
// Todos os métodos SET e GET dos atributos da classe
// Pagamento, que receba a data e informe o valor a ser pago

class Internet extends Servicos{
	// Variables
	protected String 	descricao;
	protected float		banda;
	protected float		download;
	protected int		mailQtd;

	// Set Methods
	public void setDesc(String desc){
		this.descricao = desc;
	}

	public void setBanda(float banda){
		this.banda = banda;
	}

	public void setDown(float down){
		this.download = down;
	}

	public void setMailQtd(float qtd){
		this.mailQtd = qtd;
	}

	// Get Methods

	public String getDesc() {
		return this.descricao;
	}

	public float getBanda() {
		return this.banda;
	}

	public float getDown() {
		return this.download;
	}

	public int getMailQtd() {
		return this.mailQtd;
	}



	public float Pagamento(String data){
		// Pagamento, que receba a data e informe o valor a ser pago
		return price;
	}

}
