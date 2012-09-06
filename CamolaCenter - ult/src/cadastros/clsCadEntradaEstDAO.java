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
 * @author AndreSAG
 */
public class clsCadEntradaEstDAO extends clsJdbcDAO {

    public clsCadEntradaEstDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }

    clsFunctions function = new clsFunctions();

    public ResultSet ListaComboProduto() throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT CONCAT(ID_PROD, ' - ', DESC_PROD) AS PRODUTO FROM CC_CAD_PRODUTO";
        sQuery = sQuery + " ORDER BY DESC_PROD";

        rst = statement.executeQuery(sQuery);

        return rst;
    }

    public ResultSet ListaEntrada() throws SQLException {

        String sQuery;

        sQuery = "SELECT DATE_FORMAT(A.DATA_CAD,'%d/%m/%Y') DATA, ";
        sQuery = sQuery + "      B.PRODUTO, ";
        sQuery = sQuery + "      NOTA_FISCAL 'NOTA FISCAL', ";
        sQuery = sQuery + "      QTD_ENTRADA QTD ";
        sQuery = sQuery + " FROM CC_CAD_ENTRADA A, ";
        sQuery = sQuery + "      (SELECT ID_PROD, ";
        sQuery = sQuery + "              CONCAT(ID_PROD, ' - ' , DESC_PROD) PRODUTO ";
        sQuery = sQuery + "         FROM CC_CAD_PRODUTO) B ";
        sQuery = sQuery + "WHERE A.ID_PROD = B.ID_PROD ";
        sQuery = sQuery + "ORDER BY DATA_CAD ";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;

    }

    public void InserirEntrada(clsCadEntradaEst Entrada) throws SQLException {

        String sQuery;

        sQuery = "SELECT 1 ";
        sQuery = sQuery + "  FROM CC_CAD_ENTRADA ";
        sQuery = sQuery + " WHERE DATA_CAD = STR_TO_DATE('" + Entrada.getsData() + "','%d/%m/%Y')";
        sQuery = sQuery + "   AND ID_PROD = " + Entrada.getiCodProd();

        ResultSet rst = statement.executeQuery(sQuery);

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_ENTRADA "; //Monta query de UPDATE
            sQuery = sQuery + "   SET ";
            sQuery = sQuery + "       QTD_ENTRADA = REPLACE(" + Entrada.getdQtdEntrada() + ",',','.') , ";
            sQuery = sQuery + "       NOTA_FISCAL = '" + Entrada.getsNotaFiscal() + "' ";
            sQuery = sQuery + " WHERE DATA_CAD = STR_TO_DATE('" + Entrada.getsData() +"','%d/%m/%Y')";
            sQuery = sQuery + "   AND ID_PROD = " + Entrada.getiCodProd();

            System.out.println(sQuery);

            statement.executeUpdate(sQuery);

        } else {

            //Faz INSERT
            sQuery = "INSERT INTO CC_CAD_ENTRADA(DATA_CAD, ID_PROD, NOTA_FISCAL, QTD_ENTRADA) ";
            sQuery = sQuery + " VALUES( ";
            sQuery = sQuery + "STR_TO_DATE('" + Entrada.getsData() + "','%d/%m/%Y'), ";
            sQuery = sQuery + Entrada.getiCodProd() + ", ";
            sQuery = sQuery + "'" + Entrada.getsNotaFiscal() + "', ";
            sQuery = sQuery + "REPLACE(" + Entrada.getdQtdEntrada() + ",',','.') ";
            sQuery = sQuery + ")";

            System.out.println(sQuery);

            statement.executeUpdate(sQuery);

        }
    }

    public void ExcluirEntrada(String sDate, int iCodProd) throws SQLException{

        String sQuery;

        sQuery = "DELETE FROM CC_CAD_ENTRADA ";
        sQuery = sQuery + " WHERE DATA_CAD = STR_TO_DATE('" + sDate + "', '%d/%m/%Y')";
        sQuery = sQuery + "   AND ID_PROD = " + iCodProd;

        statement.executeUpdate(sQuery);

    }

    public ResultSet ConsultarEntrada(String sData, int iCodProd) throws SQLException {

        String sQuery;

        sQuery = "SELECT NOTA_FISCAL NF, ";
        sQuery = sQuery + "      QTD_ENTRADA QTD ";
        sQuery = sQuery + " FROM CC_CAD_ENTRADA ";
        sQuery = sQuery + "WHERE DATA_CAD = STR_TO_DATE('" + sData + "', '%d/%m/%Y')";
        sQuery = sQuery + "  AND ID_PROD = " + iCodProd;
        
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;

    }
}
