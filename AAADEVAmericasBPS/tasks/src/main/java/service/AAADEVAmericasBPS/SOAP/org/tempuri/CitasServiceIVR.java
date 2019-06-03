
package service.AAADEVAmericasBPS.SOAP.org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CitasServiceIVR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CitasServiceIVR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="especialidadCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicoCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCodigoIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitasServiceIVR", propOrder = {
    "idCita",
    "especialidadCita",
    "diaCita",
    "fechaCita",
    "horaCita",
    "unidadCita",
    "medicoCita",
    "codigoIPS",
    "subCodigoIPS",
    "direccion"
})
public class CitasServiceIVR {

    protected String idCita;
    protected String especialidadCita;
    protected String diaCita;
    protected String fechaCita;
    protected String horaCita;
    protected String unidadCita;
    protected String medicoCita;
    protected String codigoIPS;
    protected String subCodigoIPS;
    @XmlElement(name = "Direccion")
    protected String direccion;

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
     * Gets the value of the especialidadCita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecialidadCita() {
        return especialidadCita;
    }

    /**
     * Sets the value of the especialidadCita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecialidadCita(String value) {
        this.especialidadCita = value;
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

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

}
