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
public class clsCadEstacionamentoDAO extends clsJdbcDAO { //cria classe que usa conecção com o banco

    public clsCadEstacionamentoDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions(); //Chama a classe

    public void InserirEstac(clsCadEstacionamento Estac) throws SQLException { //Método que insere novo turno
        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_ESTACIONAMENTO ";
        sQuery = sQuery + " WHERE ID_ESTAC = " + Estac.getiCodigo();
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_ESTACIONAMENTO "; //Monta query de UPDATE
            sQuery = sQuery + " SET ";
            sQuery = sQuery + "DATA_ESTAC = '" + Estac.getsData() + "', ";
            sQuery = sQuery + "QTD_CARRO = '" + Estac.getiQtdCarro() + "' ";
            sQuery = sQuery + "WHERE ID_ESTAC = " + Estac.getiCodigo();
            System.out.print(rst);

            statement.executeUpdate(sQuery);
        } else {

            sQuery = "INSERT INTO CC_CAD_ESTACIONAMENTO (ID_ESTAC, DATA_ESTAC, QTD_CARRO)"; //Monta query de INSERT
            sQuery = sQuery + " VALUES (";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_ESTACIONAMENTO", "ID_ESTAC") + ", "; //a função retorna o próximo ID
            sQuery = sQuery + "'" + Estac.getsData() + "', "; //dados digitados na tela
            sQuery = sQuery + "'" + Estac.getiQtdCarro() + "') ";
            

            //System.out.println(sQuery);

            statement.executeUpdate(sQuery); //executa query
        }
        //System.out.println(sQuery); //DEBUG
    }

    public ResultSet ConsultarEstac(int iEstac) throws SQLException {
        String sQuery;
        //clsCadEstacionamento estac = null;

        sQuery = "SELECT ID_ESTAC,DATA_ESTAC,QTD_CARRO ";
        sQuery = sQuery + " FROM CC_CAD_ESTACIONAMENTO ";
        sQuery = sQuery + " WHERE ID_ESTAC = " + iEstac;
        ResultSet rst = statement.executeQuery(sQuery); //executa query
      
        rst.first();
        
        //if (rst.next()) {
          //      }
        return rst;
    }

    public void ExcluiEstac(int iEstac) throws SQLException {
        String sQuery;
        clsCadEstacionamento estac = null;

        sQuery = "DELETE FROM CC_CAD_ESTACIONAMENTO WHERE ID_ESTAC = " + iEstac + "\n";
        System.out.print(sQuery);
        statement.executeUpdate(sQuery);
    }

    public ResultSet ListaEstac() throws SQLException {
        String sQuery;
        clsCadEstacionamento estac = null;

        sQuery = "SELECT ID_ESTAC CÓDIGO,";
        sQuery = sQuery + " DATE_FORMAT(DATA_ESTAC, '%d/%m/%Y') DATA,";
        sQuery = sQuery + " QTD_CARRO QUANTIDADE";
        sQuery = sQuery + " FROM CC_CAD_ESTACIONAMENTO ";

        System.out.println(sQuery);

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }
}
