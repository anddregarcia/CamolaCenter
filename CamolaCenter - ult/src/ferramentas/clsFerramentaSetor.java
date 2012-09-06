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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Osti
 */
public class clsFerramentaSetor {

    public void HabilitaNovo(JFormattedTextField txtCodSetor, JEditorPane txtDesc, JTextField txtValor,
            JTextField txtTamanho, JRadioButton optAtivo,JRadioButton optInativo,JButton btnAlterar) throws SQLException {

        LimparSetor(txtCodSetor, txtDesc, txtValor, txtTamanho, optAtivo);

        txtCodSetor.setEnabled(false);
        clsFunctions function = new clsFunctions();
        txtCodSetor.setText(Integer.toString(function.ProxRegistro("CC_CAD_SETOR", "ID_SETOR")));

        txtDesc.setEnabled(true);
        txtValor.setEnabled(true);
        txtTamanho.setEnabled(true);
        
        optAtivo.setEnabled(true);
        optInativo.setEnabled(true);
        
        btnAlterar.setEnabled(false);

    }

    public void LimparSetor(JFormattedTextField txtCodSetor, JEditorPane txtDesc, JTextField txtValor,
            JTextField txtTamanho, JRadioButton optAtivo) throws SQLException {


        txtCodSetor.setText("");
        txtDesc.setText("");
        txtValor.setText("");
        txtTamanho.setText("");
        optAtivo.setSelected(true);

    }
    
    public void HabilitaAlterar(JFormattedTextField txtCodSetor, JEditorPane txtDesc, JTextField txtValor,
            JTextField txtTamanho, JRadioButton optAtivo, JRadioButton optInativo,JButton btnAlterar, JButton btnSalvar){
        
        txtCodSetor.setEnabled(false);
        txtDesc.setEnabled(true);
        txtValor.setEnabled(true);
        txtTamanho.setEnabled(true);
        optAtivo.setEnabled(true);
        optInativo.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
    
    }
    
    public void HabilitaPesquisa (JFormattedTextField txtCodSetor, JEditorPane txtDesc, JTextField txtValor,
            JTextField txtTamanho, JRadioButton optAtivo, JRadioButton optInativo, JButton btnAlterar, JButton btnSalvar) throws SQLException{
        
        LimparSetor(txtCodSetor, txtDesc, txtValor, txtTamanho, optAtivo);
        
        txtCodSetor.setEnabled(true);
        txtDesc.setEnabled(false);
        txtValor.setEnabled(false);
        txtTamanho.setEnabled(false);
        optAtivo.setEnabled(false);
        optInativo.setEnabled(false);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(false);
    
    }
}
