package br.com.fiap.bo;

import br.com.fiap.beans.Interesse;
import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.InteresseDAO;
import br.com.fiap.dao.UsuarioDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class InteresseBO {

    InteresseDAO interesseDAO;

    // Selecionar
    public ArrayList<Interesse> selecionarInteresseBo() throws ClassNotFoundException, SQLException {
        interesseDAO = new InteresseDAO();

        return (ArrayList<Interesse>) interesseDAO.selecionarInteresse();
    }

    // Inserir
    public void inserirInteresseBo(Interesse interesse) throws ClassNotFoundException, SQLException {
        InteresseDAO interesseDao = new InteresseDAO();

        interesseDao.inserirInteresse(interesse);
    }

    // Atualizar
    public void atualizarInteresseBo(Interesse interesse) throws ClassNotFoundException, SQLException {
        InteresseDAO interesseDao = new InteresseDAO();

        interesseDao.atualizarInteresse(interesse);
    }

    // Deletar
    public void deletarInteresseBo(int idInteresse) throws ClassNotFoundException, SQLException {
        InteresseDAO interesseDao = new InteresseDAO();

        interesseDao.deletarInteresse(idInteresse);
    }


// ----- Regras de negocio ------


    // limite de interesses por usuário
    public void verificarLimiteInteresses(int idUsuario) throws SQLException, ClassNotFoundException {
        int total = interesseDAO.contarInteressesPorUsuario(idUsuario);

        // Se tiver 3 buga
        if (total >= 3) {
            throw new RuntimeException("Limite de interesses atingido (máximo: 3).");
        }
    }


    // não permite interesse repetido para o mesmo usuário
    public void verificarInteresseDuplicado(int idUsuario, String areaDesejada) throws SQLException, ClassNotFoundException {
        InteresseDAO interesseDao = new InteresseDAO();

        Interesse interesse = interesseDao.buscarInteressePorNome(idUsuario, areaDesejada);

        if (interesse != null) {
            throw new RuntimeException("Este interesse já está cadastrado para este usuário.");
        }
    }

}