/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import conexao.clsFunctions;
import conexao.clsJdbcDAO;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Osti
 */
public class clsCadLojaDAO extends clsJdbcDAO {

    public clsCadLojaDAO() throws SQLException {
        super();
    }
    clsFunctions function = new clsFunctions();

    public void InserirLoja(clsCadLoja Loja) throws SQLException {

        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_LOJA ";
        sQuery = sQuery + " WHERE ID_LOJA = " + Loja.getiCodigo();
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_LOJA "; //Monta query de UPDATE
            sQuery = sQuery + " SET ";
            sQuery = sQuery + "NOME_FANTASIA = '" + Loja.getsFantasia() + "', ";
            sQuery = sQuery + "CNPJ = '" + Loja.getsCnpj() + "', ";
            sQuery = sQuery + "RAZ_SOCIAL = '" + Loja.getsRazSocial() + "', ";
            sQuery = sQuery + "INSC_EST = '" + Loja.getsInscrEst() + "', ";
            sQuery = sQuery + "MISSAO = '" + Loja.getsMissao() + "', ";
            sQuery = sQuery + "OBSERV = '" + Loja.getsObs() + "', ";
            sQuery = sQuery + "GERENTE_LOJA = '" + Loja.getsGerLoja() + "', ";
            sQuery = sQuery + "TELEFONE_CONT = '" + Loja.getsTel() + "', ";
            sQuery = sQuery + "CELULAR_CONT = '" + Loja.getsCel() + "', ";
            sQuery = sQuery + "EMAIL_CONT = '" + Loja.getsEmail() + "', ";
            sQuery = sQuery + "DATA_CAD = STR_TO_DATE('" + Loja.getsDataCad() + "','%d/%m/%Y'), ";
            sQuery = sQuery + "STATUS = '" + Loja.getiStatus() + "' ";
            sQuery = sQuery + "WHERE ID_LOJA = " + Loja.getiCodigo();

            statement.executeUpdate(sQuery);

        } else {

            sQuery = "INSERT INTO CC_CAD_LOJA (ID_LOJA, NOME_FANTASIA, CNPJ, RAZ_SOCIAL,"
                    + " INSC_EST, MISSAO, OBSERV, GERENTE_LOJA, TELEFONE_CONT, CELULAR_CONT,"
                    + " EMAIL_CONT, DATA_CAD, STATUS )"; //Monta query de INSERT
            sQuery = sQuery + " VALUES (";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_LOJA", "ID_LOJA") + ", "; //a função retorna o próximo ID
            sQuery = sQuery + "'" + Loja.getsFantasia() + "', "; //dados digitados na tela
            sQuery = sQuery + "'" + Loja.getsCnpj() + "', ";
            sQuery = sQuery + "'" + Loja.getsRazSocial() + "', ";
            sQuery = sQuery + "'" + Loja.getsInscrEst() + "', ";
            sQuery = sQuery + "'" + Loja.getsMissao() + "', ";
            sQuery = sQuery + "'" + Loja.getsObs() + "', ";
            sQuery = sQuery + "'" + Loja.getsGerLoja() + "', ";
            sQuery = sQuery + "'" + Loja.getsTel() + "', ";
            sQuery = sQuery + "'" + Loja.getsCel() + "', ";
            sQuery = sQuery + "'" + Loja.getsEmail() + "', ";
            sQuery = sQuery + "str_to_date('" + Loja.getsDataCad() + "','%d/%m/%Y'), ";
            sQuery = sQuery + Loja.getiStatus() + ")";
            System.out.println(sQuery);
            statement.executeUpdate(sQuery); //executa query
        }


    }

    public ResultSet ListaLoja() throws SQLException {
        String sQuery;
        clsCadLoja loja = null;

        sQuery = "SELECT ID_LOJA CÓD,";
        sQuery = sQuery + " NOME_FANTASIA FANTASIA,";
        sQuery = sQuery + " CNPJ CNPJ,";
        //sQuery = sQuery + " RAZ_SOCIAL RS,";
        //sQuery = sQuery + " INSC_EST IE,";
        //sQuery = sQuery + " MISSAO MISSÃO,";
        //sQuery = sQuery + " OBSERV OBS,";
        sQuery = sQuery + " GERENTE_LOJA GERENTE,";
        sQuery = sQuery + " TELEFONE_CONT TEL,";
        //sQuery = sQuery + " CELULAR_CONT CEL,";
        sQuery = sQuery + " EMAIL_CONT EMAIL";
        //sQuery = sQuery + " DATE_FORMAT(DATA_CAD, '%d/%m/%Y') DATA";
        //sQuery = sQuery + " STATUS STATUS ";
        sQuery = sQuery + " FROM CC_CAD_LOJA ";

        System.out.println(sQuery);

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }

    public ResultSet ConsultarLoja(int iLoja) throws SQLException {
        String sQuery;
        //clsCadLoja loja = null;

        sQuery = "SELECT ID_LOJA, NOME_FANTASIA, CNPJ, RAZ_SOCIAL, INSC_EST, MISSAO, OBSERV,"
                    + "GERENTE_LOJA , TELEFONE_CONT, CELULAR_CONT, EMAIL_CONT, DATE_FORMAT (DATA_CAD, '%d/%m/%Y') DATA_CAD,"
                      + "STATUS";
        sQuery = sQuery + " FROM CC_CAD_LOJA ";
        sQuery = sQuery + " WHERE ID_LOJA = " + iLoja;
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        rst.first();

       // if (rst.next()) {
         //   loja = new clsCadLoja(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getBoolean(13));
        //}
        return rst;
    }

    public void ExcluiLoja(int iLoja) throws SQLException {
        String sQuery;
        clsCadLoja loja = null;

        sQuery = "DELETE FROM CC_CAD_LOJA WHERE ID_LOJA = " + iLoja + "\n";
        System.out.print(sQuery);
        statement.executeUpdate(sQuery);
    }
}
