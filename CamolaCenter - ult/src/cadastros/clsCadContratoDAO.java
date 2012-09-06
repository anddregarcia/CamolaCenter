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
public class clsCadContratoDAO extends clsJdbcDAO { //cria classe que usa conecção com o banco

    public clsCadContratoDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions(); //Chama a classe

    public ResultSet ListaComboLoja() throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT CONCAT(ID_LOJA, ' - ', NOME_FANTASIA) AS LOJA FROM CC_CAD_LOJA";
        sQuery = sQuery + " ORDER BY NOME_FANTASIA";

        rst = statement.executeQuery(sQuery);

        return rst;
    }

    public ResultSet ListaComboSetor() throws SQLException {
        ResultSet rst;
        String sQuery;

        sQuery = "SELECT CONCAT(ID_SETOR, ' - ', DESC_LOCAL) AS SETOR FROM CC_CAD_SETOR";
        sQuery = sQuery + " ORDER BY DESC_LOCAL";

        rst = statement.executeQuery(sQuery);

        return rst;
    }

    public void InserirContrato(clsCadContrato Contrato) throws SQLException { //Método que insere novo turno
        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_CONTRATO ";
        sQuery = sQuery + " WHERE ID_CONTRATO = " + Contrato.getiCodContrato();
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_CONTRATO "; //Monta query de UPDATE
            sQuery = sQuery + " SET ";
            sQuery = sQuery + " DATA_INICIO = '" + Contrato.getsDataIni() + "', ";
            sQuery = sQuery + " DATA_FIM = '" + Contrato.getsDataFim() + "', ";
            sQuery = sQuery + " RESP_LOJA = '" + Contrato.getsRespLoja() + "', ";
            sQuery = sQuery + " RESP_SHOP = '" + Contrato.getsRespShop() + "', ";
            sQuery = sQuery + " VLR_PARCELA = REPLACE(" + Contrato.getfValor() + ",',','.'), ";
            sQuery = sQuery + " DATA_MENSAL = " + Contrato.getiDia();
            sQuery = sQuery + " WHERE ID_CONTRATO = " + Contrato.getiCodContrato();

            statement.executeUpdate(sQuery);
        } else {

            sQuery = "INSERT INTO CC_CAD_CONTRATO (ID_CONTRATO, ID_LOJA, ID_SETOR, DATA_INICIO, DATA_FIM, RESP_LOJA, RESP_SHOP, VLR_PARCELA, DATA_MENSAL)"; //Monta query de INSERT
            sQuery = sQuery + " VALUES (";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_CONTRATO", "ID_CONTRATO") + ", "; //a função retorna o próximo ID
            sQuery = sQuery + Contrato.getIdLoja() + ", "; //dados digitados na tela
            sQuery = sQuery + Contrato.getIdSetor() + ", ";
            sQuery = sQuery + "'" + Contrato.getsDataIni() + "', ";
            sQuery = sQuery + "'" + Contrato.getsDataFim() + "', ";
            sQuery = sQuery + "'" + Contrato.getsRespLoja() + "', ";
            sQuery = sQuery + "'" + Contrato.getsRespShop() + "', ";
            sQuery = sQuery + "REPLACE(" + Contrato.getfValor() + ",',','.'), ";
            sQuery = sQuery + Contrato.getiDia() + ") ";

            statement.executeUpdate(sQuery); //executa query
        }
    }

    public ResultSet ConsultarContrato(int iContrato) throws SQLException {
        String sQuery;

        sQuery = "SELECT ";
        sQuery = sQuery + "  ID_CONTRATO, ";
        sQuery = sQuery + "  B.LOJA, ";
        sQuery = sQuery + "  C.SETOR, ";
        sQuery = sQuery + "  DATA_INICIO, ";
        sQuery = sQuery + "  DATA_FIM, ";
        sQuery = sQuery + "  RESP_LOJA, ";
        sQuery = sQuery + "  RESP_SHOP, ";
        sQuery = sQuery + "  VLR_PARCELA, ";
        sQuery = sQuery + "  DATA_MENSAL ";
        sQuery = sQuery + "FROM ";
        sQuery = sQuery + "  CC_CAD_CONTRATO A, ";
        sQuery = sQuery + "  (SELECT ID_LOJA, CONCAT(ID_LOJA, ' - ', NOME_FANTASIA) LOJA FROM CC_CAD_LOJA) B, ";
        sQuery = sQuery + "  (SELECT ID_SETOR, CONCAT(ID_SETOR, ' - ', DESC_LOCAL) SETOR FROM CC_CAD_SETOR) C ";
        sQuery = sQuery + "WHERE A.ID_LOJA = B.ID_LOJA ";
        sQuery = sQuery + "  AND A.ID_SETOR = C.ID_SETOR ";
        sQuery = sQuery + "  AND ID_CONTRATO = " + iContrato;

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }

    public void ExcluirContrato(int iContrato) throws SQLException {
        String sQuery;

        sQuery = "DELETE FROM CC_CAD_CONTRATO WHERE ID_CONTRATO = " + iContrato;
        statement.executeUpdate(sQuery);
    }

    public ResultSet ListaContrato() throws SQLException {
        String sQuery;
        clsCadContrato Contrato = null;

        sQuery = "SELECT ";
        sQuery = sQuery + "  ID_CONTRATO 'CÓD.', ";
        sQuery = sQuery + "  B.LOJA LOJA, ";
        sQuery = sQuery + "  C.SETOR SETOR, ";
        sQuery = sQuery + "  DATA_INICIO INICIO, ";
        sQuery = sQuery + "  DATA_FIM FIM ";
        sQuery = sQuery + "FROM ";
        sQuery = sQuery + "  CC_CAD_CONTRATO A, ";
        sQuery = sQuery + "  (SELECT ID_LOJA, CONCAT(ID_LOJA, ' - ', NOME_FANTASIA) LOJA FROM CC_CAD_LOJA) B, ";
        sQuery = sQuery + "  (SELECT ID_SETOR, CONCAT(ID_SETOR, ' - ', DESC_LOCAL) SETOR FROM CC_CAD_SETOR) C ";
        sQuery = sQuery + "WHERE A.ID_LOJA = B.ID_LOJA ";
        sQuery = sQuery + "  AND A.ID_SETOR = C.ID_SETOR ";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }
}
