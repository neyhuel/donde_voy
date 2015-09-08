package org.dondevoy.entidad;

import java.util.List;

import javax.persistence.EntityManager;

import org.dondevoy.entidad.dto.HorarioDeAtencionEntidadDTO;
import org.dondevoy.entidad.dto.SucursalDTO;
import org.dondevoy.entidad.entities.Dia;
import org.dondevoy.entidad.entities.HorarioDeAtencionEntidad;
import org.dondevoy.entidad.entities.Sucursal;

public class HorarioDeAtencionEntidadService implements
		HorarioDeAtencionEntidadServiceRemote {

	private EntityManager manager;

	public void registrarHorario(SucursalDTO sucursalDTO,List<Dia> dia,
			List<HorarioDeAtencionEntidadDTO> horarios) {
		Sucursal sucursal = manager.find(Sucursal.class ,sucursalDTO.getId());
		//Recorro los horarios, les seteo el dia y los seteo a la sucursal
		for (int i = 0; i < horarios.size(); i++) {
			HorarioDeAtencionEntidad nuevoHorario = new HorarioDeAtencionEntidad(
					horarios.get(i).getHorarioAperturaEntidad(), horarios
							.get(i).getHoraroCierreEntidad());
			nuevoHorario.setDia(dia.get(i));
			sucursal.addHorarioDeAtencionEntidad(nuevoHorario);	
		}
		manager.persist(sucursal);
	}

}
