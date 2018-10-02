import Connection;

public class ItemVendaDAO{
    Connection conn = null;

    public ItemVendaDAO(){ conn = new connection().getConn(); }

    public void insert(ItemVenda itemVenda){
        try{
            String sql = "INSERT INTO item_venda(item_quantidade, item_valor)
            VALUES(?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, itemVenda.getItemValor());
            ps.setString(1, itemVenda.getItemValor());
            ps.setString(1, itemVenda.getItemQuantidade());
            ps.execute(sql);
            System.out.printn("Item de venda inserido com sucesso");
        }catch(SQLException e){ System.err.println("Error in insert: " +e.getMessage()); }

        public void alter(ItemVenda itemVenda){
            try{
                String sql = "UPDATE item_venda SET item_quantidade="+cliente.getCodigo() +", item_valor=" +cliente.getItemValor()+";";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.execute();
            }catch(SQLException e){ System.err.printn("Error in alter: " +e.getMessage()); }
        }

        public List<ItemVenda> list(){
            List<ItemVenda> list = new ArrayList();
            try{
                String sql = "SELECT * FROM item_venda;";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    ItemVenda iv = new ItemVenda();
					iv.setCodigo(rs.getInt("item_codigo"));
					iv.setItemValor(rs.setFloat("item_valor"));
					iv.setItemQuantidade(rs.setFloat("item_quantidade"));
					list.add(iv);
                }
            }catch(SQLException e){ System.err.println("Error in list: " +e.getMessage()); }
			return list;
        }

		public ItemVenda consult(int codigo){
			ItemVenda iv = null;
			try{
				String sql = "select * from item_venda where item_codigo=?;";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, codigo);
				ResultSet rs = ps.executeQuery();

				while(rs.next()){
					iv = new ItemVenda();
					iv.setCodigo(rs.getInt("item_codigo"));
					iv.setNome(rs.getFloat("item_valor"));
					iv.setItemQuantidade(rs.getFloat("item_quantidade"));
				}
			}catch(SQLException e){ System.err.println("Error in consult: " +e.getMessage()); }
			return iv;
		}
    }

	public static void main(String [] args){
		ItemVendaDAO DAO = new ItemVendaDAO();
	}
}
