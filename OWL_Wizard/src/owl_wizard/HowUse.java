/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package owl_wizard;

import java.util.*;

/**
 *
 * @author shsu
 */
public class HowUse extends javax.swing.JPanel {

    /**
     * Creates new form WhatLanguage
     */
    
    ArrayList<Candidate> candidates; 
    
    public HowUse(ArrayList<Candidate> cand) {
        
        candidates = cand;
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        reasoning = new javax.swing.JCheckBox();
        querying = new javax.swing.JCheckBox();
        rules = new javax.swing.JCheckBox();
        thoroughModeling = new javax.swing.JCheckBox();

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setText("What will your ontology be used for?");

        reasoning.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        reasoning.setText("Primarily fast modeling and reasoning ");
        reasoning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reasoningActionPerformed(evt);
            }
        });

        querying.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        querying.setText("Primarily querying instance data");
        querying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryingActionPerformed(evt);
            }
        });

        rules.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        rules.setText("Modeling alongside a rule-based system");
        rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesActionPerformed(evt);
            }
        });

        thoroughModeling.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        thoroughModeling.setText("Primarily thorough and expressive modeling and reasoning");
        thoroughModeling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoroughModelingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thoroughModeling)
                            .addComponent(rules)
                            .addComponent(querying)
                            .addComponent(reasoning))
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(reasoning)
                .addGap(49, 49, 49)
                .addComponent(querying)
                .addGap(49, 49, 49)
                .addComponent(rules)
                .addGap(49, 49, 49)
                .addComponent(thoroughModeling)
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reasoningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reasoningActionPerformed
        // TODO add your handling code here:
        
        if (reasoning.isSelected())
           candidates.get(1).weighting += 2;
        if (!reasoning.isSelected())
           candidates.get(1).weighting -= 2;
        
    }//GEN-LAST:event_reasoningActionPerformed

    private void queryingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryingActionPerformed
        // TODO add your handling code here:
        if (querying.isSelected())
           candidates.get(2).weighting += 2;
        if (!querying.isSelected())
           candidates.get(2).weighting -= 2;
        
    }//GEN-LAST:event_queryingActionPerformed

    private void rulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesActionPerformed
        // TODO add your handling code here:
        if (rules.isSelected())
           candidates.get(3).weighting += 4;
        if (!rules.isSelected())
           candidates.get(3).weighting -= 4;
    }//GEN-LAST:event_rulesActionPerformed

    private void thoroughModelingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoroughModelingActionPerformed
        // TODO add your handling code here:
        if (thoroughModeling.isSelected())
           candidates.get(0).weighting += 2;
        if (!thoroughModeling.isSelected())
           candidates.get(0).weighting -= 2;
        
    }//GEN-LAST:event_thoroughModelingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox querying;
    private javax.swing.JCheckBox reasoning;
    private javax.swing.JCheckBox rules;
    private javax.swing.JCheckBox thoroughModeling;
    // End of variables declaration//GEN-END:variables
}
