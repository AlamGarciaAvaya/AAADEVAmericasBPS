
package service.AAADEVAmericasBPS.SOAP.org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CancelarCitasResult" type="{http://tempuri.org/}CancelarCitaModelIVR" minOccurs="0"/>
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
    "cancelarCitasResult"
})
@XmlRootElement(name = "CancelarCitasResponse")
public class CancelarCitasResponse {

    @XmlElement(name = "CancelarCitasResult")
    protected CancelarCitaModelIVR cancelarCitasResult;

    /**
     * Gets the value of the cancelarCitasResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancelarCitaModelIVR }
     *     
     */
    public CancelarCitaModelIVR getCancelarCitasResult() {
        return cancelarCitasResult;
    }

    /**
     * Sets the value of the cancelarCitasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelarCitaModelIVR }
     *     
     */
    public void setCancelarCitasResult(CancelarCitaModelIVR value) {
        this.cancelarCitasResult = value;
    }

}
