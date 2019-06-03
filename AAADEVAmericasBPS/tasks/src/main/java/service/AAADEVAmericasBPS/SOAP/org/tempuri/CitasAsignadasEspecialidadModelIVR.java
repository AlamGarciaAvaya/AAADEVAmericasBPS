
package service.AAADEVAmericasBPS.SOAP.org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CitasAsignadasEspecialidadModelIVR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CitasAsignadasEspecialidadModelIVR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoRTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensajeRTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCitas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicoCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCodigoIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitasAsignadasEspecialidadModelIVR", propOrder = {
    "codigoRTA",
    "mensajeRTA",
    "numeroCitas",
    "idCita",
    "diaCita",
    "fechaCita",
    "horaCita",
    "unidadCita",
    "medicoCita",
    "codigoIPS",
    "subCodigoIPS"
})
public class CitasAsignadasEspecialidadModelIVR {

    protected String codigoRTA;
    protected String mensajeRTA;
    protected String numeroCitas;
    protected String idCita;
    protected String diaCita;
    protected String fechaCita;
    protected String horaCita;
    protected String unidadCita;
    protected String medicoCita;
    protected String codigoIPS;
    protected String subCodigoIPS;

    /**
     * Gets the value of the codigoRTA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRTA() {
        return codigoRTA;
    }

    /**
     * Sets the value of the codigoRTA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRTA(String value) {
        this.codigoRTA = value;
    }

    /**
     * Gets the value of the mensajeRTA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeRTA() {
        return mensajeRTA;
    }

    /**
     * Sets the value of the mensajeRTA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeRTA(String value) {
        this.mensajeRTA = value;
    }

    /**
     * Gets the value of the numeroCitas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCitas() {
        return numeroCitas;
    }

    /**
     * Sets the value of the numeroCitas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCitas(String value) {
        this.numeroCitas = value;
    }

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
     * Gets the value of the diaCita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaCita() {
        return diaCita;
    }

    /**
     * Sets the value of the diaCita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaCita(String value) {
        this.diaCita = value;
    }

    /**
     * Gets the value of the fechaCita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCita() {
        return fechaCita;
    }

    /**
     * Sets the value of the fechaCita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCita(String value) {
        this.fechaCita = value;
    }

    /**
     * Gets the value of the horaCita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraCita() {
        return horaCita;
    }

    /**
     * Sets the value of the horaCita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraCita(String value) {
        this.horaCita = value;
    }

    /**
     * Gets the value of the unidadCita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadCita() {
        return unidadCita;
    }

    /**
     * Sets the value of the unidadCita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadCita(String value) {
        this.unidadCita = value;
    }

    /**
     * Gets the value of the medicoCita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicoCita() {
        return medicoCita;
    }

    /**
     * Sets the value of the medicoCita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicoCita(String value) {
        this.medicoCita = value;
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

}
