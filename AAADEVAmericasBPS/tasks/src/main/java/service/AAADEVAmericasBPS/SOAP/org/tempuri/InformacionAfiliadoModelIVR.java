
package service.AAADEVAmericasBPS.SOAP.org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionAfiliadoModelIVR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionAfiliadoModelIVR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoRTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MensajeRTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAfiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTitan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAfiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudadAfiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCiudadAfiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Edad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoIPSPrimaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreIPSPrimaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicioActivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEstadoServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoIPSOdontologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreIPSOdontologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioActivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usuarioTieneEdad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usuarioPOS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="derechoOdontologiaPrimeraVez" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usuarioVirreySolis" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tiempoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionAfiliadoModelIVR", propOrder = {
    "codigoRTA",
    "mensajeRTA",
    "idAfiliado",
    "idTitan",
    "nombreAfiliado",
    "ciudadAfiliado",
    "codigoCiudadAfiliado",
    "edad",
    "email",
    "celular",
    "codigoIPSPrimaria",
    "nombreIPSPrimaria",
    "idServicio",
    "servicioActivo",
    "idEstadoServicio",
    "codigoIPSOdontologia",
    "nombreIPSOdontologia",
    "usuarioActivo",
    "usuarioTieneEdad",
    "usuarioPOS",
    "derechoOdontologiaPrimeraVez",
    "usuarioVirreySolis",
    "tiempoRespuesta",
    "idTipoIdentificacion"
})
public class InformacionAfiliadoModelIVR {

    @XmlElement(name = "CodigoRTA")
    protected String codigoRTA;
    @XmlElement(name = "MensajeRTA")
    protected String mensajeRTA;
    protected String idAfiliado;
    protected String idTitan;
    protected String nombreAfiliado;
    protected String ciudadAfiliado;
    protected String codigoCiudadAfiliado;
    @XmlElement(name = "Edad")
    protected String edad;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Celular")
    protected String celular;
    protected String codigoIPSPrimaria;
    protected String nombreIPSPrimaria;
    protected String idServicio;
    protected String servicioActivo;
    protected String idEstadoServicio;
    protected String codigoIPSOdontologia;
    protected String nombreIPSOdontologia;
    protected int usuarioActivo;
    protected int usuarioTieneEdad;
    protected int usuarioPOS;
    protected int derechoOdontologiaPrimeraVez;
    protected int usuarioVirreySolis;
    protected String tiempoRespuesta;
    @XmlElement(name = "IdTipoIdentificacion")
    protected int idTipoIdentificacion;

    /**
     * Gets the value of the codigoRTA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRTA() {
        return codigoRTA;
    }

    /**
     * Sets the value of the codigoRTA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRTA(String value) {
        this.codigoRTA = value;
    }

    /**
     * Gets the value of the mensajeRTA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeRTA() {
        return mensajeRTA;
    }

    /**
     * Sets the value of the mensajeRTA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeRTA(String value) {
        this.mensajeRTA = value;
    }

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
     * Gets the value of the idTitan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTitan() {
        return idTitan;
    }

    /**
     * Sets the value of the idTitan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTitan(String value) {
        this.idTitan = value;
    }

    /**
     * Gets the value of the nombreAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAfiliado() {
        return nombreAfiliado;
    }

    /**
     * Sets the value of the nombreAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAfiliado(String value) {
        this.nombreAfiliado = value;
    }

    /**
     * Gets the value of the ciudadAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadAfiliado() {
        return ciudadAfiliado;
    }

    /**
     * Sets the value of the ciudadAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadAfiliado(String value) {
        this.ciudadAfiliado = value;
    }

    /**
     * Gets the value of the codigoCiudadAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCiudadAfiliado() {
        return codigoCiudadAfiliado;
    }

    /**
     * Sets the value of the codigoCiudadAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCiudadAfiliado(String value) {
        this.codigoCiudadAfiliado = value;
    }

    /**
     * Gets the value of the edad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Sets the value of the edad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdad(String value) {
        this.edad = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the celular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Sets the value of the celular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Gets the value of the codigoIPSPrimaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIPSPrimaria() {
        return codigoIPSPrimaria;
    }

    /**
     * Sets the value of the codigoIPSPrimaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIPSPrimaria(String value) {
        this.codigoIPSPrimaria = value;
    }

    /**
     * Gets the value of the nombreIPSPrimaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreIPSPrimaria() {
        return nombreIPSPrimaria;
    }

    /**
     * Sets the value of the nombreIPSPrimaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreIPSPrimaria(String value) {
        this.nombreIPSPrimaria = value;
    }

    /**
     * Gets the value of the idServicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdServicio() {
        return idServicio;
    }

    /**
     * Sets the value of the idServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdServicio(String value) {
        this.idServicio = value;
    }

    /**
     * Gets the value of the servicioActivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicioActivo() {
        return servicioActivo;
    }

    /**
     * Sets the value of the servicioActivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicioActivo(String value) {
        this.servicioActivo = value;
    }

    /**
     * Gets the value of the idEstadoServicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEstadoServicio() {
        return idEstadoServicio;
    }

    /**
     * Sets the value of the idEstadoServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEstadoServicio(String value) {
        this.idEstadoServicio = value;
    }

    /**
     * Gets the value of the codigoIPSOdontologia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIPSOdontologia() {
        return codigoIPSOdontologia;
    }

    /**
     * Sets the value of the codigoIPSOdontologia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIPSOdontologia(String value) {
        this.codigoIPSOdontologia = value;
    }

    /**
     * Gets the value of the nombreIPSOdontologia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreIPSOdontologia() {
        return nombreIPSOdontologia;
    }

    /**
     * Sets the value of the nombreIPSOdontologia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreIPSOdontologia(String value) {
        this.nombreIPSOdontologia = value;
    }

    /**
     * Gets the value of the usuarioActivo property.
     * 
     */
    public int getUsuarioActivo() {
        return usuarioActivo;
    }

    /**
     * Sets the value of the usuarioActivo property.
     * 
     */
    public void setUsuarioActivo(int value) {
        this.usuarioActivo = value;
    }

    /**
     * Gets the value of the usuarioTieneEdad property.
     * 
     */
    public int getUsuarioTieneEdad() {
        return usuarioTieneEdad;
    }

    /**
     * Sets the value of the usuarioTieneEdad property.
     * 
     */
    public void setUsuarioTieneEdad(int value) {
        this.usuarioTieneEdad = value;
    }

    /**
     * Gets the value of the usuarioPOS property.
     * 
     */
    public int getUsuarioPOS() {
        return usuarioPOS;
    }

    /**
     * Sets the value of the usuarioPOS property.
     * 
     */
    public void setUsuarioPOS(int value) {
        this.usuarioPOS = value;
    }

    /**
     * Gets the value of the derechoOdontologiaPrimeraVez property.
     * 
     */
    public int getDerechoOdontologiaPrimeraVez() {
        return derechoOdontologiaPrimeraVez;
    }

    /**
     * Sets the value of the derechoOdontologiaPrimeraVez property.
     * 
     */
    public void setDerechoOdontologiaPrimeraVez(int value) {
        this.derechoOdontologiaPrimeraVez = value;
    }

    /**
     * Gets the value of the usuarioVirreySolis property.
     * 
     */
    public int getUsuarioVirreySolis() {
        return usuarioVirreySolis;
    }

    /**
     * Sets the value of the usuarioVirreySolis property.
     * 
     */
    public void setUsuarioVirreySolis(int value) {
        this.usuarioVirreySolis = value;
    }

    /**
     * Gets the value of the tiempoRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    /**
     * Sets the value of the tiempoRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiempoRespuesta(String value) {
        this.tiempoRespuesta = value;
    }

    /**
     * Gets the value of the idTipoIdentificacion property.
     * 
     */
    public int getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    /**
     * Sets the value of the idTipoIdentificacion property.
     * 
     */
    public void setIdTipoIdentificacion(int value) {
        this.idTipoIdentificacion = value;
    }

}
