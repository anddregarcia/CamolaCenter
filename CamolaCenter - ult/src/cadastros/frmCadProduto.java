package cadastros;

import conexao.clsFunctions;
import ferramentas.clsFerramentaProduto;
import ferramentas.clsValidacao;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmCadProduto.java
 *
 * Created on 05/03/2011, 01:12:33
 */
/**
 *
 * @author Andre Garcia
 */
public class frmCadProduto extends javax.swing.JFrame {

    /** Creates new form frmCadProduto */
    public frmCadProduto() {
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

        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JFormattedTextField();
        txtDescProd = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUnidade = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQtdTotal = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEstoqueMin = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSair = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("*");
        jLabel8.setToolTipText("Campo Obrigatório");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("frmCadProduto"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.setName("tblProduto"); // NOI18N
        tblProduto.setUpdateSelectionOnSort(false);
        tblProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblProdutoFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 357, 142));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 359, -1, 10));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel4.setText("Descrição");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 65, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel1.setText("Código");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 34, -1, -1));

        txtCodProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodProduto.setEnabled(false);
        txtCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdutoActionPerformed(evt);
            }
        });
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 31, 45, -1));

        txtDescProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescProdKeyTyped(evt);
            }
        });
        jPanel1.add(txtDescProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 62, 254, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel5.setText("Unidade");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 96, -1, -1));

        txtUnidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadeKeyTyped(evt);
            }
        });
        jPanel1.add(txtUnidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 93, 31, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel6.setText("Qtd. Total");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 127, -1, -1));

        txtQtdTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdTotalFocusLost(evt);
            }
        });
        txtQtdTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtdTotalKeyTyped(evt);
            }
        });
        jPanel1.add(txtQtdTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 124, 77, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel7.setText("Estoque Min.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 158, -1, -1));

        txtEstoqueMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstoqueMinKeyTyped(evt);
            }
        });
        jPanel1.add(txtEstoqueMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 155, 77, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*");
        jLabel2.setToolTipText("Campo Obrigatório");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 156, 10, 15));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("*");
        jLabel3.setToolTipText("Campo Obrigatório");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 10, 15));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("*");
        jLabel9.setToolTipText("Campo Obrigatório");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 93, 10, 15));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("*");
        jLabel10.setToolTipText("Campo Obrigatório");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 124, 10, 15));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 357, 200));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 10, 350));

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
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 30, 30));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_novo.png"))); // NOI18N
        btnNovo.setToolTipText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_salvar.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 30, 30));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_excluir.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 30, 30));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_pesquisar.png"))); // NOI18N
        btnPesquisar.setToolTipText("Pesquisar");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 30, 30));

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_alterar.png"))); // NOI18N
        btnAlterar.setToolTipText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 30, 30));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-444)/2, (screenSize.height-412)/2, 444, 412);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*Para usar a classe de funções é necessário adicionar uma Exceção, para que se der alguma erro
         * o mesmo possa ser tratado.
         * Como não é possível alterar a linha que declara este método foi necessário inserir o função Try Catch
         */

        try {
            clsFunctions function = new clsFunctions();
            clsCadProdutoDAO CadProdutoDao = new clsCadProdutoDAO();

            txtCodProduto.setText(Integer.toString(function.ProxRegistro("CC_CAD_PRODUTO", "ID_PROD")));

            function.carregaTabela(CadProdutoDao.ListaProduto(), tblProduto); //carrega a tabela de Produto ao abrir tela

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this,
                    "Ocorreram problemas ao abrir tela.\n(" + err.getMessage() + ")", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_formWindowOpened

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked

        // TODO add your handling code here:
        if (btnSalvar.isEnabled() == true) {

            if (txtDescProd.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Preencha o campo Descrição!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                txtDescProd.grabFocus();
            } else if (txtUnidade.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Preencha o campo Unidade!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                txtUnidade.grabFocus();
            } else if (txtQtdTotal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Preencha o campo Quantidade Total!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                txtQtdTotal.grabFocus();
            } else if (txtEstoqueMin.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Preencha o campo Estoque mínimo!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                txtEstoqueMin.grabFocus();
            } else {
                try {
                    clsFunctions function = new clsFunctions();

                    clsCadProduto CadProduto = new clsCadProduto(Integer.parseInt(txtCodProduto.getText()),
                            txtDescProd.getText(),
                            txtUnidade.getText(),
                            Float.parseFloat(txtQtdTotal.getText()),
                            Float.parseFloat(txtEstoqueMin.getText()));

                    clsCadProdutoDAO CadProdutoDao = new clsCadProdutoDAO();

                    CadProdutoDao.InserirProduto(CadProduto);

                    clsFerramentaProduto fProduto = new clsFerramentaProduto();
                    fProduto.HabilitaNovo(txtCodProduto, txtDescProd, txtUnidade, txtQtdTotal, txtEstoqueMin, btnAlterar, btnSalvar);

                    function.carregaTabela(CadProdutoDao.ListaProduto(), tblProduto); //atualiza a tabela de Produto ao salvar registro


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

            int iCodigo = function.getRowTable(tblProduto);

            clsCadProdutoDAO CadProdutoDao = new clsCadProdutoDAO();

            CadProdutoDao.ExcluiProduto(iCodigo);

            clsFerramentaProduto fProduto = new clsFerramentaProduto();
            fProduto.HabilitaNovo(txtCodProduto, txtDescProd, txtUnidade, txtQtdTotal, txtEstoqueMin, btnAlterar, btnSalvar);

            function.carregaTabela(CadProdutoDao.ListaProduto(), tblProduto); //atualiza a tabela de Produto ao excluir registro

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possível realizar Exclusão.\n(" + err.getMessage() + ")", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        // TODO add your handling code here:
        try {
            clsFerramentaProduto fProduto = new clsFerramentaProduto();
            fProduto.HabilitaNovo(txtCodProduto, txtDescProd, txtUnidade, txtQtdTotal, txtEstoqueMin, btnAlterar, btnSalvar);

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this,
                    err.getMessage(), "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCodProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyPressed
        // TODO add your handling code here:
        try {
            clsCadProdutoDAO CadProdutoDao = new clsCadProdutoDAO();
            clsFunctions function = new clsFunctions();

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                ResultSet rst = CadProdutoDao.ConsultarProduto(Integer.parseInt(txtCodProduto.getText()));

                rst.next();

                    txtDescProd.setText(rst.getString("DESC_PROD"));
                    txtUnidade.setText(rst.getString("UNIDADE_PROD"));
                    txtQtdTotal.setText(rst.getString("QTD_TOTAL"));
                    txtEstoqueMin.setText(rst.getString("ESTOQUE_MIN"));

                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Produto com o código: "+ txtCodProduto.getText()+ " ,não cadastrado!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            txtCodProduto.setText(null);
        }
    }//GEN-LAST:event_txtCodProdutoKeyPressed

    private void txtCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdutoActionPerformed

    private void txtQtdTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdTotalFocusLost
        // TODO add your handling code here:
//        clsDecimalFormat DecFormat = new clsDecimalFormat();
//
//        txtQtdTotal.setText(DecFormat.DecimalConvert(txtQtdTotal.getText()));
    }//GEN-LAST:event_txtQtdTotalFocusLost

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        // TODO add your handling code here:
        
        clsFerramentaProduto fProduto = new clsFerramentaProduto();
        fProduto.HabilitaPesquisa(txtCodProduto, txtDescProd, txtUnidade, txtQtdTotal, txtEstoqueMin, btnAlterar, btnSalvar);
        txtCodProduto.setText(null);
    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        // TODO add your handling code here:
        
        if (btnAlterar.isEnabled() == true) {
            if (!(txtCodProduto.getText().isEmpty())) {
                clsFerramentaProduto fProduto = new clsFerramentaProduto();
                fProduto.HabilitaAlterar(txtCodProduto, txtDescProd, txtUnidade, txtQtdTotal, txtEstoqueMin, btnAlterar, btnSalvar);
            }
        }
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void txtCodProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyTyped
        // TODO add your handling code here:
        clsValidacao Valida = new clsValidacao();
        int TamCampo = 5;
        Valida.TamanhoMax(txtCodProduto, evt, TamCampo);
        Valida.SomenteNumeros(txtCodProduto, evt);
    }//GEN-LAST:event_txtCodProdutoKeyTyped

    private void txtDescProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescProdKeyTyped
        // TODO add your handling code here:
        clsValidacao Valida = new clsValidacao();
        int TamCampo = 50;
        Valida.TamanhoMax(txtDescProd, evt, TamCampo);
        Valida.SomenteNumeroLetras(txtDescProd, evt);
    }//GEN-LAST:event_txtDescProdKeyTyped

    private void txtUnidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadeKeyTyped
        // TODO add your handling code here:
        clsValidacao Valida = new clsValidacao();
        int TamCampo = 2;
        Valida.TamanhoMax(txtUnidade, evt, TamCampo);
        Valida.SomenteLetras(txtUnidade, evt);

    }//GEN-LAST:event_txtUnidadeKeyTyped

    private void txtQtdTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdTotalKeyTyped
        // TODO add your handling code here:
        clsValidacao Valida = new clsValidacao();
        int TamCampo = 3;
        Valida.TamanhoMax(txtQtdTotal, evt, TamCampo);
        Valida.SomenteNumeros(txtQtdTotal, evt);

    }//GEN-LAST:event_txtQtdTotalKeyTyped

    private void txtEstoqueMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstoqueMinKeyTyped
        // TODO add your handling code here:
        clsValidacao Valida = new clsValidacao();
        int TamCampo = 3;
        Valida.TamanhoMax(txtEstoqueMin, evt, TamCampo);
        Valida.SomenteNumeros(txtEstoqueMin, evt);
    }//GEN-LAST:event_txtEstoqueMinKeyTyped

    private void tblProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblProdutoFocusGained
        // TODO add your handling code here:
        btnAlterar.setEnabled(true);
    }//GEN-LAST:event_tblProdutoFocusGained

    private void tblProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblProdutoFocusLost
        // TODO add your handling code here:
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_tblProdutoFocusLost
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmCadProduto().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblProduto;
    private javax.swing.JFormattedTextField txtCodProduto;
    private javax.swing.JFormattedTextField txtDescProd;
    private javax.swing.JFormattedTextField txtEstoqueMin;
    private javax.swing.JFormattedTextField txtQtdTotal;
    private javax.swing.JFormattedTextField txtUnidade;
    // End of variables declaration//GEN-END:variables
}
