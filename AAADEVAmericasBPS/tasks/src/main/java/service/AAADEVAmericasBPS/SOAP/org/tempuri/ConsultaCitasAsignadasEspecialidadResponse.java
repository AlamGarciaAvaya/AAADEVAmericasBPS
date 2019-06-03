
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
 *         &lt;element name="ConsultaCitasAsignadasEspecialidadResult" type="{http://tempuri.org/}CitasAsignadasEspecialidadModelIVR" minOccurs="0"/>
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
    "consultaCitasAsignadasEspecialidadResult"
})
@XmlRootElement(name = "ConsultaCitasAsignadasEspecialidadResponse")
public class ConsultaCitasAsignadasEspecialidadResponse {

    @XmlElement(name = "ConsultaCitasAsignadasEspecialidadResult")
    protected CitasAsignadasEspecialidadModelIVR consultaCitasAsignadasEspecialidadResult;

    /**
     * Gets the value of the consultaCitasAsignadasEspecialidadResult property.
     * 
     * @return
     *     possible object is
     *     {@link CitasAsignadasEspecialidadModelIVR }
     *     
     */
    public CitasAsignadasEspecialidadModelIVR getConsultaCitasAsignadasEspecialidadResult() {
        return consultaCitasAsignadasEspecialidadResult;
    }

    /**
     * Sets the value of the consultaCitasAsignadasEspecialidadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitasAsignadasEspecialidadModelIVR }
     *     
     */
    public void setConsultaCitasAsignadasEspecialidadResult(CitasAsignadasEspecialidadModelIVR value) {
        this.consultaCitasAsignadasEspecialidadResult = value;
    }

}
