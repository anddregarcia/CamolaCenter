/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import conexao.clsFunctions;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author AndreSAG
 */
public class clsFerramentaCronograma {

    public void LimparCronograma(JTextField txtCodCrono, JComboBox cboRamo, JComboBox cboFunc,
            JComboBox cboEmpr, JComboBox cboTurno) throws SQLException {

        clsFunctions function = new clsFunctions();

        txtCodCrono.setText(Integer.toString(function.ProxRegistro("CC_CAD_CRONOGRAMA", "ID_CRONO")));
        cboFunc.setSelectedIndex(0);
        cboEmpr.setSelectedIndex(0);
        cboRamo.setSelectedIndex(0);
        cboTurno.setSelectedIndex(0);

    }

    public void HabilitaNovo(JTextField txtCodCrono, JComboBox cboRamo, JComboBox cboFunc,
            JComboBox cboEmpr, JComboBox cboTurno, JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparCronograma(txtCodCrono, cboRamo, cboFunc, cboEmpr, cboTurno);

        clsFunctions function = new clsFunctions();

        txtCodCrono.setText(Integer.toString(function.ProxRegistro("CC_CAD_CRONOGRAMA", "ID_CRONO")));
        txtCodCrono.setEnabled(false);

        cboRamo.setEnabled(true);
        cboTurno.setEnabled(true);
        cboFunc.setEnabled(true);
        cboEmpr.setEnabled(true);

        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
    }

    public void HabilitaAlterar(JTextField txtCodCrono, JComboBox cboRamo, JComboBox cboFunc,
            JComboBox cboEmpr, JComboBox cboTurno, JButton btnAlterar, JButton btnSalvar) throws SQLException {


        txtCodCrono.setEnabled(false);
        cboRamo.setEnabled(true);
        cboFunc.setEnabled(true);
        cboEmpr.setEnabled(true);
        cboTurno.setEnabled(true);

        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
    }

    public void HabilitaPesquisa(JTextField txtCodCrono, JComboBox cboRamo, JComboBox cboFunc,
            JComboBox cboEmpr, JComboBox cboTurno, JButton btnAlterar, JButton btnSalvar) throws SQLException {

        txtCodCrono.setEnabled(true);
        cboRamo.setEnabled(false);
        cboTurno.setEnabled(false);
        cboFunc.setEnabled(false);
        cboEmpr.setEnabled(false);

        btnSalvar.setEnabled(false);
    }
}
