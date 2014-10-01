/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weightlossapp;
import javax.swing.*;
/**
 *
 * @author x12112241
 */
public class CalorieGUI extends javax.swing.JFrame {

    /**
     * Creates new form CalorieGUI
     */
    public CalorieGUI() {
        initComponents();
    }
 
 
    
  
int Lunch= 0;
int Dinner= 0;
int total = 0;
int Breakfast = 0;

String s1;
String s2;
String s3;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calorieSlider = new javax.swing.JSlider();
        totalTF = new javax.swing.JLabel();
        BreakfastTF = new javax.swing.JTextField();
        LunchTF = new javax.swing.JTextField();
        DinnerTF = new javax.swing.JTextField();
        Totalbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliderTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 960));
        setResizable(false);

        calorieSlider.setMajorTickSpacing(1000);
        calorieSlider.setMaximum(5000);
        calorieSlider.setMinimum(1000);
        calorieSlider.setMinorTickSpacing(500);
        calorieSlider.setPaintLabels(true);
        calorieSlider.setPaintTicks(true);
        calorieSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calorieSliderStateChanged(evt);
            }
        });
        calorieSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                calorieSliderMouseMoved(evt);
            }
        });
        calorieSlider.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calorieSliderPropertyChange(evt);
            }
        });

        totalTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalTF.setText("0");

        BreakfastTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreakfastTFActionPerformed(evt);
            }
        });

        LunchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LunchTFActionPerformed(evt);
            }
        });

        DinnerTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinnerTFActionPerformed(evt);
            }
        });

        Totalbtn.setText("Total");
        Totalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Breakfast");

        jLabel2.setText("Lunch");

        jLabel3.setText("Dinner");

        sliderTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sliderTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BreakfastTF, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(LunchTF)
                                .addComponent(DinnerTF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Totalbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calorieSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderTF))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calorieSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BreakfastTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LunchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DinnerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Totalbtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calorieSliderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calorieSliderPropertyChange
        // TODO add your handling code here:
    
    }//GEN-LAST:event_calorieSliderPropertyChange

    private void calorieSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_calorieSliderStateChanged
        // TODO add your handling code here:

        
    }//GEN-LAST:event_calorieSliderStateChanged

    private void sliderTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sliderTFActionPerformed
        // TODO add your handling code here:
        sliderTF.setText(BreakfastTF.getText() + ""+ LunchTF.getText() + "" + DinnerTF.getText() + "");
    }//GEN-LAST:event_sliderTFActionPerformed

    private void calorieSliderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calorieSliderMouseMoved
        // TODO add your handling code here:
      
    }//GEN-LAST:event_calorieSliderMouseMoved

    private void BreakfastTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreakfastTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BreakfastTFActionPerformed

    private void LunchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LunchTFActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_LunchTFActionPerformed

    private void DinnerTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinnerTFActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_DinnerTFActionPerformed

    private void TotalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalbtnActionPerformed
        // TODO add your handling code here:
        String s1 = BreakfastTF.getText();
        String s2 = LunchTF.getText();
        String s3 = DinnerTF.getText();
     totalTF.setText(s1 + s2 + s3  );
     sliderTF.setText(s1 + s2 + s3  );
     
     
    }//GEN-LAST:event_TotalbtnActionPerformed


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
            java.util.logging.Logger.getLogger(CalorieGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalorieGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalorieGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalorieGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalorieGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BreakfastTF;
    private javax.swing.JTextField DinnerTF;
    private javax.swing.JTextField LunchTF;
    private javax.swing.JButton Totalbtn;
    private javax.swing.JSlider calorieSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField sliderTF;
    private javax.swing.JLabel totalTF;
    // End of variables declaration//GEN-END:variables
}
