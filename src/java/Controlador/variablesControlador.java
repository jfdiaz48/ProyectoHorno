/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Empleado;
import Entidad.*;
import Modelo.*;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

    @Inject
    private VariablesquemadorFacade variablesQuemadorFacade;

    @Inject
    private EmpleadoFacade empleadoFacade;

    private List<Empleado> empleados = new ArrayList<>();

    private Empleado empleado;

    private Tablahorno variables = new Tablahorno();

    private double numero;

    private Variablesquemador variablesQuemador = new Variablesquemador();

    private Variablesquemador variablesQuemadorLog = new Variablesquemador();

    private Variablesquemador variblesQuemadorEditar = new Variablesquemador();

    private List<Variablesquemador> registros = new ArrayList<>();

    private Variablesquemador variablesQuemadorModal = new Variablesquemador();

    private int estadoTabla1, estadoEdicion;

    private int estadoTabla;

    private List<Variablesquemador> variablesQuemadorRango = new ArrayList<>();

    private String vistaActual;

    public variablesControlador() {

    }

    public void registrarVariables(Empleado em) {

        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        Map params = externalContext.getRequestParameterMap();
        HttpServletRequest httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        double TermoparCorona1, TermoparCorona2, TermoparCorona3, TOPTP, TermoparPiso, TermoparGarganta, TermoparFront, OpticaCorona,
                OpticaMuroGarganta, OpticaTanqueIzquierda, OpticaTanqueDerecha, OpticaCargadero, OpticaFontVidrioEmisividad091, OpticaCanastaIzquierda,
                OpticaCanastaDerecha, OpticaMuroRegeneradorIzquierdo, OpticaMuroRegeneradorDerecha, PresionInternaDerecha, PresionInternaIzquierda, GasFlow;
        try {

            TermoparCorona1 = Double.parseDouble((String) params.get("termoparcorona1"));
            TermoparCorona2 = Double.parseDouble((String) params.get("termoparcorona2"));
            TermoparCorona3 = Double.parseDouble((String) params.get("termoparcorona3"));
            TOPTP = Double.parseDouble((String) params.get("toptp"));
            TermoparPiso = Double.parseDouble((String) params.get("termoparpiso"));
            TermoparGarganta = Double.parseDouble((String) params.get("termopargarganta"));
            TermoparFront = Double.parseDouble((String) params.get("termoparfront"));
            OpticaCorona = Double.parseDouble((String) params.get("opticacorona"));
            OpticaMuroGarganta = Double.parseDouble((String) params.get("opticamurogarganta"));
            OpticaTanqueIzquierda = Double.parseDouble((String) params.get("opticatanqueizquierda"));
            OpticaTanqueDerecha = Double.parseDouble((String) params.get("opticatanquederecha"));
            OpticaCargadero = Double.parseDouble((String) params.get("opticacargadero"));
            OpticaFontVidrioEmisividad091 = Double.parseDouble((String) params.get("opticafont"));
            OpticaCanastaIzquierda = Double.parseDouble((String) params.get("opticacanastaizquierda"));
            OpticaCanastaDerecha = Double.parseDouble((String) params.get("opticacanastaderecha"));
            OpticaMuroRegeneradorIzquierdo = Double.parseDouble((String) params.get("opticamuroregeneradorizquierdo"));
            OpticaMuroRegeneradorDerecha = Double.parseDouble((String) params.get("opticamuroregeneradorderecho"));
            PresionInternaDerecha = Double.parseDouble((String) params.get("presioninternaderecha"));
            PresionInternaIzquierda = Double.parseDouble((String) params.get("presioninternaizquierda"));
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void registrarVariablesQuemador() {

        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        Map params = externalContext.getRequestParameterMap();
        HttpServletRequest httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        try {
            numero = Double.parseDouble((String) params.get("toneladas"));
            numero = numero * 0.0066666666666667;
            numero = numero * 100;
            numero = Math.round(numero);
            Empleado emp = new Empleado();
            emp = empleadoFacade.find(Integer.parseInt((String) params.get("para")));
            variablesQuemador.setToneladas(Double.parseDouble((String) params.get("toneladas")));
            variablesQuemador.setTempOptica(Double.parseDouble((String) params.get("temperaturaOptica")));
            variablesQuemador.setPorcentajeO2Izquierdo((String) params.get("porcentajeo2izquierdo"));
            variablesQuemador.setPorcentajeO2Derecho((String) params.get("porcentajeo2derecho"));
            variablesQuemador.setDioxidoCarbonoIzquierdo((String) params.get("co2izquierdo"));
            variablesQuemador.setDioxidoCarbonoDerecho((String) params.get("co2derecho"));
            variablesQuemador.setAreaAnillosIzquierda1(Double.parseDouble((String) params.get("areaAnillos1")));
            variablesQuemador.setAreaAnillosIzquierda2(Double.parseDouble((String) params.get("areaAnillos2")));
            variablesQuemador.setAreaAnillosIzquierda3(Double.parseDouble((String) params.get("areaAnillos3")));
            variablesQuemador.setAreaAnillosIzquierda4(Double.parseDouble((String) params.get("areaAnillos4")));
            variablesQuemador.setAreaAnillosDerecha1(Double.parseDouble((String) params.get("areaAnillos5")));
            variablesQuemador.setAreaAnillosDerecha2(Double.parseDouble((String) params.get("areaAnillos6")));
            variablesQuemador.setAreaAnillosDerecha3(Double.parseDouble((String) params.get("areaAnillos7")));
            variablesQuemador.setAreaAnillosDerecha4(Double.parseDouble((String) params.get("areaAnillos8")));
            variablesQuemador.setFlujoIzquierda1(Double.parseDouble((String) params.get("flujo1")));
            variablesQuemador.setFlujoIzquierda2(Double.parseDouble((String) params.get("flujo2")));
            variablesQuemador.setFlujoIzquierda3(Double.parseDouble((String) params.get("flujo3")));
            variablesQuemador.setFlujoIzquierda4(Double.parseDouble((String) params.get("flujo4")));
            variablesQuemador.setFlujoDerecha1(Double.parseDouble((String) params.get("flujo5")));
            variablesQuemador.setFlujoDerecha2(Double.parseDouble((String) params.get("flujo6")));
            variablesQuemador.setFlujoDerecha3(Double.parseDouble((String) params.get("flujo7")));
            variablesQuemador.setFlujoDerecha4(Double.parseDouble((String) params.get("flujo8")));
            variablesQuemador.setPresionP1Izquierda1(Double.parseDouble((String) params.get("presionp1psig1")));
            variablesQuemador.setPresionP1Izquierda2(Double.parseDouble((String) params.get("presionp1psig2")));
            variablesQuemador.setPresionP1Izquierda3(Double.parseDouble((String) params.get("presionp1psig3")));
            variablesQuemador.setPresionP1Izquierda4(Double.parseDouble((String) params.get("presionp1psig4")));
            variablesQuemador.setPresionP1Derecha1(Double.parseDouble((String) params.get("presionp1psig5")));
            variablesQuemador.setPresionP1Derecha2(Double.parseDouble((String) params.get("presionp1psig6")));
            variablesQuemador.setPresionP1Derecha3(Double.parseDouble((String) params.get("presionp1psig7")));
            variablesQuemador.setPresionP1Derecha4(Double.parseDouble((String) params.get("presionp1psig8")));
            variablesQuemador.setPresionSalidaSkidIzquierda(Double.parseDouble((String) params.get("presionsalidagas1")));
            variablesQuemador.setPresionSalidaSkidDerecha(Double.parseDouble((String) params.get("presionsalidagas2")));
            variablesQuemador.setPorcentajeSalidaValvulaIzquierda(Double.parseDouble((String) params.get("salidavalv1")));
            variablesQuemador.setPorcentajeSalidaValvulaDerecha(Double.parseDouble((String) params.get("salidavalv2")));
            variablesQuemador.setFlujosGasMscfhIzquierda(Double.parseDouble((String) params.get("flujogas1")));
            variablesQuemador.setFlujosGasMscfhDerecha(Double.parseDouble((String) params.get("flujogas2")));
            variablesQuemador.setFechaRegistro(new Date());
            variablesQuemador.setFechaDeRegistroBuscar(new Date());
            variablesQuemador.setQuemadorEmpleado(emp);
            variablesQuemador.setPorcentajeCapacidad("" + numero + " %");
            variablesQuemador.setComentarios((String) params.get("comentario"));
            variablesQuemadorFacade.create(variablesQuemador);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void generarReporte() throws ParseException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        Map params = externalContext.getRequestParameterMap();
        HttpServletRequest httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String hora3 = ((String) params.get("fecha2"));

        Date lol = new Date();

        Date fechaReporte = new Date();
        fechaReporte = (Date) format.parse(hora3);
        String prueba = "" + fechaReporte.getYear() + fechaReporte.getMonth() + fechaReporte.getDay();
        List<Variablesquemador> variablesQuemador = new ArrayList<>();
        variablesQuemador = variablesQuemadorFacade.findAll();
        for (int i = 0; i < variablesQuemador.size(); i++) {

            String prueba2 = "" + variablesQuemador.get(i).getFechaDeRegistroBuscar().getYear() + variablesQuemador.get(i).getFechaDeRegistroBuscar().getMonth() + variablesQuemador.get(i).getFechaDeRegistroBuscar().getDay();

            if (prueba.equals(prueba2)) {

                variablesQuemadorLog = variablesQuemador.get(i);
                estadoTabla = 1;

            }
        }

    }

    public void generarReportesEntreFechas() throws ParseException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        Map params = externalContext.getRequestParameterMap();
        HttpServletRequest httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String fechaUno = ((String) params.get("fecha1"));
        String fechaDos = ((String) params.get("fecha2"));

        //variablesQuemadorRango = null;
        try {
            Date fecha1 = format.parse(fechaUno);
            Date fecha2 = format.parse(fechaDos);

            List<Variablesquemador> variablesQuemador = new ArrayList<>();
            variablesQuemador = variablesQuemadorFacade.findAll();
            List<Variablesquemador> variablesQuemadorAlmacenar = new ArrayList<>();

            for (int i = 0; i < variablesQuemador.size(); i++) {
                if (variablesQuemador.get(i).getFechaDeRegistroBuscar().equals(fecha1) || variablesQuemador.get(i).getFechaDeRegistroBuscar().equals(fecha2)) {
                    variablesQuemadorAlmacenar.add(variablesQuemador.get(i));
                }
                if (variablesQuemador.get(i).getFechaDeRegistroBuscar().after(fecha1) && variablesQuemador.get(i).getFechaDeRegistroBuscar().before(fecha2)) {
                    variablesQuemadorAlmacenar.add(variablesQuemador.get(i));
                }
            }
            if (variablesQuemadorAlmacenar.size() >= 1) {
                variablesQuemadorRango = variablesQuemadorAlmacenar;
                estadoTabla1 = 1;
            } else {
                variablesQuemadorRango = null;
                estadoTabla1 = 2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarVariableQuemador() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        Map params = externalContext.getRequestParameterMap();
        HttpServletRequest httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        try {
            numero = Double.parseDouble((String) params.get("toneladas"));
            numero = numero * 0.0066666666666667;
            numero = numero * 100;
            numero = Math.round(numero);
            Empleado emp = new Empleado();
            if ((String) params.get("para") == null) {

            } else {
                emp = empleadoFacade.find(Integer.parseInt((String) params.get("para")));
            }
            variblesQuemadorEditar.setToneladas(Double.parseDouble((String) params.get("toneladas")));
            variblesQuemadorEditar.setTempOptica(Double.parseDouble((String) params.get("temperaturaOptica")));
            variblesQuemadorEditar.setPorcentajeO2Izquierdo((String) params.get("porcentajeo2izquierdo"));
            variblesQuemadorEditar.setPorcentajeO2Derecho((String) params.get("porcentajeo2derecho"));
            variblesQuemadorEditar.setDioxidoCarbonoIzquierdo((String) params.get("co2izquierdo"));
            variblesQuemadorEditar.setDioxidoCarbonoDerecho((String) params.get("co2derecho"));
            variblesQuemadorEditar.setAreaAnillosIzquierda1(Double.parseDouble((String) params.get("areaAnillos1")));
            variblesQuemadorEditar.setAreaAnillosIzquierda2(Double.parseDouble((String) params.get("areaAnillos2")));
            variblesQuemadorEditar.setAreaAnillosIzquierda3(Double.parseDouble((String) params.get("areaAnillos3")));
            variblesQuemadorEditar.setAreaAnillosIzquierda4(Double.parseDouble((String) params.get("areaAnillos4")));
            variblesQuemadorEditar.setAreaAnillosDerecha1(Double.parseDouble((String) params.get("areaAnillos5")));
            variblesQuemadorEditar.setAreaAnillosDerecha2(Double.parseDouble((String) params.get("areaAnillos6")));
            variblesQuemadorEditar.setAreaAnillosDerecha3(Double.parseDouble((String) params.get("areaAnillos7")));
            variblesQuemadorEditar.setAreaAnillosDerecha4(Double.parseDouble((String) params.get("areaAnillos8")));
            variblesQuemadorEditar.setFlujoIzquierda1(Double.parseDouble((String) params.get("flujo1")));
            variblesQuemadorEditar.setFlujoIzquierda2(Double.parseDouble((String) params.get("flujo2")));
            variblesQuemadorEditar.setFlujoIzquierda3(Double.parseDouble((String) params.get("flujo3")));
            variblesQuemadorEditar.setFlujoIzquierda4(Double.parseDouble((String) params.get("flujo4")));
            variblesQuemadorEditar.setFlujoDerecha1(Double.parseDouble((String) params.get("flujo5")));
            variblesQuemadorEditar.setFlujoDerecha2(Double.parseDouble((String) params.get("flujo6")));
            variblesQuemadorEditar.setFlujoDerecha3(Double.parseDouble((String) params.get("flujo7")));
            variblesQuemadorEditar.setFlujoDerecha4(Double.parseDouble((String) params.get("flujo8")));
            variblesQuemadorEditar.setPresionP1Izquierda1(Double.parseDouble((String) params.get("presionp1psig1")));
            variblesQuemadorEditar.setPresionP1Izquierda2(Double.parseDouble((String) params.get("presionp1psig2")));
            variblesQuemadorEditar.setPresionP1Izquierda3(Double.parseDouble((String) params.get("presionp1psig3")));
            variblesQuemadorEditar.setPresionP1Izquierda4(Double.parseDouble((String) params.get("presionp1psig4")));
            variblesQuemadorEditar.setPresionP1Derecha1(Double.parseDouble((String) params.get("presionp1psig5")));
            variblesQuemadorEditar.setPresionP1Derecha2(Double.parseDouble((String) params.get("presionp1psig6")));
            variblesQuemadorEditar.setPresionP1Derecha3(Double.parseDouble((String) params.get("presionp1psig7")));
            variblesQuemadorEditar.setPresionP1Derecha4(Double.parseDouble((String) params.get("presionp1psig8")));
            variblesQuemadorEditar.setPresionSalidaSkidIzquierda(Double.parseDouble((String) params.get("presionsalidagas1")));
            variblesQuemadorEditar.setPresionSalidaSkidDerecha(Double.parseDouble((String) params.get("presionsalidagas2")));
            variblesQuemadorEditar.setPorcentajeSalidaValvulaIzquierda(Double.parseDouble((String) params.get("salidavalv1")));
            variblesQuemadorEditar.setPorcentajeSalidaValvulaDerecha(Double.parseDouble((String) params.get("salidavalv2")));
            variblesQuemadorEditar.setFlujosGasMscfhIzquierda(Double.parseDouble((String) params.get("flujogas1")));
            variblesQuemadorEditar.setFlujosGasMscfhDerecha(Double.parseDouble((String) params.get("flujogas2")));
            variblesQuemadorEditar.setFechaRegistro(new Date());
            variblesQuemadorEditar.setFechaDeRegistroBuscar(new Date());
            if ((String) params.get("para") == null) {

            } else {
                variblesQuemadorEditar.setQuemadorEmpleado(emp);
            }
            variblesQuemadorEditar.setPorcentajeCapacidad("" + numero + " %");
            variblesQuemadorEditar.setComentarios((String) params.get("comentario"));
            if (variablesQuemadorFacade.find(variblesQuemadorEditar.getIdVariable()) == variblesQuemadorEditar) {
                estadoEdicion = 3;
            }else{
            variablesQuemadorFacade.edit(variblesQuemadorEditar);
            estadoEdicion = 1;}
        } catch (Exception e) {
            e.printStackTrace();
            estadoEdicion = 2;
        }
    }

    public String cargarAtributoEditar(Variablesquemador variable) {
        variblesQuemadorEditar = variable;
        if (estadoEdicion != 0) {
            estadoEdicion = 0;
        }
        return "editarRegistro.xhtml";
    }

    public void cargarAtributo(Variablesquemador variable) {
        variablesQuemadorModal = variable;
    }

    public List<Variablesquemador> todosRegistros() {
        registros = variablesQuemadorFacade.findAll();
        return registros;
    }

    public List<Variablesquemador> getVariablesQuemadorRango() {
        return variablesQuemadorRango;
    }

    public void setVariablesQuemadorRango(List<Variablesquemador> variablesQuemadorRango) {
        this.variablesQuemadorRango = variablesQuemadorRango;
    }

    public Variablesquemador getVariablesQuemadorLog() {
        return variablesQuemadorLog;
    }

    public void setVariablesQuemadorLog(Variablesquemador variablesQuemadorLog) {
        this.variablesQuemadorLog = variablesQuemadorLog;
    }

    public int getEstadoTabla1() {
        return estadoTabla1;
    }

    public void setEstadoTabla1(int estadoTabla) {
        this.estadoTabla1 = estadoTabla;
    }

    public int getEstadoTabla() {
        return estadoTabla;
    }

    public void setEstadoTabla(int estadoTabla) {
        this.estadoTabla = estadoTabla;
    }

    public List<Variablesquemador> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Variablesquemador> registros) {
        this.registros = registros;
    }

    public Variablesquemador getVariablesQuemadorModal() {
        return variablesQuemadorModal;
    }

    public void setVariablesQuemadorModal(Variablesquemador variablesQuemadorModal) {
        this.variablesQuemadorModal = variablesQuemadorModal;
    }

    public Variablesquemador getVariblesQuemadorEditar() {
        return variblesQuemadorEditar;
    }

    public void setVariblesQuemadorEditar(Variablesquemador variblesQuemadorEditar) {
        this.variblesQuemadorEditar = variblesQuemadorEditar;
    }

    public String getVistaActual() {
        return vistaActual;
    }

    public void setVistaActual(String vistaActual) {
        this.vistaActual = vistaActual;
    }

    public int getEstadoEdicion() {
        return estadoEdicion;
    }

    public void setEstadoEdicion(int estadoEdicion) {
        this.estadoEdicion = estadoEdicion;
    }

}
