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

/**
 *
 * @author AndreSAG
 */
public class clsFerramentaFimChamado {

    public void LimparChamado(JComboBox cboChamado, JDateChooser txtData, JEditorPane txtSolucao) throws SQLException {
        
        txtSolucao.setText("");
        txtData.setDate(null);
        cboChamado.setSelectedIndex(0);
        
    }

    public void HabilitaNovo(JComboBox cboChamado, JDateChooser txtData, JEditorPane txtSolucao, JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparChamado(cboChamado, txtData, txtSolucao);
        
        cboChamado.setEnabled(true);
        txtData.setEnabled(true);
        txtSolucao.setEnabled(true);

        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
    }

    public void HabilitaAlterar(JComboBox cboChamado, JDateChooser txtData, JEditorPane txtSolucao, JButton btnAlterar, JButton btnSalvar) throws SQLException {


        cboChamado.setEnabled(false);
        txtSolucao.setEnabled(true);
        txtData.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
    }

    public void HabilitaPesquisa(JComboBox cboChamado, JDateChooser txtData, JEditorPane txtSolucao,
                 JButton btnAlterar, JButton btnSalvar) throws SQLException {

        cboChamado.setEnabled(true);
        txtData.setEnabled(false);
        txtSolucao.setEnabled(false);

        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(false);
    }
}
