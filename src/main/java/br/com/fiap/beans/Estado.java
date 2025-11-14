package br.com.fiap.beans;

public class Estado {
    private int idEstado;
    private String nomeEstado;
    private double mediaSalarial;
    private String demandaMercado;
    private double custoDeVida;
    private String principaisSetores;

    public Estado() {
    }

    public Estado(int idEstado, String nomeEstado, double mediaSalarial, String demandaMercado, double custoDeVida, String principaisSetores) {
        this.idEstado = idEstado;
        this.nomeEstado = nomeEstado;
        this.mediaSalarial = mediaSalarial;
        this.demandaMercado = demandaMercado;
        this.custoDeVida = custoDeVida;
        this.principaisSetores = principaisSetores;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public double getMediaSalarial() {
        return mediaSalarial;
    }

    public void setMediaSalarial(double mediaSalarial) {
        this.mediaSalarial = mediaSalarial;
    }

    public String getDemandaMercado() {
        return demandaMercado;
    }

    public void setDemandaMercado(String demandaMercado) {
        this.demandaMercado = demandaMercado;
    }

    public double getCustoDeVida() {
        return custoDeVida;
    }

    public void setCustoDeVida(double custoDeVida) {
        this.custoDeVida = custoDeVida;
    }

    public String getPrincipaisSetores() {
        return principaisSetores;
    }

    public void setPrincipaisSetores(String principaisSetores) {
        this.principaisSetores = principaisSetores;
    }
}
