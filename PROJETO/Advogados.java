public class Advogados extends Pessoa{
    private String cod_adv;
    private String OAB;
    private String cod_login;
    private String senha;
    private Endereco endereco; 
    
    public Advogados(String cod_adv, String OAB, String cod_login, String senha, String nome, String civil, String nascimento, String email, String CPF, String RG, String telefone, Endereco endereco){
        super(nome, civil, nascimento, email, CPF, RG, telefone);
        this.cod_adv = cod_adv;
        this.OAB = OAB;
        this.cod_login = cod_login;
        this.senha = senha;
        this.endereco = endereco;
    }
    public String getCodAdv(){
        return cod_adv;
    }
    public void setCodAdv(String cod_adv){
        this.cod_adv = cod_adv;
    }
    public String getOab(){
        return OAB;
    }
    public void setOab(String OAB){
        this.OAB = OAB;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public String getLogin(){
        return cod_login;
    }
    public void setLogin(String cod_login){
        this.cod_login = cod_login;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    @Override
    public String toString(){
        return "\n Código: " + cod_adv + "\nNº da OAB: " + OAB + "\n" + super.toString() + endereco;
    }
}