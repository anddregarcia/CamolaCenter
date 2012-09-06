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
import javax.swing.JEditorPane;
import javax.swing.JTextField;

/**
 *
 * @author AndreSAG
 */
public class clsFerramentaChamado {

    public void LimparChamado(JTextField txtCodChamado, JDateChooser txtData, JEditorPane txtDecricao,
                 JComboBox cboFunc, JComboBox cboEmpr) throws SQLException {

        clsFunctions function = new clsFunctions();
        
        txtCodChamado.setText(Integer.toString(function.ProxRegistro("CC_CAD_CHAMADO", "ID_CHAMADO")));
        txtDecricao.setText("");
        txtData.setDate(null);
        cboFunc.setSelectedIndex(0);
        cboEmpr.setSelectedIndex(0);
    }

    public void HabilitaNovo(JTextField txtChamado, JDateChooser txtData, JEditorPane txtDescricao,
            JComboBox cboFunc, JComboBox cboEmpr, JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparChamado(txtChamado, txtData, txtDescricao, cboFunc, cboEmpr);

        clsFunctions function = new clsFunctions();
        
        txtChamado.setText(Integer.toString(function.ProxRegistro("CC_CAD_CHAMADO", "ID_CHAMADO")));
        txtChamado.setEnabled(false);
        
        txtData.setEnabled(true);
        txtDescricao.setEnabled(true);
        cboFunc.setEnabled(true);
        cboEmpr.setEnabled(true);

        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
    }

    public void HabilitaAlterar(JTextField txtChamado, JDateChooser txtData, JEditorPane txtDescricao,
            JComboBox cboFunc, JComboBox cboEmpr, JButton btnAlterar, JButton btnSalvar) throws SQLException {


        txtChamado.setEnabled(false);
        txtDescricao.setEnabled(true);
        cboFunc.setEnabled(true);
        cboEmpr.setEnabled(true);
        txtData.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
    }

    public void HabilitaPesquisa(JTextField txtCodChamado, JDateChooser txtData, JEditorPane txtDescricao,
                 JComboBox cboFunc, JComboBox cboEmpr, JButton btnAlterar, JButton btnSalvar) throws SQLException {

        txtCodChamado.setEnabled(true);
        txtData.setEnabled(false);
        txtDescricao.setEnabled(false);
        cboFunc.setEnabled(false);
        cboEmpr.setEnabled(false);

        btnAlterar.setEnabled(true);
        btnSalvar.setEnabled(false);
    }
}
