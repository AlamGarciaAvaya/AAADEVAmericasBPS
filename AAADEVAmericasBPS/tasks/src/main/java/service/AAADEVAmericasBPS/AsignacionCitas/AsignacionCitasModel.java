package service.AAADEVAmericasBPS.AsignacionCitas;

import com.roobroo.bpm.model.BpmNode;

public class AsignacionCitasModel extends BpmNode{
	
	private static final long serialVersionUID = 1L;
	public AsignacionCitasModel(String name, String id) {
		super(name, id);
	}
	private String idCita;
	private String idEspecialidad;
	private String numeroIdentificacion;
	private String idAfiliado;
	private String ciudadResidencia;
	private String estadoAfiliado;
	private String tieneCita;
	private String codigoIPS;
	private String subCodigoIPS;
	private String planSalud;
	private String citaDirecta;
	private String idLlamada;
	
	public String getIdCita() {
		return idCita;
	}

	public void setIdCita(String idCita) {
		this.idCita = idCita;
	}

	public String getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(String idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getIdAfiliado() {
		return idAfiliado;
	}

	public void setIdAfiliado(String idAfiliado) {
		this.idAfiliado = idAfiliado;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	public String getEstadoAfiliado() {
		return estadoAfiliado;
	}

	public void setEstadoAfiliado(String estadoAfiliado) {
		this.estadoAfiliado = estadoAfiliado;
	}

	public String getTieneCita() {
		return tieneCita;
	}

	public void setTieneCita(String tieneCita) {
		this.tieneCita = tieneCita;
	}

	public String getCodigoIPS() {
		return codigoIPS;
	}

	public void setCodigoIPS(String codigoIPS) {
		this.codigoIPS = codigoIPS;
	}

	public String getSubCodigoIPS() {
		return subCodigoIPS;
	}

	public void setSubCodigoIPS(String subCodigoIPS) {
		this.subCodigoIPS = subCodigoIPS;
	}

	public String getPlanSalud() {
		return planSalud;
	}

	public void setPlanSalud(String planSalud) {
		this.planSalud = planSalud;
	}

	public String getCitaDirecta() {
		return citaDirecta;
	}

	public void setCitaDirecta(String citaDirecta) {
		this.citaDirecta = citaDirecta;
	}

	public String getIdLlamada() {
		return idLlamada;
	}

	public void setIdLlamada(String idLlamada) {
		this.idLlamada = idLlamada;
	}
}
