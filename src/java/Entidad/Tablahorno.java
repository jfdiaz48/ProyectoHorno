/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "tablahorno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tablahorno.findAll", query = "SELECT t FROM Tablahorno t"),
    @NamedQuery(name = "Tablahorno.findByIdTablaHorno", query = "SELECT t FROM Tablahorno t WHERE t.idTablaHorno = :idTablaHorno"),
    @NamedQuery(name = "Tablahorno.findByTermoparCorona1", query = "SELECT t FROM Tablahorno t WHERE t.termoparCorona1 = :termoparCorona1"),
    @NamedQuery(name = "Tablahorno.findByTermoparCorona2", query = "SELECT t FROM Tablahorno t WHERE t.termoparCorona2 = :termoparCorona2"),
    @NamedQuery(name = "Tablahorno.findByTermoparCorona3", query = "SELECT t FROM Tablahorno t WHERE t.termoparCorona3 = :termoparCorona3"),
    @NamedQuery(name = "Tablahorno.findByToptp", query = "SELECT t FROM Tablahorno t WHERE t.toptp = :toptp"),
    @NamedQuery(name = "Tablahorno.findByTermoparPiso", query = "SELECT t FROM Tablahorno t WHERE t.termoparPiso = :termoparPiso"),
    @NamedQuery(name = "Tablahorno.findByTermoparGarganta", query = "SELECT t FROM Tablahorno t WHERE t.termoparGarganta = :termoparGarganta"),
    @NamedQuery(name = "Tablahorno.findByTermoparFront", query = "SELECT t FROM Tablahorno t WHERE t.termoparFront = :termoparFront"),
    @NamedQuery(name = "Tablahorno.findByOpticaCorona", query = "SELECT t FROM Tablahorno t WHERE t.opticaCorona = :opticaCorona"),
    @NamedQuery(name = "Tablahorno.findByOpticaMuroGarganta", query = "SELECT t FROM Tablahorno t WHERE t.opticaMuroGarganta = :opticaMuroGarganta"),
    @NamedQuery(name = "Tablahorno.findByOpticaTanqueIzquierda", query = "SELECT t FROM Tablahorno t WHERE t.opticaTanqueIzquierda = :opticaTanqueIzquierda"),
    @NamedQuery(name = "Tablahorno.findByOpticaTanqueDerecha", query = "SELECT t FROM Tablahorno t WHERE t.opticaTanqueDerecha = :opticaTanqueDerecha"),
    @NamedQuery(name = "Tablahorno.findByOpticaCargadero", query = "SELECT t FROM Tablahorno t WHERE t.opticaCargadero = :opticaCargadero"),
    @NamedQuery(name = "Tablahorno.findByOpticaFontVidrioEmisividad091", query = "SELECT t FROM Tablahorno t WHERE t.opticaFontVidrioEmisividad091 = :opticaFontVidrioEmisividad091"),
    @NamedQuery(name = "Tablahorno.findByOpticaCanastaIzquierda", query = "SELECT t FROM Tablahorno t WHERE t.opticaCanastaIzquierda = :opticaCanastaIzquierda"),
    @NamedQuery(name = "Tablahorno.findByOpticaCanastaDerecha", query = "SELECT t FROM Tablahorno t WHERE t.opticaCanastaDerecha = :opticaCanastaDerecha"),
    @NamedQuery(name = "Tablahorno.findByOpticaMuroRegeneradorIzquierdo", query = "SELECT t FROM Tablahorno t WHERE t.opticaMuroRegeneradorIzquierdo = :opticaMuroRegeneradorIzquierdo"),
    @NamedQuery(name = "Tablahorno.findByOpticaMuroRegeneradorDerecha", query = "SELECT t FROM Tablahorno t WHERE t.opticaMuroRegeneradorDerecha = :opticaMuroRegeneradorDerecha"),
    @NamedQuery(name = "Tablahorno.findByPresionInternaDerecha", query = "SELECT t FROM Tablahorno t WHERE t.presionInternaDerecha = :presionInternaDerecha"),
    @NamedQuery(name = "Tablahorno.findByPresionInternaIzquierda", query = "SELECT t FROM Tablahorno t WHERE t.presionInternaIzquierda = :presionInternaIzquierda"),
    @NamedQuery(name = "Tablahorno.findByGasFlow", query = "SELECT t FROM Tablahorno t WHERE t.gasFlow = :gasFlow"),
    @NamedQuery(name = "Tablahorno.findByHoraDeRegistro", query = "SELECT t FROM Tablahorno t WHERE t.horaDeRegistro = :horaDeRegistro"),
    @NamedQuery(name = "Tablahorno.findByFechaDeRegistro", query = "SELECT t FROM Tablahorno t WHERE t.fechaDeRegistro = :fechaDeRegistro")})
public class Tablahorno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTablaHorno")
    private Integer idTablaHorno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TermoparCorona1")
    private Double termoparCorona1;
    @Column(name = "TermoparCorona2")
    private Double termoparCorona2;
    @Column(name = "TermoparCorona3")
    private Double termoparCorona3;
    @Column(name = "TOPTP")
    private Double toptp;
    @Column(name = "TermoparPiso")
    private Double termoparPiso;
    @Column(name = "TermoparGarganta")
    private Double termoparGarganta;
    @Column(name = "TermoparFront")
    private Double termoparFront;
    @Column(name = "OpticaCorona")
    private Double opticaCorona;
    @Column(name = "OpticaMuroGarganta")
    private Double opticaMuroGarganta;
    @Column(name = "OpticaTanqueIzquierda")
    private Double opticaTanqueIzquierda;
    @Column(name = "OpticaTanqueDerecha")
    private Double opticaTanqueDerecha;
    @Column(name = "OpticaCargadero")
    private Double opticaCargadero;
    @Column(name = "OpticaFontVidrioEmisividad091")
    private Double opticaFontVidrioEmisividad091;
    @Column(name = "OpticaCanastaIzquierda")
    private Double opticaCanastaIzquierda;
    @Column(name = "OpticaCanastaDerecha")
    private Double opticaCanastaDerecha;
    @Column(name = "OpticaMuroRegeneradorIzquierdo")
    private Double opticaMuroRegeneradorIzquierdo;
    @Column(name = "OpticaMuroRegeneradorDerecha")
    private Double opticaMuroRegeneradorDerecha;
    @Column(name = "PresionInternaDerecha")
    private Double presionInternaDerecha;
    @Column(name = "PresionInternaIzquierda")
    private Double presionInternaIzquierda;
    @Column(name = "GasFlow")
    private Double gasFlow;
    @Size(max = 45)
    @Column(name = "horaDeRegistro")
    private String horaDeRegistro;
    @Column(name = "fechaDeRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaDeRegistro;
    @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne
    private Empleado idEmpleado;

    public Tablahorno() {
    }

    public Tablahorno(Integer idTablaHorno) {
        this.idTablaHorno = idTablaHorno;
    }

    public Integer getIdTablaHorno() {
        return idTablaHorno;
    }

    public void setIdTablaHorno(Integer idTablaHorno) {
        this.idTablaHorno = idTablaHorno;
    }

    public Double getTermoparCorona1() {
        return termoparCorona1;
    }

    public void setTermoparCorona1(Double termoparCorona1) {
        this.termoparCorona1 = termoparCorona1;
    }

    public Double getTermoparCorona2() {
        return termoparCorona2;
    }

    public void setTermoparCorona2(Double termoparCorona2) {
        this.termoparCorona2 = termoparCorona2;
    }

    public Double getTermoparCorona3() {
        return termoparCorona3;
    }

    public void setTermoparCorona3(Double termoparCorona3) {
        this.termoparCorona3 = termoparCorona3;
    }

    public Double getToptp() {
        return toptp;
    }

    public void setToptp(Double toptp) {
        this.toptp = toptp;
    }

    public Double getTermoparPiso() {
        return termoparPiso;
    }

    public void setTermoparPiso(Double termoparPiso) {
        this.termoparPiso = termoparPiso;
    }

    public Double getTermoparGarganta() {
        return termoparGarganta;
    }

    public void setTermoparGarganta(Double termoparGarganta) {
        this.termoparGarganta = termoparGarganta;
    }

    public Double getTermoparFront() {
        return termoparFront;
    }

    public void setTermoparFront(Double termoparFront) {
        this.termoparFront = termoparFront;
    }

    public Double getOpticaCorona() {
        return opticaCorona;
    }

    public void setOpticaCorona(Double opticaCorona) {
        this.opticaCorona = opticaCorona;
    }

    public Double getOpticaMuroGarganta() {
        return opticaMuroGarganta;
    }

    public void setOpticaMuroGarganta(Double opticaMuroGarganta) {
        this.opticaMuroGarganta = opticaMuroGarganta;
    }

    public Double getOpticaTanqueIzquierda() {
        return opticaTanqueIzquierda;
    }

    public void setOpticaTanqueIzquierda(Double opticaTanqueIzquierda) {
        this.opticaTanqueIzquierda = opticaTanqueIzquierda;
    }

    public Double getOpticaTanqueDerecha() {
        return opticaTanqueDerecha;
    }

    public void setOpticaTanqueDerecha(Double opticaTanqueDerecha) {
        this.opticaTanqueDerecha = opticaTanqueDerecha;
    }

    public Double getOpticaCargadero() {
        return opticaCargadero;
    }

    public void setOpticaCargadero(Double opticaCargadero) {
        this.opticaCargadero = opticaCargadero;
    }

    public Double getOpticaFontVidrioEmisividad091() {
        return opticaFontVidrioEmisividad091;
    }

    public void setOpticaFontVidrioEmisividad091(Double opticaFontVidrioEmisividad091) {
        this.opticaFontVidrioEmisividad091 = opticaFontVidrioEmisividad091;
    }

    public Double getOpticaCanastaIzquierda() {
        return opticaCanastaIzquierda;
    }

    public void setOpticaCanastaIzquierda(Double opticaCanastaIzquierda) {
        this.opticaCanastaIzquierda = opticaCanastaIzquierda;
    }

    public Double getOpticaCanastaDerecha() {
        return opticaCanastaDerecha;
    }

    public void setOpticaCanastaDerecha(Double opticaCanastaDerecha) {
        this.opticaCanastaDerecha = opticaCanastaDerecha;
    }

    public Double getOpticaMuroRegeneradorIzquierdo() {
        return opticaMuroRegeneradorIzquierdo;
    }

    public void setOpticaMuroRegeneradorIzquierdo(Double opticaMuroRegeneradorIzquierdo) {
        this.opticaMuroRegeneradorIzquierdo = opticaMuroRegeneradorIzquierdo;
    }

    public Double getOpticaMuroRegeneradorDerecha() {
        return opticaMuroRegeneradorDerecha;
    }

    public void setOpticaMuroRegeneradorDerecha(Double opticaMuroRegeneradorDerecha) {
        this.opticaMuroRegeneradorDerecha = opticaMuroRegeneradorDerecha;
    }

    public Double getPresionInternaDerecha() {
        return presionInternaDerecha;
    }

    public void setPresionInternaDerecha(Double presionInternaDerecha) {
        this.presionInternaDerecha = presionInternaDerecha;
    }

    public Double getPresionInternaIzquierda() {
        return presionInternaIzquierda;
    }

    public void setPresionInternaIzquierda(Double presionInternaIzquierda) {
        this.presionInternaIzquierda = presionInternaIzquierda;
    }

    public Double getGasFlow() {
        return gasFlow;
    }

    public void setGasFlow(Double gasFlow) {
        this.gasFlow = gasFlow;
    }

    public String getHoraDeRegistro() {
        return horaDeRegistro;
    }

    public void setHoraDeRegistro(String horaDeRegistro) {
        this.horaDeRegistro = horaDeRegistro;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTablaHorno != null ? idTablaHorno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tablahorno)) {
            return false;
        }
        Tablahorno other = (Tablahorno) object;
        if ((this.idTablaHorno == null && other.idTablaHorno != null) || (this.idTablaHorno != null && !this.idTablaHorno.equals(other.idTablaHorno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Tablahorno[ idTablaHorno=" + idTablaHorno + " ]";
    }
    
}
