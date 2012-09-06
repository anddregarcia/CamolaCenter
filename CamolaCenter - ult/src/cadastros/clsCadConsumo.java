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
public class clsCadConsumo extends clsJdbcDAO {

    private String sData;
    private int iCodProd;
    private double dQtdConsumo;
    

    public clsCadConsumo(String sData, int iCodProd, double dQtdConsumo) throws SQLException {

        this.sData = sData;
        this.iCodProd = iCodProd;
        this.dQtdConsumo = dQtdConsumo;

    }

    public double getdQtdConsumo() {
        return dQtdConsumo;
    }

    public void setdQtdConsumo(double dQtdConsumido) {
        this.dQtdConsumo = dQtdConsumido;
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
}
