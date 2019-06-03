package service.AAADEVAmericasBPS.ConsultaCitasDisponibles;

import com.roobroo.bpm.model.BpmNode;

public class ConsultaCitasDisponiblesModel extends BpmNode{
	

	private static final long serialVersionUID = 1L;
	private String idPaciente;
	private String idEspecialidad;
	private String planSalud;
	private String nombreUsuario;
	private String ciudadResidencia;
	private String codigoIPS;
	private String tipoConsulta;
	private String idLlamada;
	
	public ConsultaCitasDisponiblesModel(String name, String id) {
		super(name, id);
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(String idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getPlanSalud() {
		return planSalud;
	}

	public void setPlanSalud(String planSalud) {
		this.planSalud = planSalud;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	public String getCodigoIPS() {
		return codigoIPS;
	}

	public void setCodigoIPS(String codigoIPS) {
		this.codigoIPS = codigoIPS;
	}

	public String getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public String getIdLlamada() {
		return idLlamada;
	}

	public void setIdLlamada(String idLlamada) {
		this.idLlamada = idLlamada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
