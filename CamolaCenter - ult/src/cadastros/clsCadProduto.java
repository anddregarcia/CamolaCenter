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
public class clsCadProduto extends clsJdbcDAO{
    private String sDescProd, sUnidade;
    private int iCodigo;
    private float fQtdTotal, fEstoqueMin;

   clsFunctions function = new clsFunctions();

    public clsCadProduto (int iCodigo, String sDescProd, String sUnidade, float fQtdTotal, float fEstoqueMin) throws SQLException{

        this.sDescProd = sDescProd;
        this.sUnidade = sUnidade;
        this.iCodigo = iCodigo;
        this.fQtdTotal = fQtdTotal;
        this.fEstoqueMin = fEstoqueMin;

    }

    public float getfEstoqueMin() {
        return fEstoqueMin;
    }

    public void setfEstoqueMin(float fEstoqueMin) {
        this.fEstoqueMin = fEstoqueMin;
    }

    public float getfQtdTotal() {
        return fQtdTotal;
    }

    public void setfQtdTotal(float fQtdTotal) {
        this.fQtdTotal = fQtdTotal;
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

    public String getsDescProd() {
        return sDescProd;
    }

    public void setsDescProd(String sDescProd) {
        this.sDescProd = sDescProd;
    }

    public String getsUnidade() {
        return sUnidade;
    }

    public void setsUnidade(String sUnidade) {
        this.sUnidade = sUnidade;
    }

}
