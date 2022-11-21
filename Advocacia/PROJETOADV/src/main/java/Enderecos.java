public class Enderecos {
    private String rua;
    private int numero;
    private String complemento;
    private int CEP;
    private String cidade;
    private String estado;
    
    public Enderecos(String rua, int numero, String complemento, int CEP, String cidade, String estado){
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.cidade = cidade;
        this.estado = estado;
    }
    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public String getComplemento(){
        return complemento;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public int getCep(){
        return CEP;
    }
    public void setCep(int CEP){
        this.CEP = CEP;
    }
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getEstado(){
        return estado;
    }
    public  void setEstado(String estado){
        this.estado = estado;
    }
    public String toString(){
        return "\n---------Endereço---------" + "\nRua: " + rua + "Nº: " + numero + "\nComplemento: " + complemento + "\nCEP:  " + CEP + "\nCidade: " + cidade + "\nEstado: " + estado;
    }
}
