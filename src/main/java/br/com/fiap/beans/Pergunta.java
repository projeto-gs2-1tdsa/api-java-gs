package br.com.fiap.beans;

public class Pergunta {
    private int idPergunta;
    private String descricao;

    public Pergunta() {
    }

    public Pergunta(int idPergunta, String descricao) {
        this.idPergunta = idPergunta;
        this.descricao = descricao;
    }

    public int getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
