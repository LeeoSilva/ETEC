// 6.Crie uma subclasse Telefonia derivada da classe Servicos com as informações:
// Atributos
// Operadora
// Servicos_Inclusos
// Secretária(sim/não)
// Codigo_Operadora
// Métodos
// Todos os métodos SET e GET dos atributos da classe
// Pagamento, que receba a data e informe o valor a ser pago


class Telefonia extends Servicos{
	protected String operadora;
	protected String[] servicos = new String[4];
	protected boolean secretaria;
	protected int code;

	// Sets
	public void setOperadora(String op){
		this.operadora = op;
	} 

	public void setServicos(String serv){
		for( int i = 0; i <= this.servicos.length; i++ ){
			if( this.servicos[i] != "" ){
				this.servicos[i] = serv;
			}
		}
	}

	public void setSecretaria(boolean sec){
		this.secretaria = sec;
	}

	public void setCode(int code){
		this.code = code;
	}

	// Gets

	public String getOperadora(){
		return this.operadora;
	}

	public String[] getServicos(){
		return this.servicos[];
	} 

	public boolean getSecretaria(){
		return this.secretaria;
	}

	public int getCode(){
		return this.code;
	}

}
