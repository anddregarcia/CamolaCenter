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
public class clsCadEvento extends clsJdbcDAO {
    public int iCodigo;
    public String sDataIni, sDataFim, sCnpj, sCpf, sResp, sTel, sCel, sEmail, sDataCad ;
    public float fValor;

    public clsCadEvento (int iCodigo, String sDataIni, String sDataFim, String sCnpj, String sCpf, float fValor, String sResp, String sTel, String sCel, String sEmail, String sDataCad) throws SQLException{

        this.iCodigo = iCodigo;
        this.sDataIni = sDataIni;
        this.sDataFim = sDataFim;
        this.sCnpj = sCnpj;
        this.sCpf = sCpf;
        this.fValor = fValor;
        this.sResp = sResp;
        this.sTel = sTel;
        this.sCel = sCel;
        this.sEmail = sEmail;
        this.sDataCad = sDataCad;

    }

    public float getfValor() {
        return fValor;
    }

    public void setfValor(float fValor) {
        this.fValor = fValor;
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

    public String getsCpf() {
        return sCpf;
    }

    public void setsCpf(String sCpf) {
        this.sCpf = sCpf;
    }

    public String getsDataCad() {
        return sDataCad;
    }

    public void setsDataCad(String sDataCad) {
        this.sDataCad = sDataCad;
    }

    public String getsDataFim() {
        return sDataFim;
    }

    public void setsDataFim(String sDataFim) {
        this.sDataFim = sDataFim;
    }

    public String getsDataIni() {
        return sDataIni;
    }

    public void setsDataIni(String sDataIni) {
        this.sDataIni = sDataIni;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsResp() {
        return sResp;
    }

    public void setsResp(String sResp) {
        this.sResp = sResp;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel;
    }


   
    
}
