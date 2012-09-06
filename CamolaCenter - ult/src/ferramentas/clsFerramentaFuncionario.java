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

/**
 *
 * @author Osti
 */
public class clsFerramentaFuncionario {

    public void HabilitaNovo(JFormattedTextField txtCodFunc, JFormattedTextField txtNomeFunc, JFormattedTextField txtDataNascFunc,
            JFormattedTextField txtCPFFunc, JFormattedTextField txtRGFunc, JFormattedTextField txtOEFunc, JFormattedTextField txtTelFunc,
            JFormattedTextField txtCelFunc, JFormattedTextField txtEmailFunc, JComboBox cboEmpresa, JFormattedTextField txtFuncao,
            JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparFunc(txtCodFunc, txtNomeFunc, txtDataNascFunc, txtCPFFunc, txtRGFunc, txtOEFunc, txtTelFunc,
                txtCelFunc, txtEmailFunc, cboEmpresa, txtFuncao);

        clsFunctions function = new clsFunctions();
        txtCodFunc.setText(Integer.toString(function.ProxRegistro("CC_CAD_FUNCIONARIO", "ID_FUNC")));

        txtCodFunc.setEnabled(false);
        txtNomeFunc.setEnabled(true);
        txtDataNascFunc.setEnabled(true);
        txtCPFFunc.setEnabled(true);
        txtRGFunc.setEnabled(true);
        txtOEFunc.setEnabled(true);
        txtTelFunc.setEnabled(true);
        txtCelFunc.setEnabled(true);
        txtEmailFunc.setEnabled(true);

        cboEmpresa.setEnabled(true);

        txtFuncao.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);

    }

    public void LimparFunc(JFormattedTextField txtCodFunc, JFormattedTextField txtNomeFunc, JFormattedTextField txtDataNascFunc,
            JFormattedTextField txtCPFFunc, JFormattedTextField txtRGFunc, JFormattedTextField txtOEFunc, JFormattedTextField txtTelFunc,
            JFormattedTextField txtCelFunc, JFormattedTextField txtEmailFunc, JComboBox cboEmpresa, JFormattedTextField txtFuncao) throws SQLException {


        txtCodFunc.setText("");
        txtNomeFunc.setText("");
        txtDataNascFunc.setText("");
        txtCPFFunc.setText("");
        txtRGFunc.setText("");
        txtOEFunc.setText("");
        txtTelFunc.setText("");
        txtCelFunc.setText("");
        txtEmailFunc.setText("");

        cboEmpresa.setSelectedIndex(0);

        txtFuncao.setText("");

    }
    
    public void HabilitaAlterar (JFormattedTextField txtCodFunc, JFormattedTextField txtNomeFunc, JFormattedTextField txtDataNascFunc,
            JFormattedTextField txtCPFFunc, JFormattedTextField txtRGFunc, JFormattedTextField txtOEFunc, JFormattedTextField txtTelFunc,
            JFormattedTextField txtCelFunc, JFormattedTextField txtEmailFunc, JComboBox cboEmpresa, JFormattedTextField txtFuncao,
            JButton btnAlterar, JButton btnSalvar) throws SQLException {

     
        txtCodFunc.setEnabled(false);
        txtNomeFunc.setEnabled(true);
        txtDataNascFunc.setEnabled(true);
        txtCPFFunc.setEnabled(true);
        txtRGFunc.setEnabled(true);
        txtOEFunc.setEnabled(true);
        txtTelFunc.setEnabled(true);
        txtCelFunc.setEnabled(true);
        txtEmailFunc.setEnabled(true);

        cboEmpresa.setEnabled(true);

        txtFuncao.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);

    }

    public void HabilitaPesquisar(JFormattedTextField txtCodFunc, JFormattedTextField txtNomeFunc, JFormattedTextField txtDataNascFunc,
            JFormattedTextField txtCPFFunc, JFormattedTextField txtRGFunc, JFormattedTextField txtOEFunc, JFormattedTextField txtTelFunc,
            JFormattedTextField txtCelFunc, JFormattedTextField txtEmailFunc, JComboBox cboEmpresa, JFormattedTextField txtFuncao,
            JButton btnAlterar, JButton btnSalvar) throws SQLException {

        LimparFunc(txtCodFunc, txtNomeFunc, txtDataNascFunc, txtCPFFunc, txtRGFunc, txtOEFunc, txtTelFunc,
                txtCelFunc, txtEmailFunc, cboEmpresa, txtFuncao);

        txtCodFunc.setEnabled(true);
        txtNomeFunc.setEnabled(false);
        txtDataNascFunc.setEnabled(false);
        txtCPFFunc.setEnabled(false);
        txtRGFunc.setEnabled(false);
        txtOEFunc.setEnabled(false);
        txtTelFunc.setEnabled(false);
        txtCelFunc.setEnabled(false);
        txtEmailFunc.setEnabled(false);

        cboEmpresa.setEnabled(false);

        txtFuncao.setEnabled(false);

        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(false);

    }

    public int CodEmpresa(JComboBox cboEmpresa) {
        String sEmpresa;
        int iCodEmpr, end;

        //Jogo a empresa selecionada no combo na variável sEmpresa
        sEmpresa = (String) cboEmpresa.getSelectedItem();

        //Pego o index do primeira ocorrência de um "-"
        end = sEmpresa.indexOf(" ");

        //Se não encontrou o "-"...
        if (end == -1) {
            //... É porque só tem o número da empresa
            //Então jogo o número na variável iCodEmpr
            iCodEmpr = Integer.parseInt(sEmpresa);
            return iCodEmpr;
        } else {
            //Senão uso o END para saber aonde está o número da empresa e jogo na variável iCodEmpr
            System.out.println(sEmpresa.substring(0, end));
            iCodEmpr = Integer.parseInt(sEmpresa.substring(0, end));
            return iCodEmpr;
        }
    }
}
