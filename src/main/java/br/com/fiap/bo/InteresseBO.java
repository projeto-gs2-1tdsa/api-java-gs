package br.com.fiap.bo;

import br.com.fiap.beans.Interesse;
import br.com.fiap.dao.InteresseDAO;

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
}
