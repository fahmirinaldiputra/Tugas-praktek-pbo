/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fahmi180424;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class fromgaji extends javax.swing.JFrame {

    /**
     * Creates new form fromgaji
     */
    public fromgaji() {
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

        labeljudul = new javax.swing.JLabel();
        panelidentitas = new javax.swing.JPanel();
        namapegawai = new javax.swing.JLabel();
        nik = new javax.swing.JLabel();
        golongan = new javax.swing.JLabel();
        jamkerja = new javax.swing.JLabel();
        PanelIdentitas = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnik = new javax.swing.JTextField();
        cmbgolongan = new javax.swing.JComboBox<>();
        txtjam = new javax.swing.JTextField();
        buttonhitung = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PanelGaji = new javax.swing.JLabel();
        labelpokok = new javax.swing.JLabel();
        labelupah = new javax.swing.JLabel();
        txtgapok = new javax.swing.JTextField();
        txtupah = new javax.swing.JTextField();
        labeltotupah = new javax.swing.JLabel();
        txttotupah = new javax.swing.JTextField();
        labeltotgaji = new javax.swing.JLabel();
        txttotgaji = new javax.swing.JTextField();
        buttondesk = new javax.swing.JButton();
        buttonreset = new javax.swing.JButton();
        buttonexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PanelKeterangan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textareaket = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labeljudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labeljudul.setText("PENGAJIAN KARYAWAN PT ABC");

        panelidentitas.setBackground(new java.awt.Color(153, 102, 255));

        namapegawai.setText("Nama Pegawai");

        nik.setText("NIK");

        golongan.setText("Golongan");

        jamkerja.setText("Jam Kerja");

        PanelIdentitas.setText("Identitas Pegawai");

        cmbgolongan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIHAN GOLONGAN", "Golongan 1", "Golongan 2", "Golongan 3", "Golongan 4" }));
        cmbgolongan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbgolonganActionPerformed(evt);
            }
        });

        buttonhitung.setText("HITUNG GAJI");
        buttonhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelidentitasLayout = new javax.swing.GroupLayout(panelidentitas);
        panelidentitas.setLayout(panelidentitasLayout);
        panelidentitasLayout.setHorizontalGroup(
            panelidentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelidentitasLayout.createSequentialGroup()
                .addGroup(panelidentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelidentitasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelIdentitas))
                    .addGroup(panelidentitasLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelidentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namapegawai)
                            .addComponent(nik)
                            .addComponent(golongan)
                            .addComponent(jamkerja))
                        .addGap(18, 18, 18)
                        .addGroup(panelidentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnik)
                            .addComponent(txtnama)
                            .addComponent(cmbgolongan, 0, 200, Short.MAX_VALUE)
                            .addComponent(txtjam))
                        .addGap(18, 18, 18)
                        .addComponent(buttonhitung)))
                .addContainerGap())
        );
        panelidentitasLayout.setVerticalGroup(
            panelidentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelidentitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelIdentitas)
                .addGap(11, 11, 11)
                .addGroup(panelidentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namapegawai)
                    .addGroup(panelidentitasLayout.createSequentialGroup()
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelidentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nik))))
                .addGap(17, 17, 17)
                .addGroup(panelidentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golongan)
                    .addComponent(cmbgolongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelidentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jamkerja)
                    .addComponent(txtjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelidentitasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonhitung)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        PanelGaji.setText("Rincian Gaji");

        labelpokok.setText("gaji pokok");
        labelpokok.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelpokokAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        labelupah.setText("upah per jam");

        txtgapok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgapokActionPerformed(evt);
            }
        });

        labeltotupah.setText("Total upah");

        labeltotgaji.setText("Total Gaji");

        txttotgaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotgajiActionPerformed(evt);
            }
        });

        buttondesk.setText("deskripsi");
        buttondesk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondeskActionPerformed(evt);
            }
        });

        buttonreset.setText("reset");
        buttonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonresetActionPerformed(evt);
            }
        });

        buttonexit.setText("exit");
        buttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelGaji)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelpokok))
                            .addComponent(labelupah)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttondesk)
                                .addGap(7, 7, 7)
                                .addComponent(buttonreset))
                            .addComponent(labeltotupah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeltotgaji, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtupah)
                            .addComponent(txttotupah)
                            .addComponent(txttotgaji)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtgapok, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonexit))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelGaji)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelpokok)
                    .addComponent(txtgapok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelupah)
                    .addComponent(txtupah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotupah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeltotupah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotgaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeltotgaji))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttondesk)
                    .addComponent(buttonreset)
                    .addComponent(buttonexit))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        PanelKeterangan.setText("Keterangan");

        textareaket.setColumns(20);
        textareaket.setRows(5);
        jScrollPane1.setViewportView(textareaket);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelKeterangan)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelKeterangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelidentitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(labeljudul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeljudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelidentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbgolonganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbgolonganActionPerformed
        int gp=0;
        int upah=0;
        switch(cmbgolongan.getSelectedIndex()){
            case 1: gp=1000000; upah=5000;
                    break;
            case 2: gp=1500000; upah=7000;
                    break;
            case 3: gp=2000000; upah=10000;
                    break;
            case 4: gp=2500000; upah=12500;
                    break;
        }
        txtgapok.setText(String.valueOf(gp));
        txtupah.setText(String.valueOf(upah));
    }//GEN-LAST:event_cmbgolonganActionPerformed

    private void txttotgajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotgajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotgajiActionPerformed

    private void buttonhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhitungActionPerformed

        int jk=Integer.parseInt(txtjam.getText());
        int tu = Integer.parseInt(txtupah.getText());
        txttotupah.setText(""+tu);
        int totalgaji= Integer.parseInt(txtgapok.getText())+tu;
        txttotgaji.setText(""+totalgaji);
        
    }//GEN-LAST:event_buttonhitungActionPerformed

    private void buttondeskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondeskActionPerformed
        String nama,NIK,keterangan;
        nama = txtnama.getText();
        NIK = txtnik.getText();
        int tg =Integer.parseInt(txttotgaji.getText());
        keterangan = "Data Pegawai \n Nama : " +nama+
                     "\n Nik : "+NIK+
                     "\n Total gaji : "+tg;
        
        textareaket.setText(keterangan);
    }//GEN-LAST:event_buttondeskActionPerformed

    private void buttonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonresetActionPerformed
        txtnama.setText("");
        txtnik.setText("");
        txtjam.setText("");
        txtupah.setText("");
        txtgapok.setText("");
        txttotupah.setText("");
        txttotgaji.setText("");
        textareaket.setText("");
        
    }//GEN-LAST:event_buttonresetActionPerformed

    private void buttonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonexitActionPerformed
        int jawab = JOptionPane.showOptionDialog(this,
                    "Apakah ingin keluar?",
                    "Keluar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,null,null);
        if(jawab==JOptionPane.YES_NO_OPTION)
            System.exit(0);
    }//GEN-LAST:event_buttonexitActionPerformed

    private void labelpokokAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelpokokAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_labelpokokAncestorAdded

    private void txtgapokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgapokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgapokActionPerformed

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
            java.util.logging.Logger.getLogger(fromgaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fromgaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fromgaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fromgaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fromgaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PanelGaji;
    private javax.swing.JLabel PanelIdentitas;
    private javax.swing.JLabel PanelKeterangan;
    private javax.swing.JButton buttondesk;
    private javax.swing.JButton buttonexit;
    private javax.swing.JButton buttonhitung;
    private javax.swing.JButton buttonreset;
    private javax.swing.JComboBox<String> cmbgolongan;
    private javax.swing.JLabel golongan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jamkerja;
    private javax.swing.JLabel labeljudul;
    private javax.swing.JLabel labelpokok;
    private javax.swing.JLabel labeltotgaji;
    private javax.swing.JLabel labeltotupah;
    private javax.swing.JLabel labelupah;
    private javax.swing.JLabel namapegawai;
    private javax.swing.JLabel nik;
    private javax.swing.JPanel panelidentitas;
    private javax.swing.JTextArea textareaket;
    private javax.swing.JTextField txtgapok;
    private javax.swing.JTextField txtjam;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txttotgaji;
    private javax.swing.JTextField txttotupah;
    private javax.swing.JTextField txtupah;
    // End of variables declaration//GEN-END:variables
}