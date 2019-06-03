
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
 *         &lt;element name="ConsultaCitasDisponiblesFechaListaResult" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
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
    "consultaCitasDisponiblesFechaListaResult"
})
@XmlRootElement(name = "ConsultaCitasDisponiblesFechaListaResponse")
public class ConsultaCitasDisponiblesFechaListaResponse {

    @XmlElement(name = "ConsultaCitasDisponiblesFechaListaResult")
    protected ArrayOfString consultaCitasDisponiblesFechaListaResult;

    /**
     * Gets the value of the consultaCitasDisponiblesFechaListaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getConsultaCitasDisponiblesFechaListaResult() {
        return consultaCitasDisponiblesFechaListaResult;
    }

    /**
     * Sets the value of the consultaCitasDisponiblesFechaListaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setConsultaCitasDisponiblesFechaListaResult(ArrayOfString value) {
        this.consultaCitasDisponiblesFechaListaResult = value;
    }

}
