package org.dondevoy.entidad.dto;

import org.dondevoy.entidad.entities.Provincia;

public class ProvinciaDTOFabrica {

	public static ProvinciaDTO crearProvinciaDTO(Provincia provincia){
		ProvinciaDTO dto = null;
		
		if (provincia != null){
			dto = new ProvinciaDTO();
			dto.setIdProvincia(provincia.getIdProvincia());
			dto.setAbreviaturaNombreProvincia(provincia.getAbreviaturaNombreProvincia());
			dto.setCodigoAreaProvincia(provincia.getCodigoAreaProvincia());
			dto.setNombreProvincia(provincia.getNombreProvincia());
			dto.setZonaHoraria(provincia.getZonaHoraria());
			dto.setPais(PaisDTOFabrica.crearPaisDTO(provincia.getPais()));
		}
		return dto;
	}
	
	public static Provincia crearProvincia(ProvinciaDTO provinciaDTO){
		Provincia provincia = null;
		
		if (provinciaDTO != null){
			provincia = new Provincia();
			provincia.setAbreviaturaNombreProvincia(provinciaDTO.getAbreviaturaNombreProvincia());
			provincia.setCodigoAreaProvincia(provinciaDTO.getCodigoAreaProvincia());
			provincia.setNombreProvincia(provinciaDTO.getNombreProvincia());
			provincia.setZonaHoraria(provinciaDTO.getZonaHoraria());
//			provincia.setPais(PaisDTOFabrica.crearPais(provinciaDTO.getPais()));
		}
		return provincia;
	}
}
