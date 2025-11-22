package br.com.fiap.beans;


public class Alternativa {
    private int idAlternativa;
    private Pergunta pergunta;
    private String descricao;
    private Carreira carreira;

    public Alternativa() {
    }

    public Alternativa(int idAlternativa, Pergunta pergunta, String descricao, Carreira carreira) {
        this.idAlternativa = idAlternativa;
        this.pergunta = pergunta;
        this.descricao = descricao;
        this.carreira = carreira;
    }

    public int getIdAlternativa() {
        return idAlternativa;
    }

    public void setIdAlternativa(int idAlternativa) {
        this.idAlternativa = idAlternativa;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Carreira getCarreira() {
        return carreira;
    }

    public void setCarreira(Carreira carreira) {
        this.carreira = carreira;
    }
}
