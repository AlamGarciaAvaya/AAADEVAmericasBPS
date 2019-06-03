
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
 *         &lt;element name="idPaciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEspecialidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planSalud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudadResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoConsulta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="diaCita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mesCita" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idPaciente",
    "idEspecialidad",
    "planSalud",
    "nombreUsuario",
    "ciudadResidencia",
    "codigoIPS",
    "tipoConsulta",
    "diaCita",
    "mesCita",
    "idLlamada"
})
@XmlRootElement(name = "ConsultaCitasDisponiblesFecha")
public class ConsultaCitasDisponiblesFecha {

    protected String idPaciente;
    protected String idEspecialidad;
    protected String planSalud;
    protected String nombreUsuario;
    protected String ciudadResidencia;
    protected String codigoIPS;
    protected int tipoConsulta;
    protected int diaCita;
    protected int mesCita;
    protected String idLlamada;

    /**
     * Gets the value of the idPaciente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaciente() {
        return idPaciente;
    }

    /**
     * Sets the value of the idPaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaciente(String value) {
        this.idPaciente = value;
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
     * Gets the value of the nombreUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Sets the value of the nombreUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuario(String value) {
        this.nombreUsuario = value;
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
     * Gets the value of the tipoConsulta property.
     * 
     */
    public int getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Sets the value of the tipoConsulta property.
     * 
     */
    public void setTipoConsulta(int value) {
        this.tipoConsulta = value;
    }

    /**
     * Gets the value of the diaCita property.
     * 
     */
    public int getDiaCita() {
        return diaCita;
    }

    /**
     * Sets the value of the diaCita property.
     * 
     */
    public void setDiaCita(int value) {
        this.diaCita = value;
    }

    /**
     * Gets the value of the mesCita property.
     * 
     */
    public int getMesCita() {
        return mesCita;
    }

    /**
     * Sets the value of the mesCita property.
     * 
     */
    public void setMesCita(int value) {
        this.mesCita = value;
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
