
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

 class GUIcomponents extends javax.swing.JFrame {

    /**
     * Creates new form GUIcomponents
     */
    public GUIcomponents() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BdayLabel = new javax.swing.JLabel();
        StartBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        BdayTF = new javax.swing.JTextField();
        BdayMTF = new javax.swing.JTextField();
        BdayYTF = new javax.swing.JTextField();
        TdayTF = new javax.swing.JTextField();
        TdyLabelTop = new javax.swing.JLabel();
        TimeAlive = new javax.swing.JLabel();
        TimeSlept = new javax.swing.JLabel();
        TdayMTF = new javax.swing.JTextField();
        TdayYTF = new javax.swing.JTextField();
        BdayDayLabel = new javax.swing.JLabel();
        BdayMLabel = new javax.swing.JLabel();
        BdayYLabel = new javax.swing.JLabel();
        TdyLabel = new javax.swing.JLabel();
        TdyMLabel = new javax.swing.JLabel();
        TdyYLabel = new javax.swing.JLabel();
        FinalProduct = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BdayLabel.setText("Enter Your Brithdate");

        StartBtn.setText("Calculate");
        StartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBtnActionPerformed(evt);
            }
        });

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        BdayTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdayTFActionPerformed(evt);
            }
        });

        BdayMTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdayMTFActionPerformed(evt);
            }
        });

        BdayYTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdayYTFActionPerformed(evt);
            }
        });

        TdayTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TdayTFActionPerformed(evt);
            }
        });

        TdyLabelTop.setText("Enter Todays Date");

        TdayMTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TdayMTFActionPerformed(evt);
            }
        });

        TdayYTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TdayYTFActionPerformed(evt);
            }
        });

        BdayDayLabel.setText("Day:");

        BdayMLabel.setText("Month:");

        BdayYLabel.setText("Year:");

        TdyLabel.setText("Day:");

        TdyMLabel.setText("Month:");

        TdyYLabel.setText("Year:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BdayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BdayTF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TdyLabelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TdayTF)
                            .addComponent(TdayMTF)
                            .addComponent(TdayYTF))
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BdayMLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BdayDayLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BdayYLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BdayYTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BdayMTF))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(TdyMLabel))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TdyYLabel))))
                                    .addComponent(TdyLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StartBtn)
                                    .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TimeSlept, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(TimeAlive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FinalProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TdyLabelTop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BdayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TdayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BdayDayLabel)
                    .addComponent(TdyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BdayMTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TdayMTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BdayMLabel)
                    .addComponent(TdyMLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BdayYTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TdayYTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BdayYLabel)
                    .addComponent(TdyYLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimeAlive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TimeSlept, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FinalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BdayYTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdayYTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BdayYTFActionPerformed

    private void TdayYTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TdayYTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TdayYTFActionPerformed

    private void StartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBtnActionPerformed
            // Get birth date and current date from input fields
    int birthYear = Integer.parseInt(BdayYTF.getText());
    int birthMonth = Integer.parseInt(BdayMTF.getText());
    int birthDay = Integer.parseInt(BdayTF.getText());
    LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
    LocalDate currentDate = LocalDate.now();

    // Calculate total number of hours slept since birth
    long daysAlive = ChronoUnit.DAYS.between(birthDate, currentDate);
    long hoursSlept = daysAlive * 8; // assuming 8 hours of sleep per day
    long Sleptdays = hoursSlept/24;

    // Update labels to display result
    TimeAlive.setText("Days spent alive: " + daysAlive);
    TimeSlept.setText("Hours spent sleeping: " + hoursSlept);
    FinalProduct.setText("You've spent " + daysAlive + " days alive and of those days you've spent " + Sleptdays + " days sleeping ");
    }//GEN-LAST:event_StartBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        System.exit(0); // Exit the application
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void BdayTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdayTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BdayTFActionPerformed

    private void BdayMTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdayMTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BdayMTFActionPerformed

    private void TdayMTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TdayMTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TdayMTFActionPerformed

    private void TdayTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TdayTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TdayTFActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIcomponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIcomponents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BdayDayLabel;
    private javax.swing.JLabel BdayLabel;
    private javax.swing.JLabel BdayMLabel;
    private javax.swing.JTextField BdayMTF;
    private javax.swing.JTextField BdayTF;
    private javax.swing.JLabel BdayYLabel;
    private javax.swing.JTextField BdayYTF;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel FinalProduct;
    private javax.swing.JButton StartBtn;
    private javax.swing.JTextField TdayMTF;
    private javax.swing.JTextField TdayTF;
    private javax.swing.JTextField TdayYTF;
    private javax.swing.JLabel TdyLabel;
    private javax.swing.JLabel TdyLabelTop;
    private javax.swing.JLabel TdyMLabel;
    private javax.swing.JLabel TdyYLabel;
    private javax.swing.JLabel TimeAlive;
    private javax.swing.JLabel TimeSlept;
    // End of variables declaration//GEN-END:variables
}
