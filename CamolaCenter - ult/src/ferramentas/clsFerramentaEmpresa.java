/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import conexao.clsFunctions;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;

/**
 *
 * @author Osti
 */
public class clsFerramentaEmpresa {

    public void HabilitaNovo(JFormattedTextField txtCodEmpresa, JFormattedTextField txtRazSocial, JFormattedTextField txtNomeFant,
            JFormattedTextField txtInscrEst, JFormattedTextField txtCNPJEmpr, JEditorPane txtMissao, JRadioButton optAtivo, JFormattedTextField txtRua,
            JFormattedTextField txtNumero, JFormattedTextField txtBairro, JComboBox cboEstado, JComboBox cboCidade, JFormattedTextField txtContato,
            JFormattedTextField txtEmail, JFormattedTextField txtTel, JFormattedTextField txtCel, JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparEmpresa(txtCodEmpresa, txtRazSocial, txtNomeFant, txtInscrEst, txtCNPJEmpr, txtMissao, optAtivo, txtRua, txtNumero, 
                txtBairro, cboEstado, cboCidade, txtContato, txtEmail, txtTel, txtCel);
        
        clsFunctions function = new clsFunctions();
        txtCodEmpresa.setText(Integer.toString(function.ProxRegistro("CC_CAD_EMPRESA", "ID_EMPRESA")));
        
        txtCodEmpresa.setEnabled(false);
        txtRazSocial.setEnabled(true);
        txtNomeFant.setEnabled(true);
        txtInscrEst.setEnabled(true);
        txtCNPJEmpr.setEnabled(true);
        txtMissao.setEnabled(true);
        
        optAtivo.setSelected(true);
        
        txtRua.setEnabled(true);
        txtNumero.setEnabled(true);
        txtBairro.setEnabled(true);
        
        cboEstado.setEnabled(true);
        cboCidade.setEnabled(false);
        
        txtContato.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTel.setEnabled(true);
        txtCel.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);

    }

    public void LimparEmpresa(JFormattedTextField txtCodEmpresa, JFormattedTextField txtRazSocial, JFormattedTextField txtNomeFant,
            JFormattedTextField txtInscrEst, JFormattedTextField txtCNPJEmpr, JEditorPane txtMissao, JRadioButton optAtivo, JFormattedTextField txtRua,
            JFormattedTextField txtNumero, JFormattedTextField txtBairro, JComboBox cboEstado, JComboBox cboCidade, JFormattedTextField txtContato,
            JFormattedTextField txtEmail, JFormattedTextField txtTel, JFormattedTextField txtCel) throws SQLException {

        txtCodEmpresa.setText("");
        txtRazSocial.setText("");
        txtNomeFant.setText("");
        txtInscrEst.setText("");
        txtCNPJEmpr.setText("");
        txtMissao.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        cboEstado.setSelectedIndex(0);
//        cboCidade.setSelectedIndex(0);
        txtContato.setText("");
        txtEmail.setText("");
        txtTel.setText("");
        txtCel.setText("");
    }
    
     public void HabilitaPesquisa(JFormattedTextField txtCodEmpresa, JFormattedTextField txtRazSocial, JFormattedTextField txtNomeFant,
            JFormattedTextField txtInscrEst, JFormattedTextField txtCNPJEmpr, JEditorPane txtMissao, JRadioButton optAtivo, JRadioButton optInativo, JFormattedTextField txtRua,
            JFormattedTextField txtNumero, JFormattedTextField txtBairro, JComboBox cboEstado, JComboBox cboCidade, JFormattedTextField txtContato,
            JFormattedTextField txtEmail, JFormattedTextField txtTel, JFormattedTextField txtCel, JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparEmpresa(txtCodEmpresa, txtRazSocial, txtNomeFant, txtInscrEst, txtCNPJEmpr, txtMissao, optAtivo, txtRua, txtNumero, 
                txtBairro, cboEstado, cboCidade, txtContato, txtEmail, txtTel, txtCel);
             
        txtCodEmpresa.setEnabled(true);
        txtRazSocial.setEnabled(false);
        txtNomeFant.setEnabled(false);
        txtInscrEst.setEnabled(false);
        txtCNPJEmpr.setEnabled(false);
        txtMissao.setEnabled(false);
        
        optAtivo.setEnabled(false);
        optInativo.setEnabled(false);
        
        txtRua.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        
        cboEstado.setEnabled(false);
        cboCidade.setEnabled(false);
        
        txtContato.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTel.setEnabled(false);
        txtCel.setEnabled(false);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(false);

    }
     
     public void HabilitaAlteração (JFormattedTextField txtCodEmpresa, JFormattedTextField txtRazSocial, JFormattedTextField txtNomeFant,
            JFormattedTextField txtInscrEst, JFormattedTextField txtCNPJEmpr, JEditorPane txtMissao, JRadioButton optAtivo, JRadioButton optInativo, JFormattedTextField txtRua,
            JFormattedTextField txtNumero, JFormattedTextField txtBairro, JComboBox cboEstado, JComboBox cboCidade, JFormattedTextField txtContato,
            JFormattedTextField txtEmail, JFormattedTextField txtTel, JFormattedTextField txtCel, JButton btnSalvar) throws SQLException {
                
        txtCodEmpresa.setEnabled(false);
        txtRazSocial.setEnabled(true);
        txtNomeFant.setEnabled(true);
        txtInscrEst.setEnabled(true);
        txtCNPJEmpr.setEnabled(true);
        txtMissao.setEnabled(true);
        txtRua.setEnabled(true);
        txtNumero.setEnabled(true);
        txtBairro.setEnabled(true);
        
        optAtivo.setEnabled(true);
        optInativo.setEnabled(true);                
        
        cboEstado.setEnabled(true);
        cboCidade.setEnabled(true);
        
        txtContato.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTel.setEnabled(true);
        txtCel.setEnabled(true);
        
        btnSalvar.setEnabled(true);

    }
    
}
