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
public class clsCadSetor extends clsJdbcDAO{
    private String sDescLoc;
    private float fValor, fMedida;
    private int iCodigo;
    private int iStatus;

   clsFunctions function = new clsFunctions();

    public clsCadSetor (int iCodigo, String sDescLoc, float fValor, float fMedida, int iStatus) throws SQLException{

       this.iStatus = iStatus;
       this.iCodigo = iCodigo;
       this.sDescLoc = sDescLoc;
       this.fValor = fValor;
       this.fMedida = fMedida;
       

    }

    public int getiStatus() {
        return iStatus;
    }

    public void setiStatus(int iStatus) {
        this.iStatus = iStatus;
    }

    

    public float getfMedida() {
        return fMedida;
    }

    public void setfMedida(float fMedida) {
        this.fMedida = fMedida;
    }

    public float getfValor() {
        return fValor;
    }

    public void setfValor(float fValor) {
        this.fValor = fValor;
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

    public String getsDescLoc() {
        return sDescLoc;
    }

    public void setsDescLoc(String sDescLoc) {
        this.sDescLoc = sDescLoc;
    }

   
}
