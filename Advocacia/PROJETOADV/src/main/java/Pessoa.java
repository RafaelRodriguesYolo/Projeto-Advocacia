public class Pessoa {
   private String nome;
   private String civil;
   private String dataNasc;
   private String email;
   private double CPF;
   private double RG;
   private double telefone;
   
   public Pessoa(String nome, String civil, String nascimento, String email, double CPF, double RG, double telefone){
        this.nome = nome;
        this.civil = civil;
        this.dataNasc = nascimento;
        this.email = email;
        this.CPF = CPF;
        this.RG = RG;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCivil(){
        return civil;
    }
    public void setCivil(String civil){
        this.civil = civil;
    }
    public String getNasc(){
        return dataNasc;
    }
    public void setNasc(String nascimento){
        this.dataNasc = nascimento;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public double getCpf(){
        return CPF;
    }
    public void setCpf(double CPF){
        this.CPF = CPF;
    }
    public double getRg(){
        return RG;
    }
    public void setRg(double RG){
        this.RG = RG;
    }
    public double getTel(){
        return telefone;
    }
    public  void setTel(double telefone){
        this.telefone = telefone;
    }
    @Override
    public String toString(){
        return "Pessoa\n" + "Nome: " + nome + "\nData de Nascimento: " + dataNasc + "\nE-mail: " +  email + "\nEstado Civil: " + civil + "\nCPF:  " + CPF + "\nRG: " + RG + "\nTelefone: " + telefone;
    }
}
