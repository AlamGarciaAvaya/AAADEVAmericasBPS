
package service.AAADEVAmericasBPS.SOAP.org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idAfiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idLlamada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idAfiliado",
    "idCita",
    "idLlamada"
})
@XmlRootElement(name = "CancelarCitasLista")
public class CancelarCitasLista {

    protected String idAfiliado;
    protected String idCita;
    protected String idLlamada;

    /**
     * Gets the value of the idAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAfiliado() {
        return idAfiliado;
    }

    /**
     * Sets the value of the idAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAfiliado(String value) {
        this.idAfiliado = value;
    }

    /**
     * Gets the value of the idCita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCita() {
        return idCita;
    }

    /**
     * Sets the value of the idCita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCita(String value) {
        this.idCita = value;
    }

    /**
     * Gets the value of the idLlamada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLlamada() {
        return idLlamada;
    }

    /**
     * Sets the value of the idLlamada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLlamada(String value) {
        this.idLlamada = value;
    }

}
