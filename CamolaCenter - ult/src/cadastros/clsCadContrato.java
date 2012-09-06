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
public class clsCadContrato extends clsJdbcDAO{
    private String sDataIni, sDataFim, sRespLoja, sRespShop ;
    private float fValor;
    private int iCodContrato, idLoja, idSetor, iDia;

   clsFunctions function = new clsFunctions();

    public clsCadContrato (String sDataIni, String sDataFim, String sRespLoja, String sRespShop, float fValor, 
                           int iCodContrato, int idLoja, int idSetor, int iDia) throws SQLException{

       this.sDataIni = sDataIni;
       this.sDataFim = sDataFim;
       this.sRespLoja = sRespLoja;
       this.sRespShop = sRespShop;
       this.fValor = fValor;
       this.iCodContrato = iCodContrato;
       this.idLoja = idLoja;
       this.idSetor = idSetor;
       this.iDia = iDia;

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

    public int getiCodContrato() {
        return iCodContrato;
    }

    public void setiCodContrato(int iCodContrato) {
        this.iCodContrato = iCodContrato;
    }

    public int getiDia() {
        return iDia;
    }

    public void setiDia(int iDia) {
        this.iDia = iDia;
    }

    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
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

    public String getsRespLoja() {
        return sRespLoja;
    }

    public void setsRespLoja(String sRespLoja) {
        this.sRespLoja = sRespLoja;
    }

    public String getsRespShop() {
        return sRespShop;
    }

    public void setsRespShop(String sRespShop) {
        this.sRespShop = sRespShop;
    }
   
}
