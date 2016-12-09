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
public class IntervalosAbiertosDS implements JRDataSource{

    
    private List<IntervalosAbiertosSetGet> ListaIntervalosAbiertos = 
            new ArrayList<IntervalosAbiertosSetGet>();
    private int IndiceIntervaloAbiertoActual = -1;

    
    @Override
    public boolean next() throws JRException {
    return ++IndiceIntervaloAbiertoActual < ListaIntervalosAbiertos.size();   
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
  
        Object valor = null;  

    if("Iteracion".equals(jrf.getName())) 
    { 
        valor = ListaIntervalosAbiertos.get(IndiceIntervaloAbiertoActual).getIteracion(); 
    } 
    else if("Xi".equals(jrf.getName())) 
    { 
        valor = ListaIntervalosAbiertos.get(IndiceIntervaloAbiertoActual).getXi(); 
    } 
    else if("Et".equals(jrf.getName())) 
    { 
        valor = ListaIntervalosAbiertos.get(IndiceIntervaloAbiertoActual).getEt(); 
    } 
    else if("Ea".equals(jrf.getName())) 
    { 
        valor = ListaIntervalosAbiertos.get(IndiceIntervaloAbiertoActual).getEa(); 
    }
 
    return valor; 
    }
    
    public void addIntervaloAbierto(IntervalosAbiertosSetGet IA)
{
    this.ListaIntervalosAbiertos.add(IA);
}
    
}
