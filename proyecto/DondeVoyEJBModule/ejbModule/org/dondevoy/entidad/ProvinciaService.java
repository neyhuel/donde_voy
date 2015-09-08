package org.dondevoy.entidad;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.entidad.dto.ProvinciaDTO;

public class ProvinciaService implements ProvinciaServiceRemote {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void registrarProvincia(ProvinciaDTO provinciaDTO)
			throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProvinciaDTO buscarProvincia(ProvinciaDTO provinciaDTO)
			throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarProvincia(ProvinciaDTO provinciaDTO)
			throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarProvincia(ProvinciaDTO provinciaDTO)
			throws BusinessException {
		// TODO Auto-generated method stub
		
	}
}
