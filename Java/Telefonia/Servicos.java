// 4.Essa classe deverá ter os métodos:
// Construtor
// Métodos SET e GET para cada um dos atributos
// Método que permitirá a alteração do Telefone
// Método que permitirá a alteração do Endereço Completo (utilize agregação)
// Método que permitirá a alteração do E-Mail

class Servicos{
	final Comunicacao com = new Comunicacao();

	public void setEmpresa(String empresa){
		com.empresa = empresa;
	}

	public void setEndereco(String endereco){
		com.endereco = endereco;
	}

	public void setTelefone(int telefone){
		com.telefone = telefone;
	}

	public void setMail(String mail){
		com.mail = mail;
	}

	public void setPromoPrice(float promoPrice){
		com.promoPrice = promoPrice;
	}

	public void setVencimento(String vencimento){
		com.vencimento = vencimento;
	}

	public void setNormalPrice(float normalPrice){
		com.normalPrice = normalPrice;
	}


	// GETS
	public String getEmpresa(String empresa) {
		return com.empresa;
	}

	public String getEndereco(String endereco) {
		return com.endereco;
	}

	public int getTelefone(int telefone) {
		return com.telefone;
	}

	public String getMail(String mail) {
		return com.mail;
	}

	public float getPromoPrice(float promoPrice) {
		return com.promoPrice;
	}

	public String getVencimento(String vencimento) {
		return com.vencimento;
	}

	public float getNormalPrice(float normalPrice) {
		return com.normalPrice;
	}
}


