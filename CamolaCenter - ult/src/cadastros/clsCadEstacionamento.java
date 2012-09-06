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
public class clsCadEstacionamento extends clsJdbcDAO{
    private String sData;
    private int iCodigo, iQtdCarro;

   clsFunctions function = new clsFunctions();

    public clsCadEstacionamento (int iCodigo, String sData, int iQtdCarro) throws SQLException{

        this.sData = sData;
        this.iQtdCarro = iQtdCarro;
        this.iCodigo = iCodigo;

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

    public int getiQtdCarro() {
        return iQtdCarro;
    }

    public void setiQtdCarro(int iQtdCarro) {
        this.iQtdCarro = iQtdCarro;
    }

    public String getsData() {
        return sData;
    }

    public void setsData(String sData) {
        this.sData = sData;
    }

    
   
}
