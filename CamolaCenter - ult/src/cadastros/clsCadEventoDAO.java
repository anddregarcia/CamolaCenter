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
public class clsCadEventoDAO extends clsJdbcDAO {

    public clsCadEventoDAO() throws SQLException {
        super();
    }
    clsFunctions function = new clsFunctions();

    public void InserirEventos(clsCadEvento Evento) throws SQLException {

        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_EVENTO ";
        sQuery = sQuery + " WHERE ID_EVENTO = " + Evento.getiCodigo();
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_Evento "; //Monta query de UPDATE
            sQuery = sQuery + " SET ";
            sQuery = sQuery + "DATA_INI = '" + Evento.getsDataIni() + "', ";
            sQuery = sQuery + "DATA_FIM = '" + Evento.getsDataFim() + "', ";
            sQuery = sQuery + "CNPJ_REQ = '" + Evento.getsCnpj() + "', ";
            sQuery = sQuery + "CPF_REQ = '" + Evento.getsCpf() + "', ";
            sQuery = sQuery + "VLR_LOC = '" + Evento.getfValor() + "', ";
            sQuery = sQuery + "RESP_EVENTO = '" + Evento.getsResp() + "', ";
            sQuery = sQuery + "TELEFONE_RESP = '" + Evento.getsTel() + "', ";
            sQuery = sQuery + "CELULAR_RESP = '" + Evento.getsCel() + "', ";
            sQuery = sQuery + "EMAIL_RESP = '" + Evento.getsEmail() + "', ";
            sQuery = sQuery + "DATA_CAD = STR_TO_DATE('" + Evento.getsDataCad() + "','%d/%m/%Y') ";
            sQuery = sQuery + "WHERE ID_EVENTO = " + Evento.getiCodigo();

            statement.executeUpdate(sQuery);

        } else {

            sQuery = "INSERT INTO CC_CAD_EVENTO (ID_EVENTO, DATA_INI, DATA_FIM, CNPJ_REQ,"
                    + "CPF_REQ, VLR_LOC, RESP_EVENTO, TELEFONE_RESP, CELULAR_RESP, "
                    + "EMAIL_RESP, DATA_CAD)"; //Monta query de INSERT
            sQuery = sQuery + " VALUES (";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_EVENTO", "ID_EVENTO") + ", "; //a função retorna o próximo ID
            sQuery = sQuery + "'" + Evento.getsDataIni() + "', "; //dados digitados na tela
            sQuery = sQuery + "'" + Evento.getsDataFim() + "', ";
            sQuery = sQuery + "'" + Evento.getsCnpj() + "', ";
            sQuery = sQuery + "'" + Evento.getsCpf() + "', ";
            sQuery = sQuery + "'" + Evento.getfValor() + "', ";
            sQuery = sQuery + "'" + Evento.getsResp() + "', ";
            sQuery = sQuery + "'" + Evento.getsTel() + "', ";
            sQuery = sQuery + "'" + Evento.getsCel() + "', ";
            sQuery = sQuery + "'" + Evento.getsEmail() + "', ";
            sQuery = sQuery + "str_to_date('" + Evento.getsDataCad() + "','%d/%m/%Y')) ";
            
            System.out.println(sQuery);
            statement.executeUpdate(sQuery); //executa query
        }


    }

    public ResultSet ListaEvento() throws SQLException {
        String sQuery;
        clsCadEvento evento = null;

        sQuery = "SELECT ID_EVENTO CÓD,";
        sQuery = sQuery + " DATE_FORMAT (DATA_INI, '%d/%m/%Y') INÍCIO,";
        sQuery = sQuery + " DATE_FORMAT (DATA_FIM, '%d/%m/%Y') FIM,";
        sQuery = sQuery + " REPLACE (VLR_LOC,'.',',') VALOR,";
        sQuery = sQuery + " TELEFONE_RESP TELEFONE,";
        sQuery = sQuery + " DATE_FORMAT(DATA_CAD, '%d/%m/%Y') DATA ";
        sQuery = sQuery + " FROM CC_CAD_EVENTO ";

        System.out.println(sQuery);

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }

    public ResultSet ConsultarEvento(int iEvento) throws SQLException {
        String sQuery;
        

        sQuery = "SELECT ID_EVENTO, DATA_INI, "
                + "DATA_FIM, "
                + "CNPJ_REQ, CPF_REQ, REPLACE (VLR_LOC, '.',',') VLR_LOC, RESP_EVENTO,"
                    + "TELEFONE_RESP, CELULAR_RESP, EMAIL_RESP, DATE_FORMAT (DATA_CAD, '%d/%m/%Y') DATA_CAD";
        sQuery = sQuery + " FROM CC_CAD_EVENTO ";
        sQuery = sQuery + " WHERE ID_EVENTO = " + iEvento;
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        rst.first();

        return rst;
    }

    public void ExcluiEvento(int iEvento) throws SQLException {
        String sQuery;
        clsCadEvento evento = null;

        sQuery = "DELETE FROM CC_CAD_EVENTO WHERE ID_EVENTO = " + iEvento + "\n";
        System.out.print(sQuery);
        statement.executeUpdate(sQuery);
    }
}
