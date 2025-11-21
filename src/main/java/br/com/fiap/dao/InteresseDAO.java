package br.com.fiap.dao;

import br.com.fiap.beans.Estado;
import br.com.fiap.beans.Interesse;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InteresseDAO {

    public Connection minhaConexao;

    // metodo construtor com parâmetro vazio
    public InteresseDAO() {
        super();
    }

    // Insert
    public String inserirInteresse(Interesse interesse) throws SQLException, ClassNotFoundException {
        PreparedStatement stmt = null;

        try {
            // abre a conexao dentro do metodo
            minhaConexao = new ConexaoFactory().conexao();
            stmt = minhaConexao.prepareStatement
                    ("Insert into INTERESSE values (?, ?, ?, ?, ?)");

            stmt.setInt(1, interesse.getIdInteresse());
            stmt.setInt(2, interesse.getUsuario().getIdUsuario());// FK
            stmt.setString(3, interesse.getAreaDesejada());
            stmt.setString(4, interesse.getMotivacao());
            stmt.setInt(5, interesse.getNivelInteresse());

            stmt.execute();
            return "Interesse cadastrado com sucesso!";

        } finally {
            if (stmt != null) stmt.close();
            if (minhaConexao != null && !minhaConexao.isClosed()) minhaConexao.close();
        }
    }

    // Delete
    public String deletarInteresse(int idInteresse) throws SQLException, ClassNotFoundException {
        PreparedStatement stmt = null;

        try {
            // abre a conexao dentro do metodo
            minhaConexao = new ConexaoFactory().conexao();
            stmt = minhaConexao.prepareStatement("Delete from INTERESSE where IDINTERESSE = ?");
            stmt.setInt(1, idInteresse);

            stmt.execute();
            return "Interesse deletado com sucesso!";

        } finally {
            if (stmt != null) stmt.close();
            if (minhaConexao != null && !minhaConexao.isClosed()) minhaConexao.close();
        }
    }


    // UpDate
    public String atualizarInteresse(Interesse interesse) throws SQLException, ClassNotFoundException {
        PreparedStatement stmt = null;
        try {
            minhaConexao = new ConexaoFactory().conexao();

            stmt = minhaConexao.prepareStatement("Update INTERESSE set IDUSUARIO = ?, AREADESEJADA = ?, MOTIVACAO = ?, NIVELINTERESSE = ? where IDINTERESSE = ?");

            stmt.setInt(1, interesse.getUsuario().getIdUsuario()); // FK
            stmt.setString(2, interesse.getAreaDesejada());
            stmt.setString(3, interesse.getMotivacao());
            stmt.setInt(4, interesse.getNivelInteresse());
            stmt.setInt(5, interesse.getIdInteresse());

            stmt.executeUpdate();
            return "Interesse atualizado com sucesso!";

        } finally {
            if (stmt != null) stmt.close();
            if (minhaConexao != null && !minhaConexao.isClosed()) minhaConexao.close();
        }
    }

    // Select
    public List<Interesse> selecionarInteresse() throws SQLException, ClassNotFoundException {
        List<Interesse> listaInteresses = new ArrayList<Interesse>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            minhaConexao = new ConexaoFactory().conexao();

            stmt = minhaConexao.prepareStatement("select * from INTERESSE");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Interesse interesse = new Interesse();
                interesse.setIdInteresse(rs.getInt(1));

                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt(2));
                interesse.setUsuario(usuario);

                interesse.setAreaDesejada(rs.getString(3));
                interesse.setMotivacao(rs.getString(4));
                interesse.setNivelInteresse(rs.getInt(5));

                listaInteresses.add(interesse);
            }

            return listaInteresses;

        } finally {
            if (rs != null) rs.close();// fecha ResultSet
            if (stmt != null) stmt.close();// fecha Statement
            if (minhaConexao != null && !minhaConexao.isClosed()) minhaConexao.close(); // fecha Conexão
        }
    }

    public int contarInteressesPorUsuario(int idUsuario) throws SQLException, ClassNotFoundException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int total = 0;

        try {
            minhaConexao = new ConexaoFactory().conexao();

            stmt = minhaConexao.prepareStatement("select count(*) from INTERESSE where IDUSUARIO = ?");
            stmt.setInt(1, idUsuario);

            rs = stmt.executeQuery();

            if (rs.next()) {
                total = rs.getInt(1);
            }

            return total;

        } finally {
            if (rs != null) rs.close(); // fecha ResultSet
            if (stmt != null) stmt.close(); // fecha Statement
            if (minhaConexao != null && !minhaConexao.isClosed()) minhaConexao.close(); // fecha Conexão
        }
    }

    public Interesse buscarInteressePorNome(int idUsuario, String areaDesejada)
            throws SQLException, ClassNotFoundException {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Abre conexão
            Connection conexao = new ConexaoFactory().conexao();

            stmt = conexao.prepareStatement("select * from INTERESSE where IDUSUARIO = ? and AREADESEJADA = ?");
            stmt.setInt(1, idUsuario);
            stmt.setString(2, areaDesejada);

            rs = stmt.executeQuery();

            if (rs.next()) {
                Interesse interesse = new Interesse();
                interesse.setIdInteresse(rs.getInt(1));

                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt(2));
                interesse.setUsuario(usuario);

                interesse.setIdInteresse(rs.getInt(3));

                return interesse;
            }

            return null; // se não achou

        } finally {
            if (rs != null) rs.close(); // fecha ResultSet
            if (stmt != null) stmt.close(); // fecha Statement
            if (minhaConexao != null && !minhaConexao.isClosed()) minhaConexao.close(); // fecha Conexão
        }
    }
}