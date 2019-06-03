
package service.AAADEVAmericasBPS.SOAP.org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCitasServiceIVR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCitasServiceIVR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CitasServiceIVR" type="{http://tempuri.org/}CitasServiceIVR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCitasServiceIVR", propOrder = {
    "citasServiceIVR"
})
public class ArrayOfCitasServiceIVR {

    @XmlElement(name = "CitasServiceIVR", nillable = true)
    protected List<CitasServiceIVR> citasServiceIVR;

    /**
     * Gets the value of the citasServiceIVR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citasServiceIVR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitasServiceIVR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitasServiceIVR }
     * 
     * 
     */
    public List<CitasServiceIVR> getCitasServiceIVR() {
        if (citasServiceIVR == null) {
            citasServiceIVR = new ArrayList<CitasServiceIVR>();
        }
        return this.citasServiceIVR;
    }

}
