
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
 *         &lt;element name="varExtendido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "varExtendido"
})
@XmlRootElement(name = "CancelarCitasSMS")
public class CancelarCitasSMS {

    protected String idCita;
    protected String varExtendido;

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
     * Gets the value of the varExtendido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarExtendido() {
        return varExtendido;
    }

    /**
     * Sets the value of the varExtendido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarExtendido(String value) {
        this.varExtendido = value;
    }

}
