/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import com.toedter.calendar.JDateChooser;
import conexao.clsFunctions;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Osti
 */
public class clsFerramentaEvento {

    public void HabilitarNovo(JTextField txtCodEvento, JDateChooser txtDataIni, JDateChooser txtDataFim,
            JTextField txtValor, JRadioButton optFisica, JRadioButton optJuridica, JFormattedTextField txtCpf, JFormattedTextField txtCnpj,
            JFormattedTextField txtNome, JFormattedTextField txtEmail, JFormattedTextField txtTel, JFormattedTextField txtCel,
            JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparEvento(txtCodEvento, txtDataIni, txtDataFim, txtValor, optFisica, optJuridica, txtCpf, txtCnpj, txtNome, txtEmail, txtTel, txtCel);

        clsFunctions function = new clsFunctions();
        txtCodEvento.setText(Integer.toString(function.ProxRegistro("CC_CAD_EVENTO", "ID_EVENTO")));

        txtCodEvento.setEnabled(false);
        txtDataIni.setEnabled(true);
        txtDataFim.setEnabled(true);
        txtValor.setEnabled(true);
        optFisica.setEnabled(true);
        optJuridica.setEnabled(true);
        txtCpf.setEnabled(false);
        txtCnpj.setEnabled(false);
        txtNome.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTel.setEnabled(true);
        txtCel.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
    }

    public void LimparEvento(JTextField txtCodEvento, JDateChooser txtDataIni, JDateChooser txtDataFim,
            JTextField txtValor, JRadioButton optFisica, JRadioButton optJuridica, JFormattedTextField txtCpf, JFormattedTextField txtCnpj,
            JFormattedTextField txtNome, JFormattedTextField txtEmail, JFormattedTextField txtTel, JFormattedTextField txtCel) {

        txtCodEvento.setText("");
        txtDataIni.setDate(null);
        txtDataFim.setDate(null);
        txtValor.setText("");
        optFisica.setSelected(false);
        optJuridica.setSelected(false);
        txtCpf.setText(null);
        txtCpf.setText("");
        txtCnpj.setText(null);
        txtCnpj.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtTel.setText("");
        txtCel.setText("");
    }

    public void HabilitaPesquisar(JTextField txtCodEvento, JDateChooser txtDataIni, JDateChooser txtDataFim,
            JTextField txtValor, JRadioButton optFisica, JRadioButton optJuridica, JFormattedTextField txtCpf, JFormattedTextField txtCnpj,
            JFormattedTextField txtNome, JFormattedTextField txtEmail, JFormattedTextField txtTel, JFormattedTextField txtCel,
            JButton btnAlterar, JButton btnSalvar) {

        LimparEvento(txtValor, txtDataIni, txtDataFim, txtValor, optFisica, optJuridica, txtCpf, txtCnpj, txtNome, txtEmail, txtTel, txtCel);

        txtCodEvento.setEnabled(true);
        txtDataIni.setEnabled(false);
        txtDataFim.setEnabled(false);
        txtValor.setEnabled(false);
        optFisica.setEnabled(false);
        optJuridica.setEnabled(false);
        txtCpf.setEnabled(false);
        txtCnpj.setEnabled(false);
        txtNome.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTel.setEnabled(false);
        txtCel.setEnabled(false);
        
        btnAlterar.setEnabled(true);
        btnSalvar.setEnabled(false);                    
                

    }

    public void HabilitaAlteracao(JTextField txtCodEvento, JDateChooser txtDataIni, JDateChooser txtDataFim,
            JTextField txtValor, JRadioButton optFisica, JRadioButton optJuridica, JFormattedTextField txtCpf, JFormattedTextField txtCnpj,
            JFormattedTextField txtNome, JFormattedTextField txtEmail, JFormattedTextField txtTel, JFormattedTextField txtCel, 
            JButton btnAlterar, JButton btnSalvar) {

        txtCodEvento.setEnabled(false);
        txtDataIni.setEnabled(true);
        txtDataFim.setEnabled(true);
        txtValor.setEnabled(true);
        optFisica.setEnabled(true);
        optJuridica.setEnabled(true);
        if (optFisica.isSelected()) {
            txtCpf.setEnabled(true);
            txtCnpj.setEnabled(false);
        } else {
            txtCpf.setEnabled(false);
            txtCnpj.setEnabled(true);
        }
        txtNome.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTel.setEnabled(true);
        txtCel.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);

    }
}
