/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.models;

/**
 *
 * @author manager
 */
public class Produto {
    private int codigo;
	private String pro_nome;
	private float pro_preco;
	private int pro_estoque;

	public int    getCodigo(){ return codigo; }
	public String getNome(){ return pro_nome; }
	public float  getPreco(){ return pro_preco; }
	public int    getEstoque(){ return pro_estoque; }

	public void setCodigo(int codigo){ this.codigo = codigo; }
	public void setNome(String nome){ this.pro_nome = nome; }
	public void setPreco(float preco){ this.pro_preco = preco; }
	public void setEstoque(int estoque){ this.pro_estoque = estoque; }
}
