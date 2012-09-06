/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastros;

import conexao.clsJdbcDAO;
import java.sql.SQLException;

/**
 *
 * @author AndreSAG
 */
public class clsCadEntradaEst extends clsJdbcDAO {

    private String sNotaFiscal, sData;
    private int iCodProd;
    private double dQtdEntrada;
    

    public clsCadEntradaEst(String sNotaFiscal, String sData, int iCodProd, double dQtdEntrada) throws SQLException {

        this.sNotaFiscal = sNotaFiscal;
        this.sData = sData;
        this.iCodProd = iCodProd;
        this.dQtdEntrada = dQtdEntrada;

    }

    public double getdQtdEntrada() {
        return dQtdEntrada;
    }

    public void setdQtdEntrada(double dQtdEntrada) {
        this.dQtdEntrada = dQtdEntrada;
    }

    public int getiCodProd() {
        return iCodProd;
    }

    public void setiCodProd(int iCodProd) {
        this.iCodProd = iCodProd;
    }

    public String getsData() {
        return sData;
    }

    public void setsData(String sData) {
        this.sData = sData;
    }

    public String getsNotaFiscal() {
        return sNotaFiscal;
    }

    public void setsNotaFiscal(String sNotaFiscal) {
        this.sNotaFiscal = sNotaFiscal;
    }

}
