/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vues;

import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author clement
 */
public class VueRapportVisite extends javax.swing.JFrame {
    DefaultComboBoxModel modeleListePracticiens;
    /**
     * Creates new form VueRapportVisite
     */
    public VueRapportVisite() {
        initComponents();
        modeleListePracticiens = new DefaultComboBoxModel();
        jComboBoxPraticien.setModel(modeleListePracticiens);
    } 

    public JButton getjButtonOk() {
        return jButtonOk;
    }

    public JTextField getjTextFieldBilan() {
        return jTextFieldBilan;
    }

    

    public JTextField getjTextFieldMotif() {
        return jTextFieldMotif;
    }

    

    public DefaultComboBoxModel getModeleListePracticiens() {
        return modeleListePracticiens;
    }
   
    public JButton getjButtonPrecedent() {
        return jButtonPrecedent;
    }

    public JButton getjButtonSuivant() {
        return jButtonSuivant;
    }
    
    public JButton getjButtonDetails() {
        return jButtonDetails;
    }

    public JButton getjButtonNouveau() {
        return jButtonNouveau;
    }

    public JButton getjButtonQuitter() {
        return jButtonQuitter;
    }

    public void setjButtonQuitter(JButton jButtonQuitter) {
        this.jButtonQuitter = jButtonQuitter;
    }

    public JComboBox getjComboBoxPraticien() {
        return jComboBoxPraticien;
    }

    public void setjComboBoxPraticien(JComboBox jComboBoxPraticien) {
        this.jComboBoxPraticien = jComboBoxPraticien;
    }

    public JDateChooser getjDateChooserDate() {
        return jDateChooserDate;
    }

    public void setjDateChooserDate(JDateChooser jDateChooserDate) {
        this.jDateChooserDate = jDateChooserDate;
    }

    public JTextField getjTextFieldNumRap() {
        return jTextFieldNumRap;
    }

    public void setjTextFieldNumRap(JTextField jTextFieldNumRap) {
        this.jTextFieldNumRap = jTextFieldNumRap;
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxPraticien = new javax.swing.JComboBox();
        jButtonDetails = new javax.swing.JButton();
        jLabelPracticien = new javax.swing.JLabel();
        jLabelDateRapport = new javax.swing.JLabel();
        jButtonQuitter = new javax.swing.JButton();
        jLabelMotif = new javax.swing.JLabel();
        jTextFieldMotif = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBilan = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jLabelRapport = new javax.swing.JLabel();
        jTextFieldNumRap = new javax.swing.JTextField();
        jDateChooserDate = new com.toedter.calendar.JDateChooser();
        jButtonNouveau = new javax.swing.JButton();
        jLabelConsulterLesRapports = new javax.swing.JLabel();
        jButtonPrecedent = new javax.swing.JButton();
        jButtonSuivant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonDetails.setText("Détails");

        jLabelPracticien.setText("Practicien");

        jLabelDateRapport.setText("Date Rapport ");

        jButtonQuitter.setText("Fermer");

        jLabelMotif.setText("Motif Visite");

        jLabel1.setText("Bilan");

        jButtonOk.setText("Ok");

        jLabelRapport.setText("N° de rapport ");

        jButtonNouveau.setText("Créer nouveau rapport");

        jLabelConsulterLesRapports.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelConsulterLesRapports.setText("Consulter les rapports");

        jButtonPrecedent.setText("Precedent");

        jButtonSuivant.setText("Suivant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDateRapport)
                    .addComponent(jLabelMotif)
                    .addComponent(jLabelRapport)
                    .addComponent(jLabelPracticien)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxPraticien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNumRap)
                            .addComponent(jDateChooserDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldMotif, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDetails))
                    .addComponent(jTextFieldBilan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNouveau, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrecedent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonOk, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jButtonSuivant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabelConsulterLesRapports)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelConsulterLesRapports)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRapport)
                    .addComponent(jTextFieldNumRap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPraticien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPracticien)
                    .addComponent(jButtonDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDateRapport)
                    .addComponent(jDateChooserDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMotif)
                    .addComponent(jTextFieldMotif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldBilan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSuivant, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPrecedent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNouveau)
                            .addComponent(jButtonOk)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonQuitter)
                        .addGap(49, 49, 49))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VueRapportVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueRapportVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueRapportVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueRapportVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueRapportVisite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetails;
    private javax.swing.JButton jButtonNouveau;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JButton jButtonSuivant;
    private javax.swing.JComboBox jComboBoxPraticien;
    private com.toedter.calendar.JDateChooser jDateChooserDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConsulterLesRapports;
    private javax.swing.JLabel jLabelDateRapport;
    private javax.swing.JLabel jLabelMotif;
    private javax.swing.JLabel jLabelPracticien;
    private javax.swing.JLabel jLabelRapport;
    private javax.swing.JTextField jTextFieldBilan;
    private javax.swing.JTextField jTextFieldMotif;
    private javax.swing.JTextField jTextFieldNumRap;
    // End of variables declaration//GEN-END:variables
}
