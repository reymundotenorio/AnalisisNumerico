/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eval;

import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;
import org.lsmp.djep.djep.DJep;
/**
 *
 * @author ingdonaldo
 */
public class Eval {

    /**
     * @param Funcion
     * @param Variable
     * @param valor
     * @return
     */
    public static double Eval(String Funcion, String Variable, double valor) {
        JEP parser = new JEP();

        parser.addStandardConstants();
        parser.addStandardFunctions();
        parser.setImplicitMul(true);
        parser.addVariable(Variable, valor);
        parser.addFunction("sen", new org.nfunk.jep.function.Sine());
        parser.parseExpression(Funcion);

        return parser.getValue();
    }
    
    public static double Eval(String Funcion, String Variable, double valor,String Variable2,double valor2) {
        JEP parser = new JEP();

        parser.addStandardConstants();
        parser.addStandardFunctions();
        parser.setImplicitMul(true);
        parser.addVariable(Variable, valor);
        parser.addVariable(Variable2,valor2);
        parser.parseExpression(Funcion);

        return parser.getValue();
    }
    
    
    
    public static boolean isParser(String Funcion,String Variable, double valor){
        JEP parser = new JEP();

        parser.addStandardConstants();
        parser.addStandardFunctions();

        parser.addVariable(Variable, valor);

        parser.parseExpression(Funcion);

        return parser.hasError();
    }
    
    public static String Derivar(String funcion, String Variable) {
        String derivada = "";
        DJep Derivar = new DJep();
        Derivar.addStandardFunctions();
        Derivar.addStandardConstants();
        Derivar.addComplex();
        Derivar.setAllowUndeclared(true);
        Derivar.setAllowAssignment(true);
        Derivar.setImplicitMul(true);
        Derivar.addStandardDiffRules();
        try {
            Node node = Derivar.parse(funcion);
            Node diff = Derivar.differentiate(node, Variable);
            Node sim = Derivar.simplify(diff);
            derivada = Derivar.toString(sim);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return derivada;
    }
}
