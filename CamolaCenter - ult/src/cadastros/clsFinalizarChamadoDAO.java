/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import conexao.clsJdbcDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexao.clsFunctions;

/**
 *
 * @author AndreSAG
 */
public class clsFinalizarChamadoDAO extends clsJdbcDAO {

    public clsFinalizarChamadoDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions();

    public ResultSet CarregaComboChamado() throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT CONCAT(ID_CHAMADO, ' - ', MID(DESC_CHAMADO,1,10), '...') CHAMADO FROM CC_CAD_CHAMADO "; 
        sQuery = sQuery + " ORDER BY ID_CHAMADO";

        rst = statement.executeQuery(sQuery);
        
        return rst;
    }

    public ResultSet ListaFimChamado() throws SQLException {

        String sQuery;

        sQuery = "SELECT CONCAT(ID_CHAMADO, ' - ', MID(DESC_CHAMADO,1,10), '...') AS CHAMADO, ";
        sQuery = sQuery + " EMPRESA.EMPR, FUNCIONARIO.FUNC, CHAMADO.DATA_FECHA FECHADO ";
        sQuery = sQuery + " FROM CC_CAD_CHAMADO CHAMADO, ";
        sQuery = sQuery + "   (SELECT ID_EMPRESA, CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) EMPR ";
        sQuery = sQuery + "    FROM CC_CAD_EMPRESA) EMPRESA, ";
        sQuery = sQuery + "   (SELECT ID_FUNC, CONCAT(ID_FUNC, ' - ', NOME_FUNC) FUNC ";
        sQuery = sQuery + "       FROM CC_CAD_FUNCIONARIO) FUNCIONARIO ";
        sQuery = sQuery + "  WHERE CHAMADO.ID_EMPRESA = EMPRESA.ID_EMPRESA ";
        sQuery = sQuery + "    AND CHAMADO.ID_FUNC = FUNCIONARIO.ID_FUNC ";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;

    }

    public void FecharChamado(clsFinalizarChamado Chamado) throws SQLException {

        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_CHAMADO ";
        sQuery = sQuery + "WHERE ID_CHAMADO = " + Chamado.getiChamado();

        ResultSet rst = statement.executeQuery(sQuery);

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_CHAMADO "; //Monta query de UPDATE
            sQuery = sQuery + "SET ";
            sQuery = sQuery + "     SOLUC_CHAMADO = '" + Chamado.getsSolucao() + "', ";
            sQuery = sQuery + "     DATA_FECHA = '" + Chamado.getsData() + "' ";
            sQuery = sQuery + "WHERE ID_CHAMADO = " + Chamado.getiChamado();

            statement.executeUpdate(sQuery);

        } else {

            //MSG ERRO
            
        }
    }

    public ResultSet ConsultarFimChamado(int iCodChamado) throws SQLException {

        String sQuery;

        sQuery = "SELECT CHAMADO.ID_CHAMADO CHAMADO, ";
        sQuery = sQuery + "      CHAMADO.DATA_FECHA FECHA, ";
        sQuery = sQuery + "      CHAMADO.SOLUC_CHAMADO SOLUCAO";
        sQuery = sQuery + " FROM CC_CAD_CHAMADO CHAMADO, ";
        sQuery = sQuery + "   (SELECT ID_EMPRESA, CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) EMPR ";
        sQuery = sQuery + "    FROM CC_CAD_EMPRESA) EMPRESA, ";
        sQuery = sQuery + "   (SELECT ID_FUNC, CONCAT(ID_FUNC, ' - ', NOME_FUNC) FUNC ";
        sQuery = sQuery + "       FROM CC_CAD_FUNCIONARIO) FUNCIONARIO ";
        sQuery = sQuery + "  WHERE CHAMADO.ID_EMPRESA = EMPRESA.ID_EMPRESA ";
        sQuery = sQuery + "    AND CHAMADO.ID_FUNC = FUNCIONARIO.ID_FUNC ";
        sQuery = sQuery + "    AND CHAMADO.ID_CHAMADO = " + iCodChamado;

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }
}
