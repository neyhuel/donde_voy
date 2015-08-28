package org.dondevoy.entidad.dto;

import org.dondevoy.entidad.entities.Entidad;



public class EntidadDTOFabrica {
	public static EntidadDTO crearEntidadDTO(Entidad entidad) {
		EntidadDTO dto = null;
		if (entidad != null) {
			dto = new EntidadDTO();
			dto.setNombreEntidad(entidad.getNombreEntidad());
		}
		return dto;
	}
}
