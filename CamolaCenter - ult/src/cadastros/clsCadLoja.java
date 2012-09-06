/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastros;

import conexao.clsJdbcDAO;
import java.sql.SQLException;

/**
 *
 * @author Osti
 */
public class clsCadLoja extends clsJdbcDAO {
    public int iCodigo, iStatus;
    public String sFantasia, sCnpj, sRazSocial, sInscrEst, sMissao, sObs, sGerLoja, 
                            sTel, sCel, sEmail, sDataCad;
    


    public clsCadLoja (int iCodigo, String sFantasia,String sCnpj, String sRazSocial, String sInscrEst,
                        String sMissao, String sObs, String sGerLoja, String sTel,
                          String sCel, String sEmail,String sDataCad, int iStatus) throws SQLException{

        this.iCodigo = iCodigo;
        this.sFantasia = sFantasia;
        this.sCnpj = sCnpj;
        this.sRazSocial = sRazSocial;
        this.sInscrEst = sInscrEst;
        this.sMissao = sMissao;
        this.sObs = sObs;
        this.sGerLoja = sGerLoja;
        this.sTel = sTel;
        this.sCel = sCel;
        this.sEmail = sEmail;
        this.sDataCad = sDataCad;
        this.iStatus = iStatus;

    }

    public int getiStatus() {
        return iStatus;
    }

    public void setiStatus(int iStatus) {
        this.iStatus = iStatus;
    }



    public String getsDataCad() {
        return sDataCad;
    }

    public void setsDataCad(String sDataCad) {
        this.sDataCad = sDataCad;
    }


    public int getiCodigo() {
        return iCodigo;
    }

    public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public String getsCel() {
        return sCel;
    }

    public void setsCel(String sCel) {
        this.sCel = sCel;
    }

    public String getsCnpj() {
        return sCnpj;
    }

    public void setsCnpj(String sCnpj) {
        this.sCnpj = sCnpj;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsFantasia() {
        return sFantasia;
    }

    public void setsFantasia(String sFantasia) {
        this.sFantasia = sFantasia;
    }

    public String getsGerLoja() {
        return sGerLoja;
    }

    public void setsGerLoja(String sGerLoja) {
        this.sGerLoja = sGerLoja;
    }

    public String getsInscrEst() {
        return sInscrEst;
    }

    public void setsInscrEst(String sInscrEst) {
        this.sInscrEst = sInscrEst;
    }

    public String getsMissao() {
        return sMissao;
    }

    public void setsMissao(String sMissao) {
        this.sMissao = sMissao;
    }

    public String getsObs() {
        return sObs;
    }

    public void setsObs(String sObs) {
        this.sObs = sObs;
    }

    public String getsRazSocial() {
        return sRazSocial;
    }

    public void setsRazSocial(String sRazSocial) {
        this.sRazSocial = sRazSocial;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel;
    }


}
