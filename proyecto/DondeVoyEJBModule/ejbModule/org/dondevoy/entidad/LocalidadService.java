package org.dondevoy.entidad;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.entidad.dto.LocalidadDTO;
import org.dondevoy.entidad.dto.LocalidadDTOFabrica;
import org.dondevoy.entidad.entities.Localidad;
import org.dondevoy.entidad.entities.Provincia;

public class LocalidadService implements LocalidadServiceRemote {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void registrarLocalidad(LocalidadDTO localidadDTO) throws BusinessException {
		// TODO Auto-generated method stub
		Localidad localidad = LocalidadDTOFabrica.crearLocalidad(localidadDTO);
		Provincia provincia = manager.find(Provincia.class, localidadDTO.getProvincia().getIdProvincia());
		localidad.setProvincia(provincia);
		manager.persist(localidad);
	}

	@Override
	public LocalidadDTO buscarLocalidad(LocalidadDTO localidadDTO) throws BusinessException {
		// TODO Auto-generated method stub
		Localidad localidadbuscada = null;
		try {
			localidadbuscada = manager.find(Localidad.class, localidadDTO.getProvincia().getIdProvincia());
			if (localidadbuscada == null){
				throw new BusinessException("La localidad no existe.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		LocalidadDTO localidadbuscadadto = LocalidadDTOFabrica.crearLocalidadDTO(localidadbuscada);
		return localidadbuscadadto;
	}

	@Override
	public void eliminarLocalidad(LocalidadDTO localidadDTO) throws BusinessException {
		// TODO Auto-generated method stub
		Localidad localidadAEliminar = null;
		try {
			localidadAEliminar = manager.find(Localidad.class, localidadDTO.getIdLocalidad());
			if (localidadAEliminar == null){
				throw new BusinessException("La localidad no existe.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		manager.remove(localidadAEliminar);
	}

	@Override
	public void modificarLocalidad(LocalidadDTO localidadDTO) throws BusinessException {
		// TODO Auto-generated method stub
		Localidad localidadAModificar = null;
		try {
			localidadAModificar = manager.find(Localidad.class, localidadDTO.getIdLocalidad());
			if (localidadAModificar == null){
				throw new BusinessException("La localidad no existe.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		localidadAModificar.setNombreLocalidad(localidadDTO.getNombreLocalidad());
		localidadAModificar.setProvincia(manager.find(Provincia.class, localidadDTO.getProvincia().getIdProvincia()));
		manager.refresh(localidadAModificar);
	}

}
