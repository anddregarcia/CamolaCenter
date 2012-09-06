/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmCadFuncionario.java
 *
 * Created on 09/04/2011, 14:57:20
 */
package cadastros;

import conexao.clsFunctions;
import ferramentas.clsFerramentaFuncionario;
import ferramentas.clsValidacao;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AndreSAG
 */
public class frmCadFuncionario extends javax.swing.JFrame {

    /** Creates new form frmCadFuncionario */
    public frmCadFuncionario() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFuncao = new javax.swing.JFormattedTextField();
        cboEmpresa = new javax.swing.JComboBox();
        lblObriatorio4 = new javax.swing.JLabel();
        lblObriatorio6 = new javax.swing.JLabel();
        txtCodFunc = new javax.swing.JFormattedTextField();
        txtDataNascFunc = new javax.swing.JFormattedTextField();
        txtCPFFunc = new javax.swing.JFormattedTextField();
        txtRGFunc = new javax.swing.JFormattedTextField();
        txtOEFunc = new javax.swing.JFormattedTextField();
        txtTelFunc = new javax.swing.JFormattedTextField();
        txtCelFunc = new javax.swing.JFormattedTextField();
        txtNomeFunc = new javax.swing.JFormattedTextField();
        txtEmailFunc = new javax.swing.JFormattedTextField();
        lblObriatorio = new javax.swing.JLabel();
        lblObriatorio1 = new javax.swing.JLabel();
        lblObriatorio2 = new javax.swing.JLabel();
        lblObriatorio3 = new javax.swing.JLabel();
        lblObriatorio5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel1.setText("RG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 127, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel2.setText("Data Nasc.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 96, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel4.setText("Nome");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 65, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel5.setText("E-mail");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 189, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel7.setText("CPF");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 127, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel8.setText("Código");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 34, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel10.setText("Celular");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 158, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel11.setText("Telefone");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 158, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel3.setText("Código");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 37, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Função");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 68, -1, -1));

        txtFuncao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFuncaoKeyTyped(evt);
            }
        });
        jPanel2.add(txtFuncao, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 66, 297, -1));

        cboEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cboEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 31, 297, -1));

        lblObriatorio4.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblObriatorio4.setForeground(new java.awt.Color(255, 0, 0));
        lblObriatorio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObriatorio4.setText("*");
        lblObriatorio4.setToolTipText("Campo Obrigatório!");
        jPanel2.add(lblObriatorio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 10, 20));

        lblObriatorio6.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblObriatorio6.setForeground(new java.awt.Color(255, 0, 0));
        lblObriatorio6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObriatorio6.setText("*");
        lblObriatorio6.setToolTipText("Campo Obrigatório!");
        jPanel2.add(lblObriatorio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 28, 10, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 217, 370, 110));

        txtCodFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtCodFunc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodFunc.setEnabled(false);
        txtCodFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodFuncKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodFuncKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 31, 45, -1));

        txtDataNascFunc.setFormatterFactory(clsValidacao.setFormatoData());
        txtDataNascFunc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataNascFuncFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataNascFuncFocusLost(evt);
            }
        });
        txtDataNascFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDataNascFuncKeyTyped(evt);
            }
        });
        jPanel1.add(txtDataNascFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 93, 73, -1));

        txtCPFFunc.setFormatterFactory(clsValidacao.setFormatoCPF());
        jPanel1.add(txtCPFFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 124, 93, -1));

        txtRGFunc.setFormatterFactory(clsValidacao.setFormatoRG());
        jPanel1.add(txtRGFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 124, 86, -1));

        txtOEFunc.setFormatterFactory(clsValidacao.setFormatoOE());
        jPanel1.add(txtOEFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 124, 30, -1));

        try {
            txtTelFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTelFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 155, 107, -1));

        try {
            txtCelFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCelFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 155, 106, -1));

        txtNomeFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeFuncKeyTyped(evt);
            }
        });
        jPanel1.add(txtNomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 62, 290, -1));
        jPanel1.add(txtEmailFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 186, 290, -1));

        lblObriatorio.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblObriatorio.setForeground(new java.awt.Color(0, 0, 255));
        lblObriatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObriatorio.setText("*");
        lblObriatorio.setToolTipText("Necessário digitar o CPF ou o RG");
        jPanel1.add(lblObriatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 120, 10, 20));

        lblObriatorio1.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblObriatorio1.setForeground(new java.awt.Color(255, 0, 0));
        lblObriatorio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObriatorio1.setText("*");
        lblObriatorio1.setToolTipText("Campo Obrigatório!");
        jPanel1.add(lblObriatorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 150, 10, 20));

        lblObriatorio2.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblObriatorio2.setForeground(new java.awt.Color(255, 0, 0));
        lblObriatorio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObriatorio2.setText("*");
        lblObriatorio2.setToolTipText("Campo Obrigatório!");
        jPanel1.add(lblObriatorio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 57, 10, 20));

        lblObriatorio3.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblObriatorio3.setForeground(new java.awt.Color(0, 0, 255));
        lblObriatorio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObriatorio3.setText("*");
        lblObriatorio3.setToolTipText("Necessário digitar o CPF ou o RG!");
        jPanel1.add(lblObriatorio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 10, 20));

        lblObriatorio5.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblObriatorio5.setForeground(new java.awt.Color(255, 0, 0));
        lblObriatorio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObriatorio5.setText("*");
        lblObriatorio5.setToolTipText("Campo Obrigatório!");
        jPanel1.add(lblObriatorio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 10, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 11, 400, 340));

        tblFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
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
        tblFuncionario.setName("tblFuncionario"); // NOI18N
        tblFuncionario.setUpdateSelectionOnSort(false);
        jScrollPane2.setViewportView(tblFuncionario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 358, 400, 180));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_novo.png"))); // NOI18N
        btnNovo.setToolTipText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, 10, 527));

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
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 508, 30, 30));

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_alterar.png"))); // NOI18N
        btnAlterar.setToolTipText("Novo");
        btnAlterar.setEnabled(false);
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 30, 30));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico_pesquisar.png"))); // NOI18N
        btnPesquisar.setToolTipText("Novo");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 30, 30));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-495)/2, (screenSize.height-587)/2, 495, 587);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        // TODO add your handling code here:

        try {
            clsFerramentaFuncionario fFunc = new clsFerramentaFuncionario();
            fFunc.HabilitaNovo(txtCodFunc, txtNomeFunc, txtDataNascFunc, txtCPFFunc, txtRGFunc, txtOEFunc,
                    txtTelFunc, txtCelFunc, txtEmailFunc, cboEmpresa, txtFuncao, btnAlterar, btnSalvar);

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this,
                    err.getMessage(), "Atenção!", JOptionPane.ERROR_MESSAGE);
        }

}//GEN-LAST:event_btnNovoMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked

        // TODO add your handling code here:

        //recebo o ano atual
        String sAno = new SimpleDateFormat("yyyy").format(new Date()).toString();
        //divido o ano em 4 partes
        String sAno1 = sAno.substring(0, 1);
        int iAno1 = Integer.parseInt(sAno1);
        String sAno2 = sAno.substring(1, 2);
        int iAno2 = Integer.parseInt(sAno2);
        String sAno3 = sAno.substring(2, 3);
        int iAno3 = Integer.parseInt(sAno3);
        String sAno4 = sAno.substring(3, 4);
        int iAno4 = Integer.parseInt(sAno4);

        if (txtNomeFunc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Preencha o Campo nome!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        } /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////VALIDACAO DE DATAS A PARTIR DE 1920 ATÉ A DATA ATUAL.... VERIFICA OS MESES...E ANOS BISSEXTOS
        ///// CREDITOS OSTI.... 
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (!(txtDataNascFunc.getText().matches(""
                + "(" //INICIO
                + "("//VALIDACAO COM ANO
                + "("//VALIDACAO DIA E MES
                + "(((0[0-9])|(1[0-9])|(2[0-8]))\\/(0[0-9]|1[0-2]))"//QUALQUER DATA COM DIA 28
                + "|((29|30)\\/(0[1|3|4|5|6|7|8|9]|1[0|1|2]))" //QUALQUER MES ACEITA DIA 29/30 EXCETO FEVEREIRO
                + "|(31\\/(0([1]|[3]|[5]|[7]|[8])|1([0]|[2])))"//SOMENTE JAN,MAR,MAIO,JUL,AGO,OUT,DEZ ACEITA 31 DIAS          
                + ")"//FIM VALIDACA DIA E MES
                + "\\/((19[2-9][0-9])|(2[0-" + iAno2 + "][0-" + iAno3 + "][0-" + iAno4 + "]))"
                + ")"//FIM VALIDACAO ANO
                + "|("//INICIO VALIDACAO ANOS BISSEXTOS
                + "29\\/02\\/(((19|20)[0|2|4|6|8][0|4|8])|((19|20)[1|3|5|7|9][2|6]))"
                + ")"//FIM VALIDACAO ANOS BISSEXTOS
                + ")"))) {

            JOptionPane.showMessageDialog(this,
                    "Digite uma data válida!!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);

        } else if ((txtCPFFunc.getText().equals("___.___.___-__")) && (txtRGFunc.getText().equals("__.___.___-_"))) {
            JOptionPane.showMessageDialog(this,
                    "Preencha o Campo CPF ou o Campo RG!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtTelFunc.getText().equals("(__)________")) {
            JOptionPane.showMessageDialog(this,
                    "Preencha o Campo Telefone!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);

        } else if (cboEmpresa.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Escolha uma Empresa Válida!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);

        } else if (txtFuncao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Preencha o campo Função!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);

        }


        clsFerramentaFuncionario fFunc = new clsFerramentaFuncionario();
        int iCodEmpr = fFunc.CodEmpresa(cboEmpresa);

        try {
            clsFunctions function = new clsFunctions();


            clsCadFuncionario CadFunc = new clsCadFuncionario(txtNomeFunc.getText(), txtDataNascFunc.getText(),
                    txtCPFFunc.getText(), txtRGFunc.getText(), txtOEFunc.getText(),
                    txtTelFunc.getText(), txtCelFunc.getText(), txtEmailFunc.getText(),
                    txtFuncao.getText(), Integer.parseInt(txtCodFunc.getText()), iCodEmpr);

            clsCadFuncionarioDAO CadFuncDAO = new clsCadFuncionarioDAO();
            CadFuncDAO.InserirFuncionario(CadFunc);

            fFunc.HabilitaNovo(txtCodFunc, txtNomeFunc, txtDataNascFunc, txtCPFFunc, txtRGFunc,
                    txtOEFunc, txtTelFunc, txtCelFunc, txtEmailFunc, cboEmpresa, txtFuncao,btnAlterar, btnSalvar);

            function.carregaTabela(CadFuncDAO.ListaFunc(), tblFuncionario); //atualiza a tabela de empresa ao salvar registro

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possível salvar/alterar este registro.\n", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }


}//GEN-LAST:event_btnSalvarMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        // TODO add your handling code here:

        try {

            clsFunctions function = new clsFunctions();
            int iCodigo = function.getRowTable(tblFuncionario);

            clsCadFuncionarioDAO CadFuncDAO = new clsCadFuncionarioDAO();
            CadFuncDAO.ExcluirFuncionario(iCodigo);

            clsFerramentaFuncionario fFunc = new clsFerramentaFuncionario();
            fFunc.HabilitaNovo(txtCodFunc, txtNomeFunc, txtDataNascFunc, txtCPFFunc, txtRGFunc, txtOEFunc, txtTelFunc,
                    txtCelFunc, txtEmailFunc, cboEmpresa, txtFuncao,btnAlterar, btnSalvar);

            function.carregaTabela(CadFuncDAO.ListaFunc(), tblFuncionario); //atualiza a tabela de empresa ao excluir registro

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possível realizar Exclusão.\n", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
}//GEN-LAST:event_btnExcluirMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
}//GEN-LAST:event_btnSairMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:


        try {

            clsFerramentaFuncionario fFuncionario = new clsFerramentaFuncionario();


            clsFunctions function = new clsFunctions();
            clsCadFuncionarioDAO CadFuncionarioDao = new clsCadFuncionarioDAO();

            cboEmpresa.removeAllItems(); //remove os itens que estão no combo

            function.carregaCombo(CadFuncionarioDao.ListaComboEmpresa(), cboEmpresa, "EMPRESA");

            function.carregaTabela(CadFuncionarioDao.ListaFunc(), tblFuncionario); //atualiza a tabela de empresa ao salvar registro
            txtCodFunc.setText(Integer.toString(function.ProxRegistro("CC_CAD_FUNCIONARIO", "ID_FUNC")));


        } catch (Exception err) {
            JOptionPane.showMessageDialog(this,
                    "Ocorreram problemas ao abrir tela.\n", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_formWindowOpened

    private void txtCodFuncKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodFuncKeyPressed
        // TODO add your handling code here:

        try {

            int begin;
            int end;
            String sRG, sOE;

            clsCadFuncionarioDAO CadFuncDAO = new clsCadFuncionarioDAO();
            clsFunctions function = new clsFunctions();

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                ResultSet rst = CadFuncDAO.ConsultarFunc(Integer.parseInt(txtCodFunc.getText()));

                rst.next(); // nao entedi pq tem ki fazer isso nesse form
                

                txtNomeFunc.setText(rst.getString("NOME_FUNC"));
                txtDataNascFunc.setText(rst.getString("DATA_NASC"));
                txtCPFFunc.setText(rst.getString("CPF"));

                sRG = rst.getString("CIRG");

                end = sRG.lastIndexOf(" ");
                txtRGFunc.setText(sRG.substring(0, end));

                System.out.println(end);
                System.out.println(sRG.substring(0, end));

                begin = sRG.indexOf(" ");
                txtOEFunc.setText(sRG.substring(begin + 1));

                cboEmpresa.setSelectedItem(rst.getString("ID_EMPRESA") + " - " + rst.getString("EMPRESA"));

                txtTelFunc.setText(rst.getString("TEL_FUNC"));
                txtCelFunc.setText(rst.getString("CEL_FUNC"));
                txtEmailFunc.setText(rst.getString("EMAIL_FUNC"));
                txtFuncao.setText(rst.getString("FUNCAO_FUNC"));

                btnAlterar.setEnabled(true);

            } else {
                clsFerramentaFuncionario fFunc = new clsFerramentaFuncionario();
                fFunc.LimparFunc(txtCodFunc, txtNomeFunc, txtDataNascFunc, txtCPFFunc, txtRGFunc, txtOEFunc,
                        txtTelFunc, txtCelFunc, txtEmailFunc, cboEmpresa, txtFuncao);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Funcionario não cadastrado.\n", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_txtCodFuncKeyPressed

    private void txtDataNascFuncFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascFuncFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascFuncFocusLost

    private void txtDataNascFuncFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascFuncFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascFuncFocusGained

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        // TODO add your handling code here:

        try {
            clsFerramentaFuncionario fFunc = new clsFerramentaFuncionario();
            fFunc.HabilitaAlterar(txtCodFunc, txtNomeFunc, txtDataNascFunc, txtCPFFunc, txtRGFunc,
                    txtOEFunc, txtTelFunc, txtCelFunc, txtEmailFunc, cboEmpresa, txtFuncao, btnAlterar, btnSalvar);
        } catch (SQLException ex) {
            Logger.getLogger(frmCadFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        // TODO add your handling code here:

        try {
            clsFerramentaFuncionario fFunc = new clsFerramentaFuncionario();
            fFunc.HabilitaPesquisar(txtCodFunc, txtNomeFunc, txtDataNascFunc, txtCPFFunc, txtRGFunc,
                    txtOEFunc, txtTelFunc, txtCelFunc, txtEmailFunc, cboEmpresa, txtFuncao, btnAlterar, btnSalvar);
        } catch (SQLException ex) {
            Logger.getLogger(frmCadFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void txtCodFuncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodFuncKeyTyped
        // TODO add your handling code here:
        clsValidacao Valida = new clsValidacao();
        int TamCampo = 4;
        Valida.TamanhoMax(txtCodFunc, evt, TamCampo);
        Valida.SomenteNumeros(txtCodFunc, evt);
    }//GEN-LAST:event_txtCodFuncKeyTyped

    private void txtNomeFuncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeFuncKeyTyped
        // TODO add your handling code here:
        clsValidacao Valida = new clsValidacao();
        int TamCampo = 30;
        Valida.TamanhoMax(txtNomeFunc, evt, TamCampo);
        Valida.SomenteLetras(txtNomeFunc, evt);
    }//GEN-LAST:event_txtNomeFuncKeyTyped

    private void txtDataNascFuncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataNascFuncKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascFuncKeyTyped

    private void txtFuncaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuncaoKeyTyped
        // TODO add your handling code here:
        clsValidacao Valida = new clsValidacao();
        int TamCampo = 30;
        Valida.TamanhoMax(txtFuncao, evt, TamCampo);
        Valida.SomenteLetras(txtFuncao, evt);
    }//GEN-LAST:event_txtFuncaoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmCadFuncionario().setVisible(true);
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
    private javax.swing.JComboBox cboEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblObriatorio;
    private javax.swing.JLabel lblObriatorio1;
    private javax.swing.JLabel lblObriatorio2;
    private javax.swing.JLabel lblObriatorio3;
    private javax.swing.JLabel lblObriatorio4;
    private javax.swing.JLabel lblObriatorio5;
    private javax.swing.JLabel lblObriatorio6;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JFormattedTextField txtCPFFunc;
    private javax.swing.JFormattedTextField txtCelFunc;
    private javax.swing.JFormattedTextField txtCodFunc;
    private javax.swing.JFormattedTextField txtDataNascFunc;
    private javax.swing.JFormattedTextField txtEmailFunc;
    private javax.swing.JFormattedTextField txtFuncao;
    private javax.swing.JFormattedTextField txtNomeFunc;
    private javax.swing.JFormattedTextField txtOEFunc;
    private javax.swing.JFormattedTextField txtRGFunc;
    private javax.swing.JFormattedTextField txtTelFunc;
    // End of variables declaration//GEN-END:variables
}