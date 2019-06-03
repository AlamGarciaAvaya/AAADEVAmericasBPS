
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
 *         &lt;element name="ConsultaCitasDisponiblesListaResult" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
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
    "consultaCitasDisponiblesListaResult"
})
@XmlRootElement(name = "ConsultaCitasDisponiblesListaResponse")
public class ConsultaCitasDisponiblesListaResponse {

    @XmlElement(name = "ConsultaCitasDisponiblesListaResult")
    protected ArrayOfString consultaCitasDisponiblesListaResult;

    /**
     * Gets the value of the consultaCitasDisponiblesListaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getConsultaCitasDisponiblesListaResult() {
        return consultaCitasDisponiblesListaResult;
    }

    /**
     * Sets the value of the consultaCitasDisponiblesListaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setConsultaCitasDisponiblesListaResult(ArrayOfString value) {
        this.consultaCitasDisponiblesListaResult = value;
    }

}
