/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import javax.swing.JButton;
//import static javafx.scene.paint.Color.color;
import warriors.Warrior;
import warriorsarena.Game;
/**
 *
 * @author Casa
 */
public final class FormArena extends javax.swing.JFrame {
    
    //Variables declarations:
    //Matrix of JButtons. Each JButton represents a cell of the battle arena:
    private javax.swing.JButton arena[][] = new javax.swing.JButton[6][6];    
    
    //Auxiliary variables, to store clicked JButtons:
    private javax.swing.JButton buttonClicked_1; // = new javax.swing.JButton();
    private javax.swing.JButton buttonClicked_2; // = new javax.swing.JButton();
    
    //ActionListener used for each button:
    private ActionListener actionListener = new ActionListener() {
                    
        @Override
        public void actionPerformed(ActionEvent e) {
            clickButton(e);
        }

    };    
    
    //Variable which stores original text of each JButton (before placing warriors):
    private String[][] emptys = new String[6][6];
            
    
    /**
     * Creates new form FormArena
     */
    public FormArena() {
        initComponents();
       
        
        assignButtonsToMatrix();
        initializeArena();
        
        //Warriors adding:
        Warrior[][] warriors = Game.getWarriors();
        
        Warrior warrior;
        
        //Player 0:
        warrior = warriors[0][0];
        if(warrior != null){
            arena[0][0].setText(warrior.getName());
            arena[0][0].setForeground(Color.BLACK);

        }
        
        warrior = warriors[0][1];
        if(warrior != null){
            arena[3][0].setText(warrior.getName());
        }

        warrior = warriors[0][2];        
        if(warrior != null){
            arena[5][0].setText(warrior.getName());
        }

        //Player 1:
        warrior = warriors[1][0];
        if(warrior != null){
            arena[0][5].setText(warrior.getName());
            arena[0][5].setForeground(Color.BLACK);
        }
        
        warrior = warriors[1][1];
        if(warrior != null){
            arena[3][5].setText(warrior.getName());
        }
        
        warrior = warriors[1][2];
        if(warrior != null){
            arena[5][5].setText(warrior.getName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton39 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton01 = new javax.swing.JButton();
        jButton04 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton05 = new javax.swing.JButton();
        jButton00 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jButton03 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();

        jButton39.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jButton44.setText("-");
        jButton44.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton44.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton44.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton44, gridBagConstraints);

        jButton41.setText("-");
        jButton41.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton41.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton41.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton41, gridBagConstraints);

        jButton45.setText("-");
        jButton45.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton45.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton45.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton45, gridBagConstraints);

        jButton40.setText("-");
        jButton40.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton40.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton40.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton40, gridBagConstraints);

        jButton14.setText("-");
        jButton14.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton14.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton14.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton14, gridBagConstraints);

        jButton11.setText("-");
        jButton11.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton11.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton11.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton11, gridBagConstraints);

        jButton15.setText("-");
        jButton15.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton15.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton15.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton15, gridBagConstraints);

        jButton10.setText("-");
        jButton10.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton10.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton10.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton10, gridBagConstraints);

        jButton24.setText("-");
        jButton24.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton24.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton24.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton24, gridBagConstraints);

        jButton51.setText("-");
        jButton51.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton51.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton51.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton51, gridBagConstraints);

        jButton25.setText("-");
        jButton25.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton25.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton25.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton25, gridBagConstraints);

        jButton01.setText("-");
        jButton01.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton01.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton01.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton01ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton01, gridBagConstraints);

        jButton04.setText("-");
        jButton04.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton04.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton04.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton04ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton04, gridBagConstraints);

        jButton50.setText("-");
        jButton50.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton50.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton50.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton50, gridBagConstraints);

        jButton05.setText("-");
        jButton05.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton05.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton05.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton05ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton05, gridBagConstraints);

        jButton00.setText("00");
        jButton00.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton00.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton00.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton00ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton00, gridBagConstraints);

        jButton42.setText("-");
        jButton42.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton42.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton42.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton42, gridBagConstraints);

        jButton31.setText("-");
        jButton31.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton31.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton31.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton31, gridBagConstraints);

        jButton43.setText("-");
        jButton43.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton43.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton43.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton43, gridBagConstraints);

        jButton30.setText("-");
        jButton30.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton30.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton30.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton30, gridBagConstraints);

        jButton52.setText("-");
        jButton52.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton52.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton52.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton52, gridBagConstraints);

        jButton21.setText("-");
        jButton21.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton21.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton21.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton21, gridBagConstraints);

        jButton53.setText("-");
        jButton53.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton53.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton53.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton53, gridBagConstraints);

        jButton20.setText("-");
        jButton20.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton20.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton20.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton20, gridBagConstraints);

        jButton32.setText("-");
        jButton32.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton32.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton32.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton32, gridBagConstraints);

        jButton33.setText("-");
        jButton33.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton33.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton33.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton33, gridBagConstraints);

        jButton12.setText("-");
        jButton12.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton12.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton12.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton12, gridBagConstraints);

        jButton13.setText("-");
        jButton13.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton13.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton13.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton13, gridBagConstraints);

        jButton22.setText("-");
        jButton22.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton22.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton22.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton22, gridBagConstraints);

        jButton23.setText("-");
        jButton23.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton23.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton23.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton23, gridBagConstraints);

        jButton02.setText("-");
        jButton02.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton02.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton02.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton02ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton02, gridBagConstraints);

        jButton03.setText("-");
        jButton03.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton03.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton03.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton03ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton03, gridBagConstraints);

        jButton34.setText("-");
        jButton34.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton34.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton34.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton34, gridBagConstraints);

        jButton35.setText("-");
        jButton35.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton35.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton35.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton35, gridBagConstraints);

        jButton55.setText("-");
        jButton55.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton55.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton55.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton55, gridBagConstraints);

        jButton54.setText("-");
        jButton54.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton54.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton54.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton54, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton00ActionPerformed
        //cell000.setBackground(java.awt.Color.red);
        //clickButton(evt);
        
    }//GEN-LAST:event_jButton00ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        //cell000.setBackground(java.awt.Color.green);
        //jButton120.setBackground(java.awt.Color.red);
        
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton05ActionPerformed
        //clickButton(evt);// TODO add your handling code here:
    }//GEN-LAST:event_jButton05ActionPerformed

    private void jButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton01ActionPerformed
        //clickButton(evt); // TODO add your handling code here:
    }//GEN-LAST:event_jButton01ActionPerformed

    private void jButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton02ActionPerformed
        //clickButton(evt); // TODO add your handling code here:
    }//GEN-LAST:event_jButton02ActionPerformed

    private void jButton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton03ActionPerformed
        //clickButton(evt); // TODO add your handling code here:
    }//GEN-LAST:event_jButton03ActionPerformed

    private void jButton04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton04ActionPerformed
        //clickButton(evt); // TODO add your handling code here:
    }//GEN-LAST:event_jButton04ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormArena().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton00;
    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton03;
    private javax.swing.JButton jButton04;
    private javax.swing.JButton jButton05;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    // End of variables declaration//GEN-END:variables

    public void clickButton(java.awt.event.ActionEvent actionEvent){
        
        if(buttonClicked_1 == null){
            buttonClicked_1 = (JButton)actionEvent.getSource();
            
            if(!isEmptyButton(buttonClicked_1)){
                buttonClicked_1.setBackground(java.awt.Color.red);                
            } else {
                buttonClicked_1=null;
            }          
                        
            //buttonClicked1.addActionListener(null);

        } else{
        
            //if (buttonClicked_2.equals(buttonClicked_1)){
            buttonClicked_1.setBackground(java.awt.Color.green);
            buttonClicked_1.setForeground(java.awt.Color.green);

            //buttonClicked1 = null;
            //buttonClicked1.addActionListener(actionListener);
            
            buttonClicked_2 = (JButton)actionEvent.getSource();
            //buttonClicked_2.setBackground(java.awt.Color.red); //It will make nothing. It doesn't have time at all.

            if(isEmptyButton(buttonClicked_2)){
                move();            
            } else {
                if(whoIsOwnerOf(buttonClicked_2)!=Game.CURRENT_PLAYER){
                    attack();
                }
                
                
                
//                if(isOwnerOf(buttonClicked_2)){
//                    //nothing happens.
//                } else if (EnemyIsOwnerOf(buttonClicked_2)){
//                    attack();
//                } //else if(isObstacle(buttonClicked_2)){
//                    //can't move there.
//                } else if(isDifficultTerrain(buttonClicked_2)){
//                    moveSlow();
//                }
                
                buttonClicked_1 = null;
                buttonClicked_2 = null;     
            }
            
        } /*else {
            buttonClicked_1=null;
        }*/
        
                
        /*buttonClicked2 = (JButton)actionEvent.getSource();
        
        if(clicked == false){
            //A button is selected.
            clicked = true;
            buttonClicked2.setBackground(java.awt.Color.red);         
        } else {
            //A button is moved or attacks.
            clicked = true;
            buttonClicked2.setBackground(java.awt.Color.green);
            //jButton130 = buttonClickedNew();            
        }
        
        buttonClicked1 = buttonClicked2; */                       
    }
    
    public void assignButtonsToMatrix() {
        
        
//        for(int i=0; i<6; i++){            
//            for(int j=0; j<6; j++){
//
//                arena[i][j] = new JButton();
//            }
//        }
    
        arena[0][0] = jButton00;
        arena[0][1] = jButton01;
        arena[0][2] = jButton02;
        arena[0][3] = jButton03;
        arena[0][4] = jButton04;
        arena[0][5] = jButton05;

        arena[1][0] = jButton10;
        arena[1][1] = jButton11;
        arena[1][2] = jButton12;
        arena[1][3] = jButton13;
        arena[1][4] = jButton14;
        arena[1][5] = jButton15;
        
        arena[2][0] = jButton20;
        arena[2][1] = jButton21;
        arena[2][2] = jButton22;
        arena[2][3] = jButton23;
        arena[2][4] = jButton24;
        arena[2][5] = jButton25;
        
        arena[3][0] = jButton30;
        arena[3][1] = jButton31;
        arena[3][2] = jButton32;
        arena[3][3] = jButton33;
        arena[3][4] = jButton34;
        arena[3][5] = jButton35;
        
        arena[4][0] = jButton40;
        arena[4][1] = jButton41;
        arena[4][2] = jButton42;
        arena[4][3] = jButton43;
        arena[4][4] = jButton44;
        arena[4][5] = jButton45;
        
        arena[5][0] = jButton50;
        arena[5][1] = jButton51;
        arena[5][2] = jButton52;
        arena[5][3] = jButton53;
        arena[5][4] = jButton54;
        arena[5][5] = jButton55; 
    }
    
    public void move(){           
     
        int[] pos1 = buttonPosition(buttonClicked_1);
        int[] pos2 = buttonPosition(buttonClicked_2);

        
        //Checks distance:
        if(distance( pos1, pos2) <= 1){

            buttonClicked_2.setText(buttonClicked_1.getText());        
            buttonClicked_2.setBackground(java.awt.Color.green);
            buttonClicked_2.setForeground(Color.BLACK);

            buttonClicked_1.setText(pos1[0]+""+pos1[1]);    
            buttonClicked_1.setBackground(java.awt.Color.green);

        } else {
            //Distance too far.            
        }       
        
        buttonClicked_1 = null;
        buttonClicked_2 = null;            
    }
    
    public void initializeArena(){

        for(int i=0; i<6; i++){            
            for(int j=0; j<6; j++){
                
                //Initializes arena:
                arena[i][j].addActionListener(actionListener);
                
                arena[i][j].setText(i+""+j);                
                arena[i][j].setBackground(Color.GREEN);      
                arena[i][j].setForeground(Color.GREEN);
                
                //Saves original text of the buttons:
                emptys[i][j] = i+""+j;                
            }
        }        
    }
    
    public int distance(int[] pos1, int[] pos2){
        
        int x1 = pos1[0];
        int y1 = pos1[1];
        int x2 = pos2[0];
        int y2 = pos2[1];               
        
        int powx = (int) Math.pow(x1 - x2, 2);
        int powy = (int) Math.pow(y1 - y2, 2);
        
        int result  = (int) Math.sqrt(powx + powy);
        
        return result;
    }
    
    public int[] buttonPosition(JButton button){
    
        int posx=0;
        int posy=0;
        
        for(int i=0; i<6; i++){            
            for(int j=0; j<6; j++){              
                if(arena[i][j].getText().equals(button.getText())){
                    posx=i; 
                    posy=j;                
                }
            }
        }
        
        int[] res = {posx, posy};
        
        return res;    
    }
    
    private boolean isEmptyButton(JButton button){
       
        int[] pos = buttonPosition(button);        
        
        int posx = pos[0];
        int posy = pos[1];
       
        for(int i=0; i<6; i++){            
            for(int j=0; j<6; j++){              
                if(emptys[i][j].equals(arena[posx][posy].getText())){
                    return true;
                }
            }
        }
        
       return false;
    }

    private boolean isOwnerOf(JButton buttonClicked) {
        
        Warrior[][] warriors = Game.getWarriors();
        
//        int playerWhoIsAsking;
//        
//        
//        if(Game.CURRENT_PLAYER==0){
//            playerWhoIsAsking = 1;
//        } else {
//            playerWhoIsAsking = 0;
//        }
        
        
        for(int i=0; i<6; i++){            
            
            if(warriors[Game.CURRENT_PLAYER][i].getName().equalsIgnoreCase(buttonClicked.getText())){
                return true;
            }
            
        }
        
        return false;
    }
    
        
    private int whoIsOwnerOf(JButton buttonClicked) {
       
        Warrior[][] warriors = Game.getWarriors();
        
        for(int i=0; i<2; i++){            
            for(int j=0; j<6; j++){            
     
                if(warriors[i][j]!=null){
                    if(warriors[i][j].getName().equalsIgnoreCase(buttonClicked.getText())){
                        return i;
                    }
                }
                
            }
        }
                
        return -1; //not found.        
    }    

    private boolean EnemyIsOwnerOf(JButton buttonClicked_2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void attack() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Warrior warrior_1 = warriorOfThisButton(buttonClicked_1);
        Warrior warrior_2 = warriorOfThisButton(buttonClicked_2);
        
        
        int W2L = warrior_2.getLife();        
        W2L--;

        if(W2L <= 0){
            
            buttonClicked_2.setBackground(Color.orange);
            
            
            int[] position_2 = buttonPosition(buttonClicked_2);
            
            String newText = position_2[0]+""+position_2[1];
            
            buttonClicked_2.setText(newText);
            
        } else {            
            warrior_2.setLife(W2L - 1);
        }
    }
    
    
    private Warrior warriorOfThisButton(JButton buttonClicked) {
       
        Warrior[][] warriors = Game.getWarriors();
        
        Warrior result_warrior;
        
        for(int i=0; i<6; i++){            
            for(int j=0; j<6; j++){            

                if(warriors[i][j]!=null){

                    if(warriors[i][j].getName().equalsIgnoreCase(buttonClicked.getText())){
                        result_warrior = warriors[i][j];

                        return result_warrior;
                    }
                    
                }
            }
            
        }
        
        return null;        
    }  

} //CLASS END.
