
package service.AAADEVAmericasBPS.SOAP.org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsignarCitaModelIVR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsignarCitaModelIVR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoRTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensajeRTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCitaAsignada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CuotaModeradora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsignarCitaModelIVR", propOrder = {
    "codigoRTA",
    "mensajeRTA",
    "idCitaAsignada",
    "nap",
    "cuotaModeradora",
    "texto"
})
public class AsignarCitaModelIVR {

    protected String codigoRTA;
    protected String mensajeRTA;
    protected String idCitaAsignada;
    @XmlElement(name = "Nap")
    protected String nap;
    @XmlElement(name = "CuotaModeradora")
    protected String cuotaModeradora;
    @XmlElement(name = "Texto")
    protected String texto;

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
     * Gets the value of the idCitaAsignada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCitaAsignada() {
        return idCitaAsignada;
    }

    /**
     * Sets the value of the idCitaAsignada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCitaAsignada(String value) {
        this.idCitaAsignada = value;
    }

    /**
     * Gets the value of the nap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNap() {
        return nap;
    }

    /**
     * Sets the value of the nap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNap(String value) {
        this.nap = value;
    }

    /**
     * Gets the value of the cuotaModeradora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaModeradora() {
        return cuotaModeradora;
    }

    /**
     * Sets the value of the cuotaModeradora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaModeradora(String value) {
        this.cuotaModeradora = value;
    }

    /**
     * Gets the value of the texto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Sets the value of the texto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto(String value) {
        this.texto = value;
    }

}
