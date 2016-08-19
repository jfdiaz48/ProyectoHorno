/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Empleado;
import Entidad.Tablahorno;
import Modelo.TablahornoFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author asus
 */
@Named(value = "variablesControlador")
@SessionScoped
public class variablesControlador implements Serializable {

    @Inject
    private TablahornoFacade tablaHornoFacade;
    
    private Tablahorno variables = new Tablahorno();
    
    public variablesControlador() {
    }
    
      public void registrarVariables(Empleado em) {
        
         FacesContext facesContext = FacesContext.getCurrentInstance();
         ExternalContext externalContext = facesContext.getExternalContext();
         Map params = externalContext.getRequestParameterMap();         
         HttpServletRequest httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();
         
         double TermoparCorona1, TermoparCorona2, TermoparCorona3, TOPTP,  TermoparPiso, TermoparGarganta, TermoparFront, OpticaCorona, 
         OpticaMuroGarganta, OpticaTanqueIzquierda, OpticaTanqueDerecha, OpticaCargadero, OpticaFontVidrioEmisividad091, OpticaCanastaIzquierda,
         OpticaCanastaDerecha, OpticaMuroRegeneradorIzquierdo,  OpticaMuroRegeneradorDerecha, PresionInternaDerecha, PresionInternaIzquierda, GasFlow;
         try{
         TermoparCorona1 = Double.parseDouble((String) params.get("termoparcorona1"));
         TermoparCorona2 = Double.parseDouble((String) params.get("termoparcorona2"));
         TermoparCorona3 = Double.parseDouble((String) params.get("termoparcorona3"));
         TOPTP = Double.parseDouble((String) params.get("toptp"));
         TermoparPiso = Double.parseDouble((String) params.get("termoparpiso"));
         TermoparGarganta = Double.parseDouble((String) params.get("termopargarganta"));
         TermoparFront= Double.parseDouble((String) params.get("termoparfront"));
         OpticaCorona = Double.parseDouble((String) params.get("opticacorona"));
         OpticaMuroGarganta = Double.parseDouble((String) params.get("opticamurogarganta"));
         OpticaTanqueIzquierda = Double.parseDouble((String) params.get("opticatanqueizquierda"));
         OpticaTanqueDerecha = Double.parseDouble((String) params.get("opticatanquederecha"));
         OpticaCargadero = Double.parseDouble((String) params.get("opticacargadero"));
         OpticaFontVidrioEmisividad091 = Double.parseDouble((String) params.get("opticafont"));
         OpticaCanastaIzquierda  = Double.parseDouble((String) params.get("opticacanastaizquierda"));
         OpticaCanastaDerecha  = Double.parseDouble((String) params.get("opticacanastaderecha"));
         OpticaMuroRegeneradorIzquierdo = Double.parseDouble((String) params.get("opticamuroregeneradorizquierdo"));
         OpticaMuroRegeneradorDerecha = Double.parseDouble((String) params.get("opticamuroregeneradorderecho"));
         PresionInternaDerecha  = Double.parseDouble((String) params.get("presioninternaderecha"));
         PresionInternaIzquierda  = Double.parseDouble((String) params.get("presioninternaizquierda"));
         GasFlow = Double.parseDouble((String) params.get("gasflow"));
         
         variables.setTermoparCorona1(TermoparCorona1);
         variables.setTermoparCorona2(TermoparCorona2);
         variables.setTermoparCorona3(TermoparCorona3);
         variables.setToptp(TOPTP);
         variables.setTermoparPiso(TermoparPiso);
         variables.setTermoparGarganta(TermoparGarganta);
         variables.setTermoparFront(TermoparFront);
         variables.setOpticaCorona(OpticaCorona);
         variables.setOpticaMuroGarganta(OpticaMuroGarganta);
         variables.setOpticaTanqueIzquierda(OpticaTanqueIzquierda);
         variables.setOpticaTanqueDerecha(OpticaTanqueDerecha);
         variables.setOpticaCargadero(OpticaCargadero);
         variables.setOpticaFontVidrioEmisividad091(OpticaFontVidrioEmisividad091);
         variables.setOpticaCanastaIzquierda(OpticaCanastaIzquierda);
         variables.setOpticaCanastaDerecha(OpticaCanastaDerecha);
         variables.setOpticaMuroRegeneradorIzquierdo(OpticaMuroRegeneradorIzquierdo);
         variables.setOpticaMuroRegeneradorDerecha(OpticaMuroRegeneradorDerecha);
         variables.setPresionInternaDerecha(PresionInternaDerecha);
         variables.setPresionInternaIzquierda(PresionInternaIzquierda);
         variables.setGasFlow(GasFlow);
         variables.setHoraDeRegistro("2:00 pm");
         variables.setFechaDeRegistro(new Date());
         variables.setIdEmpleado(em);
         
         tablaHornoFacade.create(variables);
         
         }catch(Exception e){
             e.printStackTrace();
         }
    }
    
}
