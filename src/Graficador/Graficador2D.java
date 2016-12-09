/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficador;

import static Eval.Eval.Eval;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static org.math.array.DoubleArray.increment;
import org.math.plot.Plot2DPanel;

/**
 *
 * @author ingdonaldo
 */
public class Graficador2D {

    public static void main(String[] args) {
//        List<String> l = new ArrayList<>();
//        l.add("x+1");
//        l.add("2");
//        Graficador2D(l, "x", 0, 20);
    }

    JPanel PanelGrafica;
    
    
    public void Graficador2D(List<String> Funcion, String Variable, double a, double b) {
        try {

            Plot2DPanel grafica2d = new Plot2DPanel("SOUTH");

            for (String funcion : Funcion) {

                double[] x = increment(a, 0.01, b);
                double[] y = f(x, funcion, Variable);

                grafica2d.addLinePlot(funcion, x, y);

            }
            
             
            JFrame frame = new JFrame("Grafica");
            frame.setSize(500, 500);
            frame.setContentPane(grafica2d);
            frame.setVisible(true);
            this.PanelGrafica = grafica2d;
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            
           
            
        } catch (NullPointerException np) {
        }
    }

    public JPanel getPanelGrafica() {
        return PanelGrafica;
    }

    
    public void Graficador2D(String titulo,String funcion, double[] x, double[] y) {
        Plot2DPanel grafica2d = new Plot2DPanel("SOUTH");
        grafica2d.addLinePlot(funcion, x, y);
        JFrame frame = new JFrame(titulo);
        frame.setSize(500, 500);
        frame.setContentPane(grafica2d);
        frame.setVisible(true);
        this.PanelGrafica = grafica2d;
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
     
    }

    public double[] f(double[] x, String funcion, String variable) {
        double[] y = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = Eval(funcion, variable, x[i]);
        }

        return y;
    }

}
