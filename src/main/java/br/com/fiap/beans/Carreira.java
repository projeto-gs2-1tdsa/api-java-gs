package br.com.fiap.beans;

public class Carreira {
    private int idCarreira;
    private String nomeCarreira;
    private String descricao;
    private String habilidadesNecessarias;
    private double salarioMedio;
    private String nivelDemanda;

    public Carreira() {
    }

    public Carreira(int idCarreira, String nomeCarreira, String descricao, String habilidadesNecessarias, double salarioMedio, String nivelDemanda) {
        this.idCarreira = idCarreira;
        this.nomeCarreira = nomeCarreira;
        this.descricao = descricao;
        this.habilidadesNecessarias = habilidadesNecessarias;
        this.salarioMedio = salarioMedio;
        this.nivelDemanda = nivelDemanda;
    }

    public int getIdCarreira() {
        return idCarreira;
    }

    public void setIdCarreira(int idCarreira) {
        this.idCarreira = idCarreira;
    }

    public String getNomeCarreira() {
        return nomeCarreira;
    }

    public void setNomeCarreira(String nomeCarreira) {
        this.nomeCarreira = nomeCarreira;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHabilidadesNecessarias() {
        return habilidadesNecessarias;
    }

    public void setHabilidadesNecessarias(String habilidadesNecessarias) {
        this.habilidadesNecessarias = habilidadesNecessarias;
    }

    public double getSalarioMedio() {
        return salarioMedio;
    }

    public void setSalarioMedio(double salarioMedio) {
        this.salarioMedio = salarioMedio;
    }

    public String getNivelDemanda() {
        return nivelDemanda;
    }

    public void setNivelDemanda(String nivelDemanda) {
        this.nivelDemanda = nivelDemanda;
    }

    @Override
    public String toString() {
        return "Carreira{" +
                "idCarreira=" + idCarreira +
                ", nomeCarreira='" + nomeCarreira + '\'' +
                ", descricao='" + descricao + '\'' +
                ", habilidadesNecessarias='" + habilidadesNecessarias + '\'' +
                ", salarioMedio=" + salarioMedio +
                ", nivelDemanda='" + nivelDemanda + '\'' +
                '}';
    }
}
