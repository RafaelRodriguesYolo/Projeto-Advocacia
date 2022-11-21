public class Processos{
    private String processo;
    private String requerido;
    private String comarca;
    private String tipo;
    private String data;
    private String audiencia;
    private String mov_proc;
    private Double valor;
    
    public Processos(String processo, String requerido, String comarca, String tipo, String data, String audiencia, String mov_proc, Double valor){
        this.processo = processo;
        this.requerido = requerido;
        this.comarca = comarca;
        this.tipo = tipo;
        this.data = data;
        this.audiencia = audiencia;
        this.mov_proc = mov_proc;
        this.valor = valor;
    }
    public String getProcesso(){
        return processo;
    }
    public void setProcesso(String processo){
        this.processo = processo;
    }
    public String getComarca(){
        return comarca;
    }
    public void setComarca(String comarca){
        this.comarca = comarca;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getAudiencia(){
        return audiencia;
    }
    public void setAudiencia(String audiencia){
        this.audiencia = audiencia;
    }
    public String getMoviemnto(){
        return mov_proc;
    }
    public void setMoviemnto(String mov_proc){
        this.mov_proc = mov_proc;
    }
    public Double getValor(){
        return valor;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }
    public String getRequerido(){
        return requerido;
    }
    public void setRequerido(String requerido){
        this.requerido = requerido;
    }
    public String toString(){
        return "\nNº do Processo: " + processo + "\nRequerido: " + requerido + "\nComarca: " + comarca + "\nTipo de Processo: " + tipo + "\nData de Abertura: " + data + "\nData da Audiencia: " + audiencia + "\nValor do Processo: R$" +  valor + "\nMovimento: " + mov_proc;
    }
}