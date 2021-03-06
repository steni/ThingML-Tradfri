/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thingml.tradfri.ui;

import org.json.JSONException;
import org.thingml.tradfri.LightBulb;
import org.thingml.tradfri.TradfriBulbListener;
import org.thingml.tradfri.TradfriConstants;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franck
 */
public class BulbPanel extends javax.swing.JPanel implements TradfriBulbListener {

    protected LightBulb bulb;
    protected boolean updating = true;
    /**
     * Creates new form BulbPanel
     */
    public BulbPanel(LightBulb bulb) {
        this.bulb = bulb;
        bulb.addLightBulbListener(this);
        initComponents();
        updatePanelContent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTemperature = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jTextFieldName = new javax.swing.JTextField();
        jRadioCold = new javax.swing.JRadioButton();
        jRadioNormal = new javax.swing.JRadioButton();
        jRadioWarm = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelDates = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(32767, 89));
        setMinimumSize(new java.awt.Dimension(0, 89));

        jToggleButton1.setText("On / Off");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Intensity :");

        jSlider1.setMaximum(255);
        jSlider1.setMinimum(1);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jTextFieldName.setEditable(false);
        jTextFieldName.setText("[Not Connected]");

        buttonGroupTemperature.add(jRadioCold);
        jRadioCold.setText("Cold");
        jRadioCold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioColdActionPerformed(evt);
            }
        });

        buttonGroupTemperature.add(jRadioNormal);
        jRadioNormal.setText("Normal");
        jRadioNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNormalActionPerformed(evt);
            }
        });

        buttonGroupTemperature.add(jRadioWarm);
        jRadioWarm.setText("Warm");
        jRadioWarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioWarmActionPerformed(evt);
            }
        });

        jLabel2.setText("Name :");

        jLabelDates.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelDates.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDates.setText("Installed: Unknown - Last seen: Unknown - Firmware: Unknown");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton1.setText("GET");
        jButton1.setMaximumSize(new java.awt.Dimension(56, 18));
        jButton1.setMinimumSize(new java.awt.Dimension(56, 18));
        jButton1.setPreferredSize(new java.awt.Dimension(56, 18));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton2.setText("SET");
        jButton2.setMaximumSize(new java.awt.Dimension(56, 18));
        jButton2.setMinimumSize(new java.awt.Dimension(56, 18));
        jButton2.setPreferredSize(new java.awt.Dimension(56, 18));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Color");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioWarm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioNormal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioCold))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioCold)
                        .addComponent(jRadioNormal)
                        .addComponent(jRadioWarm)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDates)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (updating) return;
        bulb.setOn(jToggleButton1.isSelected());
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        if (updating) return;
        if (jSlider1.getValueIsAdjusting()) return;
        bulb.setIntensity(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void jRadioWarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioWarmActionPerformed
        if (updating) return;
        bulb.setColor(TradfriConstants.COLOR_WARM);
    }//GEN-LAST:event_jRadioWarmActionPerformed

    private void jRadioNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNormalActionPerformed
        if (updating) return;
        bulb.setColor(TradfriConstants.COLOR_NORMAL);
    }//GEN-LAST:event_jRadioNormalActionPerformed

    private void jRadioColdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioColdActionPerformed
        if (updating) return;
        bulb.setColor(TradfriConstants.COLOR_COLD);
    }//GEN-LAST:event_jRadioColdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            //JOptionPane pane = new JOptionPane();
            //pane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = new JDialog((Frame)null, "Result of COAP GET for bulb " + bulb.getName(), false);
            JTextArea msg = new JTextArea(bulb.getJsonObject().toString(4) + "\n");
            msg.setFont(new Font("monospaced", Font.PLAIN, 10));
            msg.setLineWrap(true);
            msg.setWrapStyleWord(true);
            JScrollPane scrollPane = new JScrollPane(msg);
            
            dialog.getContentPane().add(scrollPane);
            dialog.setSize(350, 350);
            //dialog.pack();
            dialog.setVisible(true);
            
            
        } catch (JSONException ex) {
            Logger.getLogger(BulbPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    protected String previous_put = "";
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String put = JOptionPane.showInputDialog(this, "JSON to SET for bulb " + bulb.getName(), previous_put);
        if (put != null) {
            previous_put = put;
            bulb.sendJSONPayload(put);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Color c = JColorChooser.showDialog(null, "Choose a color", Color.WHITE);
        if (c != null) {
            bulb.setRGBColor(c.getRed(), c.getGreen(), c.getBlue());
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTemperature;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDates;
    private javax.swing.JRadioButton jRadioCold;
    private javax.swing.JRadioButton jRadioNormal;
    private javax.swing.JRadioButton jRadioWarm;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    protected void updatePanelContent() {
        updating = true;
        jTextFieldName.setText(bulb.getName());
        jTextFieldName.setToolTipText(bulb.getType());
        jSlider1.setValue(bulb.getIntensity());
        jToggleButton1.setSelected(bulb.isOn());
        if (bulb.getColor() != null) {
            jRadioCold.setEnabled(true);
            jRadioNormal.setEnabled(true);
            jRadioWarm.setEnabled(true);
            switch(bulb.getColor()) {
                case TradfriConstants.COLOR_NORMAL: jRadioNormal.setSelected(true); break;
                case TradfriConstants.COLOR_WARM: jRadioWarm.setSelected(true); break;
                case TradfriConstants.COLOR_COLD: jRadioCold.setSelected(true); break;
            }
        }
        else {
            jRadioCold.setEnabled(false);
            jRadioNormal.setEnabled(false);
            jRadioWarm.setEnabled(false);
        }
        
        
        if (bulb.isOnline()) {
            jToggleButton1.setEnabled(true);
            jRadioCold.setEnabled(true);
            jRadioNormal.setEnabled(true);
            jRadioWarm.setEnabled(true);
            jSlider1.setEnabled(true);
            jLabelDates.setText("Installed: "+bulb.getDateInstalled()+" - Last seen: "+bulb.getDateLastSeen()+" - Firmware: " + bulb.getFirmware() + " [online]");
        }
        else {
            jToggleButton1.setEnabled(false);
            jRadioCold.setEnabled(false);
            jRadioNormal.setEnabled(false);
            jRadioWarm.setEnabled(false);
            jSlider1.setEnabled(false);
            jLabelDates.setText("Installed: "+bulb.getDateInstalled()+" - Last seen: "+bulb.getDateLastSeen()+" - Firmware: " + bulb.getFirmware() + " [offline]");
        }
        
        updating = false;
    }
    
    public void bulb_state_changed(LightBulb bulb) {
        if (this.bulb == bulb)  updatePanelContent();
    }
}
