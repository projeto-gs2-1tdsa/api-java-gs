package br.com.fiap.main;

import br.com.fiap.beans.Estado;
import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;

public class InserirUsuario {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Usuario objUsuario = new Usuario();

        UsuarioDAO objUsuarioDao = new UsuarioDAO();

        objUsuario.setIdUsuario(inteiro("Informe o id"));
        objUsuario.setNomeUsuario(texto("Informe o Nome "));
        objUsuario.setEmail(texto("Informe o email"));
        objUsuario.setSenha(texto("Informe a senha"));
        objUsuario.setIdade(inteiro("Informe a idade"));
        objUsuario.setEscolaridade(texto("Informe a escolaridade"));

// CORRETO: criar o objeto Estado
        Estado objEstado = new Estado();
        objEstado.setIdEstado(inteiro("Informe o ID do estado"));  // pedir o ID ao usuário

// setar o objeto completo no usuário
        objUsuario.setEstado(objEstado);

// Inserir
        System.out.println(objUsuarioDao.inserirUsuario(objUsuario));

    }

}
