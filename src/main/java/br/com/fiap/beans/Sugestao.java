package br.com.fiap.beans;

public class Sugestao {
    private int idSugestao;
    private Usuario usuario;
    private String descricao;
    private String status; // pendente, em análise, resolvida

    public Sugestao() {
    }

    public Sugestao(int idSugestao, Usuario usuario, String descricao, String status) {
        this.idSugestao = idSugestao;
        this.usuario = usuario;
        this.descricao = descricao;
        this.status = status;
    }

    public int getIdSugestao() {
        return idSugestao;
    }

    public void setIdSugestao(int idSugestao) {
        this.idSugestao = idSugestao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
