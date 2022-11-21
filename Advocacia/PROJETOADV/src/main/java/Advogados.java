public class Advogados extends Pessoa{
    private String OAB;
    
    public Advogados(String OAB, String nome, String civil, String nascimento, String email, double CPF, double RG, double telefone){
        super(nome, civil, nascimento, email, CPF, RG, telefone);
        this.OAB = OAB;
    }
    public String getOab(){
        return OAB;
    }
    public void setOab(String  OAB){
        this.OAB = OAB;
    }
    @Override
    public String toString(){
        return "Advoado" + "\nNº da OAB: " + OAB + "\n" + super.toString();
    }
}
