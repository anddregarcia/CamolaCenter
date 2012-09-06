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
public class clsCadUsuario extends clsJdbcDAO{
    private String sLogin, sSenha, sTpAcesso, dDataCad;
    private int iCodigo;
   
   clsFunctions function = new clsFunctions();

    public clsCadUsuario (int iCodigo, String sLogin, String sSenha, String dDataCad, String sTpAcesso) throws SQLException{

        this.sLogin = sLogin;
        this.sSenha = sSenha;
        this.iCodigo = iCodigo;
        this.dDataCad = dDataCad;
        this.sTpAcesso = sTpAcesso;
        
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

    public String getsLogin() {
        return sLogin;
    }

    public void setsLogin(String sLogin) {
        this.sLogin = sLogin;
    }

    public String getsSenha() {
        return sSenha;
    }

    public void setsSenha(String sSenha) {
        this.sSenha = sSenha;
    }

    public String getsTpAcesso() {
        return sTpAcesso;
    }

    public void setsTpAcesso(String sTpAcesso) {
        this.sTpAcesso = sTpAcesso;
    }

    public String getdDataCad() {
        return dDataCad;
    }

    public void setdDataCad(String dDataCad) {
        this.dDataCad = dDataCad;
    }

}
