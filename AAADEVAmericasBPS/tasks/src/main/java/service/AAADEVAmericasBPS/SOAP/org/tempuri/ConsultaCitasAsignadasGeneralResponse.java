
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
 *         &lt;element name="ConsultaCitasAsignadasGeneralResult" type="{http://tempuri.org/}CitasAsignadasGeneralModelIVR" minOccurs="0"/>
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
    "consultaCitasAsignadasGeneralResult"
})
@XmlRootElement(name = "ConsultaCitasAsignadasGeneralResponse")
public class ConsultaCitasAsignadasGeneralResponse {

    @XmlElement(name = "ConsultaCitasAsignadasGeneralResult")
    protected CitasAsignadasGeneralModelIVR consultaCitasAsignadasGeneralResult;

    /**
     * Gets the value of the consultaCitasAsignadasGeneralResult property.
     * 
     * @return
     *     possible object is
     *     {@link CitasAsignadasGeneralModelIVR }
     *     
     */
    public CitasAsignadasGeneralModelIVR getConsultaCitasAsignadasGeneralResult() {
        return consultaCitasAsignadasGeneralResult;
    }

    /**
     * Sets the value of the consultaCitasAsignadasGeneralResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitasAsignadasGeneralModelIVR }
     *     
     */
    public void setConsultaCitasAsignadasGeneralResult(CitasAsignadasGeneralModelIVR value) {
        this.consultaCitasAsignadasGeneralResult = value;
    }

}
