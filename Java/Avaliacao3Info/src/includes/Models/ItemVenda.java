public class ItemVenda{
	private int codigo;
	private int item_quantidade;
	private float item_valor;

	public int getCodigo(){ return codigo; }
	public int getItemValor(){ return item_valor; }
	public float getItemQuantidade(){ return item_quantidade; }

	public void setCodigo(int codigo){ this.codigo = codigo; }
	public void setItemValor(int valor){ this.item_valor = valor; }
	public void setItemQuantidade(int quant){ this.item_quantidade = quant; }

}
