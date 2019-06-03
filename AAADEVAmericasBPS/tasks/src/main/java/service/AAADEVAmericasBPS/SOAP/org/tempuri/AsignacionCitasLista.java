
package service.AAADEVAmericasBPS.SOAP.org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEspecialidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAfiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudadResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoAfiliado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tieneCita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCodigoIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planSalud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="citaDirecta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idLlamada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idCita",
    "idEspecialidad",
    "numeroIdentificacion",
    "idAfiliado",
    "ciudadResidencia",
    "estadoAfiliado",
    "tieneCita",
    "codigoIPS",
    "subCodigoIPS",
    "planSalud",
    "citaDirecta",
    "idLlamada"
})
@XmlRootElement(name = "AsignacionCitasLista")
public class AsignacionCitasLista {

    protected String idCita;
    protected String idEspecialidad;
    protected String numeroIdentificacion;
    protected String idAfiliado;
    protected String ciudadResidencia;
    protected int estadoAfiliado;
    protected int tieneCita;
    protected String codigoIPS;
    protected String subCodigoIPS;
    protected String planSalud;
    protected int citaDirecta;
    protected String idLlamada;

    /**
     * Gets the value of the idCita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCita() {
        return idCita;
    }

    /**
     * Sets the value of the idCita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCita(String value) {
        this.idCita = value;
    }

    /**
     * Gets the value of the idEspecialidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    /**
     * Sets the value of the idEspecialidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEspecialidad(String value) {
        this.idEspecialidad = value;
    }

    /**
     * Gets the value of the numeroIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Sets the value of the numeroIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacion(String value) {
        this.numeroIdentificacion = value;
    }

    /**
     * Gets the value of the idAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAfiliado() {
        return idAfiliado;
    }

    /**
     * Sets the value of the idAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAfiliado(String value) {
        this.idAfiliado = value;
    }

    /**
     * Gets the value of the ciudadResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    /**
     * Sets the value of the ciudadResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadResidencia(String value) {
        this.ciudadResidencia = value;
    }

    /**
     * Gets the value of the estadoAfiliado property.
     * 
     */
    public int getEstadoAfiliado() {
        return estadoAfiliado;
    }

    /**
     * Sets the value of the estadoAfiliado property.
     * 
     */
    public void setEstadoAfiliado(int value) {
        this.estadoAfiliado = value;
    }

    /**
     * Gets the value of the tieneCita property.
     * 
     */
    public int getTieneCita() {
        return tieneCita;
    }

    /**
     * Sets the value of the tieneCita property.
     * 
     */
    public void setTieneCita(int value) {
        this.tieneCita = value;
    }

    /**
     * Gets the value of the codigoIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIPS() {
        return codigoIPS;
    }

    /**
     * Sets the value of the codigoIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIPS(String value) {
        this.codigoIPS = value;
    }

    /**
     * Gets the value of the subCodigoIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCodigoIPS() {
        return subCodigoIPS;
    }

    /**
     * Sets the value of the subCodigoIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCodigoIPS(String value) {
        this.subCodigoIPS = value;
    }

    /**
     * Gets the value of the planSalud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanSalud() {
        return planSalud;
    }

    /**
     * Sets the value of the planSalud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanSalud(String value) {
        this.planSalud = value;
    }

    /**
     * Gets the value of the citaDirecta property.
     * 
     */
    public int getCitaDirecta() {
        return citaDirecta;
    }

    /**
     * Sets the value of the citaDirecta property.
     * 
     */
    public void setCitaDirecta(int value) {
        this.citaDirecta = value;
    }

    /**
     * Gets the value of the idLlamada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLlamada() {
        return idLlamada;
    }

    /**
     * Sets the value of the idLlamada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLlamada(String value) {
        this.idLlamada = value;
    }

}
