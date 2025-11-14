package br.com.fiap.beans;

public class RecomendacaoCarreira {
    private int idRecomendacao;
    private Usuario usuario;
    private Carreira carreira;
    private String nivelCompatibilidade;
    private String justificativa;

    public RecomendacaoCarreira() {
    }

    public RecomendacaoCarreira(int idRecomendacao, Usuario usuario, Carreira carreira, String nivelCompatibilidade, String justificativa) {
        this.idRecomendacao = idRecomendacao;
        this.usuario = usuario;
        this.carreira = carreira;
        this.nivelCompatibilidade = nivelCompatibilidade;
        this.justificativa = justificativa;
    }

    public int getIdRecomendacao() {
        return idRecomendacao;
    }

    public void setIdRecomendacao(int idRecomendacao) {
        this.idRecomendacao = idRecomendacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Carreira getCarreira() {
        return carreira;
    }

    public void setCarreira(Carreira carreira) {
        this.carreira = carreira;
    }

    public String getNivelCompatibilidade() {
        return nivelCompatibilidade;
    }

    public void setNivelCompatibilidade(String nivelCompatibilidade) {
        this.nivelCompatibilidade = nivelCompatibilidade;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }
}
