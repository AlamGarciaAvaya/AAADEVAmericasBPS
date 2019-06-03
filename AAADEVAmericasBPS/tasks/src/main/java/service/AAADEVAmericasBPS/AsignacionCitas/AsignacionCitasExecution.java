package service.AAADEVAmericasBPS.AsignacionCitas;

import org.json.JSONObject;

import service.AAADEVAmericasBPS.SOAP.org.tempuri.AsignarCitaModelIVR;
import service.AAADEVAmericasBPS.SOAP.org.tempuri.SaludTotalService;
import service.AAADEVAmericasBPS.SOAP.org.tempuri.SaludTotalServiceSoap;

import com.avaya.app.entity.Instance;
import com.avaya.app.entity.NodeInstance;
import com.roobroo.bpm.model.BpmNode;

public class AsignacionCitasExecution extends NodeInstance{

	private static final long serialVersionUID = 1L;
	public AsignacionCitasExecution(Instance instance, BpmNode node) {
		super(instance, node);
	}
	public Object execute() throws Exception{
		JSONObject json = new JSONObject();
		
		AsignacionCitasModel asignacionCitasModel = (AsignacionCitasModel)getNode();
		
		String idCita = (String)get("idCita");
		if(idCita == null || idCita.isEmpty()){
			idCita = asignacionCitasModel.getIdCita();
		}
		String idEspecialidad = (String)get("idEspeciaidad");
		if(idEspecialidad == null || idEspecialidad.isEmpty()){
			idEspecialidad = asignacionCitasModel.getIdEspecialidad();
		}
		String numeroIdentificacion = (String)get("numeroIdentificacion");
		if(numeroIdentificacion == null || numeroIdentificacion.isEmpty()){
			numeroIdentificacion = asignacionCitasModel.getNumeroIdentificacion();
		}
		String idAfiliado = (String)get("idAfiliado");
		if(idAfiliado == null || idAfiliado.isEmpty()){
			idAfiliado = asignacionCitasModel.getIdAfiliado();
		}
		String ciudadResidencia = (String)get("ciudadResidencia");
		if(ciudadResidencia == null || ciudadResidencia.isEmpty()){
			ciudadResidencia = asignacionCitasModel.getCiudadResidencia();
		}
		String estadoAfiliado = (String)get("estadoAfiliado");
		if(estadoAfiliado == null || estadoAfiliado.isEmpty()){
			estadoAfiliado = asignacionCitasModel.getEstadoAfiliado();
		}
		int estadoAfiliadoInteger = Integer.parseInt(estadoAfiliado);
		
		String tieneCita = (String)get("tieneCita");
		if(tieneCita == null || tieneCita.isEmpty()){
			tieneCita = asignacionCitasModel.getTieneCita();
		}
		int tieneCitaInteger = Integer.parseInt(tieneCita);
		String codigoIPS = (String)get("codigoIPS");
		if(codigoIPS == null || codigoIPS.isEmpty()){
			codigoIPS = asignacionCitasModel.getCodigoIPS();
		}
		String subCodigoIPS = (String)get("subCodigoIPS");
		if(subCodigoIPS == null || subCodigoIPS.isEmpty()){
			subCodigoIPS = asignacionCitasModel.getSubCodigoIPS();
		}
		String planSalud = (String)get("planSalud");
		if(planSalud == null || planSalud.isEmpty()){
			planSalud = asignacionCitasModel.getPlanSalud();
		}
		String citaDirecta = (String)get("citaDirecta");
		if(citaDirecta == null || citaDirecta.isEmpty()){
			citaDirecta = asignacionCitasModel.getCitaDirecta();
		}
		int citaDirectaInteger = Integer.parseInt(citaDirecta);
		String idLlamada = (String)get("idLlamada");
		if(idLlamada == null || idLlamada.isEmpty()){
			idLlamada = asignacionCitasModel.getIdLlamada();
		}
		
		SaludTotalServiceSoap saludTotalService = new SaludTotalService().getSaludTotalServiceSoap();
		AsignarCitaModelIVR response = saludTotalService.asignacionCitas(idCita, idEspecialidad, numeroIdentificacion, idAfiliado, ciudadResidencia, estadoAfiliadoInteger, tieneCitaInteger, codigoIPS, subCodigoIPS, planSalud, citaDirectaInteger, idLlamada);
		json.put("codigoRTA", response.getCodigoRTA());
		json.put("mensajeRTA", response.getMensajeRTA());
		json.put("idCitaAsignada", response.getIdCitaAsignada());
		json.put("Nap", response.getNap());
		json.put("CuotaModeradora", response.getCuotaModeradora());
		json.put("Texto", response.getTexto());
				
		
		return json;
	}
}
