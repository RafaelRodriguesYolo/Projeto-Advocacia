public class Clientes extends Pessoa {
        private String cod_cli;
        private String honorario;
        private String situ;
        private String protesto;
        private Endereco endereco; 
        
        public Clientes(String cod_cli, String honorario, String situ, String protesto, String nome, String civil, String nascimento, String email, String CPF, String RG, String telefone, Endereco endereco){
            super(nome, civil, nascimento, email, CPF, RG, telefone);
            this.cod_cli = cod_cli;
            this.honorario = honorario;
            this.situ = situ;
            this.protesto = protesto;
            this.endereco = endereco;
        }
        public String getCodCli(){
            return cod_cli;
        }
        public void setCodCli(String cod_cli){
            this.cod_cli = cod_cli;
        }
        public String getHonorario(){
            return honorario;
        }
        public void setHonorario(String honorario){
            this.honorario = honorario;
        }
        public String getSituacao(){
            return situ;
        }
        public void setSituacao(String situ){
            this.situ = situ;
        }
        public String getProtesto(){
            return protesto;
        }
        public void setProtesto(String protesto){
            this.protesto = protesto;
        }
        public Endereco getEndereco(){
            return endereco;
        }
        public void setEndereco(Endereco endereco){
            this.endereco = endereco;
        }
        @Override
        public String toString(){
            return "\nCódigo de Registro:" + cod_cli + super.toString() + "\nSituação: " + situ + "\nHonorários: " + honorario + "%" + "\nProtesto: " + protesto + endereco;
        }
}