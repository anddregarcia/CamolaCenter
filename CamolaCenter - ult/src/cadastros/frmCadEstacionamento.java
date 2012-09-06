package cadastros;

import conexao.clsFunctions;
import ferramentas.clsFerramentaEstacionamento;
import ferramentas.clsValidacao;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmCadTurno.java
 *
 * Created on 05/03/2011, 01:12:33
 */
/**
 *
 * @author Andre Garcia
 */
public class frmCadEstacionamento extends javax.swing.JFrame {

    /** Creates new form frmCadTurno */
    public frmCadEstacionamento() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstac = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodEstac = new javax.swing.JFormattedTextField();
        txtData = new com.toedter.calendar.JDateChooser();
        txtQuantidade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSair = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Carros/Estacionamento");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("frmCadTurno"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        tblEstac.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblEstac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstac.setName("tblEstac"); // NOI18N
        tblEstac.setUpdateSelectionOnSort(false);
        jScrollPane2.setViewportView(tblEstac);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 120, 357, 170);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 359, 0, 10);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estacionamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel4.setText("Quantidade");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 65, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel1.setText("Código");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 34, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel2.setText("Data");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 34, -1, -1));

        txtCodEstac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodEstac.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodEstac.setEnabled(false);
        txtCodEstac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodEstacActionPerformed(evt);
            }
        });
        txtCodEstac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodEstacKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodEstacKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodEstac, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 31, 45, -1));

        txtData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDataKeyTyped(evt);
            }
        });
        jPanel1.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 31, 112, -1));

        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });
        jPanel1.add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 64, 90, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 10, 357, 100);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 10, 2, 280);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_sair.png"))); // NOI18N
        btnSair.setToolTipText("Sair");
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
        getContentPane().add(btnSair);
        btnSair.setBounds(10, 260, 30, 30);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_pesquisar.png"))); // NOI18N
        btnPesquisar.setToolTipText("Pesquisa");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(10, 150, 30, 30);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_salvar.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(10, 80, 30, 30);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_excluir.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(10, 115, 30, 30);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_alterar.png"))); // NOI18N
        btnAlterar.setToolTipText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(10, 45, 30, 30);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_novo.png"))); // NOI18N
        btnNovo.setToolTipText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(10, 10, 30, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-444)/2, (screenSize.height-346)/2, 444, 346);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*Para usar a classe de funções é necessário adicionar uma Exceção, para que se der alguma erro
         * o mesmo possa ser tratado.
         * Como não é possível alterar a linha que declara este método foi necessário inserir o função Try Catch
         */
        try {
            clsFunctions function = new clsFunctions();
            clsCadEstacionamentoDAO CadEstacDAO = new clsCadEstacionamentoDAO();
            clsFerramentaEstacionamento fEstac = new clsFerramentaEstacionamento();

            fEstac.HabilitaNovo(txtCodEstac, txtData, txtQuantidade, btnAlterar, btnSalvar);
            function.carregaTabela(CadEstacDAO.ListaEstac(), tblEstac); //carrega a tabela de turno ao abrir tela


        } catch (Exception err) {
            JOptionPane.showMessageDialog(this,
                    "Ocorreram problemas ao abrir tela.\n(" + err.getMessage() + ")", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_formWindowOpened

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked

        // TODO add your handling code here:

        if(btnSalvar.isEnabled()!=false){
        if (txtData.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Escolha uma data!!",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtQuantidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o Campo Quantidade!",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } else {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sData = sdf.format(txtData.getDate()); // pego e transformo a data no padrão acima


            try {


                clsCadEstacionamento CadEstac = new clsCadEstacionamento(Integer.parseInt(txtCodEstac.getText()),
                        sData, Integer.parseInt(txtQuantidade.getText()));

                clsCadEstacionamentoDAO CadEstacDAO = new clsCadEstacionamentoDAO();

                CadEstacDAO.InserirEstac(CadEstac);

                clsFerramentaEstacionamento fEstac = new clsFerramentaEstacionamento();
                fEstac.HabilitaNovo(txtCodEstac, txtData, txtQuantidade, btnAlterar, btnSalvar);

                clsFunctions function = new clsFunctions();
                function.carregaTabela(CadEstacDAO.ListaEstac(), tblEstac);

            } catch (Exception err) {
                JOptionPane.showMessageDialog(this,
                        "Não foi possível salvar/alterar este registro.\n(" + err.getMessage() + ")", "Atenção!", JOptionPane.ERROR_MESSAGE);
            }
        }
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        // TODO add your handling code here:
        try {
            clsFunctions function = new clsFunctions();

            int codigo = function.getRowTable(tblEstac);

            clsCadEstacionamentoDAO CadEstacDAO = new clsCadEstacionamentoDAO();

            CadEstacDAO.ExcluiEstac(codigo);

            clsFerramentaEstacionamento fEstac = new clsFerramentaEstacionamento();
            fEstac.LimparEstacionamento(txtCodEstac, txtData, txtQuantidade);

            function.carregaTabela(CadEstacDAO.ListaEstac(), tblEstac); //atualiza a tabela de turno ao excluir registro

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possível realizar Exlusão.\n(" + err.getMessage() + ")", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        // TODO add your handling code here:
        try {
            clsFerramentaEstacionamento fEstac = new clsFerramentaEstacionamento();
            fEstac.LimparEstacionamento(txtCodEstac, txtData, txtQuantidade);

            fEstac.HabilitaPesquisa(txtCodEstac, txtData, txtQuantidade, btnAlterar, btnSalvar);


        } catch (Exception err) {
            JOptionPane.showMessageDialog(this,
                    err.getMessage(), "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCodEstacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodEstacKeyPressed
        // TODO add your handling code here:
        try {

            clsCadEstacionamentoDAO CadEstacDao = new clsCadEstacionamentoDAO();
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                ResultSet rst = CadEstacDao.ConsultarEstac(Integer.parseInt(txtCodEstac.getText()));

                txtData.setDate(rst.getDate("DATA_ESTAC"));
                txtQuantidade.setText(String.valueOf(rst.getString("QTD_CARRO")));

                btnAlterar.setEnabled(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Estac não cadastrado.\n(" + ex.getMessage() + ")", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtCodEstacKeyPressed

    private void txtCodEstacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodEstacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodEstacActionPerformed

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        // TODO add your handling code here:
        if (btnAlterar.isEnabled() != false) {
            try {
                clsFerramentaEstacionamento fEstac = new clsFerramentaEstacionamento();
                fEstac.HabilitaAlterar(txtCodEstac, txtData, txtQuantidade, btnAlterar, btnSalvar);
            } catch (SQLException ex) {
                Logger.getLogger(frmCadEstacionamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        // TODO add your handling code here:

        try {
            clsFerramentaEstacionamento fEstac = new clsFerramentaEstacionamento();
            fEstac.HabilitaNovo(txtCodEstac, txtData, txtQuantidade, btnAlterar, btnSalvar);
        } catch (SQLException ex) {
            Logger.getLogger(frmCadEstacionamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoMouseClicked

    private void txtCodEstacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodEstacKeyTyped
        // TODO add your handling code here:
        clsValidacao Valida = new clsValidacao();
        Valida.SomenteNumeros(txtCodEstac, evt);
        int TamCampo = 4;
        Valida.TamanhoMax(txtCodEstac, evt, TamCampo);
    }//GEN-LAST:event_txtCodEstacKeyTyped

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataKeyTyped

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        // TODO add your handling code here:
        clsValidacao Valida = new clsValidacao();
        Valida.SomenteNumeros(txtCodEstac, evt);
        int TamCampo = 5;
        Valida.TamanhoMax(txtQuantidade, evt, TamCampo);
    }//GEN-LAST:event_txtQuantidadeKeyTyped
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmCadEstacionamento().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblEstac;
    private javax.swing.JFormattedTextField txtCodEstac;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
