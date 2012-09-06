/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import conexao.clsFunctions;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Osti
 */
public class clsFerramentaTurno extends PlainDocument {

    public clsFerramentaTurno() throws SQLException {
    }

    public void HabilitaNovo(JFormattedTextField txtCodTurno, JFormattedTextField txtHoraIni,
            JTextField txtObs, JRadioButton optSeis, JRadioButton optOito, JButton btnSalvar, JButton btnAlterar) throws SQLException {

        txtCodTurno.setEnabled(false);
        txtHoraIni.setEnabled(true);
        txtObs.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
        
        optSeis.setEnabled(true);
        optOito.setEnabled(true);

        clsFunctions function = new clsFunctions();
        txtCodTurno.setText(Integer.toString(function.ProxRegistro("CC_CAD_TURNO", "ID_TURNO")));
        txtHoraIni.setText("");
        txtObs.setText("");
    }

    public void LimparTurno(JFormattedTextField txtCodTurno, JFormattedTextField txtHoraIni,
            JTextField txtObs) throws SQLException {

        clsFunctions function = new clsFunctions();

        txtCodTurno.setText(Integer.toString(function.ProxRegistro("CC_CAD_TURNO", "ID_TURNO")));
        txtHoraIni.setText("");
        txtObs.setText("");
    }

    public void HabilitaPesquisa(JFormattedTextField txtCodTurno, JFormattedTextField txtHoraIni,
            JTextField txtObs, JRadioButton optSeis, JRadioButton optOito, JButton btnSalvar) throws SQLException {

        txtCodTurno.setEnabled(true);
        txtHoraIni.setEnabled(false);
        txtObs.setEnabled(false);
        btnSalvar.setEnabled(false);
        //btnSalvar.disable();

        optSeis.setEnabled(false);
        optOito.setEnabled(false);

        txtCodTurno.setText("");
        txtHoraIni.setText("");
        txtObs.setText("");

    }

    public void HabilitaAlteracao(JFormattedTextField txtCodTurno, JFormattedTextField txtHoraIni,
            JTextField txtObs, JRadioButton optSeis, JRadioButton optOito, JButton btnSalvar, JButton btnExcluir) throws SQLException {

        txtCodTurno.setEnabled(false);
        txtHoraIni.setEnabled(true);
        txtObs.setEnabled(true);
        optSeis.setEnabled(true);
        optOito.setEnabled(true);

        btnExcluir.setEnabled(true);
        btnSalvar.setEnabled(true);
    }

    public boolean verificaData(String Hora) throws SQLException {

        String sHora = Hora.substring(0, 2);
        String sHora1 = Hora.substring(0, 1);
        String sHora2 = Hora.substring(1, 2);
        String sMinuto = Hora.substring(3, 5);
        String sMinuto1 = Hora.substring(3, 4);
        String sMinuto2 = Hora.substring(4, 5);


        if (sHora1.equals("_") || sHora2.equals("_") || sMinuto1.equals("_") || sMinuto2.equals("_")) {
            return false;
        } else if ((!sHora.equals("__")) && (!sMinuto.equals("__"))) {

            int iHora = Integer.parseInt(sHora);
            int iMinuto = Integer.parseInt(sMinuto);

            if ((iHora > 23) || (iMinuto > 59)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public String alteraData(String Hora, int cHora) throws SQLException {


        String sHora = Hora.substring(0, 2);
        String sMinuto = Hora.substring(3, 5);
        //String sSegundo = Hora.substring(6, 9);

        int iHora, nHora, nnHora;
        //int iSegundo;

        iHora = Integer.parseInt(sHora);
        //iMinuto = Integer.parseInt(sMinuto);
        // iSegundo = Integer.parseInt(sSegundo);

        nHora = iHora + cHora;
        nnHora = nHora - 24;
        String Horario = null;

        if (sHora.equals("00")) {
            Horario = "0" + String.valueOf(nHora) + ":" + sMinuto + ":" + "00";
            return Horario;

        } else if (nHora < 24) {
            Horario = String.valueOf(nHora) + ":" + sMinuto + ":" + "00";
            return Horario;

        } else if (nHora > 24) {
            Horario = "0" + String.valueOf(nnHora) + ":" + sMinuto + ":" + "00";
            return Horario;
        }
        return Horario;
    }

   


}
