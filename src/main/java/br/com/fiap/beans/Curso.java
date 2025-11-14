package br.com.fiap.beans;

public class Curso {
    private int idCurso;
    private String nomeCurso;
    private String plataforma;
    private String duracao; // 3h, 3 meses
    private String nivel; // curso livre, técnico, etc
    private Carreira carreira;

    public Curso() {
    }

    public Curso(int idCurso, String nomeCurso, String plataforma, String duracao, String nivel, Carreira carreira) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.plataforma = plataforma;
        this.duracao = duracao;
        this.nivel = nivel;
        this.carreira = carreira;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Carreira getCarreira() {
        return carreira;
    }

    public void setCarreira(Carreira carreira) {
        this.carreira = carreira;
    }
}
