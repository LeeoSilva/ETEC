public class Produto{
	private int codigo;
	private String pro_nome;
	private float pro_preco;
	private int pro_estoque;

	public int getCodigo(){ return codigo; }
	public String getNome(){ return pro_nome; }
	public float getPreco(){ return pro_preco; }
	public int getEstoque(){ return pro_estoque; }

	public void getCodigo(int codigo){ this.codigo = codigo; }
	public void setNome(String nome){ this.pro_nome = nome; }
	public void setPreco(float preco){ this.pro_preco = preco; }
	public void setEstoque(int estoque){ this.pro_estoque = estoque; }
}
