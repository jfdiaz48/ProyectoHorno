/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Empleado;
import Entidad.Tablahorno;
import Modelo.EmpleadoFacade;
import Modelo.TablahornoFacade;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
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
@Named(value = "usuarioControlador")
@SessionScoped
public class usuarioControlador implements Serializable {

    @Inject
    private EmpleadoFacade empleadoFacade;

    @Inject
    private TablahornoFacade tablaHornoFacade;

    private List<Empleado> empleados = new ArrayList<>();

    private Empleado empleado;

    private Tablahorno tablaHorno;

    private Empleado usuarioLog;

    public usuarioControlador() {

    }

    public void login() throws IOException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        Map params = externalContext.getRequestParameterMap();
        HttpServletRequest httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        try {
            boolean autenticacion = false;
            int documento = Integer.parseInt((String) params.get("documento"));
            String clave = (String) params.get("clave");
            empleados = empleadoFacade.findAll();
            for (int i = 0; i < empleados.size(); i++) {
                if (empleados.get(i).getIdEmpleado() == documento && empleados.get(i).getClave().equals(clave)) {
                    httpServletRequest.getSession().setAttribute("UsuarioLog", empleados.get(i));
                    facesContext.getExternalContext().redirect("/ProyectoHorno/modUsuario/principalUsuario.xhtml");
                    autenticacion = true;
                    usuarioLog = empleados.get(i);
                }
            }
            if (autenticacion == false) {
                facesContext.getExternalContext().redirect("/ProyectoHorno/");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cerrarSesion() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpServletRequest httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        try {
            facesContext.getExternalContext().redirect("/ProyectoHorno/");
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void validarSesion() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpServletRequest httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        try {
            if (httpServletRequest.getSession().getAttribute("UsuarioLog") != null) {
            } else {
                facesContext.getExternalContext().redirect("/ProyectoHorno/");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado getUsuarioLog() {
        return usuarioLog;
    }

    public void setUsuarioLog(Empleado usuarioLog) {
        this.usuarioLog = usuarioLog;
    }

}
