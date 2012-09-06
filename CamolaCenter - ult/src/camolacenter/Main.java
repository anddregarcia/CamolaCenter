/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camolacenter;

import conexao.clsFunctions;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //  clsJdbcDAO conn = new clsJdbcDAO();
    public String sUsuario;
    public String sTpAcesso;

    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        
        

        frmLogin Login = new frmLogin();
        clsFunctions functions = new clsFunctions();

        Login.bOk = true;
        Login.bSair = false;

        while (Login.bOk == false) {
            functions.centerWindow(Login);
            Login.setVisible(true);
            if (Login.bSair) {
                System.exit(0);
            }
        }

        if (Login.bOk) {
            Login.dispose();
            frmPrincipal prim = new frmPrincipal();
            prim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            prim.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
            prim.setVisible(true);
        }
    }
}
