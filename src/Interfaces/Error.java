/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.ImageIcon;

/**
 *
 * @author Reymundo Tenorio
 */
public class Error extends javax.swing.JDialog {

    /**
     * Creates new form Error
     * @param parent
     * @param modal
     */
    public Error(java.awt.Frame parent, boolean modal, String Msj) {
        super(parent, modal);
       
      //  this.setUndecorated(true);
        try{
        // this.setOpacity(0.5F);
        }catch(Exception n){}
      
        initComponents();
        
    this.setTitle(Msj);
    ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Iconos/Bob.gif"));
    LabelGif.setIcon(imageIcon);
    LabelGif.setOpaque(false);
    LabelGif.setSize(500,329);
    this.setSize(500,329);
    this.setResizable(false);
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelGif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Error");

        jPanel1.setLayout(new java.awt.BorderLayout());

        LabelGif.setMaximumSize(new java.awt.Dimension(500, 329));
        LabelGif.setMinimumSize(new java.awt.Dimension(500, 329));
        LabelGif.setPreferredSize(new java.awt.Dimension(500, 329));
        jPanel1.add(LabelGif, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(494, 381));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Error dialog = new Error(new javax.swing.JFrame(), true, "Error");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelGif;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}