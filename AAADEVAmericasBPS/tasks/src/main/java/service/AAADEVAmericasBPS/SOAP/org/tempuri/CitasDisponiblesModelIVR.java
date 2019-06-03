
package service.AAADEVAmericasBPS.SOAP.org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CitasDisponiblesModelIVR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CitasDisponiblesModelIVR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoRTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensajeRTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCitas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="citasDisponibles" type="{http://tempuri.org/}ArrayOfCitasServiceIVR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitasDisponiblesModelIVR", propOrder = {
    "codigoRTA",
    "mensajeRTA",
    "numeroCitas",
    "citasDisponibles"
})
public class CitasDisponiblesModelIVR {

    protected String codigoRTA;
    protected String mensajeRTA;
    protected String numeroCitas;
    protected ArrayOfCitasServiceIVR citasDisponibles;

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
     * Gets the value of the citasDisponibles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCitasServiceIVR }
     *     
     */
    public ArrayOfCitasServiceIVR getCitasDisponibles() {
        return citasDisponibles;
    }

    /**
     * Sets the value of the citasDisponibles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCitasServiceIVR }
     *     
     */
    public void setCitasDisponibles(ArrayOfCitasServiceIVR value) {
        this.citasDisponibles = value;
    }

}
