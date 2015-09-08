package org.dondevoy.entidad;

import javax.ejb.Remote;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.entidad.dto.LocalidadDTO;

@Remote
public interface LocalidadServiceRemote {

	public void registrarLocalidad (LocalidadDTO localidadDTO) throws BusinessException;
	
	public LocalidadDTO buscarLocalidad (LocalidadDTO localidadDTO) throws BusinessException;
	
	public void eliminarLocalidad (LocalidadDTO localidadDTO) throws BusinessException;
	
	public void modificarLocalidad (LocalidadDTO localidadDTO) throws BusinessException;
}
