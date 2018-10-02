import Connection;

public class ProdutoDAO{
	Connection conn = null;

	public ProdutoDAO(){ conn = new connection().getConn(); }

	public void insert(Produto produto){
		try{
			String sql = "INSERT INTO produto(pro_descricao, pro_custo, pro_estoque)
						VALUES(?, ?, ?);";
			PreparedStatement ps = conn.PrepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setFloat(2, produto.getPreco());
			ps.setFloat(3, produto.getEstoque());
			ps.execute(sql);
			System.out.println("Produto inserido com sucesso");
		}catch(SQLException e){ System.err.println("Error in insert: " +e.getMessage()); }
	}

	public void alter(Produto produto){
		try{
			String sql = "UPDATE produto SET
			pro_descricao="+produto.getNome()+", pro_custo="+produto.getPreco()+", pro_estoque="+produto.getEstoque()+";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
		}catch(SQLException e){ System.err.println("Error i/n alter: " +e.getMessage()); }
	}

	public List<Produto> list(){
		List<Produto> list = new ArrayList();
		try{
			String sql = "SELECT * FROM produto;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				Produto produto = new Produto();
				produto.setCodigo(rs.getInt("pro_codigo"));
				produto.setNome(rs.getString("pro_descricao"));
				produto.setPreco(rs.getFloat("pro_custo"));
				produto.setEstoque(rs.getFloat("pro_estoque"));
				list.add(produto);
			}
		}catch(SQLException e){ System.err.println("Error in list: " +e.getMessage()); }
		return list;
	}

	public Produto consult(int codigo){
		Produto produto = null;
		try{
			String sql = "SELECT * from produto WHERE pro_codigo="+codigo+";";
			PrepareStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.execute();

			while(rs.next()){
				produto = new Produto();
				produto.setCodigo(rs.getInt("pro_codigo"));
				produto.setNome(rs.getString("pro_descricao"));
				produto.setPreco(rs.getFloat("pro_custo"));
				produto.setEstoque(rs.getFloat("pro_estoque"));
			}
		}catch(SQLException e){ System.err.println("Error in consult: " +e.getMessage()); }
		return produto;
	}

	public static void main(String args[]){
		ProdutoDAO DAO = new ProdutoDAO();
	}

}
