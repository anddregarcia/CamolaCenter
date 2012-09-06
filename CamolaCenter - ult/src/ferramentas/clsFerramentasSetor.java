/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ferramentas;

import conexao.clsFunctions;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author Osti
 */
public class clsFerramentasSetor {
    
    public clsFerramentasSetor() throws SQLException{
    
    }

    public void LimparSetor(JFormattedTextField txtCodSetor, JEditorPane txtDesc, JTextField txtValor,
                                JTextField txtMedida, ButtonGroup optStatus) throws SQLException{

        clsFunctions function = new clsFunctions();

            txtCodSetor.setText(Integer.toString(function.ProxRegistro("CC_CAD_SETOR", "ID_SETOR")));
            txtDesc.setText("");
            txtValor.setText("");
            txtMedida.setText("");
            optStatus.clearSelection();
            
    }

}
