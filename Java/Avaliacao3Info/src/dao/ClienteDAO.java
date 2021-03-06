/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dao.models.Cliente;
import java.sql.*;
import java.util.*;

/**
 *
 * @author manager
 */
public class ClienteDAO {

    Connection conn = null;

    public ClienteDAO() {
        conn = new connection().getConn();
    }

    public void insert(Cliente cliente) {
        try {
            String sql =
            "INSERT INTO cliente(cli_nome, cli_nascimento, cli_cpf, cli_rg, cli_endereco, cli_email) VALUES( ?,  ?,  ?,  ?,  ?,  ?);";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getNascimento());
            ps.setString(3, cliente.getCPF());
            ps.setString(4, cliente.getRG());
            ps.setString(5, cliente.getEndereco());
            ps.setString(6, cliente.getEmail());
            ps.execute(sql);
            System.out.println("Contato Inserido com Sucesso");
        } catch (SQLException e) {
            System.err.println("Error in insert" + e.getMessage());
        }
    }

    public void alter(Cliente cliente) {
        try {
            String sql = 
            "UPDATE cliente SET cli_nome=" + cliente.getNome() + ", cli_nascimento=" + cliente.getNascimento() + ", cli_cpf=" + cliente.getCPF() + ", cli_rg=" + cliente.getRG() + ", cli_endereco=" + cliente.getEndereco() + ", cli_email=" + cliente.getEmail() + " WHERE cli_codigo=" + cliente.getCodigo() + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            int rowAlter = ps.executeUpdate();
            System.out.println("[" + rowAlter + "] - Cliente Alterados!");
        } catch (SQLException e) {
            System.err.println("Error in alter: " + e.getMessage());
        }
    }

    public void delete(Cliente cliente) {
        try {
            String sql = "DELETE FROM cliente WHERE cli_codigo=" + cliente.getCodigo() + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {
            System.err.println("Error in delete: " +e.getMessage()
        
    

    ); }
	}

	public List<Cliente> list(Cliente cliente) {
        List<Cliente> list = new ArrayList();
        try {
            String sql = "SELECT * from cliente;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCodigo(rs.getInt("cli_codigo"));
                c.setNome(rs.getString("cli_nome"));
                c.setNascimento(rs.getString("cli_nascimento"));
                c.setCPF(rs.getString("cli_cpf"));
                c.setRG(rs.getString("cli_rg"));
                c.setEndereco(rs.getString("cli_endereco"));
                c.setEmail(rs.getString("cli_email"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.err.println("Error in listar: "+e.getMessage());
        }
		return list;
    }

    public Cliente consult(int codigo) {
        Cliente c = null;
        try {
            String sql = "select * from cliente where cli_codigo= ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                c = new Cliente();
                c.setCodigo(rs.getInt("cli_codigo"));
                c.setNome(rs.getString("cli_nome"));
                c.setNascimento(rs.getString("cli_nascimento"));
                c.setCPF(rs.getString("cli_cpf"));
                c.setRG(rs.getString("cli_rg"));
                c.setEndereco(rs.getString("cli_endereco"));
                c.setEmail(rs.getString("cli_email"));
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return c;
    }

    public static void main(String[] args) {
        ClienteDAO DAO = new ClienteDAO();
        // Cliente c = new Cliente();
        // c.setCodigo(1);
        // c.setNome("Gerald of Rivia");
        // c.setNascimento("01/01/400");
        // c.setCPF("651645312465");
        // c.setRG("unknown");
        // c.setEmail("Gerald@Rivia.com");
    }
}
