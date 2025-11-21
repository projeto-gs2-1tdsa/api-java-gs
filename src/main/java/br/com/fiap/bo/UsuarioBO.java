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

        if (emailExiste(usuario.getEmail())) {
            throw new RuntimeException("Email já cadastrado!");
        }

        usuarioDao.inserirUsuario(usuario);
    }

    // Atualizar
    public void atualizarUsuariorBo(Usuario usuario) throws ClassNotFoundException, SQLException {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        Usuario usuarioExistente = usuarioDao.buscarPorEmail(usuario.getEmail());

        if (usuarioExistente != null && usuarioExistente.getIdUsuario() != usuario.getIdUsuario()) {
            throw new RuntimeException("Email já cadastrado!");
        }

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


    // ----- Regras de negocio ------


    // login
    public boolean verificarLogin(String email, String senha) throws SQLException, ClassNotFoundException {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        Usuario usuario = usuarioDao.buscarPorEmail(email);

        if (usuario == null) {
            return false;
        }

        return usuario.getSenha().equals(senha);
    }


    // verifica se email já foi cadastrado
    public boolean emailExiste(String email) throws SQLException, ClassNotFoundException {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        Usuario usuario = usuarioDao.buscarPorEmail(email);

        return usuario != null;
    }

}
