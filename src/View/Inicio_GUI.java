/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author auada
 */
public class Inicio_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_GUI
     */
    public Inicio_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        voo1_btn = new javax.swing.JButton();
        voo2_btn = new javax.swing.JButton();
        sair_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(196, 230, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        jPanel1.setLayout(null);

        jLabel1.setText("vôo 56245");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(109, 178, 59, 16);

        jLabel2.setText("Rio de Janeiro --> São Paulo");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(54, 207, 165, 16);

        jLabel3.setText("14:20");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(121, 235, 33, 16);

        jLabel4.setText("vôo 33145");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(329, 178, 59, 16);

        jLabel5.setText("São Paulo --> Rio de Janeiro");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(277, 207, 165, 16);

        jLabel6.setText("1:10");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(346, 235, 26, 16);

        voo1_btn.setText("selecionar vôo");
        voo1_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voo1_btnActionPerformed(evt);
            }
        });
        jPanel1.add(voo1_btn);
        voo1_btn.setBounds(70, 290, 140, 25);

        voo2_btn.setText("selecionar vôo");
        voo2_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voo2_btnActionPerformed(evt);
            }
        });
        jPanel1.add(voo2_btn);
        voo2_btn.setBounds(280, 290, 150, 25);

        sair_btn.setText("x");
        sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_btnActionPerformed(evt);
            }
        });
        jPanel1.add(sair_btn);
        sair_btn.setBounds(432, 19, 50, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aviao11.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(317, 114, 84, 46);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aviao12.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 114, 84, 46);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nuvem11.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(210, 20, 90, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(500, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voo1_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voo1_btnActionPerformed

        new Voo1().setVisible(true);
    }//GEN-LAST:event_voo1_btnActionPerformed

    private void voo2_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voo2_btnActionPerformed

        new Voo2().setVisible(true);
    }//GEN-LAST:event_voo2_btnActionPerformed

    private void sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sair_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sair_btn;
    private javax.swing.JButton voo1_btn;
    private javax.swing.JButton voo2_btn;
    // End of variables declaration//GEN-END:variables
}
