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
public class clsAbrirChamadoDAO extends clsJdbcDAO {

    public clsAbrirChamadoDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions();

    public ResultSet ListaComboEmpresa() throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) AS EMPRESA FROM CC_CAD_EMPRESA";
        sQuery = sQuery + " ORDER BY NOME_FANTASIA";

        rst = statement.executeQuery(sQuery);

        return rst;
    }

    public ResultSet ListaComboFuncionario() throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT CONCAT(ID_FUNC, ' - ', NOME_FUNC) AS FUNCIONARIO FROM CC_CAD_FUNCIONARIO";
        sQuery = sQuery + " ORDER BY NOME_FUNC";

        rst = statement.executeQuery(sQuery);

        return rst;
    }

    public ResultSet ListaChamado() throws SQLException {

        String sQuery;

        sQuery = "SELECT CONCAT(ID_CHAMADO, ' - ', MID(DESC_CHAMADO,1,10), '...') AS CHAMADO, ";
        sQuery = sQuery + " EMPRESA.EMPR, FUNCIONARIO.FUNC, CHAMADO.DATA_ABERT ";
        sQuery = sQuery + " FROM CC_CAD_CHAMADO CHAMADO, ";
        sQuery = sQuery + "   (SELECT ID_EMPRESA, CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) EMPR ";
        sQuery = sQuery + "    FROM CC_CAD_EMPRESA) EMPRESA, ";
        sQuery = sQuery + "   (SELECT ID_FUNC, CONCAT(ID_FUNC, ' - ', NOME_FUNC) FUNC ";
        sQuery = sQuery + "       FROM CC_CAD_FUNCIONARIO) FUNCIONARIO ";
        sQuery = sQuery + "  WHERE CHAMADO.ID_EMPRESA = EMPRESA.ID_EMPRESA ";
        sQuery = sQuery + "    AND CHAMADO.ID_FUNC = FUNCIONARIO.ID_FUNC ";
        sQuery = sQuery + "  ORDER BY CHAMADO.ID_CHAMADO";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;

    }

    public void InserirChamado(clsAbrirChamado Chamado) throws SQLException {

        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_CHAMADO ";
        sQuery = sQuery + "WHERE ID_CHAMADO = " + Chamado.getiChamado();

        ResultSet rst = statement.executeQuery(sQuery);

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_CHAMADO "; //Monta query de UPDATE
            sQuery = sQuery + "SET ";
            sQuery = sQuery + "     ID_EMPRESA = " + Chamado.getiCodEmpr() + ", ";
            sQuery = sQuery + "     ID_FUNC = " + Chamado.getiCodFunc() + ", ";
            sQuery = sQuery + "     DESC_CHAMADO = '" + Chamado.getsDescricao() + "', ";
            sQuery = sQuery + "     DATA_ABERT = '" + Chamado.getsData() + "' ";
            sQuery = sQuery + "WHERE ID_CHAMADO = " + Chamado.getiChamado();

            statement.executeUpdate(sQuery);

        } else {

            //Faz INSERT na tabela de Funcionário
            sQuery = "INSERT INTO CC_CAD_CHAMADO(ID_CHAMADO, ID_EMPRESA, ID_FUNC, DESC_CHAMADO, DATA_ABERT) ";
            sQuery = sQuery + "VALUES(";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_CHAMADO", "ID_CHAMADO") + ", ";
            sQuery = sQuery + Chamado.getiCodEmpr() + ", ";
            sQuery = sQuery + Chamado.getiCodFunc() + ", ";
            sQuery = sQuery + "'" + Chamado.getsDescricao() + "', ";
            sQuery = sQuery + "'" + Chamado.getsData() + "' ";
            sQuery = sQuery + ")";

            System.out.println(sQuery);

            statement.executeUpdate(sQuery);

        }
    }

    //verificar se será necessário excluir chamado
    public void ExcluirChamado(String sCodChamado) throws SQLException {

        String sQuery;

        sQuery = "DELETE FROM CC_CAD_CHAMADO ";
        sQuery = sQuery + " WHERE ID_CHAMADO = " + sCodChamado;

        statement.executeUpdate(sQuery);

    }

    public ResultSet ConsultarChamado(String sCodChamado) throws SQLException {

        String sQuery;

        sQuery = "SELECT CHAMADO.ID_CHAMADO CHAMADO, ";
        sQuery = sQuery + "      EMPRESA.EMPR EMPR, ";
        sQuery = sQuery + "      FUNCIONARIO.FUNC FUNC, ";
        sQuery = sQuery + "      CHAMADO.DATA_ABERT ABERT, ";
        sQuery = sQuery + "      CHAMADO.DESC_CHAMADO DESCRICAO";
        sQuery = sQuery + " FROM CC_CAD_CHAMADO CHAMADO, ";
        sQuery = sQuery + "   (SELECT ID_EMPRESA, CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) EMPR ";
        sQuery = sQuery + "    FROM CC_CAD_EMPRESA) EMPRESA, ";
        sQuery = sQuery + "   (SELECT ID_FUNC, CONCAT(ID_FUNC, ' - ', NOME_FUNC) FUNC ";
        sQuery = sQuery + "       FROM CC_CAD_FUNCIONARIO) FUNCIONARIO ";
        sQuery = sQuery + "  WHERE CHAMADO.ID_EMPRESA = EMPRESA.ID_EMPRESA ";
        sQuery = sQuery + "    AND CHAMADO.ID_FUNC = FUNCIONARIO.ID_FUNC ";
        sQuery = sQuery + "    AND CHAMADO.ID_CHAMADO = " + sCodChamado;

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }
}
