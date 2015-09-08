package org.dondevoy.entidad;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.entidad.dto.ProvinciaDTO;

public interface ProvinciaServiceRemote {

	public void registrarProvincia (ProvinciaDTO provinciaDTO) throws BusinessException;
	
	public ProvinciaDTO buscarProvincia (ProvinciaDTO provinciaDTO) throws BusinessException;
	
	public void eliminarProvincia (ProvinciaDTO provinciaDTO) throws BusinessException;
	
	public void modificarProvincia (ProvinciaDTO provinciaDTO) throws BusinessException;
}
