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
public class clsFinalizarChamado extends clsJdbcDAO {

    private String sSolucao, sData;
    int iChamado;
    clsFunctions function = new clsFunctions();

    public clsFinalizarChamado(int iChamado, String sSolucao, String sData) throws SQLException {

        this.iChamado = iChamado;
        this.sSolucao = sSolucao;
        this.sData = sData;
    }

    public clsFunctions getFunction() {
        return function;
    }

    public void setFunction(clsFunctions function) {
        this.function = function;
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

    public String getsSolucao() {
        return sSolucao;
    }

    public void setsSolucao(String sDescricao) {
        this.sSolucao = sDescricao;
    }

}
