package dao.models;

public class Categoria {
    private int codigo;
	private String cat_descricao;

	public int getCodigo(){ return codigo; }
	public String getDescricao(){ return cat_descricao; }

	public void setCodigo(int codigo){ this.codigo = codigo; }
	public void setDescricao(String desc){ this.cat_descricao = desc; }
}
