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
public class clsCadFuncionario extends clsJdbcDAO {

    private String sNomeFunc, sDataNasc, sCPF, sCIRG, sOE, sTel, sCel, sEmail, sFuncao;
    private int iCodFunc, iCodEmpr;
    clsFunctions function = new clsFunctions();

    public clsCadFuncionario(String sNomeFunc, String sDataNasc, String sCPF, String sCIRG, String sOE,
                             String sTel, String sCel, String sEmail, String sFuncao, int iCodFunc, int iCodEmpr) throws SQLException {

        this.sNomeFunc = sNomeFunc;
        this.sDataNasc = sDataNasc;
        this.sCPF = sCPF;
        this.sCIRG = sCIRG;
        this.sOE = sOE;
        this.sTel = sTel;
        this.sCel = sCel;
        this.sEmail = sEmail;
        this.sFuncao = sFuncao;
        this.iCodFunc = iCodFunc;
        this.iCodEmpr = iCodEmpr;
    }

    public clsFunctions getFunction() {
        return function;
    }

    public void setFunction(clsFunctions function) {
        this.function = function;
    }

    public int getiCodFunc() {
        return iCodFunc;
    }

    public void setiCodFunc(int iCodFunc) {
        this.iCodFunc = iCodFunc;
    }

    public String getsCIRG() {
        return sCIRG;
    }

    public void setsCIRG(String sCIRG) {
        this.sCIRG = sCIRG;
    }

    public String getsCPF() {
        return sCPF;
    }

    public void setsCPF(String sCPF) {
        this.sCPF = sCPF;
    }

    public String getsCel() {
        return sCel;
    }

    public void setsCel(String sCel) {
        this.sCel = sCel;
    }

    public String getsDataNasc() {
        return sDataNasc;
    }

    public void setsDataNasc(String sDataNasc) {
        this.sDataNasc = sDataNasc;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsFuncao() {
        return sFuncao;
    }

    public void setsFuncao(String sFuncao) {
        this.sFuncao = sFuncao;
    }

    public String getsNomeFunc() {
        return sNomeFunc;
    }

    public void setsNomeFunc(String sNomeFunc) {
        this.sNomeFunc = sNomeFunc;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel;
    }

    public String getsOE() {
        return sOE;
    }

    public void setsOE(String sOE) {
        this.sOE = sOE;
    }

    public int getiCodEmpr() {
        return iCodEmpr;
    }

    public void setiCodEmpr(int iCodEmpr) {
        this.iCodEmpr = iCodEmpr;
    }

    
}
