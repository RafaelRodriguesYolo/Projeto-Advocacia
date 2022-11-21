public class Contrato {
    private String cod_acordo;
    private String data_acordo;
    private Double valor_total;
    private int qtd_parc;
    private Double valor_parc;
    private String data_venc;
    private int parc_pagar;
    private int parc_vencidas;
    
    public Contrato(String cod_acordo, String data_acordo, Double valor_total,  int qtd_parc, Double valor_parc, String data_venc, int parc_pagar, int parc_vencidas){
        this.cod_acordo = cod_acordo;
        this.data_acordo = data_acordo;
        this.valor_total = valor_total;
        this.qtd_parc = qtd_parc;
        this.valor_parc = valor_parc; 
        this.data_venc = data_venc;
        this.parc_pagar = parc_pagar;
        this.parc_vencidas = parc_vencidas;
    }
    public String getCodAcordo(){
        return cod_acordo;
    }
    public void setCodAcordo(String cod_acordo){
        this.cod_acordo = cod_acordo;
    }
    public String getDataAcordo(){
        return data_acordo;
    }
    public void setDataAcordo(String data_acordo){
        this.data_acordo = data_acordo;
    }
    public Double getValorTotal(){
        return valor_total;
    }
    public void setValorTotal(Double valor_total){
        this.valor_total = valor_total;
    }
    public int getQtdParcela(){
        return qtd_parc;
    }
    public void setQtdParcela(int qtd_parc){
        this.qtd_parc = qtd_parc;
    }
    public Double getValorParcela(){
        return valor_parc;
    }
    public void setValorParcela(Double valor_parc){
        this.valor_parc = valor_parc;
    }
    public String getDataVenc(){
        return data_venc;
    }
    public void setDataVenc(String data_venc){
        this.data_venc = data_venc;
    }
    public int getParcelaPagar(){
        return parc_pagar;
    }
    public void setParcelaPaga(int parc_pagar){
        this.parc_pagar = parc_pagar;
    }
    public int getParcelaVencida(){
        return parc_vencidas;
    }
    public void setParcelaVencida(int parc_vencidas){
        this.parc_vencidas = parc_vencidas;
    }
    public String toString(){
        return "\nNº do Contrato: " + cod_acordo + "\nData do Acordo: " + data_acordo + "\nValor Total: R$" + valor_total + "\nValor da Parcela: R$" + valor_parc + "\nTotal de Parcelas: " + qtd_parc + "\nData do Vencimento: " + data_venc + "\nParcela em Aberto: " + parc_pagar + "\nParcelas em  Atraso: " + parc_vencidas;
    }
    
}