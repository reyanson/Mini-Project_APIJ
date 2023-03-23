/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.app.component;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author reyanson
 */
public class Chat_Item extends javax.swing.JLayeredPane {

    /**
     * Creates new form Chat_Item
     */
    private JLabel label;
    
    public Chat_Item() {
        initComponents();
        txt.setEditable(false);
        txt.setBackground(new Color(0,0,0,0));
        txt.setOpaque(false);
    }
    
    public void setText(String text){
        txt.setText(text);
    }
    
    public void setTime(String time){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0)); 
        layer.setBorder(new EmptyBorder(0,5,10,5));
        label = new JLabel(time);
        
        label.setForeground(new Color(110,110,110));
        label.setHorizontalTextPosition(JLabel.LEFT);
        layer.add(label);
        add(label);
    }
    
    public void sendSuccess(){
        if(label != null){
                label.setIcon(new ImageIcon(getClass().getResource("/com/app/icon/tick.png")));
        }
    }
    
    public void seen(){
        if(label != null){
                label.setIcon(new ImageIcon(getClass().getResource("/com/app/icon/double_tick.png")));
        }
    }
    

    
    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new com.app.swing.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 5, 10));
        txt.setMinimumSize(new java.awt.Dimension(21, 36));
        txt.setRequestFocusEnabled(false);
        txt.setSelectionColor(new java.awt.Color(94, 190, 255));
        add(txt);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.app.swing.JIMSendTextPane txt;
    // End of variables declaration//GEN-END:variables
}
