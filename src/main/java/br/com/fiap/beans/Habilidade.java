package br.com.fiap.beans;

public class Habilidade {
    private int idHabilidade;
    private Usuario usuario;
    private String nomeHabilidade; //JavaScript, comunicação
    private String nivelDominio; //básico,avançado
    private String tipo; // técnica, interpessoal

    public Habilidade() {
    }

    public Habilidade(int idHabilidade, String nomeHabilidade, Usuario usuario, String nivelDominio, String tipo) {
        this.idHabilidade = idHabilidade;
        this.nomeHabilidade = nomeHabilidade;
        this.usuario = usuario;
        this.nivelDominio = nivelDominio;
        this.tipo = tipo;
    }

    public int getIdHabilidade() {
        return idHabilidade;
    }

    public void setIdHabilidade(int idHabilidade) {
        this.idHabilidade = idHabilidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public String getNivelDominio() {
        return nivelDominio;
    }

    public void setNivelDominio(String nivelDominio) {
        this.nivelDominio = nivelDominio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
