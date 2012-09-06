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
public class clsCadMarketing extends clsJdbcDAO {

    private String sDesc, sData, sNotaFiscal;
    private float fValor;
    private int iCodMarketing, idEmpresa, iCodProduto, iQtd;
    clsFunctions function = new clsFunctions();

    public clsCadMarketing(int iCodMarketing, String sNotaFiscal, int idEmpresa, String sData) throws SQLException {

        this.iCodMarketing = iCodMarketing;
        this.sNotaFiscal = sNotaFiscal;
        this.idEmpresa = idEmpresa;
        this.sData = sData;

    }

    public clsCadMarketing(int iCodMarketing, int iCodProduto, String sDesc, int iQtd, float fValor) throws SQLException {

        this.iCodMarketing = iCodMarketing;
        this.iCodProduto = iCodProduto;
        this.fValor = fValor;
        this.sDesc = sDesc;
        this.iQtd = iQtd;
        this.fValor = fValor;

    }

    public int getiQtd() {
        return iQtd;
    }

    public void setfQtd(int iQtd) {
        this.iQtd = iQtd;
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

    public int getiCodMarketing() {
        return iCodMarketing;
    }

    public void setiCodMarketing(int iCodMarketing) {
        this.iCodMarketing = iCodMarketing;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getsData() {
        return sData;
    }

    public void setsData(String sData) {
        this.sData = sData;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public String getsNotaFiscal() {
        return sNotaFiscal;
    }

    public void setsNotaFiscal(String sNotaFiscal) {
        this.sNotaFiscal = sNotaFiscal;
    }

    public int getiCodProduto() {
        return iCodProduto;
    }

    public void setiCodProduto(int iCodProduto) {
        this.iCodProduto = iCodProduto;
    }
    
    
}
