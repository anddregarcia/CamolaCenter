/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastros;

import conexao.clsFunctions;
import conexao.clsJdbcDAO;
import java.sql.SQLException;

/**
 *
 * @author Andre Garcia
 */
public class clsCadTurno extends clsJdbcDAO{
    private String sHoraIni, sHoraFim, sObs;
    private int iCodigo;
    private int iTempo;

   clsFunctions function = new clsFunctions();

    public clsCadTurno (int iCodigo, String sHoraIni, String sHoraFim, String sObs, int  iTempo) throws SQLException{

        this.sHoraIni = sHoraIni;
        this.sHoraFim = sHoraFim;
        this.sObs = sObs;
        this.iCodigo = iCodigo;
        this.iTempo = iTempo;

    }

    public int getiTempo() {
        return iTempo;
    }

    public void setiTempo(int iTempo) {
        this.iTempo = iTempo;
    }

    

    public clsFunctions getFunction() {
        return function;
    }

    public void setFunction(clsFunctions function) {
        this.function = function;
    }

    public int getiCodigo() {
        return iCodigo;
    }

    public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public String getsHoraFim() {
        return sHoraFim;
    }

    public void setsHoraFim(String sHoraFim) {
        this.sHoraFim = sHoraFim;
    }

    public String getsHoraIni() {
        return sHoraIni;
    }

    public void setsHoraIni(String sHoraIni) {
        this.sHoraIni = sHoraIni;
    }

    public String getsObs() {
        return sObs;
    }

    public void setsObs(String sObs) {
        this.sObs = sObs;
    }

    public void NovoTurno(Object oCodigo, Object oHoraIni, Object oHoraFim, Object oObs) throws SQLException{

        oHoraIni = "";
        oHoraFim = "";
        oObs = "";
        oCodigo = function.ProxRegistro("CC_CAD_TURNO", "ID_TURNO");

    }
}
