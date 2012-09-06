/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import conexao.clsFunctions;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Osti
 */
public class clsFerramentaLoja {

    public void HabilitaNovo(JTextField txtCodLoja, JTextField txtRazSocial, JTextField txtFantasia, JFormattedTextField txtInscrEst,
            JFormattedTextField txtCnpj, JEditorPane txtMissao, JRadioButton optAtivo, JRadioButton optInativo,
            JFormattedTextField txtGerLoja, JFormattedTextField txtEmailCont, JFormattedTextField txtTelCont,
            JFormattedTextField txtCelCont, JEditorPane txtObserv, JLabel lblStatus) throws SQLException {

        LimparLoja(txtCodLoja, txtRazSocial, txtFantasia, txtInscrEst, txtCnpj, txtMissao, txtGerLoja, txtEmailCont, txtTelCont,
                txtCelCont, txtObserv, lblStatus);

        txtCodLoja.setEnabled(false);
        txtRazSocial.setEnabled(true);
        txtRazSocial.grabFocus();
        txtFantasia.setEnabled(true);
        txtInscrEst.setEnabled(true);
        txtCnpj.setEnabled(true);
        txtMissao.setEnabled(true);
        txtGerLoja.setEnabled(true);
        txtEmailCont.setEnabled(true);
        txtTelCont.setEnabled(true);
        txtCelCont.setEnabled(true);
        txtObserv.setEnabled(true);

        optAtivo.setEnabled(true);
        optInativo.setEnabled(true);

        clsFunctions function = new clsFunctions();
        txtCodLoja.setText(Integer.toString(function.ProxRegistro("CC_CAD_LOJA", "ID_LOJA")));
    }

    public void LimparLoja(JTextField txtCodLoja, JTextField txtRazSocial, JTextField txtFantasia, JFormattedTextField txtInscrEst,
            JFormattedTextField txtCnpj, JEditorPane txtMissao, JFormattedTextField txtGerLoja, JFormattedTextField txtEmailCont,
            JFormattedTextField txtTelCont, JFormattedTextField txtCelCont, JEditorPane txtObserv, JLabel lblStatus) {

        txtCodLoja.setText("");
        txtRazSocial.setText("");
        txtFantasia.setText("");
        txtInscrEst.setText("");
        txtCnpj.setText("");
        txtMissao.setText("");
        lblStatus.setText("");
        txtGerLoja.setText("");
        txtEmailCont.setText("");
        txtTelCont.setText("");
        txtCelCont.setText("");
        txtObserv.setText("");
    }
    
    public void HabilitaPesquisa(JTextField txtCodLoja, JTextField txtRazSocial, JTextField txtFantasia, JFormattedTextField txtInscrEst,
            JFormattedTextField txtCnpj, JEditorPane txtMissao, JRadioButton optAtivo, JRadioButton optInativo,
            JFormattedTextField txtGerLoja, JFormattedTextField txtEmailCont, JFormattedTextField txtTelCont,
            JFormattedTextField txtCelCont, JEditorPane txtObserv, JLabel lblStatus, JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparLoja(txtCodLoja, txtRazSocial, txtFantasia, txtInscrEst, txtCnpj, txtMissao, txtGerLoja, txtEmailCont, txtTelCont,
                txtCelCont, txtObserv, lblStatus);

        txtCodLoja.setEnabled(true);
        txtRazSocial.setEnabled(false);
        txtFantasia.setEnabled(false);
        txtInscrEst.setEnabled(false);
        txtCnpj.setEnabled(false);
        txtMissao.setEnabled(false);
        txtGerLoja.setEnabled(false);
        txtEmailCont.setEnabled(false);
        txtTelCont.setEnabled(false);
        txtCelCont.setEnabled(false);
        txtObserv.setEnabled(false);

        optAtivo.setEnabled(false);
        optInativo.setEnabled(false);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(false);

    }
    
    public void HabilitaAlteracao(JTextField txtCodLoja, JTextField txtRazSocial, JTextField txtFantasia, JFormattedTextField txtInscrEst,
            JFormattedTextField txtCnpj, JEditorPane txtMissao, JRadioButton optAtivo, JRadioButton optInativo,
            JFormattedTextField txtGerLoja, JFormattedTextField txtEmailCont, JFormattedTextField txtTelCont,
            JFormattedTextField txtCelCont, JEditorPane txtObserv, JLabel lblStatus, JButton btnAlterar, JButton btnSalvar) throws SQLException {

        
        txtCodLoja.setEnabled(false);
        txtRazSocial.setEnabled(true);
        txtFantasia.setEnabled(true);
        txtInscrEst.setEnabled(true);
        txtCnpj.setEnabled(true);
        txtMissao.setEnabled(true);
        txtGerLoja.setEnabled(true);
        txtEmailCont.setEnabled(true);
        txtTelCont.setEnabled(true);
        txtCelCont.setEnabled(true);
        txtObserv.setEnabled(true);

        optAtivo.setEnabled(true);
        optInativo.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);

    }
}
