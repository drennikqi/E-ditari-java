/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.CrudFormException;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dreni
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    
    private int userRoli;
    private int id;
    private String emri;
    
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public MainForm(int userRoli, int id, String emri) {
        initComponents();
        setLocationRelativeTo(null);
        this.userRoli = userRoli;
        this.id = id;
        this.emri = emri;
        
        if(userRoli == 1){
            drejtoriBtn.setVisible(false);
            notatBtn.setVisible(false);
            mungesatBtn.setVisible(false);
        }else if(userRoli == 2){
            drejtoriBtn.setVisible(false);
            mesimdhenesiBtn.setVisible(false);
        }else if(userRoli == 3){
            nxenesiBtn.setVisible(false);
            drejtoriBtn.setVisible(false);
            mesimdhenesiBtn.setVisible(false);
        }else if(userRoli == 4){
            nxenesiBtn.setVisible(false);
            drejtoriBtn.setVisible(false);
            mesimdhenesiBtn.setVisible(false);
            klasaBtn.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navMenu = new javax.swing.JDesktopPane();
        drejtoriBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nxenesiBtn = new javax.swing.JButton();
        notatBtn = new javax.swing.JButton();
        mesimdhenesiBtn = new javax.swing.JButton();
        mungesatBtn = new javax.swing.JButton();
        klasaBtn = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exitMI = new javax.swing.JMenuItem();
        logoutMI = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        navMenu = new javax.swing.JDesktopPane() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.DARK_GRAY);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        drejtoriBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drejtoriBtn.setText("Drejtorat");
        drejtoriBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        drejtoriBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drejtoriBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-DITARI");

        nxenesiBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nxenesiBtn.setText("Nxenesit");
        nxenesiBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nxenesiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxenesiBtnActionPerformed(evt);
            }
        });

        notatBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        notatBtn.setText("Notat");
        notatBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        notatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notatBtnActionPerformed(evt);
            }
        });

        mesimdhenesiBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mesimdhenesiBtn.setText("Mesimdhenesit");
        mesimdhenesiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesimdhenesiBtnActionPerformed(evt);
            }
        });

        mungesatBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mungesatBtn.setText("Mungesat");
        mungesatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mungesatBtnActionPerformed(evt);
            }
        });

        klasaBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        klasaBtn.setText("Klasa");
        klasaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klasaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navMenuLayout = new javax.swing.GroupLayout(navMenu);
        navMenu.setLayout(navMenuLayout);
        navMenuLayout.setHorizontalGroup(
            navMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navMenuLayout.createSequentialGroup()
                .addGroup(navMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navMenuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(navMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mesimdhenesiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mungesatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(notatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(drejtoriBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nxenesiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(klasaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(navMenuLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        navMenuLayout.setVerticalGroup(
            navMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navMenuLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(nxenesiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drejtoriBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(notatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mungesatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mesimdhenesiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(klasaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navMenu.setLayer(drejtoriBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(nxenesiBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(notatBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(mesimdhenesiBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(mungesatBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(klasaBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        desktopPane = new javax.swing.JDesktopPane() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.DARK_GRAY);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        desktopPane.setPreferredSize(new java.awt.Dimension(823, 557));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        exitMI.setText("Exit");
        exitMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMIActionPerformed(evt);
            }
        });
        jMenu1.add(exitMI);

        logoutMI.setText("Logout");
        logoutMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMIActionPerformed(evt);
            }
        });
        jMenu1.add(logoutMI);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Copy");
        jMenu2.add(jMenuItem2);

        pasteMenuItem.setText("Paste");
        jMenu2.add(pasteMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drejtoriBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drejtoriBtnActionPerformed
        // TODO add your handling code here:
        DrejtoriForm df = new DrejtoriForm();
        desktopPane.add(df);
        df.show();
    }//GEN-LAST:event_drejtoriBtnActionPerformed

    private void nxenesiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxenesiBtnActionPerformed
        // TODO add your handling code here:
        NxenesiForm nf = new NxenesiForm(userRoli);
        desktopPane.add(nf);
        nf.show();
    }//GEN-LAST:event_nxenesiBtnActionPerformed

    private void notatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notatBtnActionPerformed
        // TODO add your handling code here:
        try {
            NotatForm nf;
            nf = new NotatForm(userRoli, id, emri);
            desktopPane.add(nf);
            nf.show();
        } catch (CrudFormException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_notatBtnActionPerformed

    private void mesimdhenesiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesimdhenesiBtnActionPerformed
        // TODO add your handling code here:
        MesimdhenesiForm rbf = new MesimdhenesiForm(userRoli);
        desktopPane.add(rbf);
        rbf.show();
    }//GEN-LAST:event_mesimdhenesiBtnActionPerformed

    private void mungesatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mungesatBtnActionPerformed
        // TODO add your handling code here:
        MungesaForm pf = new MungesaForm(userRoli, id, emri);
        desktopPane.add(pf);
        pf.show();
    }//GEN-LAST:event_mungesatBtnActionPerformed

    private void klasaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klasaBtnActionPerformed
        // TODO add your handling code here:
        KlasaForm pf = new KlasaForm(userRoli, id, emri);
        desktopPane.add(pf);
        pf.show();
    }//GEN-LAST:event_klasaBtnActionPerformed

    private void exitMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMIActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_exitMIActionPerformed

    private void logoutMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMIActionPerformed
        // TODO add your handling code here:
        new LoginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutMIActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton drejtoriBtn;
    private javax.swing.JMenuItem exitMI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton klasaBtn;
    private javax.swing.JMenuItem logoutMI;
    private javax.swing.JButton mesimdhenesiBtn;
    private javax.swing.JButton mungesatBtn;
    private javax.swing.JDesktopPane navMenu;
    private javax.swing.JButton notatBtn;
    private javax.swing.JButton nxenesiBtn;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables
}
