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
public class clsAbrirChamado extends clsJdbcDAO {

    private String sChamado, sDescricao, sData;
    private int iChamado, iCodFunc, iCodEmpr;
    clsFunctions function = new clsFunctions();

    public clsAbrirChamado(int iChamado, String sDescricao, String sData, int iCodFunc, int iCodEmpr) throws SQLException {

        this.iChamado = iChamado;
        this.sDescricao = sDescricao;
        this.sData = sData;
        this.iCodFunc = iCodFunc;
        this.iCodEmpr = iCodEmpr;
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

    public int getiChamado() {
        return iChamado;
    }

    public void setiChamado(int iChamado) {
        this.iChamado = iChamado;
    }

    public String getsData() {
        return sData;
    }

    public void setsData(String sData) {
        this.sData = sData;
    }

    public String getsDescricao() {
        return sDescricao;
    }

    public void setsDescricao(String sDescricao) {
        this.sDescricao = sDescricao;
    }

}
