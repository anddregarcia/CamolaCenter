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
 * @author AndreSAG
 */
public class clsCronograma extends clsJdbcDAO {

    private int iCrono, iCodFunc, iCodEmpr, iTurno ;
    String sRamo;
    clsFunctions function = new clsFunctions();

    public clsCronograma(int iCrono, String sRamo, int iCodFunc, int iCodEmpr, int iTurno) throws SQLException {

        this.iCrono = iCrono;
        this.sRamo = sRamo;
        this.iCodFunc = iCodFunc;
        this.iCodEmpr = iCodEmpr;
        this.iTurno = iTurno;
    }

    public clsFunctions getFunction() {
        return function;
    }

    public void setFunction(clsFunctions function) {
        this.function = function;
    }

    public int getiCodEmpr() {
        return iCodEmpr;
    }

    public void setiCodEmpr(int iCodEmpr) {
        this.iCodEmpr = iCodEmpr;
    }

    public int getiCodFunc() {
        return iCodFunc;
    }

    public void setiCodFunc(int iCodFunc) {
        this.iCodFunc = iCodFunc;
    }

    public int getiCrono() {
        return iCrono;
    }

    public void setiCrono(int iCrono) {
        this.iCrono = iCrono;
    }

    public int getiTurno() {
        return iTurno;
    }

    public void setiTurno(int iTurno) {
        this.iTurno = iTurno;
    }

    public String getsRamo() {
        return sRamo;
    }

    public void setsRamo(String sRamo) {
        this.sRamo = sRamo;
    }
    
    

}
