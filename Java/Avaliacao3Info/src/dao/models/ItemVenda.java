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
public class ItemVenda {
    private int codigo;
	private int item_quantidade;
	private float item_valor;

	public int getCodigo(){ return codigo; }
	public float getItemValor(){ return item_valor; }
	public float getItemQuantidade(){ return item_quantidade; }

	public void setCodigo(int codigo){ this.codigo = codigo; }
	public void setItemValor(float valor){ this.item_valor = valor; }
	public void setItemQuantidade(int quant){ this.item_quantidade = quant; }
}
