/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Reymundo Tenorio
 */
public class IntervalosCerradosDS implements JRDataSource{

    
    private List<IntervalosCerradosSetGet> ListaIntervalosCerrados = 
            new ArrayList<IntervalosCerradosSetGet>();
    private int IndiceIntervaloAbiertoActual = -1;

    
    @Override
    public boolean next() throws JRException {
    return ++IndiceIntervaloAbiertoActual < ListaIntervalosCerrados.size();   
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
  
        Object valor = null;  

    if("Iteracion".equals(jrf.getName())) 
    { 
        valor = ListaIntervalosCerrados.get(IndiceIntervaloAbiertoActual).getIteracion(); 
    } 
    else if("Xl".equals(jrf.getName())) 
    {
        valor = ListaIntervalosCerrados.get(IndiceIntervaloAbiertoActual).getXl(); 
    } 
    else if("Xu".equals(jrf.getName())) 
    { 
        valor = ListaIntervalosCerrados.get(IndiceIntervaloAbiertoActual).getXu(); 
    } 
    else if("Xr".equals(jrf.getName())) 
    { 
        valor = ListaIntervalosCerrados.get(IndiceIntervaloAbiertoActual).getXr(); 
    } 
    else if("f(Xr)".equals(jrf.getName())) 
    { 
        valor = ListaIntervalosCerrados.get(IndiceIntervaloAbiertoActual).getFXr(); 
    } 
    else if("f(Xl) f(Xr)".equals(jrf.getName())) 
    { 
        valor = ListaIntervalosCerrados.get(IndiceIntervaloAbiertoActual).getFXrFXl(); 
    } 
    else if("Ea".equals(jrf.getName())) 
    { 
        valor = ListaIntervalosCerrados.get(IndiceIntervaloAbiertoActual).getEa(); 
    }
 
    return valor; 
    }
    
    public void addIntervaloCerrado(IntervalosCerradosSetGet IA)
{
    this.ListaIntervalosCerrados.add(IA);
}
    
}
