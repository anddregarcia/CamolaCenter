/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import conexao.clsFunctions;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

/**
 *
 * @author Osti
 */
public class clsFerramentaProduto {

    public void HabilitaNovo(JFormattedTextField txtCodProduto, JFormattedTextField txtDescProd, JFormattedTextField txtUnidade,
            JFormattedTextField txtQtdTotal, JFormattedTextField txtEstoqueMin, JButton btnAlterar, JButton btnSalvar) throws SQLException {
        
        LimparProduto(txtCodProduto, txtDescProd, txtUnidade, txtQtdTotal, txtEstoqueMin);
        
        clsFunctions function = new clsFunctions();
        txtCodProduto.setText(Integer.toString(function.ProxRegistro("CC_CAD_PRODUTO", "ID_PROD")));
        
        txtCodProduto.setEnabled(false);
        txtDescProd.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtQtdTotal.setEnabled(true);
        txtEstoqueMin.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);

    }

    public void LimparProduto(JFormattedTextField txtCodProduto, JFormattedTextField txtDescProd, JFormattedTextField txtUnidade,
            JFormattedTextField txtQtdTotal, JFormattedTextField txtEstoqueMin) {
        
        txtCodProduto.setText("");
        txtDescProd.setText("");
        txtUnidade.setText("");
        txtQtdTotal.setText("");
        txtEstoqueMin.setText("");
        
    }
    
    public void HabilitaPesquisa(JFormattedTextField txtCodProduto, JFormattedTextField txtDescProd, JFormattedTextField txtUnidade,
            JFormattedTextField txtQtdTotal, JFormattedTextField txtEstoqueMin, JButton btnAlterar, JButton btnSalvar){
        
        LimparProduto(txtDescProd, txtDescProd, txtUnidade, txtQtdTotal, txtEstoqueMin);
        
        txtCodProduto.setEnabled(true);
        txtDescProd.setEnabled(false);
        txtUnidade.setEnabled(false);
        txtQtdTotal.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        
        btnAlterar.setEnabled(true);
        btnSalvar.setEnabled(false);
    
    }
    
    public void HabilitaAlterar(JFormattedTextField txtCodProduto, JFormattedTextField txtDescProd, JFormattedTextField txtUnidade,
            JFormattedTextField txtQtdTotal, JFormattedTextField txtEstoqueMin, JButton btnAlterar, JButton btnSalvar){
        
        txtCodProduto.setEnabled(false);
        txtDescProd.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtQtdTotal.setEnabled(true);
        txtEstoqueMin.setEnabled(true);
        
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
    }
}
