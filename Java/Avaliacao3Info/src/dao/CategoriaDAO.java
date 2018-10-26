package dao;
import dao.models.Categoria;
import java.sql.*;
import java.util.*;


public class CategoriaDAO {
    Connection conn = null;
    public CategoriaDAO(){ conn = new connection().getConn(); }

    public void insert(Categoria categoria){
        try{
            String sql = "INSERT INTO categoria(cat_descricao) VALUES(?);";
            PreparedStatement ps = conn.prepareStatement("sql");
            ps.setString(1, categoria.getDescricao());
            ps.execute(sql);
            System.out.println("Categoria inserida com sucesso");
        }catch(SQLException e){ System.err.println("Error in insert: " +e.getMessage()); }
    }

    public void alter(Categoria categoria){
        try{
            String sql = "UPDATE categoria SET cat_descricao=" +categoria.getDescricao() + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            int row = ps.executeUpdate();
            System.out.println("[" +row +"] - Categorias alteradas!");
        }catch(SQLException e){ System.err.println("Error in alter: " +e.getMessage()); }
    }

    public void delete(Categoria categoria){
        try{
            String sql = "DELETE FROM categoria WHERE cat_descricao="+categoria.getDescricao()+";";
            PreparedStatement ps = conn.prepareStatement(sql);
            int row = ps.executeUpdate(sql);
        }catch(SQLException e){ System.err.println("Error in delete: " +e.getMessage()); }
    }

    public List<Categoria> list(){
        List<Categoria> list = new ArrayList();
        try{
            String sql = "SELECT * FROM categoria";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while(rs.next()){
                Categoria c = new Categoria();
                c.setCodigo(rs.getInt("cat_codigo"));
                c.setDescricao(rs.getString("cat_descricao"));
                list.add(c);
            }
        }catch(SQLException e){ System.err.println("Error in list: " +e.getMessage()); }
        return list;
    }

    public Categoria consult(int codigo){
        Categoria c = null;
        try{
            String sql = "SELECT * FROM categoria WHERE cat_codigo=" +codigo + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                c = new Categoria();
                c.setCodigo(rs.getInt("cat_codigo"));
                c.setDescricao(rs.getString("cat_descricao"));
            }
        }catch(SQLException e){ System.err.println("Error in consult: " +e.getMessage()); }
        return c;
    }

    public static void main(String [] args){
        CategoriaDAO DAO = new CategoriaDAO();
    }
}
