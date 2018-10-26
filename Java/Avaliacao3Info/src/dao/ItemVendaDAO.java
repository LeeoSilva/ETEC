/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import dao.models.ItemVenda;
import java.util.*;

/**
 *
 * @author manager
 */
public class ItemVendaDAO {

    Connection conn = null;

    public ItemVendaDAO() {
        conn = new connection().getConn();
    }

    public void insert(ItemVenda itemVenda) {
        try {
            String sql = "INSERT INTO item_venda(item_quantidade, item_valor) VALUES( ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, itemVenda.getItemValor());
            ps.setFloat(2, itemVenda.getItemQuantidade());
            ps.execute(sql);
            System.out.println("Item de venda inserido com sucesso");
        } catch (SQLException e) {
            System.err.println("Error in insert: " + e.getMessage());
        }
    }

        

    public void alter(ItemVenda itemVenda){
        try {
            String sql = "UPDATE item_venda SET item_quantidade=" + itemVenda.getCodigo() + ", item_valor=" + itemVenda.getItemValor() + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {
            System.err.println("Error in alter: " + e.getMessage());
        }
    }

    public List<ItemVenda> list() {
        List<ItemVenda> list = new ArrayList();
        try {
            String sql = "SELECT * FROM item_venda;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ItemVenda iv = new ItemVenda();
                iv.setCodigo(rs.getInt("item_codigo"));
                iv.setItemValor(rs.getFloat("item_valor"));
                iv.setItemQuantidade(rs.getInt("item_quantidade"));
                list.add(iv);
            }
        } catch (SQLException e) {
            System.err.println("Error in list: " + e.getMessage());
        }
        return list;
    }

    public ItemVenda consult(int codigo) {
        ItemVenda iv = null;
        try {
            String sql = "select * from item_venda where item_codigo=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                iv = new ItemVenda();
                iv.setCodigo(rs.getInt("item_codigo"));
                iv.setItemValor(rs.getFloat("item_valor"));
                iv.setItemQuantidade(rs.getInt("item_quantidade"));
            }
        } catch (SQLException e) {
            System.err.println("Error in consult: " + e.getMessage());
        }
        return iv;
    }
}

//public static void main(String [] args){
//    ItemVendaDAO DAO = new ItemVendaDAO();
//}

