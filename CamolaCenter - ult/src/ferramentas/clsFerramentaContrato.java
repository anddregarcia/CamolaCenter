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
import javax.swing.JTextField;

/**
 *
 * @author Andre Garcia
 */
public class clsFerramentaContrato {
    
    public clsFerramentaContrato() throws SQLException{
    
    }

    public void HabilitaNovo(JTextField txtCodContrato, JComboBox cboLoja, JComboBox cboSetor,
            JTextField txtRespLoja, JTextField txtRespShop, JDateChooser txtDataIni, JDateChooser txtDataFim,
            JTextField txtDiaPgto, JTextField txtVlrParcela, JButton btnAlterar, JButton btnSalvar, JButton btnExcluir) throws SQLException {

        LimparContrato(txtCodContrato, cboLoja, cboSetor, txtRespLoja, txtRespShop, txtDataIni, txtDataFim, txtDiaPgto, txtVlrParcela);
        
        clsFunctions function = new clsFunctions();
        txtCodContrato.setText(Integer.toString(function.ProxRegistro("CC_CAD_CONTRATO", "ID_CONTRATO")));
        
        txtCodContrato.setEnabled(false);
        cboLoja.setEnabled(true);
        cboSetor.setEnabled(true);
        txtRespLoja.setEnabled(true);
        txtRespShop.setEnabled(true);
        txtDataIni.setEnabled(true);        
        txtDataFim.setEnabled(true);
        txtDiaPgto.setEnabled(true);
        txtVlrParcela.setEnabled(true);

        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);

    }

    public void LimparContrato(JTextField txtCodContrato, JComboBox cboLoja, JComboBox cboSetor,
            JTextField txtRespLoja, JTextField txtRespShop, JDateChooser txtDataIni, JDateChooser txtDataFim,
            JTextField txtDiaPgto, JTextField txtVlrParcela) throws SQLException {
        
        clsFunctions functions = new clsFunctions();
        
        txtCodContrato.setText(Integer.toString(functions.ProxRegistro("CC_CAD_CONTRATO", "ID_CONTRATO")));
        cboLoja.setSelectedIndex(0);
        cboSetor.setSelectedIndex(0);        
        txtRespLoja.setText("");
        txtRespShop.setText("");
        txtDataIni.setDate(null);
        txtDataFim.setDate(null);
        txtDiaPgto.setText("");
        txtVlrParcela.setText("");

    }
    
     public void HabilitaPesquisa(JTextField txtCodContrato, JComboBox cboLoja, JComboBox cboSetor,
            JTextField txtRespLoja, JTextField txtRespShop, JDateChooser txtDataIni, JDateChooser txtDataFim,
            JTextField txtDiaPgto, JTextField txtVlrParcela, JButton btnAlterar, JButton btnSalvar, JButton btnExcluir) throws SQLException {

        LimparContrato(txtCodContrato, cboLoja, cboSetor, txtRespLoja, txtRespShop, txtDataIni, txtDataFim, txtDiaPgto, txtVlrParcela);
             
        txtCodContrato.setEnabled(true);
        cboLoja.setEnabled(false);
        cboSetor.setEnabled(false);
        txtRespLoja.setEnabled(false);
        txtRespShop.setEnabled(false);
        txtDataIni.setEnabled(false);        
        txtDataFim.setEnabled(false);
        txtDiaPgto.setEnabled(false);
        txtVlrParcela.setEnabled(false);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(false);

    }
     
     public void HabilitaAlterar (JTextField txtCodContrato, JComboBox cboLoja, JComboBox cboSetor,
            JTextField txtRespLoja, JTextField txtRespShop, JDateChooser txtDataIni, JDateChooser txtDataFim,
            JTextField txtDiaPgto, JTextField txtVlrParcela, JButton btnSalvar) throws SQLException {
                
        txtCodContrato.setEnabled(false);
        cboLoja.setEnabled(false);
        cboSetor.setEnabled(false);
        txtRespLoja.setEnabled(true);
        txtRespShop.setEnabled(true);
        txtDataIni.setEnabled(true);        
        txtDataFim.setEnabled(true);
        txtDiaPgto.setEnabled(true);
        txtVlrParcela.setEnabled(true);
        
        btnSalvar.setEnabled(true);

    }

}
