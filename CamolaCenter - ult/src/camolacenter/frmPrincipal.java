package camolacenter;

import cadastros.frmAbrirChamado;
import cadastros.frmCadConsumo;
import cadastros.frmCadContrato;
import cadastros.frmCadLoja;
import cadastros.frmCadEstacionamento;
import cadastros.frmCadEmpresa;
import cadastros.frmCadEntradaEst;
import cadastros.frmCadFuncionario;
import cadastros.frmCadMarketing;
import cadastros.frmCadSetor;
import conexao.clsFunctions;
import cadastros.frmCadTurno;
import cadastros.frmCronograma;
import cadastros.frmFinalizarChamado;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmPricipal.java
 *
 * Created on 05/03/2011, 01:48:43
 */
/**
 *
 * @author Andre
 */
public class frmPrincipal extends javax.swing.JFrame {

    /** Creates new form frmPricipal */
    public frmPrincipal() {
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

        jDialog1 = new javax.swing.JDialog();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnuCadastros = new javax.swing.JMenu();
        jMenuCadLojas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuContrato = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuCadTurno = new javax.swing.JMenuItem();
        mnuCadEmpresa = new javax.swing.JMenuItem();
        mnuCadFunc = new javax.swing.JMenuItem();
        mnuCrono = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuMarketing = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mnuEntradaEst = new javax.swing.JMenuItem();
        mnuConsumo = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuCadEstacionamento = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        mnuAbrirChamado = new javax.swing.JMenuItem();
        mnuFecharChamado = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenu();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CamolaCenter");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(1);
        setFocusCycleRoot(false);
        setName("frmPrincipal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jMenu2.setText("Ferramentas");
        jMenuBar1.add(jMenu2);

        mnuCadastros.setText("Lojas");
        mnuCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCadastrosMouseClicked(evt);
            }
        });

        jMenuCadLojas.setFont(new java.awt.Font("Arial", 0, 12));
        jMenuCadLojas.setText("Lojas");
        jMenuCadLojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadLojasActionPerformed(evt);
            }
        });
        mnuCadastros.add(jMenuCadLojas);

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 12));
        jMenuItem1.setText("Setor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuCadastros.add(jMenuItem1);

        mnuContrato.setFont(new java.awt.Font("Arial", 0, 12));
        mnuContrato.setText("Contrato");
        mnuContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuContratoActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuContrato);

        jMenuBar1.add(mnuCadastros);

        jMenu3.setText("Terceirizados");

        mnuCadTurno.setFont(new java.awt.Font("Arial", 0, 12));
        mnuCadTurno.setText("Turno");
        mnuCadTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadTurnoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCadTurno);

        mnuCadEmpresa.setFont(new java.awt.Font("Arial", 0, 12));
        mnuCadEmpresa.setText("Empresa");
        mnuCadEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadEmpresaActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCadEmpresa);

        mnuCadFunc.setFont(new java.awt.Font("Arial", 0, 12));
        mnuCadFunc.setText("Funcionário");
        mnuCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadFuncActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCadFunc);

        mnuCrono.setText("Cronograma");
        mnuCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCronoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCrono);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Eventos");
        jMenuBar1.add(jMenu4);

        mnuMarketing.setText("Marketing");
        mnuMarketing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuMarketingMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuMarketing);

        jMenu1.setText("Estoque");

        mnuEntradaEst.setText("Entrada");
        mnuEntradaEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEntradaEstActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEntradaEst);

        mnuConsumo.setText("Consumo");
        mnuConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsumoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuConsumo);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("Estacionamento");

        jMenuCadEstacionamento.setFont(new java.awt.Font("Arial", 0, 12));
        jMenuCadEstacionamento.setText("Estacionamento");
        jMenuCadEstacionamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadEstacionamentoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuCadEstacionamento);

        jMenuBar1.add(jMenu6);

        jMenu8.setText("Chamado");

        mnuAbrirChamado.setFont(new java.awt.Font("Arial", 0, 12));
        mnuAbrirChamado.setText("Abrir chamado");
        mnuAbrirChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAbrirChamadoActionPerformed(evt);
            }
        });
        jMenu8.add(mnuAbrirChamado);

        mnuFecharChamado.setFont(new java.awt.Font("Arial", 0, 12));
        mnuFecharChamado.setText("Fechar chamado");
        mnuFecharChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFecharChamadoActionPerformed(evt);
            }
        });
        jMenu8.add(mnuFecharChamado);

        jMenuBar1.add(jMenu8);

        jMenu7.setText("Ajuda");
        jMenuBar1.add(jMenu7);

        mnuSair.setText("Sair");
        mnuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSairMouseClicked(evt);
            }
        });
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCadastrosMouseClicked
        // TODO add your handling code here:
}//GEN-LAST:event_mnuCadastrosMouseClicked

    private void mnuCadTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadTurnoActionPerformed
        // TODO add your handling code here:
        frmCadTurno CadTurno = new frmCadTurno();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(CadTurno);
        } catch (Exception e) {
            e.getMessage();
        }

        CadTurno.show();
    }//GEN-LAST:event_mnuCadTurnoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void mnuCadEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadEmpresaActionPerformed
        // TODO add your handling code here:
        frmCadEmpresa CadEmpresa = new frmCadEmpresa();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(CadEmpresa);
        } catch (Exception e) {
            e.getMessage();
        }

        CadEmpresa.show();
    }//GEN-LAST:event_mnuCadEmpresaActionPerformed

    private void jMenuCadLojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadLojasActionPerformed
        // TODO add your handling code here:
        frmCadLoja CadLoja = new frmCadLoja();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(CadLoja);
        } catch (Exception e) {
            e.getMessage();
        }

        CadLoja.show();

    }//GEN-LAST:event_jMenuCadLojasActionPerformed

    private void jMenuCadEstacionamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadEstacionamentoActionPerformed
        // TODO add your handling code here:
        frmCadEstacionamento CadEstac = new frmCadEstacionamento();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(CadEstac);
        } catch (Exception e) {
            e.getMessage();
        }

        CadEstac.show();
    }//GEN-LAST:event_jMenuCadEstacionamentoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmCadSetor CadSetor = new frmCadSetor();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(CadSetor);
        } catch (Exception e) {
            e.getMessage();
        }

        CadSetor.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuAbrirChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAbrirChamadoActionPerformed
        // TODO add your handling code here:
        frmAbrirChamado AbrirChamado = new frmAbrirChamado();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(AbrirChamado);
        } catch (Exception e) {
            e.getMessage();
        }

        AbrirChamado.show();
    }//GEN-LAST:event_mnuAbrirChamadoActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_mnuSairActionPerformed

    private void mnuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuSairMouseClicked

    private void mnuCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadFuncActionPerformed
        // TODO add your handling code here:
        frmCadFuncionario CadFunc = new frmCadFuncionario();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(CadFunc);
        } catch (Exception e) {
            e.getMessage();
        }

        CadFunc.show();
    }//GEN-LAST:event_mnuCadFuncActionPerformed

    private void mnuFecharChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFecharChamadoActionPerformed
        // TODO add your handling code here:
        frmFinalizarChamado FecharChamado = new frmFinalizarChamado();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(FecharChamado);
        } catch (Exception e) {
            e.getMessage();
        }

        FecharChamado.show();

    }//GEN-LAST:event_mnuFecharChamadoActionPerformed

    private void mnuContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuContratoActionPerformed
        // TODO add your handling code here:
        frmCadContrato CadContrato = new frmCadContrato();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(CadContrato);
        } catch (Exception e) {
            e.getMessage();
        }

        CadContrato.setVisible(true);
    }//GEN-LAST:event_mnuContratoActionPerformed

    private void mnuEntradaEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEntradaEstActionPerformed
        // TODO add your handling code here:
        frmCadEntradaEst CadEntradaEst = new frmCadEntradaEst();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(CadEntradaEst);
        } catch (Exception e) {
            e.getMessage();
        }

        CadEntradaEst.setVisible(true);
    }//GEN-LAST:event_mnuEntradaEstActionPerformed

    private void mnuConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsumoActionPerformed
        // TODO add your handling code here:
        frmCadConsumo CadConsumo = new frmCadConsumo();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(CadConsumo);
        } catch (Exception e) {
            e.getMessage();
        }

        CadConsumo.setVisible(true);
    }//GEN-LAST:event_mnuConsumoActionPerformed

    private void mnuMarketingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuMarketingMouseClicked
        // TODO add your handling code here:
        frmCadMarketing CadMarketing = new frmCadMarketing();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(CadMarketing);
        } catch (Exception e) {
            e.getMessage();
        }

        CadMarketing.setVisible(true);
    }//GEN-LAST:event_mnuMarketingMouseClicked

    private void mnuCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCronoActionPerformed
        // TODO add your handling code here:
        frmCronograma Crono = new frmCronograma();
        try {
            clsFunctions functions = new clsFunctions();

            functions.centerWindow(Crono);
        } catch (Exception e) {
            e.getMessage();
        }

        Crono.setVisible(true);
    }//GEN-LAST:event_mnuCronoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new frmPrincipal().setVisible(true);


            }
        });


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadEstacionamento;
    private javax.swing.JMenuItem jMenuCadLojas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuAbrirChamado;
    private javax.swing.JMenuItem mnuCadEmpresa;
    private javax.swing.JMenuItem mnuCadFunc;
    private javax.swing.JMenuItem mnuCadTurno;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenuItem mnuConsumo;
    private javax.swing.JMenuItem mnuContrato;
    private javax.swing.JMenuItem mnuCrono;
    private javax.swing.JMenuItem mnuEntradaEst;
    private javax.swing.JMenuItem mnuFecharChamado;
    private javax.swing.JMenu mnuMarketing;
    private javax.swing.JMenu mnuSair;
    // End of variables declaration//GEN-END:variables
}
