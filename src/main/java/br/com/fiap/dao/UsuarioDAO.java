package br.com.fiap.dao;

import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public Connection minhaConexao;

    // metodo construtor com parâmetro vazio
    public UsuarioDAO() throws SQLException, ClassNotFoundException {
        //super();        pq isso? investigar
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // Insert
    public String inserirUsuario(Usuario usuario) throws SQLException {
        PreparedStatement stmt = null;

        try {
            stmt = minhaConexao.prepareStatement
                ("Insert into USUARIO values (?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, usuario.getIdUsuario());
        stmt.setString(2, usuario.getNomeUsuario());
        stmt.setString(3, usuario.getEmail());
        stmt.setString(4, usuario.getSenha());
        stmt.setInt(5, usuario.getIdade());
        stmt.setString(6, usuario.getEscolaridade());

        stmt.execute();
        return "Usuário cadastrado com sucesso!";

        } finally {
            if (stmt != null) stmt.close();
            // fecha conexão
            if (minhaConexao != null && !minhaConexao.isClosed()) minhaConexao.close();
        }
    }

    // Delete
    public String deletarUsuario(int idUsuario) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("Delete from USUARIO where idUsuario = ?");
        stmt.setInt(1, idUsuario);

        stmt.execute();
        stmt.close();

        return "Usuário deletado com sucesso!";
    }



}
