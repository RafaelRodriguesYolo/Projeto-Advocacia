public class Pessoa {
    private String nome;
    private String civil;
    private String dataNasc;
    private String email;
    private String CPF;
    private String RG;
    private String telefone;
      
    public Pessoa(String nome, String civil, String nascimento, String email, String CPF, String RG, String telefone){
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
     public String getCpf(){
         return CPF;
     }
     public void setCpf(String CPF){
         this.CPF = CPF;
     }
     public String getRg(){
         return RG;
     }
     public void setRg(String RG){
         this.RG = RG;
     }
     public String getTel(){
         return telefone;
     }
     public  void setTel(String telefone){
         this.telefone = telefone;
     }
     @Override
     public String toString(){
         return "\nNome: " + nome + "\nData de Nascimento: " + dataNasc + "\nE-mail: " +  email + "\nEstado Civil: " + civil + "\nCPF: " + CPF + "\nRG: " + RG + "\nTelefone: " + telefone + "\n";
     }
 }