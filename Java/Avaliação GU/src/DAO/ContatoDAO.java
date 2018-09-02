.

package DAO;

/**
 *
 * @authorEliezer
 */

import gui.Inserir;
import gui.Listar;
import Modelo.Contato;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.lang.Iterable;


public class ContatoDAO {

    boolean next;
    Connection conexao;

    //Criarcontrutor metodo
    public ContatoDAO(){
       conexao = new Conexao().getConexao();
    }

    public void inserir(Contato Contato){
        try {
            String sql = "INSERT INTO contato(nome,telefone,email) VALUES ("+Contato.getNome()+","+Contato.getTel()+","+Contato.getEmail()+","+Contato.getCel()+")";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,Contato.getNome());
            ps.setString(2,Contato.getTel());
            ps.setString(3,Contato.getEmail());
            ps.setString(3,Contato.getCel());
            ps.execute(sql);
            System.out.println("Contato Inserido Com Sucesso");
        } catch (SQLException ex) {
            System.err.println("ERROR: "+ex.getMessage());
        }
    }

    public void alterar(Contato Contato){
        try{
            String sql = "UPDATE contato SET nome="+Contato.getNome()+" , telefone="+Contato.getTel()+" , email="+Contato.getEmail()+" WHERE codigo="+Contato.getCodigo()+";";
            PreparedStatement ps=conexao.prepareStatement(sql);
            //ps.setString(1,Contato.getNome());
            //ps.setString(2,Contato.getTel());
            //ps.setString(3,Contato.getEmail());
            //ps.setInt(4,Contato.getCodigo());
            int q = ps.executeUpdate();
            System.out.println("[" + q + "] - Contato(s) Alterado!");
        } catch(SQLException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
    }

    public void excluir(Contato Contato){
        try{
            String sql = " DELETE FROM contato WHERE codigo="+Contato.getCodigo()+";";
            PreparedStatement ps=conexao.prepareStatement(sql);
            //ps.setString(1,Contato.getNome());
            //ps.setString(2,Contato.getTel());
            //ps.setString(3,Contato.getEmail());
            ps.setInt(1,Contato.getCodigo());
            ps.execute();
            System.out.println("Contato Exluído Com Sucesso!");
        } catch(SQLException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
    }
    public List<Contato> listar(){
        List<Contato> lista=new ArrayList();
        try {
            String sql="select * from contato;";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Contato c=new Contato();
                c.setCodigo(rs.getInt("Codigo"));
                c.setNome(rs.getString("Nome"));
                c.setEmail(rs.getString("Email"));
                c.setTel(rs.getString("Telefone"));
                c.setCel(rs.getString("Celular"));
                lista.add(c);



            }
        } catch (SQLException ex) {
            System.err.println("ERRO ao listar: "+ex.getMessage());
        }
        return lista;
    }

    public Contato consultar(int codigo){
        Contato c= null;
        try {
            String sql="select * from contato where codigo= ?;";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                c = new Contato();
                c.setCodigo(rs.getInt("Codigo"));
                c.setNome(rs.getString("Nome"));
                c.setEmail(rs.getString("Email"));
                c.setTel(rs.getString("Telefone"));
                c.setCel(rs.getString("Celular"));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: "+ex.getMessage());
        }
        return c;
    }

    public static void main(String[] args){
        ContatoDAO DAO = new ContatoDAO();
        /*Contato contato = new Contato();
        contato.setNome("luis");
        contato.setEmail("luis@luis.com");
        contato.setTel("565132132");
        contato.setCodigo(3);*/
    };
}
