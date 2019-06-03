package service.AAADEVAmericasBPS.ConsultaAfiliado;

import com.roobroo.bpm.model.BpmNode;

public class ConsultaAfiliadoModel extends BpmNode {


	private static final long serialVersionUID = 1L;

	public ConsultaAfiliadoModel(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	 private String tipoDocumento;
	 private String numeroDocumento;
	 private String idLlamada;
	 private String idCampanaTitan;

	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getIdLlamada() {
		return idLlamada;
	}
	public void setIdLlamada(String idLlamada) {
		this.idLlamada = idLlamada;
	}
	public String getIdCampanaTitan() {
		return idCampanaTitan;
	}
	public void setIdCampanaTitan(String idCampanaTitan) {
		this.idCampanaTitan = idCampanaTitan;
	}
	
}
