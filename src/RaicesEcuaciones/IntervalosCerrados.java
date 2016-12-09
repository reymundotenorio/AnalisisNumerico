package RaicesEcuaciones;

import static Eval.Eval.Eval;
import static Eval.Eval.isParser;
import Graficador.Graficador2D;
import Graficador.GraficadorClasico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ingdonaldo
 */
public class IntervalosCerrados extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();

    public IntervalosCerrados() {
        initComponents();
        Conclusion.setVisible(false);
        setLocationRelativeTo(null);
        dtm.addColumn("# Iteracion");
        dtm.addColumn("Xl");
        dtm.addColumn("Xu");
        dtm.addColumn("Xr");
        dtm.addColumn("f(Xr)");
        dtm.addColumn("f(Xl)f(Xr)");
        dtm.addColumn("Ea(%)");
        jTable1.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Funcion = new javax.swing.JTextField();
        Xl = new javax.swing.JTextField();
        Xu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Ea = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Evaluacion = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        Variable = new javax.swing.JTextField();
        GenerarGrafica = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        Conclusion = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solucion a raices de ecuaciones");

        jLabel1.setText("Funcion");

        jLabel2.setText("Limite Inferior");

        jLabel3.setText("Limite Superior");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Ea(%)");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Metodo de evaluacion");

        Evaluacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Falsa Posicion", "Biseccion" }));

        jLabel7.setText("Variable de la funcion");

        GenerarGrafica.setText("Generar grafica de funcion");

        Conclusion.setColumns(20);
        Conclusion.setRows(5);
        jScrollPane2.setViewportView(Conclusion);

        jCheckBox1.setText("Generar grafica f(xr)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(GenerarGrafica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Funcion, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(Xl)
                            .addComponent(Xu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ea, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Evaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Variable, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Funcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Variable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Xl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Ea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Xu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Evaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(GenerarGrafica)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void Calcular(){
         String funcion = Funcion.getText();
        String val = Variable.getText();
        double xl, xu, xr, xrAnt, FxlFxr, ea;
        try {
            xl = Double.parseDouble(Xl.getText());
            xu = Double.parseDouble(Xu.getText());
            ea = Double.parseDouble(Ea.getText());
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, "Error de caracteres en los limites o en el valor Ea de referencia", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isParser(funcion, val, xl)) {
            JOptionPane.showMessageDialog(null, "Error no se puede evaluar la funcion", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double[] x, y;

        xr = CalculoFalsaPosicion(funcion, xl, xu, val);
        FxlFxr = Eval(funcion, val, xl) * Eval(funcion, val, xr);
        if (GenerarGrafica.isSelected()) {
            GraficadorClasico g = new GraficadorClasico(val);
            g.setVisible(true);
            g.AgregarFuncion(funcion);

        }
        Limpiar();
        dtm.addRow(new Object[]{1, xl, xu, xr, Eval(funcion, val, xr), FxlFxr, "-"});
        int i = 1;
        do {
            i++;
            if (FxlFxr < 0) {
                xu = xr;
            } else if (FxlFxr == 0) {
                return;
            } else if (FxlFxr > 0) {
                xl = xr;
            }

            xrAnt = xr;
            if (this.Evaluacion.getSelectedIndex() == 0) {
                xr = CalculoFalsaPosicion(funcion, xl, xu, val);
            } else {
                xr = CalculoBiseccion(xl, xu);
            }
            FxlFxr = Eval(funcion, val, xl) * Eval(funcion, val, xr);

            dtm.addRow(new Object[]{i, xl, xu, xr, Eval(funcion, val, xr), FxlFxr, Math.abs(CalculoDiferencia(xr, xrAnt))});

        } while (Math.abs(CalculoDiferencia(xr, xrAnt)) >= ea);

        x = new double[i];
        y = new double[i];

        for (int j = dtm.getRowCount()-1; j >= 0; j--) {
            x[j] = Double.parseDouble(dtm.getValueAt(j, 3).toString());
            y[j] = Double.parseDouble(dtm.getValueAt(j, 4).toString());
        }

        Conclusion.setVisible(true);
        Conclusion.setText(Conclu(xr, CalculoDiferencia(xr, xrAnt), dtm.getRowCount()));
        new Graficador2D().Graficador2D("Grafica de f(Xr)","",x,y);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       Calcular();
    }//GEN-LAST:event_jButton1ActionPerformed

    public String Conclu(double xr, double Ea, int it) {

        return "Se encontro el valor buscado " + xr + " a la " + it + " iteracion con un error relativo de " + Ea + " %";
    }

    public void Limpiar() {
        for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
    }

    public double CalculoDiferencia(double va, double vant) {
        return ((va - vant)) / va * 100;
    }

    public double CalculoFalsaPosicion(String Funcion, double Xl, double Xu, String Val) {
        double Xr;

        Xr = Xu - (Eval(Funcion, Val, Xu) * (Xl - Xu) / (Eval(Funcion, Val, Xl) - Eval(Funcion, Val, Xu)));

        return Xr;
    }

    public double CalculoBiseccion(double Xl, double Xu) {
        return (Xl + Xu) / 2;
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(IntervalosCerrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntervalosCerrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntervalosCerrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntervalosCerrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntervalosCerrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Conclusion;
    private javax.swing.JTextField Ea;
    private javax.swing.JComboBox Evaluacion;
    private javax.swing.JTextField Funcion;
    private javax.swing.JCheckBox GenerarGrafica;
    private javax.swing.JTextField Variable;
    private javax.swing.JTextField Xl;
    private javax.swing.JTextField Xu;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
