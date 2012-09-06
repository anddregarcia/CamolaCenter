/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import conexao.clsFunctions;
import conexao.clsJdbcDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Andre Garcia
 */
public class clsCadUsuarioDAO extends clsJdbcDAO { //cria classe que usa conecção com o banco

    public clsCadUsuarioDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions(); //Chama a classe

    public void InserirUsuario(clsCadUsuario Usuario) throws SQLException, ParseException { //Método que insere novo Usuario
        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_USUARIO ";
        sQuery = sQuery + " WHERE ID_USUARIO = " + Usuario.getiCodigo();
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_USUARIO "; //Monta query de UPDATE
            sQuery = sQuery + " SET ";
            sQuery = sQuery + "LOGIN = '" + Usuario.getsLogin() + "', ";
            sQuery = sQuery + "SENHA = '" + Usuario.getsSenha() + "', ";
            sQuery = sQuery + "TIPO_USUARIO = '" + Usuario.getsTpAcesso() + "' ";
            sQuery = sQuery + "WHERE ID_USUARIO = " + Usuario.getiCodigo();

            statement.executeUpdate(sQuery);
        } else {

            sQuery = "INSERT INTO CC_CAD_USUARIO (ID_USUARIO, LOGIN, SENHA, DATA_CAD, TIPO_USUARIO)"; //Monta query de INSERT
            sQuery = sQuery + " VALUES (";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_USUARIO", "ID_USUARIO") + ", "; //a função retorna o próximo ID
            sQuery = sQuery + "'" + Usuario.getsLogin() + "', "; //dados digitados na tela
            sQuery = sQuery + "'" + Usuario.getsSenha() + "', ";
            sQuery = sQuery + "STR_TO_DATE('" + function.fSysDate() + "','%d/%m/%Y'), ";
            sQuery = sQuery + "'" + Usuario.getsTpAcesso() + "') ";

            statement.executeUpdate(sQuery); //executa query
        }        
    }

    public ResultSet ConsultarUsuario(int iUsuario) throws SQLException {
        String sQuery;
        clsCadUsuario Usuario = null;

        sQuery = "SELECT ID_USUARIO, ";
        sQuery = sQuery + " LOGIN , ";
        sQuery = sQuery + " SENHA , ";
        //sQuery = sQuery + " DATE_FORMAT(DATA_CAD,'%d/%m/%Y') CADASTRADO, ";
        sQuery = sQuery + " TIPO_USUARIO ";
        sQuery = sQuery + "  FROM CC_CAD_USUARIO ";
        sQuery = sQuery + " WHERE ID_USUARIO = " + iUsuario;
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }

    public void ExcluiUsuario(int iUsuario) throws SQLException {
        String sQuery;

        sQuery = "DELETE FROM CC_CAD_USUARIO WHERE ID_USUARIO = " + iUsuario + "\n";
        statement.executeUpdate(sQuery);
    }

    public ResultSet ListaUsuario() throws SQLException {
        String sQuery;

        sQuery = "SELECT ID_USUARIO CÓDIGO, ";
        sQuery = sQuery + " LOGIN 'USUARIO', ";
        sQuery = sQuery + " DATE_FORMAT(DATA_CAD,'%d/%m/%Y') DATA, ";
        sQuery = sQuery + " TIPO_USUARIO TIPO ";
        sQuery = sQuery + " FROM CC_CAD_USUARIO ";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }
}
