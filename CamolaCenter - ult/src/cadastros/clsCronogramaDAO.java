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
public class clsCronogramaDAO extends clsJdbcDAO {

    public clsCronogramaDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions();

    public ResultSet ListaComboEmpresa(String sTipo) throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) AS EMPRESA FROM CC_CAD_EMPRESA";
        sQuery = sQuery + " WHERE TIPO = '" + sTipo + "'"; 
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

    public ResultSet ListaComboTurno() throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT CONCAT(ID_TURNO, ' - ', MID(OBS_TURNO,1,30), '...') TURNO FROM CC_CAD_TURNO ";
        sQuery = sQuery + " ORDER BY ID_TURNO";

        rst = statement.executeQuery(sQuery);

        return rst;
    }

    public ResultSet ListaComboRamo() throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT TIPO AS RAMO FROM CC_CAD_EMPRESA";
        sQuery = sQuery + " ORDER BY TIPO ";

        rst = statement.executeQuery(sQuery);

        return rst;
    }

    public ResultSet ListaCronograma() throws SQLException {

        String sQuery;

        sQuery = "SELECT CRONOGRAMA.ID_CRONO 'CÓD.', ";
        sQuery = sQuery + " EMPRESA.EMPR 'EMPRESA', FUNCIONARIO.FUNC 'FUNCIONÁRIO', TURNO.TURNO 'TURNO', RAMO.TIPO 'RAMO' ";

        sQuery = sQuery + " FROM CC_CAD_CRONOGRAMA CRONOGRAMA, ";

        sQuery = sQuery + "   (SELECT ID_EMPRESA, CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) EMPR ";
        sQuery = sQuery + "    FROM CC_CAD_EMPRESA) EMPRESA, ";

        sQuery = sQuery + "   (SELECT ID_FUNC, CONCAT(ID_FUNC, ' - ', NOME_FUNC) FUNC ";
        sQuery = sQuery + "       FROM CC_CAD_FUNCIONARIO) FUNCIONARIO, ";

        sQuery = sQuery + "   (SELECT ID_TURNO, CONCAT(ID_TURNO, ' - ', MID(OBS_TURNO,1,10), '...') TURNO ";
        sQuery = sQuery + "       FROM CC_CAD_TURNO) TURNO, ";

        sQuery = sQuery + "   (SELECT TIPO ";
        sQuery = sQuery + "    FROM CC_CAD_EMPRESA) RAMO ";

        sQuery = sQuery + "  WHERE CRONOGRAMA.ID_EMPRESA = EMPRESA.ID_EMPRESA ";
        sQuery = sQuery + "    AND CRONOGRAMA.ID_FUNC = FUNCIONARIO.ID_FUNC ";
        sQuery = sQuery + "    AND CRONOGRAMA.ID_FUNC = TURNO.ID_TURNO ";
        sQuery = sQuery + "    AND CRONOGRAMA.RAMO = RAMO.TIPO ";
        sQuery = sQuery + "  ORDER BY CRONOGRAMA.ID_CRONO";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;

    }

    public void InserirCronograma(clsCronograma Crono) throws SQLException {

        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_CRONOGRAMA ";
        sQuery = sQuery + "WHERE ID_CRONO = " + Crono.getiCrono();

        ResultSet rst = statement.executeQuery(sQuery);

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_CRONOGRAMA "; //Monta query de UPDATE
            sQuery = sQuery + "SET ";
            sQuery = sQuery + "     ID_EMPRESA = " + Crono.getiCodEmpr() + ", ";
            sQuery = sQuery + "     ID_FUNC = " + Crono.getiCodFunc() + ", ";
            sQuery = sQuery + "     ID_TURNO = " + Crono.getiTurno() + ", ";
            sQuery = sQuery + "     RAMO = '" + Crono.getsRamo() + "' ";
            sQuery = sQuery + "WHERE ID_CRONO = " + Crono.getiCrono();

            statement.executeUpdate(sQuery);

        } else {

            //Faz INSERT na tabela de Funcionário
            sQuery = "INSERT INTO CC_CAD_CRONOGRAMA(ID_CRONO, ID_EMPRESA, ID_FUNC, ID_TURNO, RAMO) ";
            sQuery = sQuery + "VALUES(";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_CRONOGRAMA", "ID_CRONO") + ", ";
            sQuery = sQuery + Crono.getiCodEmpr() + ", ";
            sQuery = sQuery + Crono.getiCodFunc() + ", ";
            sQuery = sQuery + Crono.getiCodFunc() + ", ";
            sQuery = sQuery + "'" + Crono.getsRamo() + "' ";
            sQuery = sQuery + ")";

            System.out.println(sQuery);

            statement.executeUpdate(sQuery);

        }
    }

    //verificar se será necessário excluir cronograma
    public void ExcluirCronograma(int iCodCrono) throws SQLException {

        String sQuery;

        sQuery = "DELETE FROM CC_CAD_CRONOGRAMA ";
        sQuery = sQuery + " WHERE ID_CRONO = " + iCodCrono;

        statement.executeUpdate(sQuery);

    }

    public ResultSet ConsultarCronograma(String iCodCrono) throws SQLException {

        String sQuery;

        sQuery = "SELECT CRONOGRAMA.ID_CRONO ID_CRONO, ";
        sQuery = sQuery + "      EMPRESA.EMPR EMPR, ";
        sQuery = sQuery + "      FUNCIONARIO.FUNC FUNC, ";
        sQuery = sQuery + "      TURNO.TURNO TURNO, ";
        sQuery = sQuery + "      RAMO.TIPO RAMO";
        
        sQuery = sQuery + " FROM CC_CAD_CRONOGRAMA CRONOGRAMA, ";
        
        sQuery = sQuery + "   (SELECT ID_EMPRESA, CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) EMPR ";
        sQuery = sQuery + "    FROM CC_CAD_EMPRESA) EMPRESA, ";
        
        sQuery = sQuery + "   (SELECT ID_FUNC, CONCAT(ID_FUNC, ' - ', NOME_FUNC) FUNC ";
        sQuery = sQuery + "       FROM CC_CAD_FUNCIONARIO) FUNCIONARIO, ";
        
        sQuery = sQuery + "   (SELECT ID_TURNO, CONCAT(ID_TURNO, ' - ', MID(OBS_TURNO,1,30), '...') TURNO ";
        sQuery = sQuery + "    FROM CC_CAD_TURNO) TURNO, ";
        
        sQuery = sQuery + "   (SELECT TIPO ";
        sQuery = sQuery + "    FROM CC_CAD_EMPRESA) RAMO ";
        
        sQuery = sQuery + "  WHERE CRONOGRAMA.ID_EMPRESA = EMPRESA.ID_EMPRESA ";
        sQuery = sQuery + "    AND CRONOGRAMA.ID_FUNC = FUNCIONARIO.ID_FUNC ";
        sQuery = sQuery + "    AND CRONOGRAMA.ID_FUNC = TURNO.ID_TURNO ";
        sQuery = sQuery + "    AND CRONOGRAMA.RAMO = RAMO.TIPO ";
        sQuery = sQuery + "    AND CRONOGRAMA.ID_CRONO = " + iCodCrono;

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }
}
