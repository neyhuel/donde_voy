package org.dondevoy.entidad;

import javax.ejb.Remote;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.entidad.dto.EntidadDTO;
import org.dondevoy.entidad.dto.SucursalDTO;
import org.dondevoy.entidad.dto.TipoEntidadDTO;

@Remote
public interface EntidadServiceRemote {
	public void altaEntidad (EntidadDTO EntidadDTO, SucursalDTO SucursalDTO,TipoEntidadDTO tipoEntidadDTO) throws BusinessException;
	public EntidadDTO buscarEntidad(EntidadDTO entidadDTO) throws BusinessException;
	public void EliminarEntidad(EntidadDTO entidadDTO);
	public void cambiarEstadoEntidad(EntidadDTO entidadDTO);
	
}
