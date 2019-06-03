
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
 *         &lt;element name="ConsultaCitasAsignadasGeneralListaResult" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
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
    "consultaCitasAsignadasGeneralListaResult"
})
@XmlRootElement(name = "ConsultaCitasAsignadasGeneralListaResponse")
public class ConsultaCitasAsignadasGeneralListaResponse {

    @XmlElement(name = "ConsultaCitasAsignadasGeneralListaResult")
    protected ArrayOfString consultaCitasAsignadasGeneralListaResult;

    /**
     * Gets the value of the consultaCitasAsignadasGeneralListaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getConsultaCitasAsignadasGeneralListaResult() {
        return consultaCitasAsignadasGeneralListaResult;
    }

    /**
     * Sets the value of the consultaCitasAsignadasGeneralListaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setConsultaCitasAsignadasGeneralListaResult(ArrayOfString value) {
        this.consultaCitasAsignadasGeneralListaResult = value;
    }

}
