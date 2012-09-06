/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import com.toedter.calendar.JDateChooser;
import conexao.clsFunctions;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Andre Garcia
 */
public class clsFerramentaMarketing {

    public clsFerramentaMarketing() throws SQLException {
    }

    public void HabilitaNovo(JTextField txtCodMarketing, JTextField txtNotaFiscal, JComboBox cboEmpresa,
            JDateChooser txtData, JTextField txtDesc, JTextField txtQtd, JTextField txtValor, JTable tblProdNota,
            JButton btnAlterar, JButton btnSalvar, JButton btnExcluir) throws SQLException {

        LimparTela(txtCodMarketing, txtNotaFiscal, cboEmpresa, txtData, txtDesc, txtQtd, txtValor, tblProdNota);

        clsFunctions function = new clsFunctions();
        
        tblProdNota.removeAll();
        
        txtCodMarketing.setEnabled(false);
        txtNotaFiscal.setEnabled(true);
        cboEmpresa.setEnabled(true);
        txtData.setEnabled(true);
        txtDesc.setEnabled(true);
        txtQtd.setEnabled(true);
        txtValor.setEnabled(true);
        tblProdNota.setEnabled(true);

        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);

    }

    public void LimparTela(JTextField txtCodMarketing, JTextField txtNotaFiscal, JComboBox cboEmpresa,
            JDateChooser txtData, JTextField txtDesc, JTextField txtQtd, JTextField txtValor, JTable tblProdNota) throws SQLException {

        clsFunctions function = new clsFunctions();
        
        tblProdNota.removeAll();

        txtCodMarketing.setText(Integer.toString(function.ProxRegistro("CC_CAD_MARKETING", "ID_MARKETING")));
        txtNotaFiscal.setText("");
        cboEmpresa.setSelectedIndex(0);
        txtData.setDate(null);
        txtDesc.setText("");
        txtQtd.setText("");
        txtValor.setText("");
    }

    public void HabilitaPesquisa(JTextField txtCodMarketing, JTextField txtNotaFiscal, JComboBox cboEmpresa,
            JDateChooser txtData, JTextField txtDesc, JTextField txtQtd, JTextField txtValor, JTable tblProdNota, JButton btnAlterar, JButton btnSalvar, JButton btnExcluir) throws SQLException {

        LimparTela(txtCodMarketing, txtNotaFiscal, cboEmpresa, txtData, txtDesc, txtQtd, txtValor, tblProdNota);

        txtCodMarketing.setEnabled(true);
        txtNotaFiscal.setEnabled(false);
        cboEmpresa.setEnabled(false);
        txtData.setEnabled(false);
        txtDesc.setEnabled(false);
        txtQtd.setEnabled(false);
        txtValor.setEnabled(false);
        tblProdNota.setEnabled(false);

        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(false);
        
        tblProdNota.removeAll();

    }

    public void HabilitaAlterar(JTextField txtCodMarketing, JTextField txtNotaFiscal, JComboBox cboEmpresa,
            JDateChooser txtData, JTextField txtDesc, JTextField txtQtd, JTable tblProdNota, JTextField txtValor, JButton btnSalvar) throws SQLException {

        txtCodMarketing.setEnabled(false);
        txtNotaFiscal.setEnabled(false);
        cboEmpresa.setEnabled(true);
        txtData.setEnabled(true);
        txtDesc.setEnabled(true);
        txtQtd.setEnabled(true);
        txtValor.setEnabled(true);
        tblProdNota.setEnabled(true);

        btnSalvar.setEnabled(true);

    }
}
