
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
 *         &lt;element name="EnviarCertificadoAfiliadoListaResult" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
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
    "enviarCertificadoAfiliadoListaResult"
})
@XmlRootElement(name = "EnviarCertificadoAfiliadoListaResponse")
public class EnviarCertificadoAfiliadoListaResponse {

    @XmlElement(name = "EnviarCertificadoAfiliadoListaResult")
    protected ArrayOfString enviarCertificadoAfiliadoListaResult;

    /**
     * Gets the value of the enviarCertificadoAfiliadoListaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getEnviarCertificadoAfiliadoListaResult() {
        return enviarCertificadoAfiliadoListaResult;
    }

    /**
     * Sets the value of the enviarCertificadoAfiliadoListaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setEnviarCertificadoAfiliadoListaResult(ArrayOfString value) {
        this.enviarCertificadoAfiliadoListaResult = value;
    }

}
