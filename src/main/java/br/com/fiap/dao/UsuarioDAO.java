package br.com.fiap.dao;

import br.com.fiap.beans.Estado;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public Connection minhaConexao;

    // metodo construtor com parâmetro vazio
    public UsuarioDAO() {
        super();
    }

    // Insert
    public String inserirUsuario(Usuario usuario) throws SQLException, ClassNotFoundException {
        PreparedStatement stmt = null;

        try {
            // abre a conexao dentro do metodo
            minhaConexao = new ConexaoFactory().conexao();
            stmt = minhaConexao.prepareStatement
                    ("Insert into USUARIO values (?, ?, ?, ?, ?, ?, ?)");

            stmt.setInt(1, usuario.getIdUsuario());
            stmt.setString(2, usuario.getNomeUsuario());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            stmt.setInt(5, usuario.getIdade());
            stmt.setString(6, usuario.getEscolaridade());
            stmt.setInt(7, usuario.getEstado().getIdEstado()); // FK correta

            stmt.execute();
            return "Usuário cadastrado com sucesso!";

        } finally {
            if (stmt != null) stmt.close();
            if (minhaConexao != null && !minhaConexao.isClosed()) minhaConexao.close();
        }
    }

    // Delete
    public String deletarUsuario(int idUsuario) throws SQLException, ClassNotFoundException {
        PreparedStatement stmt = null;

        try {
            // abre a conexao dentro do metodo
            minhaConexao = new ConexaoFactory().conexao();
            stmt = minhaConexao.prepareStatement(
                    "Delete from USUARIO where IDUSUARIO = ?"
            );
            stmt.setInt(1, idUsuario);

            stmt.execute();
            return "Usuário deletado com sucesso!";

        } finally {
            if (stmt != null) stmt.close();
            if (minhaConexao != null && !minhaConexao.isClosed()) minhaConexao.close();
        }
    }

    // UpDate
    public String atualizarUsuario(Usuario usuario) throws SQLException, ClassNotFoundException {
        PreparedStatement stmt = null;

        try {
            minhaConexao = new ConexaoFactory().conexao();

            stmt = minhaConexao.prepareStatement(
                    "Update USUARIO set NOMEUSUARIO = ?, EMAIL = ?, SENHA = ?, IDADE = ?, ESCOLARIDADE = ?, IDESTADO = ? where IDUSUARIO = ?"
            );

        stmt.setString(1, usuario.getNomeUsuario());
        stmt.setString(2, usuario.getEmail());
        stmt.setString(3, usuario.getSenha());
        stmt.setInt(4, usuario.getIdade());
        stmt.setString(5, usuario.getEscolaridade());
        stmt.setInt(6, usuario.getEstado().getIdEstado());
        stmt.setInt(7, usuario.getIdUsuario());

            stmt.executeUpdate();
            return "Usuário atualizado com sucesso!";

        } finally {
            if (stmt != null) stmt.close();
            if (minhaConexao != null && !minhaConexao.isClosed()) minhaConexao.close();
        }
    }

    // Select
    public List<Usuario> selecionarUsuario() throws SQLException {
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("select * from USUARIO");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setIdUsuario(rs.getInt(1));
            usuario.setNomeUsuario(rs.getString(2));
            usuario.setEmail(rs.getString(3));
            usuario.setSenha(rs.getString(4));
            usuario.setIdade(rs.getInt(5));
            usuario.setEscolaridade(rs.getString(6));

            Estado estado = new Estado();
            estado.setIdEstado(rs.getInt(7));
            usuario.setEstado(estado);

            listaUsuarios.add(usuario);
        }
        return listaUsuarios;
    }

}
