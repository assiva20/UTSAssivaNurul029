/*
Nama        : Assiva Nurul Huzna
NIM         : 11200930000029
Kelas       : Sistem Informasi 2A
 */

public class KonverSuhu extends javax.swing.JFrame {
    
    public KonverSuhu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        inputKelvin = new javax.swing.JTextField();
        ButtonKonversi = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();
        ButtonKeluar = new javax.swing.JButton();
        KelvinTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ReamurTxt = new javax.swing.JLabel();
        outputReamur = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel9.setText("KONVERSI SUHU");

        inputKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKelvinActionPerformed(evt);
            }
        });

        ButtonKonversi.setText("Konversi");
        ButtonKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKonversiActionPerformed(evt);
            }
        });

        ButtonHapus.setText("Hapus");
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });

        ButtonKeluar.setText("Keluar");
        ButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKeluarActionPerformed(evt);
            }
        });

        KelvinTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        KelvinTxt.setText("Suhu Kelvin");

        jLabel2.setText("'K");

        ReamurTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ReamurTxt.setText("Suhu Reamur");

        outputReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputReamurActionPerformed(evt);
            }
        });

        jLabel4.setText("'R");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel9)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(ReamurTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(outputReamur, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(KelvinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(inputKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ButtonKonversi)
                            .addGap(38, 38, 38)
                            .addComponent(ButtonHapus)
                            .addGap(33, 33, 33)
                            .addComponent(ButtonKeluar)))
                    .addContainerGap(65, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KelvinTxt)
                            .addComponent(jLabel2))
                        .addComponent(inputKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonHapus)
                        .addComponent(ButtonKonversi)
                        .addComponent(ButtonKeluar))
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ReamurTxt)
                        .addComponent(outputReamur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addContainerGap(92, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKelvinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputKelvinActionPerformed

    private void ButtonKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKonversiActionPerformed
        // TODO add your handling code here:
        double k,r;

        k = Double.parseDouble(inputKelvin.getText());

        r = (k - 273.15)*0.8;

        outputReamur.setText(String.valueOf(r));
    }//GEN-LAST:event_ButtonKonversiActionPerformed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        // TODO add your handling code here:
        inputKelvin.setText("");
        outputReamur.setText("");
        inputKelvin.requestFocus();
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void ButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ButtonKeluarActionPerformed

    private void outputReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputReamurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputReamurActionPerformed

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
            java.util.logging.Logger.getLogger(KonverSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonverSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonverSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonverSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonverSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonKeluar;
    private javax.swing.JButton ButtonKonversi;
    private javax.swing.JLabel KelvinTxt;
    private javax.swing.JLabel ReamurTxt;
    private javax.swing.JTextField inputKelvin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField outputReamur;
    // End of variables declaration//GEN-END:variables
}
