/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
import dao.models.Venda;
import java.util.*;

/**
 *
 * @author manager
 */
public class VendaDAO {

    Connection conn = null;

    public VendaDAO() {
        conn = new connection().getConn();
    }

    public void insert(Venda venda) {
        try {
            String sql = "INSERT INTO venda(ven_data) VALUES(?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, venda.getData());
            ps.execute(sql);
        } catch (SQLException e) {
            System.err.println("Error in insert: " + e.getMessage());
        }
    }

    public void alter(Venda venda) {
        try {
            String sql = "UPDATE venda SET ven_data=" + venda.getData() +";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        }catch(SQLException e){ System.err.println("Error in alter: " + e.getMessage()); }
    }

    public List<Venda> list() {
        List<Venda> list = new ArrayList();
        try {
            String sql = "SELECT * FROM venda;";
            PreparedStatement  ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venda venda = new Venda();
                venda.setCodigo(rs.getInt("ven_codigo"));
                venda.setData(rs.getString("ven_data"));
                list.add(venda);
            }
        } catch (SQLException e) {
            System.err.println("Error in list: " + e.getMessage());
        }
        return list;
    }

    public Venda consult(int codigo) {
        Venda venda = null;
        try {
            String sql = "SELECT * FROM venda WHERE ven_codigo=" + codigo + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                venda = new Venda();
                venda.setCodigo(rs.getInt("ven_codigo"));
                venda.setData(rs.getString("ven_data"));
            }
        } catch (SQLException e) {
            System.err.println("Error in consult: " + e.getMessage());
        }
        return venda;
    }

    public static void main(String args[]) {
        VendaDAO DAO = new VendaDAO();
    }
}
