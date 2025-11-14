package br.com.fiap.beans;

public class Interesse {
    private int idInteresse;
    private Usuario usuario;
    private String areaDesejada;
    private String motivacao;
    private int nivelInteresse; //0 a 10

    public Interesse() {
    }

    public Interesse(int idInteresse, Usuario usuario, String areaDesejada, String motivacao, int nivelInteresse) {
        this.idInteresse = idInteresse;
        this.usuario = usuario;
        this.areaDesejada = areaDesejada;
        this.motivacao = motivacao;
        this.nivelInteresse = nivelInteresse;
    }

    public int getIdInteresse() {
        return idInteresse;
    }

    public void setIdInteresse(int idInteresse) {
        this.idInteresse = idInteresse;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAreaDesejada() {
        return areaDesejada;
    }

    public void setAreaDesejada(String areaDesejada) {
        this.areaDesejada = areaDesejada;
    }

    public String getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(String motivacao) {
        this.motivacao = motivacao;
    }

    public int getNivelInteresse() {
        return nivelInteresse;
    }

    public void setNivelInteresse(int nivelInteresse) {
        this.nivelInteresse = nivelInteresse;
    }
}
