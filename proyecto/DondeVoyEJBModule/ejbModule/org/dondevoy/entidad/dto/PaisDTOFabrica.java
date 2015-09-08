package org.dondevoy.entidad.dto;

import org.dondevoy.entidad.entities.Pais;

public class PaisDTOFabrica {

	public static PaisDTO crearPaisDTO(Pais pais){
		PaisDTO dto = null;
		
		if (pais != null){
			dto = new PaisDTO();
			dto.setIdPais(pais.getIdPais());
			dto.setAbreviaturaNombrePais(pais.getAbreviaturaNombrePais());
			dto.setCodigoAreaPais(pais.getCodigoAreaPais());
			dto.setNombrePais(pais.getNombrePais());
			dto.setZonaHoraria(pais.getZonaHoraria());
		}
		return dto;
	}
	
	public static Pais crearPais(PaisDTO paisDTO){
		Pais pais = null;
		
		if (paisDTO != null){
			pais = new Pais();
			pais.setAbreviaturaNombre(paisDTO.getAbreviaturaNombrePais());
			pais.setCodigoAreaPais(paisDTO.getCodigoAreaPais());
			pais.setNombrePais(paisDTO.getNombrePais());
			pais.setZonaHoraria(paisDTO.getZonaHoraria());
		}
		return pais;
	}
}
