package cadastros;

import camolacenter.Main;
import conexao.clsFunctions;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmLogin.java
 *
 * Created on 09/05/2011, 21:16:31
 */
/**
 *
 * @author AndreSAG
 */

public class frmLogin extends javax.swing.JFrame {

    /** Creates new form frmLogin */
    public frmLogin() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrar1 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bem Vindo ao CamolaCenter");
        setName("frmLogin"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar1.setFont(new java.awt.Font("Arial", 0, 11));
        btnEntrar1.setText("Entrar");
        btnEntrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrar1MouseClicked(evt);
            }
        });
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 129, -1, -1));

        btnSair.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 129, 63, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 65, -1, -1));
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 31, 150, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel1.setText("Usuário");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 34, -1, -1));

        txtSenha.setText("jPasswordField1");
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 64, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, 243, 112));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean bOk = false;
    public boolean bSair = false;


    private void btnEntrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar1MouseClicked
        // TODO add your handling code here:

        Main Global = new Main();

        try{
            clsFunctions functions = new clsFunctions();
            ResultSet rst;


            rst = functions.BuscaUsuario(txtLogin.getText(), txtSenha.getText());

            if (rst != null) {
                Global.sUsuario = rst.getString("LOGIN");
                Global.sTpAcesso = rst.getString("TIPO_USUARIO");
                bOk = true;
                
            }
            else{
                bOk = false;
                JOptionPane.showMessageDialog(this,
                    "Não foi possível entrar no sistema.\nNome/Senha incorretos.\n", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        catch(Exception ex){

        }

    }//GEN-LAST:event_btnEntrar1MouseClicked

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar1ActionPerformed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        // TODO add your handling code here:
        bOk = false;
        bSair = true;
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtSenha.setText(null);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
