
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
 *         &lt;element name="AsignacionCitasListaResult" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
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
    "asignacionCitasListaResult"
})
@XmlRootElement(name = "AsignacionCitasListaResponse")
public class AsignacionCitasListaResponse {

    @XmlElement(name = "AsignacionCitasListaResult")
    protected ArrayOfString asignacionCitasListaResult;

    /**
     * Gets the value of the asignacionCitasListaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAsignacionCitasListaResult() {
        return asignacionCitasListaResult;
    }

    /**
     * Sets the value of the asignacionCitasListaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAsignacionCitasListaResult(ArrayOfString value) {
        this.asignacionCitasListaResult = value;
    }

}
