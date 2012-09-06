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
public class clsCadMarketingDAO extends clsJdbcDAO { //cria classe que usa conecção com o banco

    public clsCadMarketingDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions(); //Chama a classe

    public ResultSet ListaComboEmpresa() throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) AS EMPRESA FROM CC_CAD_EMPRESA";
        sQuery = sQuery + " ORDER BY NOME_FANTASIA";

        rst = statement.executeQuery(sQuery);

        return rst;
    }

    public void InserirMarketing(clsCadMarketing Marketing) throws SQLException { //Método que insere novo turno
        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_MARKETING ";
        sQuery = sQuery + " WHERE ID_MARKETING = " + Marketing.getiCodMarketing();
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_MARKETING "; //Monta query de UPDATE
            sQuery = sQuery + " SET ";
            sQuery = sQuery + " ID_EMPRESA = " + Marketing.getIdEmpresa() + ", ";
            sQuery = sQuery + " NOTA_FISCAL = '" + Marketing.getsNotaFiscal() + "', ";
            sQuery = sQuery + " DATA = '" + Marketing.getsData() + "' ";
            sQuery = sQuery + " WHERE ID_MARKETING = " + Marketing.getiCodMarketing();

            statement.executeUpdate(sQuery);
        } else {

            sQuery = "INSERT INTO CC_CAD_MARKETING (ID_MARKETING, ID_EMPRESA, NOTA_FISCAL, DATA)"; //Monta query de INSERT
            sQuery = sQuery + " VALUES (";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_MARKETING", "ID_MARKETING") + ", "; //a função retorna o próximo ID
            sQuery = sQuery + Marketing.getIdEmpresa() + ", "; //dados digitados na tela
            sQuery = sQuery + "'" + Marketing.getsNotaFiscal() + "', ";
            sQuery = sQuery + "'" + Marketing.getsData() + "') ";

            statement.executeUpdate(sQuery); //executa query
        }
    }

    public void InserirProduto(clsCadMarketing Marketing) throws SQLException {

        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_MARK_PROD ";
        sQuery = sQuery + " WHERE ID_PROD = " + Marketing.getiCodProduto();
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_MARK_PROD "; //Monta query de UPDATE
            sQuery = sQuery + " SET ";
            sQuery = sQuery + " DESC_PROD = '" + Marketing.getsDesc() + "', ";
            sQuery = sQuery + " QTD_PROD = REPLACE(" + Marketing.getiQtd() + ",',','.'), ";
            sQuery = sQuery + " VALOR_PROD = REPLACE(" + Marketing.getfValor() + ",',','.') ";
            sQuery = sQuery + " WHERE ID_PROD = " + Marketing.getiCodProduto();

            statement.executeUpdate(sQuery);
        } else {

            sQuery = "INSERT INTO CC_CAD_MARK_PROD (ID_PROD, ID_MARKETING, DESC_PROD, QTD_PROD, VALOR_PROD)"; //Monta query de INSERT
            sQuery = sQuery + " VALUES (";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_MARK_PROD", "ID_PROD") + ", "; //a função retorna o próximo ID
            sQuery = sQuery + Marketing.getiCodMarketing() + ", "; //dados digitados na tela
            sQuery = sQuery + "'" + Marketing.getsDesc() + "', ";
            sQuery = sQuery + Marketing.getiQtd() + ", ";
            sQuery = sQuery + "REPLACE(" + Marketing.getfValor() + ",',','.') )";

            statement.executeUpdate(sQuery); //executa query
        }

    }

    public ResultSet ConsultarMarketing(int iMarketing) throws SQLException {
        String sQuery;

        sQuery = "SELECT ";
        sQuery = sQuery + "  ID_MARKETING, ";
        sQuery = sQuery + "  B.EMPRESA, ";
        sQuery = sQuery + "  NOTA_FISCAL, ";
        sQuery = sQuery + "  DATA ";
        sQuery = sQuery + "FROM ";
        sQuery = sQuery + "  CC_CAD_MARKETING A, ";
        sQuery = sQuery + "   (SELECT ID_EMPRESA, CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) EMPRESA FROM CC_CAD_EMPRESA) B ";
        sQuery = sQuery + "WHERE A.ID_EMPRESA = B.ID_EMPRESA ";
        sQuery = sQuery + "  AND ID_MARKETING = " + iMarketing;

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }

    public ResultSet ConsultarProdMark(int iProdMark) throws SQLException {
        String sQuery;

        sQuery = "SELECT ";
        sQuery = sQuery + "  ID_PROD, ";
        sQuery = sQuery + "  ID_MARKETING, ";
        sQuery = sQuery + "  DESC_PROD, ";
        sQuery = sQuery + "  QTD_PROD, ";
        sQuery = sQuery + "  VALOR_PROD ";
        sQuery = sQuery + "FROM ";
        sQuery = sQuery + "  CC_CAD_MARK_PROD ";
        sQuery = sQuery + "WHERE ID_PROD = " + iProdMark;

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }

    public void ExcluirMarketing(int iMarketing) throws SQLException {
        String sQuery;

        sQuery = "DELETE FROM CC_CAD_MARK_PROD WHERE ID_MARKETING = " + iMarketing;
        statement.executeUpdate(sQuery);

        sQuery = "DELETE FROM CC_CAD_MARKETING WHERE ID_MARKETING = " + iMarketing;
        statement.executeUpdate(sQuery);

    }

    public void ExcluirProdMark(int iProdMark) throws SQLException {
        String sQuery;

        sQuery = "DELETE FROM CC_CAD_MARK_PROD WHERE ID_PROD = " + iProdMark;
        statement.executeUpdate(sQuery);

    }

    public ResultSet ListaMarketing() throws SQLException {
        String sQuery;

        sQuery = "SELECT ";
        sQuery = sQuery + "  ID_MARKETING 'CÓD.', ";
        sQuery = sQuery + "  B.EMPRESA EMPRESA, ";
        sQuery = sQuery + "  NOTA_FISCAL 'N. FISCAL', ";
        sQuery = sQuery + "  DATA FIM ";
        sQuery = sQuery + "FROM ";
        sQuery = sQuery + "  CC_CAD_MARKETING A, ";
        sQuery = sQuery + "   (SELECT ID_EMPRESA, CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) EMPRESA FROM CC_CAD_EMPRESA) B ";
        sQuery = sQuery + "WHERE A.ID_EMPRESA = B.ID_EMPRESA ";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }

    public ResultSet ListaProdMark(int iCodMarketing) throws SQLException {
        String sQuery;

        sQuery = "SELECT ";
        sQuery = sQuery + "  ID_PROD 'CÓD.', ";
        sQuery = sQuery + "  DESC_PROD PRODUTO, ";
        sQuery = sQuery + "  QTD_PROD 'QTD.', ";
        sQuery = sQuery + "  VALOR_PROD VALOR ";
        sQuery = sQuery + " FROM ";
        sQuery = sQuery + "  CC_CAD_MARK_PROD A ";
        sQuery = sQuery + " WHERE ID_MARKETING = " + iCodMarketing;
        sQuery = sQuery + " ORDER BY DESC_PROD ";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }
}
