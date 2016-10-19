/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundblaster;

/**
 *
 * @author Eric
 */
public class GUI extends javax.swing.JFrame {

    SoundBlaster SB = new SoundBlaster();

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        soundBtn = new javax.swing.JButton();
        soundBtn2 = new javax.swing.JButton();
        noSoundBtn = new javax.swing.JButton();
        soundBtn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        soundBtn.setBackground(new java.awt.Color(102, 102, 102));
        soundBtn.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        soundBtn.setForeground(new java.awt.Color(255, 153, 0));
        soundBtn.setText("SOUND - 1");
        soundBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(255, 153, 0)));
        soundBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundBtnActionPerformed(evt);
            }
        });

        soundBtn2.setBackground(new java.awt.Color(102, 102, 102));
        soundBtn2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        soundBtn2.setForeground(new java.awt.Color(255, 153, 0));
        soundBtn2.setText("SOUND - 2");
        soundBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(255, 153, 0)));
        soundBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundBtn2ActionPerformed(evt);
            }
        });

        noSoundBtn.setBackground(new java.awt.Color(102, 102, 102));
        noSoundBtn.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        noSoundBtn.setForeground(new java.awt.Color(255, 153, 0));
        noSoundBtn.setText("NO SOUND!");
        noSoundBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(255, 153, 0)));
        noSoundBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSoundBtnActionPerformed(evt);
            }
        });

        soundBtn3.setBackground(new java.awt.Color(102, 102, 102));
        soundBtn3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        soundBtn3.setForeground(new java.awt.Color(255, 153, 0));
        soundBtn3.setText("SOUND - 3");
        soundBtn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(255, 153, 0)));
        soundBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noSoundBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(soundBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soundBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soundBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soundBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soundBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soundBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noSoundBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soundBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundBtnActionPerformed
        SB.startaLjud1();
    }//GEN-LAST:event_soundBtnActionPerformed

    private void soundBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundBtn2ActionPerformed
        SB.startaLjud2();
    }//GEN-LAST:event_soundBtn2ActionPerformed

    private void noSoundBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSoundBtnActionPerformed
        SB.stoppaLjud1();
        SB.stoppaLjud2();
        SB.stoppaLjud3();
    }//GEN-LAST:event_noSoundBtnActionPerformed

    private void soundBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundBtn3ActionPerformed
        SB.startaLjud3();
    }//GEN-LAST:event_soundBtn3ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton noSoundBtn;
    private javax.swing.JButton soundBtn;
    private javax.swing.JButton soundBtn2;
    private javax.swing.JButton soundBtn3;
    // End of variables declaration//GEN-END:variables
}
