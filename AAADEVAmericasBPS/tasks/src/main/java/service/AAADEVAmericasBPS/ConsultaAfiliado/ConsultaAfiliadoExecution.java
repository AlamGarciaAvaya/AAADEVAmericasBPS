package service.AAADEVAmericasBPS.ConsultaAfiliado;

import org.json.JSONObject;

import service.AAADEVAmericasBPS.SOAP.org.tempuri.InformacionAfiliadoModelIVR;
import service.AAADEVAmericasBPS.SOAP.org.tempuri.SaludTotalService;
import service.AAADEVAmericasBPS.SOAP.org.tempuri.SaludTotalServiceSoap;

import com.avaya.app.entity.Instance;
import com.avaya.app.entity.NodeInstance;
import com.roobroo.bpm.model.BpmNode;

public class ConsultaAfiliadoExecution extends NodeInstance {

	private static final long serialVersionUID = 1L;

	public ConsultaAfiliadoExecution(Instance instance, BpmNode node) {
		super(instance, node);
	}

	public Object execute() throws Exception {
		JSONObject json = new JSONObject();
		try {

			ConsultaAfiliadoModel consultaAfiliadoModel = (ConsultaAfiliadoModel) getNode();

			String tipoDocumento = (String) get("tipoDocumento");
			if (tipoDocumento == null || tipoDocumento.isEmpty()) {
				tipoDocumento = consultaAfiliadoModel.getTipoDocumento();
			}
			int tipoDocumentoInteger = Integer.parseInt(tipoDocumento);

			String numeroDocumento = (String) get("numeroDocumento");
			if (numeroDocumento == null || numeroDocumento.isEmpty()) {
				numeroDocumento = consultaAfiliadoModel.getNumeroDocumento();
			}

			String idLlamada = (String) get("idLlamada");
			if (idLlamada == null || idLlamada.isEmpty()) {
				idLlamada = consultaAfiliadoModel.getIdLlamada();
			}

			String idCampanaTitan = (String) get("idCampanaTitan");
			if (idCampanaTitan == null || idCampanaTitan.isEmpty()) {
				idCampanaTitan = consultaAfiliadoModel.getIdCampanaTitan();
			}

			int idCampanaTitanInteger = Integer.parseInt(idCampanaTitan);

			SaludTotalServiceSoap saludTotalService = new SaludTotalService()
					.getSaludTotalServiceSoap();
			InformacionAfiliadoModelIVR response = saludTotalService
					.consultaAfiliado(tipoDocumentoInteger, numeroDocumento,
							idLlamada, idCampanaTitanInteger);

			json.put("CodigoRTA", response.getCodigoRTA());
			json.put("MensajeRTA", response.getMensajeRTA());
			json.put("idAfiliado", response.getIdAfiliado());
			json.put("idTitan", response.getIdTitan());
			json.put("nombreAfiliado", response.getNombreAfiliado());
			json.put("ciudadAfiliado", response.getCiudadAfiliado());
			json.put("codigoCiudadAfiliado", response.getCodigoCiudadAfiliado());
			json.put("Edad", response.getEdad());
			json.put("Email", response.getEmail());
			json.put("Celular", response.getCelular());
			json.put("codigoIPSPrimaria", response.getCodigoIPSPrimaria());
			json.put("nombreIPSPrimaria", response.getNombreIPSPrimaria());
			json.put("idServicio", response.getIdServicio());
			json.put("servicioActivo", response.getServicioActivo());
			json.put("idEstadoServicio", response.getIdEstadoServicio());
			json.put("codigoIPSOdontologia", response.getCodigoIPSOdontologia());
			json.put("nombreIPSOdontologia", response.getNombreIPSOdontologia());
			json.put("usuarioActivo",
					Integer.toString(response.getUsuarioActivo()));
			json.put("usuarioTieneEdad",
					Integer.toString(response.getUsuarioTieneEdad()));
			json.put("usuarioPOS", Integer.toString(response.getUsuarioPOS()));
			json.put("derechoOdontologiaPrimeraVez", Integer.toString(response
					.getDerechoOdontologiaPrimeraVez()));
			json.put("usuarioVirreySolis",
					Integer.toString(response.getUsuarioVirreySolis()));
			json.put("tiempoRespuesta", response.getTiempoRespuesta());
			json.put("idTipoIdentifiacion", response.getIdTipoIdentificacion());
			return json;
		} catch (Exception e) {
			json.put("Error", e.toString());
			return json;
		}

	}

}
