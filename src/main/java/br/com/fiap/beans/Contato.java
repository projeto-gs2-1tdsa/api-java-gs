package br.com.fiap.beans;

public class Contato {
    private int idContato;
    private String nomeUsuario;
    private String email;
    private String mensagem;
    private String tipo; //erro, dúvida

    public Contato() {
    }

    public Contato(int idContato, String nomeUsuario, String email, String mensagem, String tipo) {
        this.idContato = idContato;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
