package service.AAADEVAmericasBPS.ConsultaCitasDisponibles;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import service.AAADEVAmericasBPS.SOAP.org.tempuri.CitasDisponiblesModelIVR;
import service.AAADEVAmericasBPS.SOAP.org.tempuri.CitasServiceIVR;
import service.AAADEVAmericasBPS.SOAP.org.tempuri.SaludTotalService;
import service.AAADEVAmericasBPS.SOAP.org.tempuri.SaludTotalServiceSoap;

import com.avaya.app.entity.Instance;
import com.avaya.app.entity.NodeInstance;
import com.roobroo.bpm.model.BpmNode;

public class ConsultaCitasDisponiblesExcecution extends NodeInstance{

	private static final long serialVersionUID = 1L;

	public ConsultaCitasDisponiblesExcecution(Instance instance, BpmNode node) {
		super(instance, node);
	}
	
	public Object execute() throws Exception {
		
		
		ConsultaCitasDisponiblesModel consultaCitasDisponiblesModel =  (ConsultaCitasDisponiblesModel)getNode();
		
		String idPaciente = (String)get("idPaciente");
		if(idPaciente == null || idPaciente.isEmpty()){
			idPaciente = consultaCitasDisponiblesModel.getIdPaciente();
		}
		String idEspecialidad = (String)get("idEspecialidad");
		if(idEspecialidad == null || idEspecialidad.isEmpty()){
			idEspecialidad = consultaCitasDisponiblesModel.getIdEspecialidad();
		}
		String planSalud = (String)get("planSalud");
		if(planSalud == null || planSalud.isEmpty()){
			planSalud = consultaCitasDisponiblesModel.getPlanSalud();
		}
		String nombreUsuario = (String)get("nombreUsuario");
		if(nombreUsuario == null || nombreUsuario.isEmpty()){
			nombreUsuario = consultaCitasDisponiblesModel.getNombreUsuario();
		}
		String ciudadResidencia = (String)get("ciudadResidencia");
		if(ciudadResidencia == null || ciudadResidencia.isEmpty()){
			ciudadResidencia = consultaCitasDisponiblesModel.getCiudadResidencia();
		}
		String codigoIPS = (String)get("codigoIPS");
		if(codigoIPS == null || codigoIPS.isEmpty()){
			codigoIPS = consultaCitasDisponiblesModel.getCodigoIPS();
		}
		String tipoConsulta = (String)get("tipoConsulta");
		if(tipoConsulta == null || tipoConsulta.isEmpty()){
			tipoConsulta = consultaCitasDisponiblesModel.getTipoConsulta();
		}
		int tipoConsultaInteger = Integer.parseInt(tipoConsulta);
		
		String idLlamada = (String)get("idLlamada");
		if(idLlamada == null || idLlamada.isEmpty()){
			idLlamada = consultaCitasDisponiblesModel.getIdLlamada();
		}
		
		SaludTotalServiceSoap saludTotalService = new SaludTotalService().getSaludTotalServiceSoap();
		CitasDisponiblesModelIVR response = saludTotalService.consultaCitasDisponibles(idPaciente, idEspecialidad, planSalud, nombreUsuario, ciudadResidencia, codigoIPS, tipoConsultaInteger, idLlamada);
		
		JSONObject jsonConsultaCitas = new JSONObject();
		jsonConsultaCitas.put("codigoRTA", response.getCodigoRTA());
		jsonConsultaCitas.put("mensajeRTA", response.getMensajeRTA());
		jsonConsultaCitas.put("numeroCitas", response.getNumeroCitas());
		
		JSONArray jsonArray = new JSONArray();
		List<CitasServiceIVR> list = response.getCitasDisponibles().getCitasServiceIVR();
		for(CitasServiceIVR res : list){
			JSONObject json = new JSONObject();
			json.put("idCita", res.getIdCita());
			json.put("especialidadCita", res.getEspecialidadCita());
			json.put("diaCita", res.getDiaCita());
			json.put("fechaCita", res.getFechaCita());
			json.put("horaCita", res.getHoraCita());
			json.put("unidadCita", res.getUnidadCita());
			json.put("medicoCita", res.getMedicoCita());
			json.put("codigoIPS", res.getCodigoIPS());
			json.put("subCodigoIPS", res.getSubCodigoIPS());
			json.put("Direccion", res.getDireccion());
			jsonArray.put(json);
		}
		
		jsonConsultaCitas.put("citasDisponibles", jsonArray);
		return jsonConsultaCitas;
	}
	
}
