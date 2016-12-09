/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

/**
 *
 * @author reymundo
 */
public class IntervalosCerradosSetGet {
    
    private String Iteracion;
    private String Xl;
    private String Xu;
    private String Xr;
    private String FXr;
    private String FXlFXr;
    private String Ea;

    public IntervalosCerradosSetGet() {
    }

    public IntervalosCerradosSetGet(String Iteracion, String Xl, String Xu, String Xr, String FXr, String FXrFXl, String Ea) {
        this.Iteracion = Iteracion;
        this.Xl = Xl;
        this.Xu = Xu;
        this.Xr = Xr;
        this.FXr = FXr;
        this.FXlFXr = FXrFXl;
        this.Ea = Ea;
    }

    public String getIteracion() {
        return Iteracion;
    }

    public void setIteracion(String Iteracion) {
        this.Iteracion = Iteracion;
    }

    public String getXl() {
        return Xl;
    }

    public void setXl(String Xl) {
        this.Xl = Xl;
    }

    public String getXu() {
        return Xu;
    }

    public void setXu(String Xu) {
        this.Xu = Xu;
    }

    public String getXr() {
        return Xr;
    }

    public void setXr(String Xr) {
        this.Xr = Xr;
    }

    public String getFXr() {
        return FXr;
    }

    public void setFXr(String FXr) {
        this.FXr = FXr;
    }

    public String getFXrFXl() {
        return FXlFXr;
    }

    public void setFXrFXl(String FXrFXl) {
        this.FXlFXr = FXrFXl;
    }

    public String getEa() {
        return Ea;
    }

    public void setEa(String Ea) {
        this.Ea = Ea;
    }
    
    
}
