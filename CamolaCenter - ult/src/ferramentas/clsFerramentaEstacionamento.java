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
import javax.swing.JTextField;

/**
 *
 * @author Osti
 */
public class clsFerramentaEstacionamento {

    public void LimparEstacionamento(JFormattedTextField txtCodEstac, JDateChooser txtData,
            JTextField txtQuantidade) throws SQLException {

        clsFunctions function = new clsFunctions();
        txtCodEstac.setText(Integer.toString(function.ProxRegistro("CC_CAD_ESTACIONAMENTO", "ID_ESTAC")));
        
        
        txtCodEstac.setText("");
        txtData.setDate(null);
        txtQuantidade.setText("");
    }

    public void HabilitaNovo(JFormattedTextField txtCodEstac, JDateChooser txtData,
            JTextField txtQuantidade,JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparEstacionamento(txtCodEstac, txtData, txtQuantidade);

        clsFunctions function = new clsFunctions();
        txtCodEstac.setText(Integer.toString(function.ProxRegistro("CC_CAD_ESTACIONAMENTO", "ID_ESTAC")));
        txtCodEstac.setEnabled(false);
        txtData.setEnabled(true);
        txtQuantidade.setEnabled(true);

        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
    }

    public void HabilitaAlterar(JFormattedTextField txtCodEstac, JDateChooser txtData,
            JTextField txtQuantidade, JButton btnAlterar, JButton btnSalvar) throws SQLException {


        txtCodEstac.setEnabled(false);
        txtData.setEnabled(true);
        txtQuantidade.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
    }

    public void HabilitaPesquisa(JFormattedTextField txtCodEstac, JDateChooser txtData,
            JTextField txtQuantidade, JButton btnAlterar, JButton btnSalvar) {

        txtCodEstac.setEnabled(true);
        txtData.setEnabled(false);
        txtQuantidade.setEnabled(false);

        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(false);
    }
}
