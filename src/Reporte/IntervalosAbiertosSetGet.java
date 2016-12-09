/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

/**
 *
 * @author Reymundo Tenorio
 */
public class IntervalosAbiertosSetGet {
    
    private String Iteracion;
    private String Xi;
    private String Et;

    public IntervalosAbiertosSetGet() {
    }

    public IntervalosAbiertosSetGet(String Iteracion, String Xi, String Et, String Ea) {
        this.Iteracion = Iteracion;
        this.Xi = Xi;
        this.Et = Et;
        this.Ea = Ea;
    }
    private String Ea;

    public String getIteracion() {
        return Iteracion;
    }

    public void setIteracion(String Iteracion) {
        this.Iteracion = Iteracion;
    }

    public String getXi() {
        return Xi;
    }

    public void setXi(String Xi) {
        this.Xi = Xi;
    }

    public String getEt() {
        return Et;
    }

    public void setEt(String Et) {
        this.Et = Et;
    }

    public String getEa() {
        return Ea;
    }

    public void setEa(String Ea) {
        this.Ea = Ea;
    }
    
    
    
}
