
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
 *         &lt;element name="ConsultaCitasAsignadasEspecialidadListaResult" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
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
    "consultaCitasAsignadasEspecialidadListaResult"
})
@XmlRootElement(name = "ConsultaCitasAsignadasEspecialidadListaResponse")
public class ConsultaCitasAsignadasEspecialidadListaResponse {

    @XmlElement(name = "ConsultaCitasAsignadasEspecialidadListaResult")
    protected ArrayOfString consultaCitasAsignadasEspecialidadListaResult;

    /**
     * Gets the value of the consultaCitasAsignadasEspecialidadListaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getConsultaCitasAsignadasEspecialidadListaResult() {
        return consultaCitasAsignadasEspecialidadListaResult;
    }

    /**
     * Sets the value of the consultaCitasAsignadasEspecialidadListaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setConsultaCitasAsignadasEspecialidadListaResult(ArrayOfString value) {
        this.consultaCitasAsignadasEspecialidadListaResult = value;
    }

}
