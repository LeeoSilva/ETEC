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
public class Venda {
    private int codigo;
	private String ven_data;

	public int getCodigo(){ return codigo; }
	public String getData(){ return ven_data; }

	public void setCodigo(int codigo){ this.codigo = codigo; }
	public void setData(String data){ this.ven_data = data; }
}
