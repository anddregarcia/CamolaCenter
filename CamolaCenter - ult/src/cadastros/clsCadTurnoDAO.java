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
public class clsCadTurnoDAO extends clsJdbcDAO { //cria classe que usa conecção com o banco

    public clsCadTurnoDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions(); //Chama a classe

    public void InserirTurno(clsCadTurno Turno) throws SQLException { //Método que insere novo turno
        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_TURNO ";
        sQuery = sQuery + " WHERE ID_TURNO = " + Turno.getiCodigo();
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_TURNO "; //Monta query de UPDATE
            sQuery = sQuery + " SET ";
            
            sQuery = sQuery + "HORA_INI = '" + Turno.getsHoraIni() + "', ";
            sQuery = sQuery + "HORA_FINAL = '" + Turno.getsHoraFim() + "', ";
            sQuery = sQuery + "OBS_TURNO = '" + Turno.getsObs() + "', ";
            sQuery = sQuery + "TEMPO = '" + Turno.getiTempo() + "' ";
            sQuery = sQuery + "WHERE ID_TURNO = " + Turno.getiCodigo();
            

            statement.executeUpdate(sQuery);
        } else {

            sQuery = "INSERT INTO CC_CAD_TURNO (ID_TURNO, HORA_INI, HORA_FINAL, OBS_TURNO, TEMPO)"; //Monta query de INSERT
            sQuery = sQuery + " VALUES (";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_TURNO", "ID_TURNO") + ", "; //a função retorna o próximo ID
            //sQuery = sQuery + Turno.isbTempo() + "', ";
            sQuery = sQuery + "'" + Turno.getsHoraIni() + "', "; //dados digitados na tela
            sQuery = sQuery + "'" + Turno.getsHoraFim() + "', ";
            sQuery = sQuery + "'" + Turno.getsObs() + "', ";
            sQuery = sQuery + Turno.getiTempo() + ")";

            statement.executeUpdate(sQuery); //executa query
        }
    }

    public ResultSet ConsultarTurno(int iTurno) throws SQLException {
        String sQuery;
        //clsCadTurno turno = null;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_TURNO ";
        sQuery = sQuery + " WHERE ID_TURNO = " + iTurno;
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        rst.first();

        //if (rst.next()) {
            //turno = new clsCadTurno(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getBoolean(5));
        //}
        return rst;
    }

    public void ExcluiTurno(int iTurno) throws SQLException {
        String sQuery;
        clsCadTurno turno = null;

        sQuery = "DELETE FROM CC_CAD_TURNO WHERE ID_TURNO = " + iTurno + "\n";
        statement.executeUpdate(sQuery);
    }

    public ResultSet ListaTurno() throws SQLException {
        String sQuery;
        clsCadTurno turno = null;

        sQuery = "SELECT ID_TURNO CÓDIGO,";
        
        sQuery = sQuery + " HORA_INI INÍCIO,";
        sQuery = sQuery + " HORA_FINAL FIM,";
        sQuery = sQuery + " OBS_TURNO OBS,";
        sQuery = sQuery + " TEMPO TEMPO";
        sQuery = sQuery + " FROM CC_CAD_TURNO ";


        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }


}
