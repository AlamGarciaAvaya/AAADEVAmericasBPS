
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
 *         &lt;element name="ConsultaAfiliadoResult" type="{http://tempuri.org/}InformacionAfiliadoModelIVR" minOccurs="0"/>
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
    "consultaAfiliadoResult"
})
@XmlRootElement(name = "ConsultaAfiliadoResponse")
public class ConsultaAfiliadoResponse {

    @XmlElement(name = "ConsultaAfiliadoResult")
    protected InformacionAfiliadoModelIVR consultaAfiliadoResult;

    /**
     * Gets the value of the consultaAfiliadoResult property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionAfiliadoModelIVR }
     *     
     */
    public InformacionAfiliadoModelIVR getConsultaAfiliadoResult() {
        return consultaAfiliadoResult;
    }

    /**
     * Sets the value of the consultaAfiliadoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionAfiliadoModelIVR }
     *     
     */
    public void setConsultaAfiliadoResult(InformacionAfiliadoModelIVR value) {
        this.consultaAfiliadoResult = value;
    }

}
