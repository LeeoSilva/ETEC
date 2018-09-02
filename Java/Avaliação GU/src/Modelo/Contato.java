package Modelo;
public class Contato {
    private int codigo;
    private String nome;
    private String tel;
    private String email;
    private String cel;


    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
   public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTel(){
        return tel;
    }
    public void setTel(String Tel){
        this.tel = Tel;
    }
     public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email = Email;
    }
    public String getCel(){
        return cel;
    }
    public void setCel(String Cel){
        this.cel = Cel;
    }
}
