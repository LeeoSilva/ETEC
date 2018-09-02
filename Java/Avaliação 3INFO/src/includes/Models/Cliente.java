public class Cliente{
	// Variables

	private int codigo;
	private String cli_nome;
	private String cli_nascimento;
	private String cli_cpf;
	private String cli_rg;
	private String cli_endereco;
	private String cli_email;

	// Gets

	public int getCodigo(){ return codigo; }
	public String getNome(){ return cli_nome; }
	public String getNascimento(){ return cli_nascimento; }
	public String getCPF(){ return cli_cpf; }
	public String getRG(){ return cli_rg; }
	public String getEndereco(){ return cli_endereco; }
	public String getEmail(){ return cli_email; }

	// Sets

	public void setCodigo(int codigo){ this.codigo = codigo; }
	public void setNome(String nome){ this.cli_nome = nome; }
	public void setNascimento(String nascimento){ this.nascimento  = nascimento; }
	public void getCPF(String cpf){ this.cli_cpf = cpf; }
	public void getRG(String rg){ this.cli_rg = rg; }
	public void getEndereco(String Endereco){ this.cli_endereco = endereco; }
	public void getEmail(String email){ this.cli_email = email; }
}
