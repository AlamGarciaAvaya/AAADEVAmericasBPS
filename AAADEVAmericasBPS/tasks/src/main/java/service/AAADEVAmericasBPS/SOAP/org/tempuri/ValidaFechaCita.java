
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
 *         &lt;element name="diaCita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mesCita" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "diaCita",
    "mesCita"
})
@XmlRootElement(name = "ValidaFechaCita")
public class ValidaFechaCita {

    protected int diaCita;
    protected int mesCita;

    /**
     * Gets the value of the diaCita property.
     * 
     */
    public int getDiaCita() {
        return diaCita;
    }

    /**
     * Sets the value of the diaCita property.
     * 
     */
    public void setDiaCita(int value) {
        this.diaCita = value;
    }

    /**
     * Gets the value of the mesCita property.
     * 
     */
    public int getMesCita() {
        return mesCita;
    }

    /**
     * Sets the value of the mesCita property.
     * 
     */
    public void setMesCita(int value) {
        this.mesCita = value;
    }

}
