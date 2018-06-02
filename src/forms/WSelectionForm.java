/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.table.DefaultTableModel;
import static sun.audio.AudioPlayer.player;
import warriors.Archer;
import warriors.Warrior;
import warriorsarena.Game;

/**
 *
 * @author Casa
 */
public class WSelectionForm extends javax.swing.JFrame {
    DefaultTableModel model;
    private int player;
    
    /*private int countName1=0;
    private int countName2=0;*/
    
    
    

    public WSelectionForm(int player) {
        initComponents();
        
        this.player=player;
        
        model = (DefaultTableModel) jTable1.getModel();    
        
        if(player==1){        
            jButton1.setText("Swordman");
            jButton2.setText("Archer");
            jButton3.setText("Dwarf");
        }
        else if(player==2){        
            jButton1.setText("Orc");
            jButton2.setText("Barbarian");
            jButton3.setText("Goblin");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        accept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(452, 402));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Attack", "Defense", "AttackDistance", "Distance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        jButton1.setText("Archer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jButton1, gridBagConstraints);

        jButton3.setText("Dwarf");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jButton3, gridBagConstraints);

        jButton2.setText("Swordman");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jPanel1, gridBagConstraints);

        accept.setText("Accept");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        getContentPane().add(accept, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        
        Warrior warrior = Game.addWarrior(player, "archer");
        
        model.addRow(new Object[]{
            warrior.getName(),
            warrior.getType(),
            warrior.getAttack(),
            warrior.getDefense(),
            warrior.getAttackDist(),
            warrior.getDistance()
        });
                
                
        
        /*String name;
        
        if(player==1){            
            name=Warrior.getName(0,countName1);
            countName1++;
                        
            model.addRow(new Object[]{name, "swordman", 1, 1, 1, 1});
            
            Warrior warrior= new Warrior(name, "swordman", 1, 1, 1, 1);                
            Game.addWarrior(warrior, player);
        }
        else{
            name=Warrior.getName(1,countName2);
            countName2++;
            
            model.addRow(new Object[]{name, "orc", 1, 1, 1, 2});

            Warrior warrior= new Warrior(name, "orc", 1, 1, 1, 2);                
            Game.addWarrior(warrior, player);        
        }*/

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //if(player==1){            
            //Archer archer = new Archer("Pepe");
            //model.addRow(new Object[]{name, "archer", 1, 1, 1, 1});
        //}
        //model.addRow(new Object[]{archer.getType(), archer.getAttack(),1,1,1});

        /*String name;
        
        if(player==1){            
            name=Warrior.getName(0,countName1);
            countName1++;
                        
            model.addRow(new Object[]{name, "archer", 1, 1, 1, 1});
            
            Warrior warrior= new Warrior(name, "archer", 1, 1, 1, 1);                
            Game.addWarrior(warrior, player);
        }
        else{
            name=Warrior.getName(1,countName2);
            countName2++;
            
            model.addRow(new Object[]{name, "barbarian", 1, 1, 1, 2});

            Warrior warrior= new Warrior(name, "barbarian", 1, 1, 1, 2);                
            Game.addWarrior(warrior, player);
        }*/        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        /*String name;
        
        if(player==1){            
            name=Warrior.getName(0,countName1);
            countName1++;
                        
            model.addRow(new Object[]{name, "dwarf", 1, 1, 1, 1});
            
            Warrior warrior= new Warrior(name, "dwarf", 1, 1, 1, 1);                
            Game.addWarrior(warrior, player);
        }
        else{
            name=Warrior.getName(1,countName2);
            countName2++;
            
            model.addRow(new Object[]{name, "goblin", 1, 1, 1, 2});

            Warrior warrior= new Warrior(name, "goblin", 1, 1, 1, 2);                
            Game.addWarrior(warrior, player);        
        }*/
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptActionPerformed

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
//            java.util.logging.Logger.getLogger(WSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(WSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(WSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(WSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new WSelectionForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


    public void addWarrior(String typeWarrior, int player){
        
        /*Switc        
        Game.warriors[player-1][0]=;*/
        
        
        
        
        
        
        /*String name;
                
        if(player==1){            
            name=Warrior.getName(0,countName1);
            countName1++;
                        
            model.addRow(new Object[]{name, "swordman", 1, 1, 1, 1});
            
            Warrior warrior= new Warrior(name, "swordman", 1, 1, 1, 1);                
            Game.addWarrior(warrior, player);
        }
        else{
            name=Warrior.getName(1,countName2);
            countName2++;
            
            model.addRow(new Object[]{name, "orc", 1, 1, 1, 2});

            Warrior warrior= new Warrior(name, "orc", 1, 1, 1, 2);                
            Game.addWarrior(warrior, player);        
        }*/

    }   
    
    
    public void createWarrior(){
    }




}