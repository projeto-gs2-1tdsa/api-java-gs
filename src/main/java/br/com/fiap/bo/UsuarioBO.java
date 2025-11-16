package br.com.fiap.bo;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioBO {

    UsuarioDAO usuarioDAO;

    // Selecionar
    public ArrayList<Usuario> selecionarUsuarioBo() throws ClassNotFoundException, SQLException {
        usuarioDAO = new UsuarioDAO();

        return (ArrayList<Usuario>) usuarioDAO.selecionarUsuario();
    }

    // Inserir
    public void inserirUsuarioBo(Usuario usuario) throws ClassNotFoundException, SQLException {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        normalizarUsuario(usuario);
        usuarioDao.inserirUsuario(usuario);
    }

    // Atualizar
    public void atualizarUsuariorBo(Usuario usuario) throws ClassNotFoundException, SQLException {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        usuarioDao.atualizarUsuario(usuario);
    }

    // Deletar
    public void deletarUsuarioBo(int idUsuario) throws ClassNotFoundException, SQLException {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        usuarioDao.deletarUsuario(idUsuario);
    }

    // Select Usuario ID
    public Usuario selecionarUsuarioPorIdBo(int idUsuario) throws SQLException, ClassNotFoundException {
        usuarioDAO = new UsuarioDAO();
        return usuarioDAO.selecionarUsuarioPorId(idUsuario);
    }

    // -------------------------
    // Metodos regras de negocio

    private void normalizarUsuario(Usuario usuario) {
        usuario.setNomeUsuario(usuario.getNomeUsuario().trim());
        usuario.setEmail(usuario.getEmail().toLowerCase());
    }
}
