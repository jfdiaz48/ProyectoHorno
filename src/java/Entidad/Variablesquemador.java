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
@Table(name = "variablesquemador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Variablesquemador.findAll", query = "SELECT v FROM Variablesquemador v"),
    @NamedQuery(name = "Variablesquemador.findByIdVariable", query = "SELECT v FROM Variablesquemador v WHERE v.idVariable = :idVariable"),
    @NamedQuery(name = "Variablesquemador.findByToneladas", query = "SELECT v FROM Variablesquemador v WHERE v.toneladas = :toneladas"),
    @NamedQuery(name = "Variablesquemador.findByPorcentajeCapacidad", query = "SELECT v FROM Variablesquemador v WHERE v.porcentajeCapacidad = :porcentajeCapacidad"),
    @NamedQuery(name = "Variablesquemador.findByTempOptica", query = "SELECT v FROM Variablesquemador v WHERE v.tempOptica = :tempOptica"),
    @NamedQuery(name = "Variablesquemador.findByPorcentajeO2Izquierdo", query = "SELECT v FROM Variablesquemador v WHERE v.porcentajeO2Izquierdo = :porcentajeO2Izquierdo"),
    @NamedQuery(name = "Variablesquemador.findByPorcentajeO2Derecho", query = "SELECT v FROM Variablesquemador v WHERE v.porcentajeO2Derecho = :porcentajeO2Derecho"),
    @NamedQuery(name = "Variablesquemador.findByDioxidoCarbonoIzquierdo", query = "SELECT v FROM Variablesquemador v WHERE v.dioxidoCarbonoIzquierdo = :dioxidoCarbonoIzquierdo"),
    @NamedQuery(name = "Variablesquemador.findByDioxidoCarbonoDerecho", query = "SELECT v FROM Variablesquemador v WHERE v.dioxidoCarbonoDerecho = :dioxidoCarbonoDerecho"),
    @NamedQuery(name = "Variablesquemador.findByAreaAnillosIzquierda1", query = "SELECT v FROM Variablesquemador v WHERE v.areaAnillosIzquierda1 = :areaAnillosIzquierda1"),
    @NamedQuery(name = "Variablesquemador.findByAreaAnillosIzquierda2", query = "SELECT v FROM Variablesquemador v WHERE v.areaAnillosIzquierda2 = :areaAnillosIzquierda2"),
    @NamedQuery(name = "Variablesquemador.findByAreaAnillosIzquierda3", query = "SELECT v FROM Variablesquemador v WHERE v.areaAnillosIzquierda3 = :areaAnillosIzquierda3"),
    @NamedQuery(name = "Variablesquemador.findByAreaAnillosIzquierda4", query = "SELECT v FROM Variablesquemador v WHERE v.areaAnillosIzquierda4 = :areaAnillosIzquierda4"),
    @NamedQuery(name = "Variablesquemador.findByAreaAnillosDerecha1", query = "SELECT v FROM Variablesquemador v WHERE v.areaAnillosDerecha1 = :areaAnillosDerecha1"),
    @NamedQuery(name = "Variablesquemador.findByAreaAnillosDerecha2", query = "SELECT v FROM Variablesquemador v WHERE v.areaAnillosDerecha2 = :areaAnillosDerecha2"),
    @NamedQuery(name = "Variablesquemador.findByAreaAnillosDerecha3", query = "SELECT v FROM Variablesquemador v WHERE v.areaAnillosDerecha3 = :areaAnillosDerecha3"),
    @NamedQuery(name = "Variablesquemador.findByAreaAnillosDerecha4", query = "SELECT v FROM Variablesquemador v WHERE v.areaAnillosDerecha4 = :areaAnillosDerecha4"),
    @NamedQuery(name = "Variablesquemador.findByFlujoIzquierda1", query = "SELECT v FROM Variablesquemador v WHERE v.flujoIzquierda1 = :flujoIzquierda1"),
    @NamedQuery(name = "Variablesquemador.findByFlujoIzquierda2", query = "SELECT v FROM Variablesquemador v WHERE v.flujoIzquierda2 = :flujoIzquierda2"),
    @NamedQuery(name = "Variablesquemador.findByFlujoIzquierda3", query = "SELECT v FROM Variablesquemador v WHERE v.flujoIzquierda3 = :flujoIzquierda3"),
    @NamedQuery(name = "Variablesquemador.findByFlujoIzquierda4", query = "SELECT v FROM Variablesquemador v WHERE v.flujoIzquierda4 = :flujoIzquierda4"),
    @NamedQuery(name = "Variablesquemador.findByFlujoDerecha1", query = "SELECT v FROM Variablesquemador v WHERE v.flujoDerecha1 = :flujoDerecha1"),
    @NamedQuery(name = "Variablesquemador.findByFlujoDerecha2", query = "SELECT v FROM Variablesquemador v WHERE v.flujoDerecha2 = :flujoDerecha2"),
    @NamedQuery(name = "Variablesquemador.findByFlujoDerecha3", query = "SELECT v FROM Variablesquemador v WHERE v.flujoDerecha3 = :flujoDerecha3"),
    @NamedQuery(name = "Variablesquemador.findByFlujoDerecha4", query = "SELECT v FROM Variablesquemador v WHERE v.flujoDerecha4 = :flujoDerecha4"),
    @NamedQuery(name = "Variablesquemador.findByPresionP1Izquierda1", query = "SELECT v FROM Variablesquemador v WHERE v.presionP1Izquierda1 = :presionP1Izquierda1"),
    @NamedQuery(name = "Variablesquemador.findByPresionP1Izquierda2", query = "SELECT v FROM Variablesquemador v WHERE v.presionP1Izquierda2 = :presionP1Izquierda2"),
    @NamedQuery(name = "Variablesquemador.findByPresionP1Izquierda3", query = "SELECT v FROM Variablesquemador v WHERE v.presionP1Izquierda3 = :presionP1Izquierda3"),
    @NamedQuery(name = "Variablesquemador.findByPresionP1Izquierda4", query = "SELECT v FROM Variablesquemador v WHERE v.presionP1Izquierda4 = :presionP1Izquierda4"),
    @NamedQuery(name = "Variablesquemador.findByPresionP1Derecha1", query = "SELECT v FROM Variablesquemador v WHERE v.presionP1Derecha1 = :presionP1Derecha1"),
    @NamedQuery(name = "Variablesquemador.findByPresionP1Derecha2", query = "SELECT v FROM Variablesquemador v WHERE v.presionP1Derecha2 = :presionP1Derecha2"),
    @NamedQuery(name = "Variablesquemador.findByPresionP1Derecha3", query = "SELECT v FROM Variablesquemador v WHERE v.presionP1Derecha3 = :presionP1Derecha3"),
    @NamedQuery(name = "Variablesquemador.findByPresionP1Derecha4", query = "SELECT v FROM Variablesquemador v WHERE v.presionP1Derecha4 = :presionP1Derecha4"),
    @NamedQuery(name = "Variablesquemador.findByPresionSalidaSkidIzquierda", query = "SELECT v FROM Variablesquemador v WHERE v.presionSalidaSkidIzquierda = :presionSalidaSkidIzquierda"),
    @NamedQuery(name = "Variablesquemador.findByPresionSalidaSkidDerecha", query = "SELECT v FROM Variablesquemador v WHERE v.presionSalidaSkidDerecha = :presionSalidaSkidDerecha"),
    @NamedQuery(name = "Variablesquemador.findByPorcentajeSalidaValvulaIzquierda", query = "SELECT v FROM Variablesquemador v WHERE v.porcentajeSalidaValvulaIzquierda = :porcentajeSalidaValvulaIzquierda"),
    @NamedQuery(name = "Variablesquemador.findByPorcentajeSalidaValvulaDerecha", query = "SELECT v FROM Variablesquemador v WHERE v.porcentajeSalidaValvulaDerecha = :porcentajeSalidaValvulaDerecha"),
    @NamedQuery(name = "Variablesquemador.findByFlujosGasMscfhIzquierda", query = "SELECT v FROM Variablesquemador v WHERE v.flujosGasMscfhIzquierda = :flujosGasMscfhIzquierda"),
    @NamedQuery(name = "Variablesquemador.findByFlujosGasMscfhDerecha", query = "SELECT v FROM Variablesquemador v WHERE v.flujosGasMscfhDerecha = :flujosGasMscfhDerecha"),
    @NamedQuery(name = "Variablesquemador.findByComentarios", query = "SELECT v FROM Variablesquemador v WHERE v.comentarios = :comentarios"),
    @NamedQuery(name = "Variablesquemador.findByFechaRegistro", query = "SELECT v FROM Variablesquemador v WHERE v.fechaRegistro = :fechaRegistro")})
public class Variablesquemador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVariable")
    private Integer idVariable;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "toneladas")
    private Double toneladas;
    @Size(max = 45)
    @Column(name = "porcentajeCapacidad")
    private String porcentajeCapacidad;
    @Column(name = "tempOptica")
    private Double tempOptica;
    @Size(max = 45)
    @Column(name = "porcentajeO2Izquierdo")
    private String porcentajeO2Izquierdo;
    @Size(max = 45)
    @Column(name = "porcentajeO2Derecho")
    private String porcentajeO2Derecho;
    @Size(max = 45)
    @Column(name = "dioxidoCarbonoIzquierdo")
    private String dioxidoCarbonoIzquierdo;
    @Size(max = 45)
    @Column(name = "dioxidoCarbonoDerecho")
    private String dioxidoCarbonoDerecho;
    @Column(name = "areaAnillosIzquierda1")
    private Double areaAnillosIzquierda1;
    @Column(name = "areaAnillosIzquierda2")
    private Double areaAnillosIzquierda2;
    @Column(name = "areaAnillosIzquierda3")
    private Double areaAnillosIzquierda3;
    @Column(name = "areaAnillosIzquierda4")
    private Double areaAnillosIzquierda4;
    @Column(name = "areaAnillosDerecha1")
    private Double areaAnillosDerecha1;
    @Column(name = "areaAnillosDerecha2")
    private Double areaAnillosDerecha2;
    @Column(name = "areaAnillosDerecha3")
    private Double areaAnillosDerecha3;
    @Column(name = "areaAnillosDerecha4")
    private Double areaAnillosDerecha4;
    @Column(name = "flujoIzquierda1")
    private Double flujoIzquierda1;
    @Column(name = "flujoIzquierda2")
    private Double flujoIzquierda2;
    @Column(name = "flujoIzquierda3")
    private Double flujoIzquierda3;
    @Column(name = "flujoIzquierda4")
    private Double flujoIzquierda4;
    @Column(name = "flujoDerecha1")
    private Double flujoDerecha1;
    @Column(name = "flujoDerecha2")
    private Double flujoDerecha2;
    @Column(name = "flujoDerecha3")
    private Double flujoDerecha3;
    @Column(name = "flujoDerecha4")
    private Double flujoDerecha4;
    @Column(name = "presionP1Izquierda1")
    private Double presionP1Izquierda1;
    @Column(name = "presionP1Izquierda2")
    private Double presionP1Izquierda2;
    @Column(name = "presionP1Izquierda3")
    private Double presionP1Izquierda3;
    @Column(name = "presionP1Izquierda4")
    private Double presionP1Izquierda4;
    @Column(name = "presionP1Derecha1")
    private Double presionP1Derecha1;
    @Column(name = "presionP1Derecha2")
    private Double presionP1Derecha2;
    @Column(name = "presionP1Derecha3")
    private Double presionP1Derecha3;
    @Column(name = "presionP1Derecha4")
    private Double presionP1Derecha4;
    @Column(name = "presionSalidaSkidIzquierda")
    private Double presionSalidaSkidIzquierda;
    @Column(name = "presionSalidaSkidDerecha")
    private Double presionSalidaSkidDerecha;
    @Column(name = "PorcentajeSalidaValvulaIzquierda")
    private Double porcentajeSalidaValvulaIzquierda;
    @Column(name = "PorcentajeSalidaValvulaDerecha")
    private Double porcentajeSalidaValvulaDerecha;
    @Column(name = "flujosGasMscfhIzquierda")
    private Double flujosGasMscfhIzquierda;
    @Column(name = "flujosGasMscfhDerecha")
    private Double flujosGasMscfhDerecha;
    @Size(max = 5000)
    @Column(name = "comentarios")
    private String comentarios;
    @Column(name = "fechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @JoinColumn(name = "quemadorEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne(optional = false)
    private Empleado quemadorEmpleado;

    public Variablesquemador() {
    }

    public Variablesquemador(Integer idVariable) {
        this.idVariable = idVariable;
    }

    public Integer getIdVariable() {
        return idVariable;
    }

    public void setIdVariable(Integer idVariable) {
        this.idVariable = idVariable;
    }

    public Double getToneladas() {
        return toneladas;
    }

    public void setToneladas(Double toneladas) {
        this.toneladas = toneladas;
    }

    public String getPorcentajeCapacidad() {
        return porcentajeCapacidad;
    }

    public void setPorcentajeCapacidad(String porcentajeCapacidad) {
        this.porcentajeCapacidad = porcentajeCapacidad;
    }

    public Double getTempOptica() {
        return tempOptica;
    }

    public void setTempOptica(Double tempOptica) {
        this.tempOptica = tempOptica;
    }

    public String getPorcentajeO2Izquierdo() {
        return porcentajeO2Izquierdo;
    }

    public void setPorcentajeO2Izquierdo(String porcentajeO2Izquierdo) {
        this.porcentajeO2Izquierdo = porcentajeO2Izquierdo;
    }

    public String getPorcentajeO2Derecho() {
        return porcentajeO2Derecho;
    }

    public void setPorcentajeO2Derecho(String porcentajeO2Derecho) {
        this.porcentajeO2Derecho = porcentajeO2Derecho;
    }

    public String getDioxidoCarbonoIzquierdo() {
        return dioxidoCarbonoIzquierdo;
    }

    public void setDioxidoCarbonoIzquierdo(String dioxidoCarbonoIzquierdo) {
        this.dioxidoCarbonoIzquierdo = dioxidoCarbonoIzquierdo;
    }

    public String getDioxidoCarbonoDerecho() {
        return dioxidoCarbonoDerecho;
    }

    public void setDioxidoCarbonoDerecho(String dioxidoCarbonoDerecho) {
        this.dioxidoCarbonoDerecho = dioxidoCarbonoDerecho;
    }

    public Double getAreaAnillosIzquierda1() {
        return areaAnillosIzquierda1;
    }

    public void setAreaAnillosIzquierda1(Double areaAnillosIzquierda1) {
        this.areaAnillosIzquierda1 = areaAnillosIzquierda1;
    }

    public Double getAreaAnillosIzquierda2() {
        return areaAnillosIzquierda2;
    }

    public void setAreaAnillosIzquierda2(Double areaAnillosIzquierda2) {
        this.areaAnillosIzquierda2 = areaAnillosIzquierda2;
    }

    public Double getAreaAnillosIzquierda3() {
        return areaAnillosIzquierda3;
    }

    public void setAreaAnillosIzquierda3(Double areaAnillosIzquierda3) {
        this.areaAnillosIzquierda3 = areaAnillosIzquierda3;
    }

    public Double getAreaAnillosIzquierda4() {
        return areaAnillosIzquierda4;
    }

    public void setAreaAnillosIzquierda4(Double areaAnillosIzquierda4) {
        this.areaAnillosIzquierda4 = areaAnillosIzquierda4;
    }

    public Double getAreaAnillosDerecha1() {
        return areaAnillosDerecha1;
    }

    public void setAreaAnillosDerecha1(Double areaAnillosDerecha1) {
        this.areaAnillosDerecha1 = areaAnillosDerecha1;
    }

    public Double getAreaAnillosDerecha2() {
        return areaAnillosDerecha2;
    }

    public void setAreaAnillosDerecha2(Double areaAnillosDerecha2) {
        this.areaAnillosDerecha2 = areaAnillosDerecha2;
    }

    public Double getAreaAnillosDerecha3() {
        return areaAnillosDerecha3;
    }

    public void setAreaAnillosDerecha3(Double areaAnillosDerecha3) {
        this.areaAnillosDerecha3 = areaAnillosDerecha3;
    }

    public Double getAreaAnillosDerecha4() {
        return areaAnillosDerecha4;
    }

    public void setAreaAnillosDerecha4(Double areaAnillosDerecha4) {
        this.areaAnillosDerecha4 = areaAnillosDerecha4;
    }

    public Double getFlujoIzquierda1() {
        return flujoIzquierda1;
    }

    public void setFlujoIzquierda1(Double flujoIzquierda1) {
        this.flujoIzquierda1 = flujoIzquierda1;
    }

    public Double getFlujoIzquierda2() {
        return flujoIzquierda2;
    }

    public void setFlujoIzquierda2(Double flujoIzquierda2) {
        this.flujoIzquierda2 = flujoIzquierda2;
    }

    public Double getFlujoIzquierda3() {
        return flujoIzquierda3;
    }

    public void setFlujoIzquierda3(Double flujoIzquierda3) {
        this.flujoIzquierda3 = flujoIzquierda3;
    }

    public Double getFlujoIzquierda4() {
        return flujoIzquierda4;
    }

    public void setFlujoIzquierda4(Double flujoIzquierda4) {
        this.flujoIzquierda4 = flujoIzquierda4;
    }

    public Double getFlujoDerecha1() {
        return flujoDerecha1;
    }

    public void setFlujoDerecha1(Double flujoDerecha1) {
        this.flujoDerecha1 = flujoDerecha1;
    }

    public Double getFlujoDerecha2() {
        return flujoDerecha2;
    }

    public void setFlujoDerecha2(Double flujoDerecha2) {
        this.flujoDerecha2 = flujoDerecha2;
    }

    public Double getFlujoDerecha3() {
        return flujoDerecha3;
    }

    public void setFlujoDerecha3(Double flujoDerecha3) {
        this.flujoDerecha3 = flujoDerecha3;
    }

    public Double getFlujoDerecha4() {
        return flujoDerecha4;
    }

    public void setFlujoDerecha4(Double flujoDerecha4) {
        this.flujoDerecha4 = flujoDerecha4;
    }

    public Double getPresionP1Izquierda1() {
        return presionP1Izquierda1;
    }

    public void setPresionP1Izquierda1(Double presionP1Izquierda1) {
        this.presionP1Izquierda1 = presionP1Izquierda1;
    }

    public Double getPresionP1Izquierda2() {
        return presionP1Izquierda2;
    }

    public void setPresionP1Izquierda2(Double presionP1Izquierda2) {
        this.presionP1Izquierda2 = presionP1Izquierda2;
    }

    public Double getPresionP1Izquierda3() {
        return presionP1Izquierda3;
    }

    public void setPresionP1Izquierda3(Double presionP1Izquierda3) {
        this.presionP1Izquierda3 = presionP1Izquierda3;
    }

    public Double getPresionP1Izquierda4() {
        return presionP1Izquierda4;
    }

    public void setPresionP1Izquierda4(Double presionP1Izquierda4) {
        this.presionP1Izquierda4 = presionP1Izquierda4;
    }

    public Double getPresionP1Derecha1() {
        return presionP1Derecha1;
    }

    public void setPresionP1Derecha1(Double presionP1Derecha1) {
        this.presionP1Derecha1 = presionP1Derecha1;
    }

    public Double getPresionP1Derecha2() {
        return presionP1Derecha2;
    }

    public void setPresionP1Derecha2(Double presionP1Derecha2) {
        this.presionP1Derecha2 = presionP1Derecha2;
    }

    public Double getPresionP1Derecha3() {
        return presionP1Derecha3;
    }

    public void setPresionP1Derecha3(Double presionP1Derecha3) {
        this.presionP1Derecha3 = presionP1Derecha3;
    }

    public Double getPresionP1Derecha4() {
        return presionP1Derecha4;
    }

    public void setPresionP1Derecha4(Double presionP1Derecha4) {
        this.presionP1Derecha4 = presionP1Derecha4;
    }

    public Double getPresionSalidaSkidIzquierda() {
        return presionSalidaSkidIzquierda;
    }

    public void setPresionSalidaSkidIzquierda(Double presionSalidaSkidIzquierda) {
        this.presionSalidaSkidIzquierda = presionSalidaSkidIzquierda;
    }

    public Double getPresionSalidaSkidDerecha() {
        return presionSalidaSkidDerecha;
    }

    public void setPresionSalidaSkidDerecha(Double presionSalidaSkidDerecha) {
        this.presionSalidaSkidDerecha = presionSalidaSkidDerecha;
    }

    public Double getPorcentajeSalidaValvulaIzquierda() {
        return porcentajeSalidaValvulaIzquierda;
    }

    public void setPorcentajeSalidaValvulaIzquierda(Double porcentajeSalidaValvulaIzquierda) {
        this.porcentajeSalidaValvulaIzquierda = porcentajeSalidaValvulaIzquierda;
    }

    public Double getPorcentajeSalidaValvulaDerecha() {
        return porcentajeSalidaValvulaDerecha;
    }

    public void setPorcentajeSalidaValvulaDerecha(Double porcentajeSalidaValvulaDerecha) {
        this.porcentajeSalidaValvulaDerecha = porcentajeSalidaValvulaDerecha;
    }

    public Double getFlujosGasMscfhIzquierda() {
        return flujosGasMscfhIzquierda;
    }

    public void setFlujosGasMscfhIzquierda(Double flujosGasMscfhIzquierda) {
        this.flujosGasMscfhIzquierda = flujosGasMscfhIzquierda;
    }

    public Double getFlujosGasMscfhDerecha() {
        return flujosGasMscfhDerecha;
    }

    public void setFlujosGasMscfhDerecha(Double flujosGasMscfhDerecha) {
        this.flujosGasMscfhDerecha = flujosGasMscfhDerecha;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Empleado getQuemadorEmpleado() {
        return quemadorEmpleado;
    }

    public void setQuemadorEmpleado(Empleado quemadorEmpleado) {
        this.quemadorEmpleado = quemadorEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVariable != null ? idVariable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Variablesquemador)) {
            return false;
        }
        Variablesquemador other = (Variablesquemador) object;
        if ((this.idVariable == null && other.idVariable != null) || (this.idVariable != null && !this.idVariable.equals(other.idVariable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Variablesquemador[ idVariable=" + idVariable + " ]";
    }
    
}
