package org.dondevoy.entidad;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.dondevoy.entidad.dto.SucursalDTO;
import org.dondevoy.entidad.dto.TelefonoDTO;
import org.dondevoy.entidad.entities.Sucursal;
import org.dondevoy.entidad.entities.Telefono;
import org.dondevoy.entidad.entities.TipoTelefono;

public class TelefonoService implements TelefonoServiceRemote {
	@PersistenceContext
	private EntityManager manager;

	public void registrarTelefono(SucursalDTO sucursalDTO,
			List<TelefonoDTO> listaTelefonoDTO,
			List<TipoTelefono> listaTipoTelefono) {
		Sucursal sucursal = manager.find(Sucursal.class, sucursalDTO.getId());
		for (int i = 0; i < listaTelefonoDTO.size(); i++) {
			Telefono nuevoTelefono = new Telefono(listaTelefonoDTO.get(i)
					.getCodigoAreaTelefono(), listaTelefonoDTO.get(i)
					.getCodigoInternacional(), listaTelefonoDTO.get(i)
					.getNumeroTelefono());
			nuevoTelefono.setTipoTelefono(listaTipoTelefono.get(i));
			sucursal.addTelefono(nuevoTelefono);
		}
		manager.persist(sucursal);
	}
	public void modificarTelefono()
	
}
