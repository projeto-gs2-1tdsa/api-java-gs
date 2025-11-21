package br.com.fiap.beans;

public class RecomendacaoCurso {
    private int idRecomendacao;
    private Usuario usuario;
    private Curso curso;
    private String nivelCompatibilidade;
    private String justificativa;

    public RecomendacaoCurso() {
    }

    public RecomendacaoCurso(int idRecomendacao, Usuario usuario, Curso curso, String nivelCompatibilidade, String justificativa) {
        this.idRecomendacao = idRecomendacao;
        this.usuario = usuario;
        this.curso = curso;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
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
