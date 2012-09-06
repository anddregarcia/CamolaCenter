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
public class clsCadConsumoDAO extends clsJdbcDAO {

    public clsCadConsumoDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
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

    public ResultSet ListaConsumo() throws SQLException {

        String sQuery;

        sQuery = "SELECT DATE_FORMAT(A.DATA_CAD,'%d/%m/%Y') DATA, ";
        sQuery = sQuery + "      B.PRODUTO, ";
        sQuery = sQuery + "      QTD_CONSUMO QTD ";
        sQuery = sQuery + " FROM CC_CAD_CONSUMO A, ";
        sQuery = sQuery + "      (SELECT ID_PROD, ";
        sQuery = sQuery + "              CONCAT(ID_PROD, ' - ' , DESC_PROD) PRODUTO ";
        sQuery = sQuery + "         FROM CC_CAD_PRODUTO) B ";
        sQuery = sQuery + "WHERE A.ID_PROD = B.ID_PROD ";
        sQuery = sQuery + "ORDER BY DATA_CAD ";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;

    }

    public void InserirConsumo(clsCadConsumo Consumo) throws SQLException {

        String sQuery;

        sQuery = "SELECT 1 ";
        sQuery = sQuery + "  FROM CC_CAD_CONSUMO ";
        sQuery = sQuery + " WHERE DATA_CAD = STR_TO_DATE('" + Consumo.getsData() + "','%d/%m/%Y')";
        sQuery = sQuery + "   AND ID_PROD = " + Consumo.getiCodProd();

        ResultSet rst = statement.executeQuery(sQuery);

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_CONSUMO "; //Monta query de UPDATE
            sQuery = sQuery + "   SET QTD_CONSUMO = REPLACE(" + Consumo.getdQtdConsumo() + ",',','.') ";
            sQuery = sQuery + " WHERE DATA_CAD = STR_TO_DATE('" + Consumo.getsData() +"','%d/%m/%Y')";
            sQuery = sQuery + "   AND ID_PROD = " + Consumo.getiCodProd();

            System.out.println(sQuery);

            statement.executeUpdate(sQuery);

        } else {

            //Faz INSERT
            sQuery = "INSERT INTO CC_CAD_CONSUMO(DATA_CAD, ID_PROD, QTD_CONSUMO) ";
            sQuery = sQuery + " VALUES( ";
            sQuery = sQuery + "STR_TO_DATE('" + Consumo.getsData() + "','%d/%m/%Y'), ";
            sQuery = sQuery + Consumo.getiCodProd() + ", ";
            sQuery = sQuery + "REPLACE(" + Consumo.getdQtdConsumo() + ",',','.') ";
            sQuery = sQuery + ")";

            System.out.println(sQuery);

            statement.executeUpdate(sQuery);

        }
    }

    public void ExcluirConsumo(String sDate, int iCodProd) throws SQLException{

        String sQuery;

        sQuery = "DELETE FROM CC_CAD_CONSUMO ";
        sQuery = sQuery + " WHERE DATA_CAD = STR_TO_DATE('" + sDate + "', '%d/%m/%Y')";
        sQuery = sQuery + "   AND ID_PROD = " + iCodProd;

        statement.executeUpdate(sQuery);

    }

    public ResultSet ConsultarConsumo(String sData, int iCodProd) throws SQLException {

        String sQuery;

        sQuery = "SELECT QTD_CONSUMO QTD ";
        sQuery = sQuery + " FROM CC_CAD_CONSUMO ";
        sQuery = sQuery + "WHERE DATA_CAD = STR_TO_DATE('" + sData + "', '%d/%m/%Y')";
        sQuery = sQuery + "  AND ID_PROD = " + iCodProd;
        
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;

    }
}
