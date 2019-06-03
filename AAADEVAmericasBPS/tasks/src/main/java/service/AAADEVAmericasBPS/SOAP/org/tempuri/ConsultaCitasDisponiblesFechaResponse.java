
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
 *         &lt;element name="ConsultaCitasDisponiblesFechaResult" type="{http://tempuri.org/}CitasDisponiblesModelIVR" minOccurs="0"/>
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
    "consultaCitasDisponiblesFechaResult"
})
@XmlRootElement(name = "ConsultaCitasDisponiblesFechaResponse")
public class ConsultaCitasDisponiblesFechaResponse {

    @XmlElement(name = "ConsultaCitasDisponiblesFechaResult")
    protected CitasDisponiblesModelIVR consultaCitasDisponiblesFechaResult;

    /**
     * Gets the value of the consultaCitasDisponiblesFechaResult property.
     * 
     * @return
     *     possible object is
     *     {@link CitasDisponiblesModelIVR }
     *     
     */
    public CitasDisponiblesModelIVR getConsultaCitasDisponiblesFechaResult() {
        return consultaCitasDisponiblesFechaResult;
    }

    /**
     * Sets the value of the consultaCitasDisponiblesFechaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitasDisponiblesModelIVR }
     *     
     */
    public void setConsultaCitasDisponiblesFechaResult(CitasDisponiblesModelIVR value) {
        this.consultaCitasDisponiblesFechaResult = value;
    }

}
