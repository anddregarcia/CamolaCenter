/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import conexao.clsFunctions;
import conexao.clsJdbcDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Andre Garcia
 */
public class clsCadSetorDAO extends clsJdbcDAO { //cria classe que usa conecção com o banco

    public clsCadSetorDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions(); //Chama a classe

    public void InserirSetor(clsCadSetor Setor) throws SQLException { //Método que insere novo turno
        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_SETOR ";
        sQuery = sQuery + " WHERE ID_SETOR = " + Setor.getiCodigo();
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_SETOR "; //Monta query de UPDATE
            sQuery = sQuery + " SET ";
            sQuery = sQuery + "DESC_LOCAL = '" + Setor.getsDescLoc() + "', ";
            sQuery = sQuery + "VLR_LOC = '" + Setor.getfValor() + "', ";
            sQuery = sQuery + "SET_MEDIDA = '" + Setor.getfMedida() + "', ";
            sQuery = sQuery + "STATUS = '" + Setor.getiStatus() + "' ";
            sQuery = sQuery + "WHERE ID_SETOR = " + Setor.getiCodigo();

            statement.executeUpdate(sQuery);
        } else {

            sQuery = "INSERT INTO CC_CAD_SETOR (ID_SETOR, DESC_LOCAL, VLR_LOC, SET_MEDIDA, STATUS)"; //Monta query de INSERT
            sQuery = sQuery + " VALUES (";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_SETOR", "ID_SETOR") + ", "; //a função retorna o próximo ID
            sQuery = sQuery + "'" + Setor.getsDescLoc()+ "', "; //dados digitados na tela
            sQuery = sQuery + "'" + Setor.getfValor() + "', ";
            sQuery = sQuery + "'" + Setor.getfMedida() + "', ";
            sQuery = sQuery + Setor.getiStatus() + ") ";

            statement.executeUpdate(sQuery); //executa query
        }
        //System.out.println(sQuery); //DEBUG
    }

    public ResultSet ConsultarSetor(int iSetor) throws SQLException {
        String sQuery;
        //clsCadSetor setor = null;

        sQuery = "SELECT ID_SETOR, DESC_LOCAL, REPLACE(VLR_LOC,'.',',') VLR_LOC, "
                    + "REPLACE(SET_MEDIDA,'.',',') SET_MEDIDA, STATUS";
        sQuery = sQuery + " FROM CC_CAD_SETOR ";
        sQuery = sQuery + " WHERE ID_SETOR = " + iSetor;
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        rst.first();

        return rst;
    }

    public void ExcluiSetor(int iSetor) throws SQLException {
        String sQuery;
        clsCadSetor setor = null;

        sQuery = "DELETE FROM CC_CAD_SETOR WHERE ID_SETOR = " + iSetor + "\n";
        System.out.print(sQuery);
        statement.executeUpdate(sQuery);
    }

    public ResultSet ListaSetor() throws SQLException {
        String sQuery;
        clsCadSetor setor = null;

        sQuery = "SELECT ID_SETOR CÓDIGO,";
        sQuery = sQuery + " DESC_LOCAL DESCRIÇÃO,";
        sQuery = sQuery + " REPLACE (VLR_LOC,'.',',') VALOR,";
        sQuery = sQuery + " REPLACE (SET_MEDIDA,'.',',') MEDIDA,";
        sQuery = sQuery + " STATUS STATUS ";
        sQuery = sQuery + " FROM CC_CAD_SETOR ORDER BY ID_SETOR DESC";

        System.out.println(sQuery);

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }


}
