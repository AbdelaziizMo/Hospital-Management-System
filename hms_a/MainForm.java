
package hms_a;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        report = new javax.swing.JButton();
        patient = new javax.swing.JButton();
        earning = new javax.swing.JButton();
        medicine = new javax.swing.JButton();
        poweroff = new javax.swing.JButton();
        checkup = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\toshiba\\OneDrive\\Documents\\NetBeansProjects\\HMS\\src\\icon\\Blue and White Illustrative Doctor Health Care Logo.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        report.setBackground(new java.awt.Color(242, 242, 242));
        report.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        report.setForeground(new java.awt.Color(0, 102, 102));
        report.setText("Reports");
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportMouseExited(evt);
            }
        });
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        patient.setBackground(new java.awt.Color(242, 242, 242));
        patient.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        patient.setForeground(new java.awt.Color(0, 102, 102));
        patient.setText("Patients");
        patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patientMouseExited(evt);
            }
        });
        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });

        earning.setBackground(new java.awt.Color(242, 242, 242));
        earning.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        earning.setForeground(new java.awt.Color(0, 102, 102));
        earning.setText("Earnings");
        earning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                earningMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                earningMouseExited(evt);
            }
        });
        earning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earningActionPerformed(evt);
            }
        });

        medicine.setBackground(new java.awt.Color(242, 242, 242));
        medicine.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        medicine.setForeground(new java.awt.Color(0, 102, 102));
        medicine.setText("Medicines");
        medicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medicineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                medicineMouseExited(evt);
            }
        });
        medicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineActionPerformed(evt);
            }
        });

        poweroff.setBackground(new java.awt.Color(242, 242, 242));
        poweroff.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        poweroff.setForeground(new java.awt.Color(0, 102, 102));
        poweroff.setText("Power Off");
        poweroff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poweroffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poweroffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poweroffMouseExited(evt);
            }
        });
        poweroff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poweroffActionPerformed(evt);
            }
        });

        checkup.setBackground(new java.awt.Color(242, 242, 242));
        checkup.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        checkup.setForeground(new java.awt.Color(0, 102, 102));
        checkup.setText("Check Up");
        checkup.setToolTipText("");
        checkup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkupMouseExited(evt);
            }
        });
        checkup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(medicine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patient, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(earning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poweroff, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patient, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(earning, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(poweroff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 135, 137));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOSPITAL MANAGEMENT SYSTEM");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\toshiba\\OneDrive\\Documents\\NetBeansProjects\\HMS_A\\src\\icon\\Blue Red White Square Badge Simple Medical Clinic Logo.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportActionPerformed

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientActionPerformed

    private void earningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_earningActionPerformed

    private void medicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineActionPerformed
    }//GEN-LAST:event_medicineActionPerformed

    private void poweroffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poweroffActionPerformed

    }//GEN-LAST:event_poweroffActionPerformed

    private void checkupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkupActionPerformed

    }//GEN-LAST:event_checkupActionPerformed

    private void patientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientMouseEntered
        patient.setBackground(java.awt.Color.decode("#deedee"));        
    }//GEN-LAST:event_patientMouseEntered

    private void reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseEntered
        report.setBackground(java.awt.Color.decode("#deedee"));
    }//GEN-LAST:event_reportMouseEntered

    private void medicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineMouseEntered
        medicine.setBackground(java.awt.Color.decode("#deedee"));
    }//GEN-LAST:event_medicineMouseEntered

    private void earningMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earningMouseEntered
        earning.setBackground(java.awt.Color.decode("#deedee"));
    }//GEN-LAST:event_earningMouseEntered

    private void checkupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkupMouseEntered
        checkup.setBackground(java.awt.Color.decode("#deedee"));
    }//GEN-LAST:event_checkupMouseEntered

    private void poweroffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poweroffMouseEntered
        poweroff.setBackground(java.awt.Color.decode("#deedee"));
    }//GEN-LAST:event_poweroffMouseEntered

    private void patientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientMouseExited
        patient.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_patientMouseExited

    private void reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseExited
        report.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_reportMouseExited

    private void medicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineMouseExited
        medicine.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_medicineMouseExited

    private void earningMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earningMouseExited
        earning.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_earningMouseExited

    private void checkupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkupMouseExited
        checkup.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_checkupMouseExited

    private void poweroffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poweroffMouseExited
        poweroff.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_poweroffMouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientMouseClicked
        this.setVisible(false);
        new Patients().setVisible(true);
    }//GEN-LAST:event_patientMouseClicked

    private void medicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineMouseClicked
        Medicines medicines = new Medicines();
        this.setVisible(false);
        medicines.setVisible(true);
    }//GEN-LAST:event_medicineMouseClicked

    private void checkupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkupMouseClicked
        CheckUp checkup = new CheckUp();
        this.setVisible(false);
        checkup.setVisible(true);
    }//GEN-LAST:event_checkupMouseClicked

    private void poweroffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poweroffMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_poweroffMouseClicked

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        // TODO add your handling code here:
        Reports reports = new Reports();
        this.setVisible(false);
        reports.setVisible(true);
    }//GEN-LAST:event_reportMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkup;
    private javax.swing.JButton earning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton medicine;
    private javax.swing.JButton patient;
    private javax.swing.JButton poweroff;
    private javax.swing.JButton report;
    // End of variables declaration//GEN-END:variables
}
