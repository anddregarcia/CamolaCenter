/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import conexao.clsFunctions;
import conexao.clsJdbcDAO;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;


/**
 *
 * @author AndreSAG
 */
public class clsCadEmpresa extends clsJdbcDAO {

    private String sData, sRazSocial, sFantasia, sInscrEst, sCnpj, sMissao,
            sRua, sNumero, sBairro, sContNome, sContEmail,
            sTel, sCel;
    Object oUF, oCidade;
    private int iCod;
    private boolean bStatus;
    clsFunctions function = new clsFunctions();

    public clsCadEmpresa(int iCod, String sData, String sRazSocial, String sFantasia, String sInscrEst, String sCnpj, String sMissao,
            String sRua, String sNumero, String sBairro, Object oUF, Object oCidade, String sContNome, String sContEmail,
            String sTel, String sCel, boolean bStatus) throws SQLException {

        this.iCod = iCod;
        this.sData = sData;
        this.sRazSocial = sRazSocial;
        this.sFantasia = sFantasia;
        this.sInscrEst = sInscrEst;
        this.sCnpj = sCnpj;
        this.sMissao = sMissao;
        this.sRua = sRua;
        this.sNumero = sNumero;
        this.sBairro = sBairro;
        this.oUF = oUF;
        this.oCidade = oCidade;
        this.sContNome = sContNome;
        this.sContEmail = sContEmail;
        this.sTel = sTel;
        this.sCel = sCel;
        this.bStatus = bStatus;
    }

    public boolean isbStatus() {
        return bStatus;
    }

    public void setbStatus(boolean bStatus) {
        this.bStatus = bStatus;
    }

    public clsFunctions getFunction() {
        return function;
    }

    public void setFunction(clsFunctions function) {
        this.function = function;
    }

    public int getiCod() {
        return iCod;
    }

    public void setiCod(int iCod) {
        this.iCod = iCod;
    }

    public Object getoCidade() {
        return oCidade;
    }

    public void setoCidade(Object oCidade) {
        this.oCidade = oCidade;
    }

    public Object getoUF() {
        return oUF;
    }

    public void setoUF(Object oUF) {
        this.oUF = oUF;
    }

    public String getsBairro() {
        return sBairro;
    }

    public void setsBairro(String sBairro) {
        this.sBairro = sBairro;
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

    public String getsContEmail() {
        return sContEmail;
    }

    public void setsContEmail(String sContEmail) {
        this.sContEmail = sContEmail;
    }

    public String getsContNome() {
        return sContNome;
    }

    public void setsContNome(String sContNome) {
        this.sContNome = sContNome;
    }

    public String getsData() {
        return sData;
    }

    public void setsData(String sData) {
        this.sData = sData;
    }

    public String getsFantasia() {
        return sFantasia;
    }

    public void setsFantasia(String sFantasia) {
        this.sFantasia = sFantasia;
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

    public String getsNumero() {
        return sNumero;
    }

    public void setsNumero(String sNumero) {
        this.sNumero = sNumero;
    }

    public String getsRazSocial() {
        return sRazSocial;
    }

    public void setsRazSocial(String sRazSocial) {
        this.sRazSocial = sRazSocial;
    }

    public String getsRua() {
        return sRua;
    }

    public void setsRua(String sRua) {
        this.sRua = sRua;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel;
    }


    public void NovaEmpresa(JFormattedTextField txtCodEmpresa, JFormattedTextField txtDataCad, JFormattedTextField txtRazSocial, 
                            JFormattedTextField txtNomeFant, JFormattedTextField txtInscrEst, JFormattedTextField txtCNPJEmpr,
                            JFormattedTextField txtMissao, JRadioButton optAtivo, JRadioButton optInativo,
                            JFormattedTextField txtRua, JFormattedTextField txtNumero, JFormattedTextField txtBairro,
                            JComboBox cboEstado, JComboBox cboCidade, JFormattedTextField txtContato,
                            JFormattedTextField txtEmail, JFormattedTextField txtTel, JFormattedTextField txtCel) throws SQLException {

       System.out.println("Aqui4");

        txtCodEmpresa.setText(Integer.toString(function.ProxRegistro("CC_CAD_EMPRESA", "ID_EMPRESA")));
        txtDataCad.setText("");
        txtRazSocial.setText("");
        txtNomeFant.setText("");
        txtInscrEst.setText("");
        txtCNPJEmpr.setText("");
        txtMissao.setText("");
        optAtivo.setSelected(true);
        optInativo.setSelected(false);
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        cboEstado.setSelectedIndex(1);
        cboCidade.setSelectedIndex(1);
        txtContato.setText("");
        txtEmail.setText("");
        txtTel.setText("");
        txtCel.setText("");
    }
}
