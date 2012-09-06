/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import conexao.clsFunctions;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

/**
 *
 * @author Osti
 */
public class clsFerramentaUsuario {

    public void HabilitarNovo(JFormattedTextField txtCodUsuario, JFormattedTextField txtLogin, JPasswordField txtSenha,
            JPasswordField txtConfirmacao, JComboBox cboTpAcesso,JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparUsuario(txtCodUsuario, txtLogin, txtSenha, txtConfirmacao, cboTpAcesso);

        clsFunctions function = new clsFunctions();

        txtCodUsuario.setText(Integer.toString(function.ProxRegistro("CC_CAD_USUARIO", "ID_USUARIO")));
        txtCodUsuario.setEnabled(false);
        txtLogin.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmacao.setEnabled(true);
        cboTpAcesso.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
    }

    public void LimparUsuario(JFormattedTextField txtCodUsuario, JFormattedTextField txtLogin, JPasswordField txtSenha,
            JPasswordField txtConfirmacao, JComboBox cboTpAcesso) {

        txtCodUsuario.setText("");
        txtLogin.setText("");
        txtSenha.setText(null);
        txtConfirmacao.setText(null);
        //cboTpAcesso.setSelectedIndex(0);
    }

    public void HabilitarPesquisa(JFormattedTextField txtCodUsuario, JFormattedTextField txtLogin,JPasswordField txtSenha,
            JPasswordField txtConfirmacao, JComboBox cboTpAcesso, JButton btnAlterar, JButton btnSalvar) {

        txtCodUsuario.setEnabled(true);
        txtCodUsuario.setText(null);
        txtLogin.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfirmacao.setEnabled(false);
        cboTpAcesso.setEnabled(false);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(false);
    }
    
    public void HabilitaAlteracao (JFormattedTextField txtCodUsuario, JFormattedTextField txtLogin, JPasswordField txtSenha,
            JPasswordField txtConfirmacao, JComboBox cboTpAcesso,JButton btnAlterar, JButton btnSalvar){
        txtCodUsuario.setEnabled(false);
        txtLogin.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmacao.setEnabled(true);
        cboTpAcesso.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
    }
}
