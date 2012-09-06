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
public class clsCadFuncionarioDAO extends clsJdbcDAO {

    public clsCadFuncionarioDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }

    clsFunctions function = new clsFunctions();

    public boolean ExisteEmpresa(String codEmpresa) throws SQLException {

        String sQuery;

        sQuery = "SELECT 1 ";
        sQuery = sQuery + " FROM CC_CAD_EMPRESA";
        sQuery = sQuery + " WHERE ID_EMPRESA = " + codEmpresa;

        System.out.println(sQuery);

        ResultSet rst = statement.executeQuery(sQuery);

        if (rst.next()) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet ListaComboEmpresa() throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT CONCAT(ID_EMPRESA, ' - ', NOME_FANTASIA) AS EMPRESA FROM CC_CAD_EMPRESA";
        sQuery = sQuery + " ORDER BY NOME_FANTASIA";

        rst = statement.executeQuery(sQuery);

        return rst;
    }

    public ResultSet ListaFunc() throws SQLException {

        String sQuery;

        sQuery = "SELECT ID_FUNC 'CÓD. FUNC', ";
        sQuery = sQuery + "NOME_FUNC NOME, ";
        sQuery = sQuery + "ID_EMPRESA EMPRESA, ";
        sQuery = sQuery + "FUNCAO_FUNC FUNÇÃO ";
        sQuery = sQuery + "FROM CC_CAD_FUNCIONARIO ";
        sQuery = sQuery + "ORDER BY NOME_FUNC";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;

    }

    public void InserirFuncionario(clsCadFuncionario Func) throws SQLException {

        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + "FROM CC_CAD_FUNCIONARIO ";
        sQuery = sQuery + "WHERE ID_FUNC = " + Func.getiCodFunc();

        ResultSet rst = statement.executeQuery(sQuery);

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_FUNCIONARIO "; //Monta query de UPDATE
            sQuery = sQuery + "SET ";
            sQuery = sQuery + "ID_EMPRESA = " + Func.getiCodEmpr() + ", ";
            sQuery = sQuery + "NOME_FUNC = '" + Func.getsNomeFunc() + "', ";
            sQuery = sQuery + "DATA_NASC = STR_TO_DATE('" + Func.getsDataNasc() + "','%d/%m/%Y'), ";
            sQuery = sQuery + "CPF = '" + Func.getsCPF() + "', ";
            sQuery = sQuery + "CIRG = '" + Func.getsCIRG() + " " + Func.getsOE() + "', ";
            sQuery = sQuery + "TEL_FUNC = '" + Func.getsTel() + "', ";
            sQuery = sQuery + "CEL_FUNC = '" + Func.getsCel() + "', ";
            sQuery = sQuery + "EMAIL_FUNC = '" + Func.getsEmail() + "', ";
            sQuery = sQuery + "FUNCAO_FUNC = '" + Func.getsFuncao() + "' ";
            sQuery = sQuery + "WHERE ID_FUNC = " + Func.getiCodFunc();

            System.out.println(sQuery);

            statement.executeUpdate(sQuery);

        } else {

            //Faz INSERT na tabela de Funcionário
            sQuery = "INSERT INTO CC_CAD_FUNCIONARIO(ID_FUNC, ID_EMPRESA, NOME_FUNC, DATA_NASC, CPF, CIRG, TEL_FUNC, CEL_FUNC, EMAIL_FUNC, FUNCAO_FUNC) ";
            sQuery = sQuery + "VALUES(";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_FUNCIONARIO", "ID_FUNC") + ", ";
            //sQuery = sQuery + "'" + Func.getiCodFunc() + "', ";
            sQuery = sQuery + Func.getiCodEmpr() + ", ";
            sQuery = sQuery + "'" + Func.getsNomeFunc() + "', ";
            sQuery = sQuery + "STR_TO_DATE('" + Func.getsDataNasc() + "','%d/%m/%Y'), ";
            sQuery = sQuery + "'" + Func.getsCPF() + "', ";
            sQuery = sQuery + "'" + Func.getsCIRG() + " " + Func.getsOE() + "', ";
            sQuery = sQuery + "'" + Func.getsTel() + "', ";
            sQuery = sQuery + "'" + Func.getsCel() + "', ";
            sQuery = sQuery + "'" + Func.getsEmail() + "', ";
            sQuery = sQuery + "'" + Func.getsFuncao() + "' ";
            sQuery = sQuery + ")";

            System.out.println(sQuery);

            statement.executeUpdate(sQuery);

        }
    }

    public void ExcluirFuncionario(int iCodFunc) throws SQLException{

        String sQuery;

        sQuery = "DELETE FROM CC_CAD_FUNCIONARIO ";
        sQuery = sQuery + " WHERE ID_FUNC = " + iCodFunc;

        statement.executeUpdate(sQuery);

    }

    public ResultSet ConsultarFunc(int iCodFunc) throws SQLException {

        String sQuery;

        sQuery = "SELECT A.ID_FUNC, ";
        sQuery = sQuery + "A.ID_EMPRESA, ";
        sQuery = sQuery + "(SELECT C.NOME_FANTASIA FROM CC_CAD_EMPRESA C WHERE C.ID_EMPRESA = A.ID_EMPRESA) EMPRESA, ";
        sQuery = sQuery + "A.NOME_FUNC,";
        sQuery = sQuery + "DATE_FORMAT(A.DATA_NASC,'%d/%m/%Y') DATA_NASC, ";
        sQuery = sQuery + "A.CPF, ";
        sQuery = sQuery + "A.CIRG, ";
        sQuery = sQuery + "A.TEL_FUNC,";
        sQuery = sQuery + "A.CEL_FUNC, ";
        sQuery = sQuery + "A.EMAIL_FUNC, ";
        sQuery = sQuery + "A.FUNCAO_FUNC ";
        sQuery = sQuery + "FROM CC_CAD_FUNCIONARIO A ";
        sQuery = sQuery + "WHERE ID_FUNC = " + iCodFunc + " ";
        sQuery = sQuery + "ORDER BY NOME_FUNC";
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;

    }
    
    public boolean  ConsultarFuncEmpresa(int iCodEmpresa) throws SQLException {

        String sQuery;

        sQuery = "SELECT 1 ";
        sQuery = sQuery + "FROM CC_CAD_FUNCIONARIO ";
        sQuery = sQuery + "WHERE ID_EMPRESA = " + iCodEmpresa; 
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {
            return true;
        } else {
            return false;
        }

    }
}
