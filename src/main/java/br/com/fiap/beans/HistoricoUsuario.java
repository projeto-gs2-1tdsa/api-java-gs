package br.com.fiap.beans;

public class HistoricoUsuario {
    private int idHistoricoUsuario;
    private Usuario usuario;
    private String experienciaProfissional;
    private String formacao;
    private int anosExperiencia;

    public HistoricoUsuario() {
    }

    public HistoricoUsuario(int idHistoricoUsuario, Usuario usuario, String experienciaProfissional, String formacao, int anosExperiencia) {
        this.idHistoricoUsuario = idHistoricoUsuario;
        this.usuario = usuario;
        this.experienciaProfissional = experienciaProfissional;
        this.formacao = formacao;
        this.anosExperiencia = anosExperiencia;
    }

    public int getIdHistoricoUsuario() {
        return idHistoricoUsuario;
    }

    public void setIdHistoricoUsuario(int idHistoricoUsuario) {
        this.idHistoricoUsuario = idHistoricoUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getExperienciaProfissional() {
        return experienciaProfissional;
    }

    public void setExperienciaProfissional(String experienciaProfissional) {
        this.experienciaProfissional = experienciaProfissional;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
}
