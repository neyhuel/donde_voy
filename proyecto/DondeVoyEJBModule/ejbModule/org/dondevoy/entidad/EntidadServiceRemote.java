package org.dondevoy.entidad;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.entidad.dto.EntidadDTO;
import org.dondevoy.entidad.dto.SucursalDTO;
import org.dondevoy.entidad.dto.TipoEntidadDTO;

public interface EntidadServiceRemote {
	public void altaEntidad (EntidadDTO EntidadDTO, SucursalDTO SucursalDTO,TipoEntidadDTO tipoEntidadDTO) throws BusinessException;
	public EntidadDTO buscarEntidad(String nombre) throws BusinessException;

	
}