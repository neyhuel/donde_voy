package org.dondevoy.entidad.dto;

import org.dondevoy.entidad.entities.Localidad;

public class LocalidadDTOFabrica {

	public static LocalidadDTO crearLocalidadDTO(Localidad localidad){
		LocalidadDTO dto = null;
		
		if (localidad != null){
			dto = new LocalidadDTO();
			dto.setIdLocalidad(localidad.getIdLocalidad());
			dto.setNombreLocalidad(localidad.getNombreLocalidad());
			dto.setProvincia(ProvinciaDTOFabrica.crearProvinciaDTO(localidad.getProvincia()));
		}
		return dto;
	}
	
	public static Localidad crearLocalidad(LocalidadDTO localidadDTO){
		Localidad localidad = null;
		
		if (localidadDTO != null){
			localidad = new Localidad();
			localidad.setNombreLocalidad(localidadDTO.getNombreLocalidad());
//			localidad.setProvincia(ProvinciaDTOFabrica.crearProvincia(localidadDTO.getProvincia()));
		}
		return localidad;
	}
}
